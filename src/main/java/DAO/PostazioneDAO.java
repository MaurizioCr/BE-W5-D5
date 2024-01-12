package DAO;

import Entities.Postazione;
import Entities.TipoPostazione;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostazioneDAO extends JpaRepository {
    List<Postazione> findByTypeAndCity(TipoPostazione tipoPostazione, String city);
}
