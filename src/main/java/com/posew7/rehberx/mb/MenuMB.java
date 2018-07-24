package com.posew7.rehberx.mb;

import com.posew7.rehberx.entity.Kisi;
import com.posew7.rehberx.session.KisiFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;

@Named(value = "menuMB")
@SessionScoped
public class MenuMB implements Serializable {

    @EJB
    private KisiFacade kisiFacade;

    private int no;
    private String ad;
    private String soyad;
    private BigDecimal maas;
    private java.util.Date dogtar;
    private String tel;

    public MenuMB() {
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public BigDecimal getMaas() {
        return maas;
    }

    public void setMaas(BigDecimal maas) {
        this.maas = maas;
    }

    public Date getDogtar() {
        return dogtar;
    }

    public void setDogtar(Date dogtar) {
        this.dogtar = dogtar;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String ekle() {

        Kisi k = new Kisi();

        k.setAd(ad);
        k.setSoyad(soyad);
        k.setMaas(maas);
        k.setDogtar(dogtar);
        k.setTel(tel);

        kisiFacade.create(k);

        return "listele.xhtml";
    }
    
    public List<Kisi> listele(){
        
        return kisiFacade.findAll();
    }

}
