package edu.upc.eetac.dsa.rlorenzo.Enteros;

/**
 * 
 *@author raul
 *Ejercicio 1
 *leer numeros enteros y sacarlos por pantalla sin el finally
 */



import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ListaEnteros {
   public static void main(String[] args) {
       FileReader fr = null;
       BufferedReader entrada = null;
       try {
           fr = new FileReader("/home/raul/enteros.txt");
           entrada = new BufferedReader(fr);
           int aux = entrada.read();
           while (aux != -1) {
               System.out.print((char) aux);
               aux = entrada.read();
           }
          entrada.close();
          fr.close();
           
       } catch (FileNotFoundException e) {
           System.out.println(e.getMessage());
       } catch (IOException e) {
           System.out.println(e.getMessage());
       } 
     }
   }
