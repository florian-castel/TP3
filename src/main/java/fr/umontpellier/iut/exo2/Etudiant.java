package fr.umontpellier.iut.exo2;
import java.time.LocalDate;

public class Etudiant {

    private String nom;
    private String prenom;
    private LocalDate dateDeNaissance;
    private String mail;
    private String adresse;
    private Note[] tabNote = new Note[20];
    private int nbNote = 0;

    public Etudiant(LocalDate dateDeNaissance, String nom, String prenom, String adresse, String mail) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = dateDeNaissance;
        this.mail = mail;
        this.adresse = adresse;
    }

    public void noter(int valeur, Matiere m){
        this.tabNote[this.nbNote] = new Note(m,valeur);
    }

    public void calculerMoyenne(){
        int moyenne = 0;
        for (int i = 0; i < this.nbNote; i++) {
            moyenne = moyenne + (this.tabNote[i].getValeur() * this.tabNote[i].getM().getCoefficient());
        }
        moyenne = moyenne / this.nbNote;
    }

    public String toString() {
        return "Etudiant{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", dateDeNaissance=" + dateDeNaissance +
                ", mail='" + mail + '\'' +
                ", adresse='" + adresse + '\'' +
                '}';
    }

    public void setNomPrenom(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;

    }

}