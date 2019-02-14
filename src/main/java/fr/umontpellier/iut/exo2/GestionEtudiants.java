package fr.umontpellier.iut.exo2;

import java.time.LocalDate;
import java.time.Month;

public class GestionEtudiants {
    public static void main(String[] args) {
        Etudiant lolo = new Etudiant(LocalDate.of(1998, Month.NOVEMBER, 12), "Adrien", "Autef", "13 rue Bernard Courtois", "adrienautefdu66@gmail.com");
        Etudiant toto = new Etudiant(LocalDate.of(1998, Month.NOVEMBER, 12), "Adrien", "Autef", "13 rue Bernard Courtois", "adrienautefdu66@gmail.com");
        System.out.println(lolo.toString());
        System.out.println(toto.toString());
        Etudiant titi = new Etudiant(LocalDate.of(1990, Month.JANUARY, 17),"Francis","Garcia","12 rue du machin","mail.mail@mail.fr");
        Etudiant lili = new Etudiant(LocalDate.of(2000, Month.FEBRUARY, 13),"Marin","Bourgeret","15 rue du truc","Mailmachin@truc.fr");
        Departement monDepInfo = new Departement("Info", "99 avenue d'occitanie");
        monDepInfo.inscrire(toto);
        monDepInfo.inscrire(lolo);
        monDepInfo.inscrire(titi);
        monDepInfo.inscrire(lili);
        System.out.println(monDepInfo.toString());
        monDepInfo.desinscrire(toto);
        System.out.println(monDepInfo.toString());
    }
}