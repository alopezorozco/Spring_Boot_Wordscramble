package com.wordscramble.words.models;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "palabra")
public class Palabra {

    //declaración de campos
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="palid")
    private int idPalabra;

    @Column(name="palpalabra", nullable = false)
    private String palabraAAdivinar;

    @Column(name="paldescripcion", nullable = false)
    private String palDescripcion;

    @Column(name="palponderacion", nullable = false)
    private int ponderacion;

    @ManyToOne
    @JoinColumn(name="asigid")
    private Asignatura asignatura;

    @OneToMany(mappedBy = "palabra")
    private List<Acierto> aciertos = new ArrayList<>();

    //constructores
    public Palabra() {
    }

    public Palabra (int idPalabra){
        this.idPalabra = idPalabra;
    }

    public Palabra(int idPalabra, String palabra, String descripcion, int ponderacion) {
        this.idPalabra = idPalabra;
        this.palabraAAdivinar = palabra;
        this.ponderacion = ponderacion;
        this.asignatura = asignatura;
        this.palDescripcion = descripcion;
    }

    public Palabra(String palabra, String palDescripcion, int ponderacion, Asignatura asignatura) {
        this.palabraAAdivinar = palabra;
        this.ponderacion = ponderacion;
        this.asignatura = asignatura;
        this.palDescripcion = palDescripcion;
    }

    public Palabra(String palabra, int ponderacion) {
        this.palabraAAdivinar = palabra;
        this.ponderacion = ponderacion;
    }

    public Palabra(int idPalabra, String palabraAAdivinar, String palDescripcion, int ponderacion, Asignatura asignatura) {
        this.idPalabra = idPalabra;
        this.palabraAAdivinar = palabraAAdivinar;
        this.palDescripcion = palDescripcion;
        this.ponderacion = ponderacion;
        this.asignatura = asignatura;
    }

    //getters y setters
    public int getIdPalabra() {
        return idPalabra;
    }

    public void setIdPalabra(int idPalabra) {
        this.idPalabra = idPalabra;
    }

    public String getPalabraAAdivinar() {
        return palabraAAdivinar;
    }

    public void setPalabraAAdivinar(String palabra) {
        this.palabraAAdivinar = palabra;
    }

    public String getPalDescripcion() {
        return palDescripcion;
    }

    public void setPalDescripcion(String palDescripcion) {
        this.palDescripcion = palDescripcion;
    }

    public int getPonderacion() {
        return ponderacion;
    }

    public void setPonderacion(int ponderacion) {
        this.ponderacion = ponderacion;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }
}

