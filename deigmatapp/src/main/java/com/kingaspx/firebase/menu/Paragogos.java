/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kingaspx.firebase.menu;

/**
 *
 * @author mario
 */
public class Paragogos {
    
    String onomateponymo;
    String pt;
    String Flag;
    
    String posostoSkaireoi;
    String posostoSpasmenes;
    String posostoSoiotika;
    String posostoKsenesYles;
    String brix;
    
    
    

    public Paragogos(String onomateponymo, String pt) {
        this.onomateponymo = onomateponymo;
        this.pt = pt;
    }

    public Paragogos() {
    }

    public String getFlag() {
        return Flag;
    }

    public String getBrix() {
        return brix;
    }

    public void setBrix(String brix) {
        this.brix = brix;
    }

    public void setFlag(String Flag) {
        this.Flag = Flag;
    }

    public String getPosostoSkaireoi() {
        return posostoSkaireoi;
    }

    public void setPosostoSkaireoi(String posostoSkaireoi) {
        this.posostoSkaireoi = posostoSkaireoi;
    }

    public String getPosostoSpasmenes() {
        return posostoSpasmenes;
    }

    public void setPosostoSpasmenes(String posostoSpasmenes) {
        this.posostoSpasmenes = posostoSpasmenes;
    }

    public String getPosostoSoiotika() {
        return posostoSoiotika;
    }

    public void setPosostoSoiotika(String posostoSoiotika) {
        this.posostoSoiotika = posostoSoiotika;
    }

    public String getPosostoKsenesYles() {
        return posostoKsenesYles;
    }

    public void setPosostoKsenesYles(String posostoKsenesYles) {
        this.posostoKsenesYles = posostoKsenesYles;
    }

    public String getOnomateponymo() {
        return onomateponymo;
    }

    public void setOnomateponymo(String onomateponymo) {
        this.onomateponymo = onomateponymo;
    }

    public String getPt() {
        return pt;
    }

    public void setPt(String pt) {
        this.pt = pt;
    }
    
}
