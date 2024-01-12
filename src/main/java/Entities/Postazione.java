package Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "postazione")
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Postazione {
    @Id
    @GeneratedValue

    private long id;
    private String descrizione;
    private TipoPostazione tipoPostazione;
    private int maxOccupanti;
    private StatoPostazione statoPostazione;

    @ManyToMany(mappedBy = "postazioniPrenotate")
    private List<Utente> utente;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Edificio edificio;

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public void setTipoPostazione(TipoPostazione tipoPostazione) {
        this.tipoPostazione = tipoPostazione;
    }

    public void setMaxOccupanti(int maxOccupanti) {
        this.maxOccupanti = maxOccupanti;
    }

    public void setStatoPostazione(StatoPostazione statoPostazione) {
        this.statoPostazione = statoPostazione;
    }

    public void setEdificio(Edificio edificio) {
        this.edificio = edificio;
    }

    public void setUtente(List<Utente> utente) {
        this.utente = utente;
    }
}
