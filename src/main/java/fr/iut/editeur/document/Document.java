package fr.iut.editeur.document;

public class Document {

    private String texte;

    public Document() {
        this.texte = "";
    }
	
    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public void ajouter(String texte) {
        this.texte += texte;
    }

    @Override
    public String toString() {
        return this.texte;
    }
    public void remplacer(int debut, int fin, String remplacement) {
        String partieGauche = texte.substring(0, debut);
        String partieDroite = texte.substring(fin + 1);
        texte = partieGauche + remplacement + partieDroite;
    }

    public void majuscules(int debut, int fin) {
        if (debut >= 0 && fin <= texte.length()){
            String temp = "";
            if (debut == 0) {
                temp = this.texte.substring(debut, fin + 1);
            } else {
                temp = this.texte.substring(debut - 1, fin + 1);
            }
            String valeur = temp.toUpperCase();
            remplacer(debut, fin, valeur);
        } else {
            throw new IndexOutOfBoundsException("Les valeurs sont incorrectes");
        }
    }

    public void effacer(int debut, int fin){
        remplacer(debut, fin, "");
    }
    public void clear(){
        this.texte = "";
    }
}
