package com.wordscramble.words.models;

import com.wordscramble.words.dao.AsignaturaDao;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class AsignaturaDaoImp implements AsignaturaDao {

    @PersistenceContext
    EntityManager entityManager;

    /**
     * Retorna toda la lista de elementos de la entidad asignatura
     * @return
     */
    @Override
    public List<Asignatura> getAsignaturas() {
        //crearemos la consulta a la base de datos de tipo HQL
        String query = "FROM Asignatura";
        return entityManager.createQuery(query).getResultList();
    }

    /**
     * Guarda una nueva asignatura
     * @param asignatura
     */
    @Override
    public void registrarAsignatura(Asignatura asignatura) {
       entityManager.merge(asignatura);
    }
}
