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
 * Classe abstraite AbstractFactory dont vont heriter FigureFactory et CouleurFactory
 */
public abstract class AbstractFactory {
    
    public Figure getFigure(String typeFigure)
    {
        if(typeFigure == null)
        {
            return null;
        }
        if(typeFigure.equalsIgnoreCase("CERCLE"))
        {
            return new Cercle();
        }
        if(typeFigure.equalsIgnoreCase("CARRE"))
        {
            return new Carre();
        }
        if(typeFigure.equalsIgnoreCase("RECTANGLE"))
        {
            return new Rectangle();
        }
        return null;
    }
     
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
