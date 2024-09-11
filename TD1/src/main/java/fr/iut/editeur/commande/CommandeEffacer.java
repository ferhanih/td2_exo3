package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

/**
 * Cette classe concerne la commande effacer pour pouvoir effacer une chaine de caractère entre l'intervalle choisit
 */


public class CommandeEffacer extends CommandeDocument {
    public CommandeEffacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    public void executer() {
        if(parameters.length < 2) {
            System.err.println("Format attendu : effacer;debut;fin");
            return;
        }
        String texte = parameters[1];
        String texte2 = parameters[2];
        this.document.effacer(Integer.parseInt(texte), Integer.parseInt(texte2));
        super.executer();
    }
}

