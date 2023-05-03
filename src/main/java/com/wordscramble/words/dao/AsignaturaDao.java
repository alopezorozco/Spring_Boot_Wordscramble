package com.wordscramble.words.dao;

import com.wordscramble.words.models.Asignatura;

import java.util.List;

public interface AsignaturaDao {
    //método que retorna todas las asignatura de la bd
    List<Asignatura> getAsignaturas();

    //método que permite guardar una nueva asignatura
    void registrarAsignatura(Asignatura asignatura);
}
