/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADAPTER;

import javafx.collections.ObservableList;

/**
 *
 * @author fince
 */
public interface UcusIslemcisi {
    public ObservableList<Ucus> IslemYap(int islemTuru,Ucus ucus);
    

}