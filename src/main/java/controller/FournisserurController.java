package controller;

import entity.Fournisseur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.IFournisseuService;
import service.IProduitService;

@RestController
@RequestMapping("/api/fournisseurs")
public class FournisserurController {

    @Autowired
    private IFournisseuService fournisseuService;

    @PostMapping("/ajouterFour")
    public Fournisseur ajouterFournissuer(@RequestBody Fournisseur fournisseur) {
        return fournisseuService.ajouterFournissuer(fournisseur);
    }


}