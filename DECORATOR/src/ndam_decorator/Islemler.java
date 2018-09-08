/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ndam_decorator;

import javafx.collections.ObservableList;

/**
 *
 * @author fince
 */
public abstract class Islemler {
    
    public ObservableList<Ucus> ucus_listesi;
    public ObservableList<Ucus> arama_ucus_listesi;
    public abstract ObservableList<Ucus> listeyi_Ver();
    public abstract void islemYap(Ucus ucus);
    
}
