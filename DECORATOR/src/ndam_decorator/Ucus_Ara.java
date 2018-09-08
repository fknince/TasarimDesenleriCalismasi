/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ndam_decorator;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author fince
 */
public class Ucus_Ara extends Islemler{
    
    public Ucus_Ara()
    {
        arama_ucus_listesi=FXCollections.observableArrayList();
    }
    @Override
    public ObservableList<Ucus> listeyi_Ver() {
       return arama_ucus_listesi;
    }

    @Override
    public void islemYap(Ucus ucus) {
        arama_ucus_listesi.clear();
      
         int fiyat_kistasi = ucus.getArama_kriteri();
         for(Ucus u:ucus_listesi)
         {  
             
             if(!(ucus.getUcusNo().isEmpty()) &&  !(ucus.getUcusNo().equals(u.getUcusNo())))
             {
                
               
                 continue;
           
             }
             if(!(ucus.getNerden().isEmpty()) && !(ucus.getNerden().equals(u.getNerden())))
             {
              
             
                 continue;
             }
              if(!(ucus.getNereye().isEmpty()) && !(ucus.getNereye().equals(u.getNereye())))
             {
                 
             
                 continue;

             }  
             
              if(!(ucus.getFiyat().isEmpty()))
             {
              
               int fiyat_kistas=Integer.parseInt(ucus.getFiyat());
               int fiyat_ucus=Integer.parseInt(u.getFiyat());
                
                
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
              
              
                  
           
            arama_ucus_listesi.add(u);
           
          
          
         }
         
       
    }
    
}
