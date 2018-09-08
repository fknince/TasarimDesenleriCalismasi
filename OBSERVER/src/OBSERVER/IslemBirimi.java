/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OBSERVER;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.Observable;
import javafx.collections.ObservableList;
import ndam_observer.Ucus;



/**
 *
 * @author fince
 */
public class IslemBirimi {
    private ArrayList<Islem> islemler;
    private Ucus u;
    private String islem;
    public ObservableList<Ucus> ucus_listesi;
    public  ObservableList<Ucus> arama_ucus_listesi;
  

    public IslemBirimi(ObservableList<Ucus> ucus_listesi) {
        islemler=new ArrayList<Islem>();
        this.ucus_listesi=ucus_listesi;
    }
    public void islemEkle(Islem i,Ucus u,String islem)
    {
        this.u=u;
        this.islem=islem;
        islemler.add(i);
        islemiYap(i);
    }
    public void islemBilgisiYazdir(Islem i)
    {
        Calendar now = Calendar.getInstance();
        int hour = now.get(Calendar.HOUR_OF_DAY);
        int minute = now.get(Calendar.MINUTE);
        int second = now.get(Calendar.SECOND);
        System.out.printf("%02d:%02d:%02d | "+islem+" işlemi yapıldı.\n Toplam işlem adeti: %d\n",hour,minute,second,islemler.size());
    }
    public void islemiYap(Islem i)
    {
        if(islem.equals("Arama"))
        {
            arama_ucus_listesi=  i.islemYap(u,ucus_listesi);
        }
        else
            ucus_listesi=  i.islemYap(u,ucus_listesi);
      
        islemBilgisiYazdir(i);
    }
    
    
    
}
