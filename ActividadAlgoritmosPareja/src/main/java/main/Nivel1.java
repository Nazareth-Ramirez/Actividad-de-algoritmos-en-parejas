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
public class Nivel1 {
    
    
    //metodos nivel basico
    public void metodo1(){
        
        double[] numeros = {8.5,9.2,7.4,6.0};
        
        JOptionPane.showMessageDialog(null, "La longitu es de: "+ numeros.length+ "\nEl ultimo elemento es: "+ numeros[3] );
        
//        System.out.println("La longitu es de: "+ numeros.length);
//        System.out.println("El ultimo elemento es: "+ numeros[3]);
        
    }//fin del metodo1
    
    
    public void metodo2(){
        boolean[] valores={true, true, false, true, false,false};
        
        for(int i=0; i<valores.length; i++){
            
            JOptionPane.showMessageDialog (null, "["+ i + "]= "+ valores[i]);
            
//            System.out.println("["+ i + "]= "+ valores[i]);
        }//fin del for
        
    }//fin del metodo2
    
    
     public void FundamentoInt(){  //muestar en orden los numeros que digito
        
        int numeros[] = new int[8];
        String resultado = "";
        
        
        for(int i=0; i<numeros.length; i++){
            numeros[i]=Integer.parseInt(JOptionPane.showInputDialog("digite cualalquier numero para guardar"));
            resultado += numeros[i] + ",";
            
            
        }//FIN DEL FOR
        JOptionPane.showMessageDialog(null, "los numeros que digito fueron: "+resultado);
        
    }//fin del int
    
    public void FundamentosChar(){   //cuenta cuantas letras tiene la palabra asignada
        
        char nombres[] = {'y', 'a', 'r', 'i', 'l', 'i', 's'};
        
        for(int i=0; i<nombres.length; i++){
             JOptionPane.showMessageDialog(null, "la letra "+ (i+1)+ ": " +nombres[i]);
            
        }//fin del for
        
    }//fin del char
    
}
