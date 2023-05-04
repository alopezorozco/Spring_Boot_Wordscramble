package com.wordscramble.words.controllers;

import com.wordscramble.words.dao.AciertoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class AciertoController implements AciertoDao {

    @Autowired
    private AciertoDao aciertoDao;

    /**
     * Permite guardar la palabra adivinada
     * @param idUsuario
     * @param idPalabra
     */
    @Override
    @RequestMapping(value="guardar-acierto/{idUsuario}/{idPalabra}", method = RequestMethod.GET)
    @Transactional
    public void guardarAcierto(@PathVariable int idUsuario, @PathVariable int idPalabra) {
        aciertoDao.guardarAcierto(idUsuario, idPalabra);
    }
}
