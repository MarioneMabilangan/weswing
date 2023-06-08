package com.example.weswing.model;

public class Assistent {
    private int imagen;
    private String titulo;
    private String subtitulo;

    public Assistent(int imagen, String titulo, String subtitulo) {
        this.imagen = imagen;
        this.titulo = titulo;
        this.subtitulo = subtitulo;
    }

    public int getImagen() {
        return imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getSubtitulo() {
        return subtitulo;
    }
}
