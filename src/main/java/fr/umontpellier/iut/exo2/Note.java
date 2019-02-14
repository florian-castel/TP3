package fr.umontpellier.iut.exo2;

public class Note {
    private Matiere m;
    private int valeur;

    public Note(Matiere m, int valeur) {
        this.m = m;
        this.valeur = valeur;
    }

    public Matiere getM() {
        return m;
    }

    public void setM(Matiere m) {
        this.m = m;
    }

    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }
}
