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
public class SetterGetter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SetterdanGetter in = new SetterdanGetter();
        
        in.setPanjang(100);
        in.setLebar(50);
        in.setLuas();
        in.tampil();
    }
    
}
