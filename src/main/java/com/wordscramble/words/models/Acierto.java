package com.wordscramble.words.models;

import javax.persistence.*;

@Entity
@Table(name="acierto")
@IdClass(AciertoId.class)
public class Acierto {

    @Id
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="palid") //campo de la clase Palabra definido como id
    private Palabra palabra;

    @Id
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="usuid") //campo de la clase Usuario definido como Id
    private Usuario usuario;

    //constructor vacío requerido por JPA
    public Acierto(){}

    // constructor que toma los objetos Palabra y Usuario como parámetros
    public Acierto(Usuario usuario, Palabra palabra) {

        this.palabra = palabra;
        this.usuario = usuario;
    }

    //descriptores de acceso getter y setter
    public Palabra getPalabra() {
        return palabra;
    }

    public void setPalabra(Palabra palabra) {
        this.palabra = palabra;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String toString(){
        return palabra.getPalabraAAdivinar();
    }
}
