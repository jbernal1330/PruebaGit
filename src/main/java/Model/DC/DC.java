/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.DC;

import Model.EditorialComics;
import Model.SHArquero;
import Model.SHHechicero;
import Model.SHSigiloso;
import Model.SHTecnologiaAvanzada;
import Model.SHVeloz;

/**
 *
 * @author user
 */
public class DC implements EditorialComics{

    @Override
    public SHArquero getHeroeArq() {
        return new GreenArrow();
    }

    @Override
    public SHHechicero getHeroeHec() {
        return new ZatannaZatara();
    }

    @Override
    public SHSigiloso getHeroeSig() {
        return new Catwoman();
    }

    @Override
    public SHTecnologiaAvanzada getHeroeTec() {
        return new Batman();
    }

    @Override
    public SHVeloz getHeroeVel() {
        return new Flash();
    }
    
}
