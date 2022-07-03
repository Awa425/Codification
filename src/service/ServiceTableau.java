package service;

import models.Etudiant;
import models.Pavillon;
import models.TypeChambre;

import java.util.Scanner;

import models.BoursiersLoges;
import models.Chambre;


public class ServiceTableau implements IService {
    private final int TAILLE=5;
 private Pavillon[] pavillons= new Pavillon[TAILLE];
 private Chambre[] chambres= new Chambre[TAILLE];
 private int indexPavillon; //il l'initialise a 0 par defaut
 private int indexChambre;
 private int id_saisi;  //lors du saisi de l'id du pavillon pour la chambre


    public void menu(){
        Scanner sc = new Scanner(System.in);
        Chambre chambre = new Chambre();
        Pavillon pavillon = new Pavillon();

        System.out.println("****** Menu *******");
        System.out.println("1: Ajouter Pavillon");
        System.out.println("2: lister Pavillon");
        System.out.println("3: Ajouter Chambre");
        System.out.println("4: Lister Chambre");
        System.out.println("5: Quitter");
        int iMenu = sc.nextInt();
            if (iMenu == 1) {
                System.out.println("Ajouter Pavillon");
                System.out.println("Donner le numero du pavillon");
                pavillon.setNumPav(sc.nextInt());
                System.out.println("Donner le nombre d'etage");
                pavillon.setNbreDetages(sc.nextInt());
                this.addPavillon(pavillon);
                System.out.println("Pavillon ajoute!!!");
                System.out.println("-------------------------------------");
                menu();
            }
            else if (iMenu == 2) {
                System.out.println("La liste des Pavillons");
                this.listerPavillon(); 
                // System.out.println(indexPavillon);
                menu();
            }
            else if (iMenu == 3) {
                System.out.println("Ajout Chambre"); 
                System.out.println("Donner le type de chambre: tapez");
                System.out.println("1: si c'est individul");
                System.out.println("2: si c'est double");
                int choix = sc.nextInt();
                while(choix!=1 && choix!=2){
                    System.out.println("Donner le type de chambre: tapez");
                    System.out.println("1: si c'est individul");
                    System.out.println("2: si c'est double");
                     choix = sc.nextInt();
                }
                if (choix==1) {
                    chambre.setType(TypeChambre.valueOf("INDIVIDUEL")) ;
                }
                else if (choix==2) {
                    chambre.setType(TypeChambre.valueOf("DOUBLE")) ;
                }
                System.out.println("Donner le numero de l'etage");
                chambre.setNumEtage(sc.nextInt());
                System.out.println("Choisit le pavillon");
                id_saisi = sc.nextInt();
                System.out.println(indexPavillon); 
                // for(int i=1; i<= indexPavillon; i++){
                //     if (pavillons[i].getId()==id_saisi) {
                //         chambre.setPavillon(pavillons[i]); 
                //     }
                // }
                // for (Pavillon p : pavillons) {
                //     if (p.getId()==id_saisi) {
                        // chambre.setPavillon(p); 
                        // System.out.println("ok");
                //     }
                // }
                menu();
                // this.addChambre(chambre);
                // System.out.println("Chambre Ajouter");

                // System.out.println("-------------------------------------");
                // menu();
            }
            else if (iMenu == 4) {
                System.out.println("La liste des Chambre");
                this.listerChambre(); 
                menu();
            }
        }    

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
        if(indexChambre<TAILLE){
            chambres[indexChambre]=chambre;
            indexChambre++;
          }else{
              System.out.println("le tableau est plein");
          }   
    }

    @Override
    public void listerChambre() {
         for (Chambre c : chambres) {
            if(c!=null){
                System.out.println(c);
            }
        }
        
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
