package fr.umontpellier.iut.exo1;
import java.time.LocalDate;

public class Etudiant {

    private String nom;
    private String prenom;
    private LocalDate dateDeNaissance;
    private String mail;
    private String adresse;

    public Etudiant( LocalDate dateDeNaissance, String nom, String prenom, String adresse, String mail) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = dateDeNaissance;
        this.mail = mail;
        this.adresse = adresse;
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