package service;

import models.Etudiant;
import models.Pavillon;
import models.BoursiersLoges;
import models.Chambre;


public class ServiceTableau implements IService {
    private final int TAILLE=10;
 private Pavillon[] pavillons= new Pavillon[TAILLE];
 private int indexPavillon;
    @Override
    public void addPavillon(Pavillon pavillon) {
        if(indexPavillon<TAILLE){
          pavillons[indexPavillon]=pavillon;
          indexPavillon++;
        }else{
            System.out.println("le tableau est plein");
        }
        
    }

    @Override
    public void supprimerPavillon(Pavillon pavillon) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void listerPavillon() {
        for (Pavillon p : pavillons) {
            if(p!=null){
                System.out.println(p);
            }
        }
        
    }

    @Override
    public void listerChambreDunPavillon(Pavillon pavillon) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void addChambre(Chambre chambre) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void listerChambre() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void archiverChambre(Chambre chambre) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void addEtudiant(Etudiant etudiant) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void listerEtudiantChambre(Chambre chambre) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void affecterChambrePavillon(Chambre chambre, Pavillon pavillon) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void affecterChambreBoursierLoge(Chambre chambre, BoursiersLoges BoursiersLoges) {
        // TODO Auto-generated method stub
        
    }
   
}
