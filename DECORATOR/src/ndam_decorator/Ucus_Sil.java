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
public class Ucus_Sil extends Islemler{

    @Override
    public ObservableList<Ucus> listeyi_Ver() {
        return ucus_listesi;
    }

    @Override
    public void islemYap(Ucus ucus) {
        int id = ucus.getIndis();
        ucus_listesi.remove(id);
    }
    
    
}
