package fr.iut.editeur.commande.factory;

import fr.iut.editeur.commande.CommandeDocument;
import fr.iut.editeur.document.Document;

public class CommandeMajuscules extends CommandeDocument {
    public CommandeMajuscules(Document document, String[] parameters) {
        super(document, parameters);
    }
    @Override
    public void executer() {
        if(parameters.length < 2) {
            System.err.println("Format attendu : majuscules;debut;fin");
            return;
        }
        String texte = parameters[1];
        String texte2 = parameters[2];
        this.document.majuscules(Integer.parseInt(texte), Integer.parseInt(texte2));
        super.executer();
    }
}
