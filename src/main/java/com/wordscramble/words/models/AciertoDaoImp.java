package com.wordscramble.words.models;

import com.wordscramble.words.dao.AciertoDao;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class AciertoDaoImp implements AciertoDao {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void guardarAcierto(int idUsuario, int idPalabra) {
        //creamos un objeto de tipo AciertoId
        AciertoId aciertoId = new AciertoId();

        //creamos un objeto de tipo Acierto
        Acierto miAcierto = new Acierto();

            //obtenemos los objetos Usuario y Palabra con base a su Id.
            miAcierto.setPalabra(obtenerPalabraPorId(idPalabra));
            miAcierto.setUsuario(obtenerUsuarioPorId(idUsuario));

        //guardamos el nuevo registro
        entityManager.merge(miAcierto);
    }

    /**
     * Obtiene la palabra según el id especificado
     * @param idPalabra
     * @return
     */
    private Palabra obtenerPalabraPorId(int idPalabra) {
        return entityManager.find(Palabra.class, idPalabra);
    }

    /**
     * Obtiene el usuario según el id. del usuario
     * @param idUsuario
     * @return
     */
    private Usuario obtenerUsuarioPorId(int idUsuario){
        return entityManager.find(Usuario.class, idUsuario);
    }
}
