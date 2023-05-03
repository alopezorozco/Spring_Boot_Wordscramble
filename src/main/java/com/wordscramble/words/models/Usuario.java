package com.wordscramble.words.models;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name="usuario")
public class Usuario {
    //declaración de campos
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="usuid")
    private int id;

    @Column(name="usumatricula")
    private String matricula;

    @Column(name="usunombre")
    private String usunombre;

    @OneToMany(mappedBy = "usuario")
    private List<Acierto> aciertos = new ArrayList<>();

    public Usuario (int idUsuario){
        this.id = idUsuario;
    }

    //constructor vacío requerido por JPA
    public Usuario(){}

    //constructor con 4 parámetros
    public Usuario(int id, String matricula, String usunombre, List<Acierto> aciertos) {
        this.id = id;
        this.matricula = matricula;
        this.usunombre = usunombre;
        this.aciertos = aciertos;
    }

    //declaración de getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getUsunombre() {
        return usunombre;
    }

    public void setUsunombre(String usunombre) {
        this.usunombre = usunombre;
    }

    public List<Acierto> getAciertos() {
        return aciertos;
    }

    public void setAciertos(List<Acierto> aciertos) {
        this.aciertos = aciertos;
    }
}//fin de la clase
