/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torreshanoi;

/**
 *
 * @author DEMEN
 */
public class TorresHanoi2 {
    
    //Atributos.
    private int disc;
    private String nomTor1;
    private String nomTor2;
    private String nomTor3;
    
    //Constructor forma 1.
    public TorresHanoi2(int disc, String nomTor1, String nomTor2, String nomTor3) {
        this.disc = disc;
        this.nomTor1 = nomTor1;
        this.nomTor2 = nomTor2;
        this.nomTor3 = nomTor3;
    }
    
    //Constructor forma 2.
    public TorresHanoi2() {
        this.disc = 0;
        this.nomTor1 = "";
        this.nomTor2 = "";
        this.nomTor3 = "";
    }
    
    //Getters y setters.
    public int getDisc() {
        return this.disc;
    }
    
    public void setDisc(int disc) {
        this.disc = disc;
    }
    
    public String getNomTor1() {
        return this.nomTor1;
    }
    
    public void setNomTor1(String nomTor1) {
        this.nomTor1 = nomTor1;
    }
    
    public String getNomTor2() {
        return this.nomTor2;
    }
    
    public void setNomTor2(String nomTor2) {
        this.nomTor2 = nomTor2;
    }
    
    public String getNomTor3() {
        return this.nomTor3;
    }
    
    public void setNomTor3(String nomTor3) {
        this.nomTor3 = nomTor3;
    }
    
    
    
    public void hanoi(int disc, String ori, String aux, String des) {

        //Caso base.
        if(disc==1) {
            
            System.out.println("Mover disco de torre " + ori + " a torre " + des);
        } else {
            //Recursividad.
            hanoi(disc-1, ori, des, aux);

            System.out.println("Mover disco de torre " + ori + " a torre " + des);
            hanoi(disc-1, aux, ori, des);
            
            
        }
        
    }
    
}
