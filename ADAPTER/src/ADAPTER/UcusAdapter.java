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
 * 
 */

public class UcusAdapter implements UcusIslemcisi{
    private UcusAdaptee ucusAdaptee;
    
    
    
    public UcusAdapter(UcusAdaptee ucusAdaptee){
        this.ucusAdaptee=ucusAdaptee;
        
    }

   

    @Override
    public ObservableList<Ucus> IslemYap(int islemTuru,Ucus ucus) {
        ObservableList<Ucus> donecek = null;
        switch (islemTuru){
            case 0:
            {
               donecek=ucusAdaptee.ucusAra(ucus);
               break;        
            } 
            case 1:
            {
               ucusAdaptee.ucusEkle(ucus);
               break;        
            }  
            case 2:
            {
               ucusAdaptee.ucus_guncelle(ucus);
               break;        
            }  
            case 3:
            {
               ucusAdaptee.ucus_sil(ucus.getIndis());
               break;        
            } 
            case 4:
            {
                donecek=ucusAdaptee.getUcus_listesi();
                break;
            }
        }
        return donecek;
           
        
    }
    
}
