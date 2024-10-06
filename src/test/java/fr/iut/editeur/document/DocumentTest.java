package fr.iut.editeur.document;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * AJout de tests unitaires testant les différentes méthodes dans la classe Document
 */

public class DocumentTest {
    Document document = new Document();
    @Test
    public void testAjouter() {
        document.ajouter("bonjour");
        System.out.println(document.getTexte());
        assertTrue(document.getTexte().equals("bonjour"));
    }

    @Test
    public void testMajuscule() {
        document.ajouter("bonjour");
        document.majuscules(0, document.getTexte().length() - 1);
        assertTrue(document.getTexte().equals("BONJOUR"));
    }

    @Test
    public void testEffacer(){
        document.ajouter("bonjour");
        document.effacer(0,0);
        assertTrue(document.getTexte().equals("onjour"));
    }

}