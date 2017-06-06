package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




public class Conexion
{
    String nomBase="artDirect";
    String user="root";
    String pass = "holasoyyo2013";
    String server = "localhost";
    Connection c;
    Statement s;
    
    public Conexion() throws Exception 
    {
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        c=DriverManager.getConnection("jdbc:mysql://"+server+"/"+nomBase,user,pass);
        s=c.createStatement();
        
    }
    
    public ResultSet consulta(String sp, Object... data)throws Exception
    {
        ResultSet rs;
        if(data.length==0)
        {
            System.out.println("call "+sp+"();");
            rs = s.executeQuery("call "+sp+"();");
            
        }else
        {
            System.out.println("call "+sp+"("+cargaParametros(data)+");");
            rs = s.executeQuery("call "+sp+"("+cargaParametros(data)+");");
        }
        
        return rs;
    }
    // Este metodo deberia ser temporal, lo puse porque el metodo de arriba lo manda todo como String
    public ResultSet consultaInt(String sp) throws SQLException {
        ResultSet rs = s.executeQuery(sp);
       return rs;
    }
    
    private String cargaParametros(Object... data)
    {
        String strParametros="'";
        String salida;
        
        for(Object dt: data)
        {
           strParametros += dt + "','";
        }
        salida = strParametros.substring(0, (strParametros.length()- 2));
        
        
        return salida;
    }

    private ResultSet executeQuery(String sp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    // Si hacemos muchas consultas sin cerrar la conexion la base se muere
    public void cerrar() throws SQLException {
        this.c.close();
    }
}
