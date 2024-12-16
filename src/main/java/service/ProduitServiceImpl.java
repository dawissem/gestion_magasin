package service;

  import entity.Fournisseur;
  import entity.Produit;
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.stereotype.Service;
  import repository.IRepositoryFournisseur;
  import repository.IRepositoryProduit;

  import java.util.Optional;

@Service
public class ProduitServiceImpl implements IProduitService {

    @Autowired
    private IRepositoryProduit iRepositoryProduit;

    @Autowired
    private IRepositoryFournisseur iRepositoryFournisseur;


    @Override
    public Produit ajouterProduit(Produit produit) {
        return iRepositoryProduit.save(produit);
    }

    @Override
    public Optional<Produit> findByIdP(int idP) {
        return iRepositoryProduit.findById(idP);
    }


    @Override
    public Produit assignPF(int idF, int idP) {
        Produit produit = iRepositoryProduit.findById(idP)
                .orElseThrow(() -> new RuntimeException("Produit exist "));
         Fournisseur fournisseur = iRepositoryFournisseur.findById(idF)
                .orElseThrow(() -> new RuntimeException("Fournisseur exist pas"));
        produit.setFournisseur(fournisseur);
        return iRepositoryProduit.save(produit);
    }


}

