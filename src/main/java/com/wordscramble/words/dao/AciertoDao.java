package com.wordscramble.words.dao;

public interface AciertoDao {
    //método que permite guardar el acierto de una palabra
    void guardarAcierto(int idUsuario, int idPalabra);
}