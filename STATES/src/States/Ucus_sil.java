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
public class Ucus_sil implements Islem{
    public ObservableList<Ucus> ucus_listesi = FXCollections.observableArrayList();
    
    @Override
    public void liste_ekle(ObservableList<Ucus> ucusListesi) {
             this.ucus_listesi = ucusListesi;
    }

    @Override
    public ObservableList<Ucus> islem_yap(Ucus ucus) {
        try
         {
              int id = ucus.getIndis();
              ucus_listesi.remove(id);
              return ucus_listesi;
         }
         catch(Exception e)
         {
             return null;
         }
       
    }
    
    
}
