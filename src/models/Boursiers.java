package models;

public class Boursiers extends Etudiant {
    
    protected boolean montantBourse;
    protected TypeBourse type;

    

    public TypeBourse getType() {
        return type;
    }

    public void setType(TypeBourse type) {
        this.type = type;
    }

    public boolean isMontantBourse() {
        return montantBourse;
    }

    public void setMontantBourse(boolean montantBourse) {
        this.montantBourse = montantBourse;
    }
}
