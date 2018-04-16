/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoprototype;

/**
 * @since 14/04/2018
 * @author Bouya
 * creation d une classe clone 2 de la classe Prototype
 * la classe ConcretePrototype2 va heriter de la classe Prototype
 */
public class ConcretePrototype2 extends Prototype {
    
    public ConcretePrototype2(String p2) {
        super(p2);
    }

    /**
     * Méthode d'affichage.
     * Indique que c'est un objet de classe ConcretePrototypeA 
     * et la valeur de l'attribut texte. 
     */
    public void affiche() {
        System.out.println("ConcretePrototype2: " + texte);
    }
}

