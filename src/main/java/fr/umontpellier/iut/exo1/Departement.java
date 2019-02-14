package fr.umontpellier.iut.exo1;


public class Departement {
    private String specialite;
    private String adresse;
    private Etudiant[] tabEtud = new Etudiant[100];
    private int nbEtudiant = 0;

    public Departement(String specialite, String adresse) {
        this.specialite = specialite;
        this.adresse = adresse;
    }


    public String toString() {
        String a = "dans le departement" +
                "de specialite='" + specialite + '\'' +
                ",à l'adresse='" + adresse + '\'' +
                "Il y a ces étudiants : ";
        System.out.println(this.nbEtudiant);
        for(int i =0;i<this.nbEtudiant;i++){
            a = a + "\n";
            a = a + tabEtud[i].toString();
        }
        return a;
    }

    public void inscrire(Etudiant etu){
        this.tabEtud[this.nbEtudiant]=etu;
        this.nbEtudiant=this.nbEtudiant+1;
    }

    public void desinscrire(Etudiant etu){
        for(int i=0;i<this.nbEtudiant ;i++){
            if(this.tabEtud[i]==etu){
                this.tabEtud[i]=this.tabEtud[this.nbEtudiant - 1];
                this.nbEtudiant=this.nbEtudiant-1;
            }
        }
    }
}



