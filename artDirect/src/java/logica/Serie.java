/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import db.Conexion;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author tona
 */
public class Serie  extends Pelicula{
    ArrayList<Episodio> episodios;
    public Serie() {
        episodios = new ArrayList<Episodio>();
    }

    public ArrayList<Episodio> getEpisodios() {
        return episodios;
    }

    public void setEpisodios() throws Exception {
        Conexion con = new Conexion();
        ResultSet rs = con.consulta("spGetEpisodes", this.getId());
        while(rs.next()) {
            Episodio episode = new Episodio();
            episode.setNombre(rs.getString("nombre"));
            episode.setRuta(rs.getString("path"));
            episode.setNumero(rs.getInt("numero"));
            episode.setDescripcion(rs.getString("descripcion"));
            episodios.add(episode);
        }
        con.cerrar();
    }
    
    
}
