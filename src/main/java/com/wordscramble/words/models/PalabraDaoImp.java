package com.wordscramble.words.models;

import com.wordscramble.words.dao.PalabraDao;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
@Transactional
public class PalabraDaoImp implements PalabraDao {

    @PersistenceContext
    EntityManager entityManager;

    /**
     * Obtiene una lista de palabras no acertadas según la asignatura
     * @param idAsignatura
     * @return
     */
    @Override
    public List<Palabra> obtenerPalabraAAdivinar(int idAsignatura) {
        //consulta HQL para obtener todas las palabras que no han sido adivinadas
        //por el usuario y que pertenezcan a la asignatura pasada como parámetro
        String hql = "SELECT p " +
                "FROM Acierto a RIGHT JOIN a.palabra p " +
                "WHERE p.asignatura.id = : asignaturaId AND a.palabra IS NULL";

        //ejetucamos la consulta y le pasamos el parámetro correspondiente
        Query query = entityManager.createQuery(hql);
        query.setParameter("asignaturaId", idAsignatura);

        //especificamos que la consulta sólo retorne un resultado
        query.setMaxResults(1);

        //asignamos el resultado a la lista resutl
        List<Palabra> result = query.getResultList();

        //retornamos el resultado
        return result;
    }//fin del método obtenerPalabraAAdivinar
}//fin de la clase
