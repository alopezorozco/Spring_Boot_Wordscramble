package com.wordscramble.words.models;

import javax.persistence.Embeddable;

@Embeddable
public class AciertoId {
    private static final int serialVersionUID = 1;

    //especifica que la entidad acierto hace uso de una PK compuesta
    private int usuario;
    private int palabra;

    // constructor vacío requerido por JPA
    public AciertoId() {

    }

    //constructor con 2 parámteros
    public AciertoId(int usuario, int palabra) {
        this.usuario = usuario;
        this.palabra = palabra;
    }

    // getters y setters

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    public int getPalabra() {
        return palabra;
    }

    public void setPalabra(int palabra) {
        this.palabra = palabra;
    }
}
