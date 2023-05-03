package com.wordscramble.words.dao;

import com.wordscramble.words.models.Palabra;

import java.util.List;

public interface PalabraDao {
    List<Palabra> obtenerPalabraAAdivinar(int idAsignatura); //retorna la palabra a adivinar
}
