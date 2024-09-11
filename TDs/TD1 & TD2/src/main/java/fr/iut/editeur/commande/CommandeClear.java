package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

/**
 * Cette classe concerne la commande clear qui nous permet de supprimer l'entiéreté du message écrit.
 */

public class CommandeClear extends CommandeDocument{
    public CommandeClear(Document document, String[] parameters) {
        super(document, parameters);
    }
    public void executer() {
        this.document.clear();
        super.executer();
    }
}
