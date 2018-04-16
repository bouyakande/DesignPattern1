/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoprototype;

/**
 * @since 14/04/2018
 * @author Bouya
 *  creation d une classe clone 1 de la classe Prototype
 * la classe ConcretePrototype1 va heriter de la classe Prototype
 * Sous-class de Prototype.
 */

public class ConcretePrototype1 extends Prototype {
    
    public ConcretePrototype1(String p1) {
        super(p1);
    }

    /**
     * Méthode d'affichage.
     * Indique que c'est un objet de classe ConcretePrototypeA 
     * et la valeur de l'attribut texte. 
     */
    public void affiche() {
        System.out.println("ConcretePrototype1: " + texte);
    }
}
