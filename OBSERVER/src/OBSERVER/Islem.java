/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OBSERVER;


import javafx.collections.ObservableList;
import ndam_observer.Ucus;

/**
 *
 * @author fince
 */
public interface Islem {
    
    public ObservableList<Ucus> islemYap(Ucus u,ObservableList<Ucus> ucus_listesi);
    
}
