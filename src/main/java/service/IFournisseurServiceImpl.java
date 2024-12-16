package service;

import entity.Fournisseur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.IRepositoryFournisseur;

import java.util.Optional;

@Service
public class IFournisseurServiceImpl implements IFournisseuService {


    @Autowired
    private IRepositoryFournisseur iRepositoryFournisseur;



    @Override
    public Fournisseur ajouterFournissuer(Fournisseur fournisseur) {
        return iRepositoryFournisseur.save(fournisseur);    }

    @Override
    public Optional<Fournisseur> findByIdF(int idF) {
        return iRepositoryFournisseur.findById(idF);
    }
}


