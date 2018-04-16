/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronTP2;

import mesInterfaces.Figure;

/**
 *
 * @author Bouya
 * @since 26/03/2018
 * Methode d'instanciation de l'objet de type Figure
 * @param typeFigure
 * @return object
 */
public class FigureFactory extends AbstractFactory{
    
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
}
