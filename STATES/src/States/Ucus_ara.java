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
public class Ucus_ara implements Islem{

    public ObservableList<Ucus> ucus_listesi ;
    public ObservableList<Ucus> ucus_listesi_donecek= FXCollections.observableArrayList();
    
    @Override
    public void liste_ekle(ObservableList<Ucus> ucusListesi) {
        this.ucus_listesi = ucusListesi;
       
    }

    @Override
    public ObservableList<Ucus> islem_yap(Ucus ucus) {
         ucus_listesi_donecek.clear();
      
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
              
              
                  
           
            ucus_listesi_donecek.add(u);
           
          
          
         }
         return ucus_listesi_donecek;
        
    }
    
}
