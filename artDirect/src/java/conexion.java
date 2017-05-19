

import java.sql.*;

public class conexion
{
    String nomBase="artDirect";
    String user="root";
    String pass = "root";
    String server = "localhost";
    Connection c;
    Statement s;
    
    public conexion() throws Exception 
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

    
}
