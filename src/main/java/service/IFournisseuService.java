package service;

import entity.Fournisseur;

import java.util.Optional;

public interface IFournisseuService {

    Fournisseur ajouterFournissuer(Fournisseur fournisseur);
     Optional<Fournisseur> findByIdF(int idF);
}
