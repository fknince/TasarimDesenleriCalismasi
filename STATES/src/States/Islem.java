/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package States;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import ndam_states.Ucus;

/**
 *
 * @author Aceer
 */
public interface Islem {
    public void liste_ekle(ObservableList<Ucus> ucusListesi);
    public ObservableList<Ucus> islem_yap(Ucus ucus);
    
}
