/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package States;

import javafx.collections.ObservableList;
import ndam_states.Ucus;

/**
 *
 * @author Aceer
 */
public class Ucus_baslangic implements Islem{

    ObservableList<Ucus> ucus_listesi;
    @Override
    public void liste_ekle(ObservableList<Ucus> ucusListesi) {
        ucus_listesi=ucusListesi;
       
    }

    @Override
    public ObservableList<Ucus> islem_yap(Ucus ucus) {
        return ucus_listesi;
    }
    
}
