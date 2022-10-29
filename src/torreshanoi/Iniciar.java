/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torreshanoi;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author DEMEN
 */
public class Iniciar {
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        String res;
        
        //Pidiendo el número de discos.
        
        do {
            int opcion = 0, n=1;
            boolean verificar=false;
            System.out.println("***** TORRES DE HANÓI *****");
            
            System.out.print("Digite n discos: ");
            n=entrada.nextInt();
            
            /*System.out.println("Número de disco 2 a 6");
            System.out.println("0. Salir.");
            System.out.println("2. Dos discos.");
            System.out.println("3. Tres discos.");
            System.out.println("4. Cuatro discos.");
            System.out.println("5. Cinco discos.");
            System.out.println("6. Seis discos.");
            System.out.print("Elija la opción a jugar: ");*/
            
            /*while(!verificar) {
                try {
                    opcion=entrada.nextInt();
                    verificar=true;
                
                } catch (Exception e) {
                    System.out.println("Error: solo se permiten números entre 2 y 6");
                    entrada.nextLine();
                    System.out.print("Vuelve a intentarlo: ");
                }
            }*/
            
            

            /*switch(opcion) {
                
                case 0:
                    System.out.println("***** APLICACIÓN FINALIZADA *****");
                    System.exit(0);
                
                case 2: n=2;
                break;
                
                case 3: n=3;
                break;

                case 4: n=4;
                break;

                case 5: n=5;
                break;

                case 6: n=6;
                break;

                default : System.out.println("Opción no válida, se tomará el número de discos igual a uno.");
                
                
                
                
            }*/

            /* Primera forma, texto */
            TorresHanoi2 obj = new TorresHanoi2(n, "1", "2", "3");

            obj.hanoi(obj.getDisc(), obj.getNomTor1(), obj.getNomTor2(), obj.getNomTor3());

            /* Segunda forma, con impresiones */
            TorresHanoi obj2 = new TorresHanoi();

            Stack tor1 = new Stack();
            Stack tor2 = new Stack();
            Stack tor3 = new Stack();


            /*tor1.push(3);
            tor1.push(2);
            tor1.push(1);*/

            //Rellenando la pila 1.
            for(int i=n; i>0; i--) {
                tor1.push(i);
            }

            obj2.setDisc(n);
            obj2.setTor1(tor1);
            obj2.setTor2(tor2);
            obj2.setTor3(tor3);

            obj2.hanoi(obj2.getDisc(), obj2.getTor1(), obj2.getTor2(), obj2.getTor3());

            System.out.println("El mínimo de movimientos para " + n + " discos es: " + obj2.getMinMov());
            
            do {
                 System.out.println("¿Deseas jugar nuevamente?, escribe si o no");
                 res=entrada.next();
                
            } while (!"si".equals(res.toLowerCase()) && !"no".equals(res.toLowerCase()));
            
           

            //System.out.println(tor1);
            //System.out.println(tor2);
            //System.out.println(tor3);
            
            System.out.println();
            
        } while (res.toLowerCase().equals("si"));
        
        System.out.println("***** APLICACIÓN FINALIZADA *****");
        
        
        
 
    }
    
}
