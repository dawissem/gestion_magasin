package entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Fournisseur {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String nomF;
    String contact;

    @OneToMany(mappedBy = "fournisseur")
    private List<Produit> produits;
}
