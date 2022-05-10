
package EncriptacionBasica;

import java.util.Scanner;
public class Desincriptar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       String palabra,otro="";
        System.out.print("Ingrese una palabra:\n>");
        palabra=sc.nextLine();
        
        //sin array
        for (int i = 0; i < palabra.length(); i++) {
           if(palabra.charAt(i)=='a'){
               otro+="a";
               i+=1;
           }else if(palabra.charAt(i)=='e'){
               otro+="e";
               i+=4;
           }else if(palabra.charAt(i)=='i'){
               otro+="i";
               i+=3;
           }
           else if(palabra.charAt(i)=='o'){
               otro+="o";
               i+=3;
           }
           else if(palabra.charAt(i)=='u'){
               otro+="u";
               i+=3;
           }else{
               otro+=palabra.charAt(i);
           }
        }
        
        System.out.println("Palabra Encriptada: "+palabra);
        System.out.println("Palbra Desincriptada: "+otro);
    }
    
}
