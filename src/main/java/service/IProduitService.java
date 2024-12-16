package service;

import entity.Produit;

import java.util.Optional;


public interface IProduitService {

    Produit ajouterProduit(Produit produit);
    Optional<Produit> findByIdP(int idP);
    Produit assignPF(int idF, int idP);

}
