/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLLERS;

import MODELS.Ucus;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author fince
 */

public class UcusController {
     private final ObservableList<Ucus> ucus_listesi;
     private final ObservableList<Ucus> aranan_ucus_listesi;

    public ObservableList<Ucus> getUcus_listesi() {
        return ucus_listesi;
    }
     
     
     public UcusController()
     {
         ucus_listesi=FXCollections.observableArrayList(
                 new Ucus(
                 "123","Isparta","İstanbul","150"),
                 new Ucus("112","Ankara","İstanbul","175"),
                 new Ucus("324","Trabzon","İstanbul","250"),
                 new Ucus("354","İstanbul","Hatay","350")
                 
         );
         aranan_ucus_listesi=FXCollections.observableArrayList();
     }
     public boolean ucusEkle(Ucus ucus_bilgileri)
     {
         try
         {
             ucus_listesi.add(ucus_bilgileri);
             return true;
         }
         catch(Exception e)
         {
             return false;
         }
         
     }                                                      // 0<  1=  2>
     public ObservableList<Ucus> ucusAra(Ucus arama_kriterleri,int fiyat_kistasi)
     {
        
         aranan_ucus_listesi.clear();
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
  
            aranan_ucus_listesi.add(ucus);
           
          
         }
         return aranan_ucus_listesi;
     }
    
     public boolean ucus_sil(int id)
     {
         try
         {
              ucus_listesi.remove(id);
              return true;
         }
         catch(Exception e)
         {
             return false;
         }
        
     }
     public boolean ucus_guncelle(Ucus ucus,int indis)
     {
         try {
             
            ucus_listesi.set(indis, ucus);
            return true;     
             
         } catch (Exception e)
         {
             return false;
         }
     }
    
}
