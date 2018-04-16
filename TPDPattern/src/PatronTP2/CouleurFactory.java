/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronTP2;

import mesInterfaces.Couleur;

/**
 *
 * @author Bouya
 * @since 26/03/2018
 * 
 */
public class CouleurFactory extends AbstractFactory{
    /*Methode d'instanciation de l'objet de type Figure
     @param typeCcouleur
     @return object*/
    public Couleur getCouleur(String typeCouleur)
    {
        if(typeCouleur == null)
        {
            return null;
        }
        if(typeCouleur.equalsIgnoreCase("ROUGE"))
        {
            return new Rouge();
        }
        if(typeCouleur.equalsIgnoreCase("VERT"))
        {
            return new Vert();
        }
        if(typeCouleur.equalsIgnoreCase("JAUNE"))
        {
            return new Jaune();
        }
        return null;
    }
}
