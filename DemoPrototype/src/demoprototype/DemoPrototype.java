/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoprototype;

/**
 *
 * @author Bouya
 * @since 14/04/2018
 */
public class DemoPrototype {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        // TODO code application logic here
        // Instancie un objet de classe ConcretePrototype1
        // et un autre de classe ConcretePrototype2
        // de "manière traditionnelle".
        Prototype lPrototype1 = new ConcretePrototype1("Racine1");
        Prototype lPrototype2 = new ConcretePrototype2("Racine2");
        
        // Duplique les objets précédemment créés/
        Prototype lP1Clone = lPrototype1.clone();
        Prototype lP2Clone = lPrototype2.clone();
        
        // Affiche les objets : 
        // les clones sont identiques aux originaux
        lPrototype1.affiche();
        lP1Clone.affiche();
        lPrototype2.affiche();
        lP2Clone.affiche();
        
        // Modifie les clones
        lP1Clone.setTexte("Clone enfent");
        lP2Clone.setTexte("Clone enfant");
        
        
        // affichage.
        lPrototype1.affiche();
        lP1Clone.affiche();
        lPrototype2.affiche();
        lP2Clone.affiche();
    }
    
}
