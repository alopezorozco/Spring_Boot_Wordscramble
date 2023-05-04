package com.wordscramble.words.controllers;

import com.wordscramble.words.dao.PalabraDao;
import com.wordscramble.words.models.Palabra;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class PalabraController implements PalabraDao {

    @Autowired
    private PalabraDao palabraDao;

    @Override
    @RequestMapping(value="palabra-a-adivinar/{idAsignatura}")
    public List<Palabra> obtenerPalabraAAdivinar(@PathVariable int idAsignatura) {
        return palabraDao.obtenerPalabraAAdivinar(idAsignatura);
    }//find el método obtenerPalabraAAdivinar
}//fin de la clase
