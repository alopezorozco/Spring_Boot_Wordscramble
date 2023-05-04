package com.wordscramble.words.models;

import com.wordscramble.words.dao.AciertoDao;

public class AciertoDaoImp implements AciertoDao {
    @Override
    public void guardarAcierto(int idUsuario, int idPalabra) {
        //creamos un objeto de tipo AciertoId
        AciertoId aciertoId = new AciertoId();

        //creamos un objeto de tipo Acierto
        Acierto miAcierto = new Acierto();


    }
}
