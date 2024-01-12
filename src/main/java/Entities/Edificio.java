package Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Edificio {

    @Id
    @GeneratedValue

    private long id;
    private String name;
    private String address;
    private String city;

    @OneToMany (mappedBy = "user")
    private List<Postazione> postazione;


}
