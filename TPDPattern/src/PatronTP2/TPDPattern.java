/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronTP2;

import mesInterfaces.Couleur;
import mesInterfaces.Figure;

/**
 *
 * @author Bouya
 * @since 26/03/2018
 * Classe Main permettant de tester les differentes classes créees
 */
public class TPDPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FactoryProducer fproducer = new FactoryProducer();
        
        //Recuperation de l'objet FigureFactory
        FigureFactory figureFactory = (FigureFactory) fproducer.getFactory("FIGUREFACTORY");
        //Recuperation de l'objet Figure
        Figure figure = figureFactory.getFigure("CERCLE");
        //Appel de la fonction dessiner
        figure.dessiner();
        
        //Recuperation de l'objet CouleurFactory
        CouleurFactory couleurFactory = (CouleurFactory) fproducer.getFactory("COULEURFACTORY");
        //Recuperation de l'objet Couleur
        Couleur couleur = couleurFactory.getCouleur("ROUGE");
        //Appel de la fonction remplir
        couleur.remplir();
        
    }
    
}
