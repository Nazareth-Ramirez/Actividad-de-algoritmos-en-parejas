/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import javax.swing.JOptionPane;

/**
 *
 * @author yaris
 */
public class Nivel3 {
    
    public void LeerValor(){
        
        int num[] = new int[12];
        int valor = 0;
        int suma = 0;
        
        for(int i=0; i<num.length; i++){
            num[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite 12 numeros sabiendo que puede repetir numeros ya puestos "));
            
        }//fin del for para guardar los numeros
       
            valor=Integer.parseInt(JOptionPane.showInputDialog("Digite el valor que desea encontar y le diremos la cantidad de veces que sale"));
            
        for(int i=0; i<num.length; i++){    //para sumar y guardar las veces que se repite un numero
            if(num[i]==valor){
                suma++;
            }
                
        }//fin del for para sumar valores
        JOptionPane.showMessageDialog(null, "El numero que usted elegia saber es: " +valor+ " y la veces que sale esa numero en la lista que nos1 dia es de: "+suma);
        
    }//fin del leer y valor
    
    public void ContarChar(){
        
        
        
        
        
    }//FIN DEL CONTAR VOCALES, CONSONANTES Y SIMBOLOS
    
    
}//fin del nivel 2
