/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ndam_decorator;

/**
 *
 * @author fince
 */
public class Ucus {
    String ucusNo,nerden,nereye,fiyat;
    int arama_kriteri,indis;

    public int getIndis() {
        return indis;
    }

    public void setIndis(int indis) {
        this.indis = indis;
    }
    

    public int getArama_kriteri() {
        return arama_kriteri;
    }

    public void setArama_kriteri(int arama_kriteri) {
        this.arama_kriteri = arama_kriteri;
    }
    
    public Ucus()
    {
        
    }

    public Ucus(String ucusNo, String nerden, String nereye, String fiyat) {
        this.ucusNo = ucusNo;
        this.nerden = nerden;
        this.nereye = nereye;
        this.fiyat = fiyat;
    }
    

    public String getUcusNo() {
        return ucusNo;
    }

    public void setUcusNo(String ucusNo) {
        this.ucusNo = ucusNo;
    }

    public String getNerden() {
        return nerden;
    }

    public void setNerden(String nerden) {
        this.nerden = nerden;
    }

    public String getNereye() {
        return nereye;
    }

    public void setNereye(String nereye) {
        this.nereye = nereye;
    }

    public String getFiyat() {
        return fiyat;
    }

    public void setFiyat(String fiyat) {
        this.fiyat = fiyat;
    }
    
    
}
