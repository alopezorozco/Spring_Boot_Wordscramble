package com.wordscramble.words.models;

import javax.persistence.*;

@Entity
@Table(name = "asignatura")
public class Asignatura {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="asigid") //como se llama la columan en la bd
    private int asigId;

    @Column(name="asignombre", nullable = false)
    private String asigNombre;

    public Asignatura(int asigId, String asigNombre) {
        this.asigId = asigId;
        this.asigNombre = asigNombre;
    }

    public Asignatura() {
    }

    public int getAsigId() {
        return asigId;
    }

    public void setAsigId(int asigId) {
        this.asigId = asigId;
    }

    public String getAsigNombre() {
        return asigNombre;
    }

    public void setAsigNombre(String asigNombre) {
        this.asigNombre = asigNombre;
    }
}
