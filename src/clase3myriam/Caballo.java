/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3myriam;

/**
 *
 * @author LAB07
 */
public class Caballo 
{
    

//Declaracion de archivo de clase
String altura;
String color;
String peso;
String raza;
int patas = 4, edad;

//Metodo constructor
public Caballo (String nuevoNombre)
{
 raza = nuevoNombre; 
}
//Metodo get y set de la clase
public void relinchar()
{
    
}
public int obtenerEdad()
{
    //Sentencia obligatoria de retorno
  return edad;  
}

}