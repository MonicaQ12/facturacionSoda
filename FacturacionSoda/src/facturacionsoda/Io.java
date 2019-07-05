/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacionsoda;

import java.util.Scanner;

/**
 *
 * @author Jheron Chacon
 */
public abstract class Io {
    public static void escribir(String mensaje){
        System.out.println(mensaje);
    }
    
    public static int leerEntero(){
        Scanner userInput = new Scanner(System.in);
        int input = userInput.nextInt();
        return input;
    }
    
    public static String leerString(){
        Scanner userInput = new Scanner(System.in);
        String input = userInput.nextLine();
        return input;
    }
    
    public static double leerDouble(){
        Scanner userInput = new Scanner(System.in);
        double input = userInput.nextDouble();
        return input;
    }
    
    public static int preguntarEntero(String pregunta){
        escribir(pregunta);
        return leerEntero();
    }
    
    public static double preguntarDouble(String pregunta){
        escribir(pregunta);
        return leerDouble();
    }
    
    public static String preguntarString(String pregunta){
        escribir(pregunta);
        return leerString();
    }
}
