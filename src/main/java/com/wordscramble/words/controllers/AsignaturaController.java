package com.wordscramble.words.controllers;

import com.wordscramble.words.dao.AsignaturaDao;
import com.wordscramble.words.models.Asignatura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class AsignaturaController implements AsignaturaDao{

    @Autowired
    private AsignaturaDao asignaturaDao;

    /**
     * Retorna la lista de asignaturas
     * @return
     */
    @RequestMapping(value = "asignatura", method= RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public List<Asignatura> getAsignaturas(){
        return asignaturaDao.getAsignaturas();
    }

    @Override
    @RequestMapping(value="api/guardar-asignatura", method=RequestMethod.POST)
    public void registrarAsignatura(Asignatura asignatura) {
        asignaturaDao.registrarAsignatura(asignatura);
    }
}//fin de la clase AsignaturaController
