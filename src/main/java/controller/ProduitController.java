package controller;

import entity.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.IProduitService;

@RestController
@RequestMapping("/api/produits")
public class ProduitController {

    @Autowired
    private IProduitService produitService;

    @PostMapping("/ajouter")
    public Produit ajouterProduit(@RequestBody Produit produit){
        return produitService.ajouterProduit(produit);
    }
    @PutMapping("/assignFour/{idF}/{idP}")
    public Produit assignFournisseur(@PathVariable int idP, @PathVariable int idF) {
        return produitService.assignPF(idF, idP);

    }
}
