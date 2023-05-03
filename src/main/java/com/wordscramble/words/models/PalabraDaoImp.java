package com.wordscramble.words.models;

import com.wordscramble.words.dao.PalabraDao;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class PalabraDaoImp implements PalabraDao {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Palabra> obtenerPalabraAAdivinar(int idAsignatura) {
        return null;
    }
}
