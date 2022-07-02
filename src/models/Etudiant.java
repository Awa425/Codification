package models;

public class Etudiant {
    protected int id;
    protected String nomComplet;
    // public Etudiant(String nomComplet, String email, String telephone, String matricule, String dateNaissance) {
    //     this.nomComplet = nomComplet;
    //     this.email = email;
    //     this.telephone = telephone;
    //     this.matricule = matricule;
    //     this.dateNaissance = dateNaissance;
    // }
    public Etudiant(){

    }

    protected String email;
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    protected String telephone;
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    protected String matricule;
    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    protected String dateNaissance;



    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getNomComplet() {
        return nomComplet;
    }

    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }

   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
