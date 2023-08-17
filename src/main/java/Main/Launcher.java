/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Model.DC.DC;
import Model.EditorialComics;
import Model.Marvel.Marvel;
import Model.SHArquero;
import Model.SHHechicero;
import Model.SHSigiloso;
import Model.SHTecnologiaAvanzada;
import Model.SHVeloz;
import java.util.Random;

/**
 *
 * @author user
 */
public class Launcher {
    public static void main(String[] args) {
        EditorialComics editorial = null;
        
        Random r = new Random();
        int i = r.nextInt(10);
        
        System.out.println("Número aleatorio: "+i);
        
        if(i<5){
            editorial = new Marvel();
        }else{
            editorial = new DC();
        }
        
        SHArquero a = editorial.getHeroeArq();
        SHHechicero h = editorial.getHeroeHec();
        SHSigiloso s = editorial.getHeroeSig();
        SHTecnologiaAvanzada t = editorial.getHeroeTec();
        SHVeloz v = editorial.getHeroeVel();
        
        System.out.println("Frases características de los héroes de la editorial: ");
        System.out.println(a.getFrase());
        System.out.println(h.getFrase());
        System.out.println(s.getFrase());
        System.out.println(t.getFrase());
        System.out.println(v.getFrase());
    }
}
