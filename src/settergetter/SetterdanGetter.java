/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package settergetter;

/**
 *
 * @author user
 */
public class SetterdanGetter {
    private double panjang;
    private double lebar;       
    protected double luas;
    
    public void setPanjang(double panjang){
        this.panjang = panjang;
    }
    public void setLebar(double lebar){
        this.lebar  = lebar;
    }
    public double getPanjang(){
        return panjang;
    }
    public double getLebar(){
        return lebar;
    }
    public void setLuas(){
        luas = panjang*lebar;
    }
    public double getLuas(){
        return luas;
    }
    public void tampil(){
        System.out.println("Panjang Layar TV : "+panjang);
        System.out.println("Lebar Layar TV   : "+lebar);
        System.out.println("Luas Layar TV    : "+luas);
    }
}

