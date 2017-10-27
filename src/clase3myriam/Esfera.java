/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3myriam;

import javax.swing.JOptionPane;

/**
 *
 * @author LAB07
 */
public class Esfera
{
    

    public static void main(String [] args)
 {
   float radio, volumen;
   final float PI=3.14f;//Final define una costante 
   //Convertimos el string a entero antes de guardarlo
   radio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese radio"));
   if (radio>0)
 {    
 volumen =(4/3)*(radio*radio*radio);
  JOptionPane.showMessageDialog(null,"El volumen de su esfera es: "+volumen);
   }
 }
} 