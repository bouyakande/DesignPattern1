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
 * since 26/03/2018
 * Classe Cercle implementant l'interface Figure et representant un cercle
 */
public class Cercle implements Figure{

    @Override
    public void dessiner() {
        System.out.println("Representation d'un cercle");
    }
    
}
