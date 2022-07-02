package models;

public class Pavillon {
    private int id;
    private int nbreDetages;
    private int numPav;


    public int getNumPav() {
        return numPav;
    }

    public void setNumPav(int numPav) {
        this.numPav = numPav;
    }

    public int getNbreDetages() {
        return nbreDetages;
    }

    public void setNbreDetages(int nbreDetages) {
        this.nbreDetages = nbreDetages;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Pavillon [id=" + id + ", nbreDetages=" + nbreDetages + ", numPav=" + numPav + "]";
    }
}
