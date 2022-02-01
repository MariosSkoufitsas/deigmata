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
    
    

    public Paragogos(String onomateponymo, String pt) {
        this.onomateponymo = onomateponymo;
        this.pt = pt;
    }

    public Paragogos() {
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
