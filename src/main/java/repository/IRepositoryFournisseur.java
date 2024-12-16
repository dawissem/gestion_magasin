package repository;

import entity.Fournisseur;
import entity.Produit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IRepositoryFournisseur extends CrudRepository<Fournisseur,Integer> {

}
