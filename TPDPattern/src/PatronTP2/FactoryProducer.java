/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronTP2;

/**
 *
 * @author Bouya
 * @since 26/03/2018
 * Classe FactoryProducer permettant de creer FigureFactory et CouleurFactory
 * 
 * /*Methode d'instanciation de l'objet de type Factory
  @param typeFactory
  @return object
 */
public class FactoryProducer {
    
   
    public AbstractFactory getFactory(String typeFactory)
    {
        AbstractFactory factory = null;
        if(typeFactory == null)
        {
            return null;
        }
        if(typeFactory.equalsIgnoreCase("FIGUREFACTORY"))
        {
     
            factory = new FigureFactory();
        }
        if(typeFactory.equalsIgnoreCase("CouleurFactory"))
        {
            factory = new CouleurFactory();
        }
        return factory;
    }
}
