/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Marvel;

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
public class Marvel implements EditorialComics{

    @Override
    public SHArquero getHeroeArq() {
        return new Hawkeye();
    }

    @Override
    public SHHechicero getHeroeHec() {
        return new DoctorStrange();
    }

    @Override
    public SHSigiloso getHeroeSig() {
        return new BlackWidow();
    }

    @Override
    public SHTecnologiaAvanzada getHeroeTec() {
        return new IronMan();
    }

    @Override
    public SHVeloz getHeroeVel() {
        return new QuickSilver();
    }
    
}
