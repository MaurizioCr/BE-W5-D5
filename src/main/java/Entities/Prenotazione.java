package Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Entity
@Table(name = "prenotazione")
@NoArgsConstructor
@Getter
@ToString


public class Prenotazione {
    @Id
    @GeneratedValue

    private long id;
    private LocalDate localDate;

    @ManyToMany
    private Postazione postazione;

    @ManyToMany
    private Utente utente;


}
