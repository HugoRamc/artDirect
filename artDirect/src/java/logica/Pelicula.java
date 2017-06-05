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
public class Pelicula {

    private String titulo;
    private String tipo;
    private ArrayList<String> categorias;
    private String autor;
    private double calificacion;
    private int id;
    private boolean esFavorito;
    public Pelicula (){
        this.categorias = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        if (tipo==0)
            this.tipo = "Pelicula";
        else
            this.tipo = "Serie";
    }

    public ArrayList<String> getCategorias() {
        return categorias;
    }

    public void setCategorias(int idFilme) {
        
        this.categorias = categorias;
    }
    
    public void setCategorias() throws Exception {
        Conexion con = new Conexion();
        ResultSet rs = con.consulta("spGetCategorias",this.id);
        /*select c.categoria 
    from tblcategorias t 
    inner join ctgcategoriafilme c 
    on c.idCatFilme=t.idCatFilme
    and t.idFilme =idpeli;*/

        while (rs.next()) {
            String categoria = rs.getString("categoria");
            this.categorias.add(categoria);
        }
        con.cerrar();
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public void setAutor() throws Exception {
        Conexion con = new Conexion();
        ResultSet rs = con.consulta("spGetAutor", this.id);
        if (rs.next()) {
            String nombre = rs.getString("nombreArtistico");
            this.autor= nombre;
        }
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean getEsFavorito() {
        return esFavorito;
    }

    public void setEsFavorito(boolean esFavorito) {
        this.esFavorito = esFavorito;
    }
    
}
