/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OBSERVER;


import java.util.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import ndam_observer.Ucus;

/**
 *
 * @author fince
 */
public class Ara implements Islem{
     private ObservableList<Ucus> ucus_listesi;
     private ObservableList<Ucus> arama_ucus_listesi;
     
     public Ara()
     {
         arama_ucus_listesi=FXCollections.observableArrayList();
     }
    @Override
    public ObservableList<Ucus> islemYap(Ucus arama_kriterleri,ObservableList<Ucus> ucus_listesi) {
       this.ucus_listesi=ucus_listesi;
       arama_ucus_listesi.clear();
       int fiyat_kistasi=arama_kriterleri.getFiyat_kistasi();
        for(Ucus ucus:ucus_listesi)
         {  

             if(!(arama_kriterleri.getUcusNo().isEmpty()) &&  !(arama_kriterleri.getUcusNo().equals(ucus.getUcusNo())))
             {
                 continue;
                 
             }
             if(!(arama_kriterleri.getNerden().isEmpty()) && !(arama_kriterleri.getNerden().equals(ucus.getNerden())))
             {
               
                 continue;
             }
              if(!(arama_kriterleri.getNereye().isEmpty()) && !(arama_kriterleri.getNereye().equals(ucus.getNereye())))
             {
                 
                continue;

             }  
             
              if(!(arama_kriterleri.getFiyat().isEmpty()))
             {
              
               int fiyat_kistas=Integer.parseInt(arama_kriterleri.getFiyat());
               int fiyat_ucus=Integer.parseInt(ucus.getFiyat());
                
                
               switch(fiyat_kistasi)
               {
                   case 0:
                   {
                    
                       if(!(fiyat_ucus<fiyat_kistas))
                            continue;
                      
                       break;
                   }
                   case 1:
                   {
                       if(fiyat_ucus != fiyat_kistas)
                       {
                           continue;
                       }
                       break;
                   }
                   case 2:
                   {
                       if(!(fiyat_ucus>fiyat_kistas))
                       {
                          continue;
                       }
                       break;
                   }
               }
             }
  
            arama_ucus_listesi.add(ucus);
           
          
         }
       
       return arama_ucus_listesi;
    }

   
    
}
