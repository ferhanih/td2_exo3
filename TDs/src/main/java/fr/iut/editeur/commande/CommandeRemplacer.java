package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeRemplacer extends CommandeDocument{
    public CommandeRemplacer(Document document, String[] parameters) {
        super(document, parameters);
    }
    @Override
    public void executer() {
        if(parameters.length < 2) {
            System.err.println("Format attendu : remplacer;int;int;String;");
            return;
        }
        String texte1 = parameters[1];
        String texte2 = parameters[2];
        String texte3 = parameters[3];
        this.document.remplacer(Integer.parseInt(texte1), Integer.parseInt(texte2), texte3);
        super.executer();

    }
}
