/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OBSERVER;


import java.util.Observable;
import javafx.collections.ObservableList;
import ndam_observer.Ucus;

/**
 *
 * @author fince
 */
public class Ekle implements Islem{
    private ObservableList<Ucus> ucus_listesi;

   
    @Override
    public ObservableList<Ucus> islemYap(Ucus u,ObservableList<Ucus> ucus_listesi) {
         this.ucus_listesi=ucus_listesi;
         ucus_listesi.add(u);
         return ucus_listesi;
       
    }
    
}
