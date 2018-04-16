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
 * Classe Rectangle implementant l'interface Figure et representant un rectangle
 */
public class Rectangle implements Figure{

    @Override
    public void dessiner() {
        System.out.println("Representation d'un rectangle");
    }
    
}
