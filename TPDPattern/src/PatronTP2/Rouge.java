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
 * since 26/03/2018
 * Classe Rouge implementant l'interface Couleur
 */
public class Rouge implements Couleur{

    @Override
    public void remplir() {
        System.out.println("Cette figure est rouge");
    }
    
}
