package fr.umontpellier.iut.exo2;

public class Matiere {
    private String intitule;
    private int coefficient;
    private Professeur responsable;

    public Matiere(String intitule, int coefficient, Professeur responsable) {
        this.intitule = intitule;
        this.coefficient = coefficient;
        this.responsable = responsable;
    }

    public int getCoefficient() {
        return coefficient;
    }
}