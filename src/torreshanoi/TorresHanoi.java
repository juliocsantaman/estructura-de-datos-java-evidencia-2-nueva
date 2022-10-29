/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torreshanoi;

import java.util.Stack;

/**
 *
 * @author DEMEN
 */
public class TorresHanoi {
    
    //Atributos.
    private int disc;
    private Stack tor1;
    private Stack tor2;
    private Stack tor3;
    private int minMov;
    private int c=1;
    /*private String nomTor1;
    private String nomTor2;
    private String nomTor3;*/
    
    //Getters y setters.
    
    public int getDisc() {
        return this.disc;
    }
    
    public void setDisc(int disc) {
        this.disc = disc;
    }
    
    public Stack getTor1() {
        return this.tor1;
    }
    
    public void setTor1(Stack tor1) {
        this.tor1 = tor1;
    }
    
    public Stack getTor2() {
        return this.tor2;
    }
    
    public void setTor2(Stack tor2) {
        this.tor2 = tor2;
    }
    
    public Stack getTor3() {
        return this.tor3;
    }
    
    public void setTor3(Stack tor3) {
        this.tor3 = tor3;
    }
    
    public int getMinMov() {
        return this.minMov;
    }
    
    public void setMinMov(int minMov) {
        this.minMov = minMov;
    }
    
    public int getC() {
        return c;
    }
    
    public void setC(int c) {
        this.c = c;
    }
    
    /*public String getNomTor1() {
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
    }*/
    
    
    /* Fin getters y setters */
    
    
    
    public void hanoi(int n, Stack ori, Stack aux, Stack des) {
        
        
        //Caso base.
        if(n==1) {
            
            mover(ori, des);
            mostrar();
        } else {
            //Recursividad.
            hanoi(n-1, ori, des, aux);
            
            mover(ori, des);
            mostrar();
            
            hanoi(n-1, aux, ori, des);
            
            
        }
        
    }
    
    public void mover(Stack ori, Stack des) {
        try {
            des.push(ori.pop());
            this.minMov++;
        } catch (Exception e) {
            
            System.out.println("Error: pila vacía.");
        }
    }
    

    
    public void mostrar() {
        
        System.out.print("Movimiento " + this.c + "  ");
        System.out.print(getTor1());
        System.out.print("                  ");
        System.out.print(getTor2());
        System.out.print("                  ");
        System.out.print(getTor3());
        System.out.println("                ");
        
        this.c++;
    }
    
}
