package com.example.parcial2;

public class Tema {
    private final String titulo;
    private final int imagen;
    private final int logo;

    public Tema(String titulo, int imagen, int logo) {
        this.titulo = titulo;
        this.imagen = imagen;
        this.logo = logo;
    }

    public String getTitulo() { return titulo; }
    public int getImagen() { return imagen; }
    public int getLogo() { return logo; }
}