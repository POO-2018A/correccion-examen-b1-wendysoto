/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author Wendy Soto
 */
public class Libro {
    
    private String titulo;
    private int anio;
    private Autor autor;
    private boolean favorito;
     public Libro (String titulo, Autor autor, int anio, boolean favorito){
         this.titulo=titulo;
         this.anio=anio;
         this.autor=autor;
         this.favorito=favorito;
     }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public boolean isFavorito() {
        return favorito;
    }

    public void setFavorito(boolean favorito) {
        this.favorito = favorito;
    }

    @Override
    public String toString() {
        return  "\nTitulo= " + titulo + "\nAño= " + anio  + autor  ;
    }
    
    
     
    
}
