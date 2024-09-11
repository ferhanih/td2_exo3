package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

/**
 * Cette classe est la classe principale dont les autres commandes héritent.
 */

public abstract class CommandeDocument implements Commande {

    protected Document document;

    protected String[]parameters;

    public CommandeDocument(Document document, String[] parameters) {
        this.document = document;
        this.parameters = parameters;
    }

    @Override
    public void executer() {
        System.out.println(this.document);
    }
}
