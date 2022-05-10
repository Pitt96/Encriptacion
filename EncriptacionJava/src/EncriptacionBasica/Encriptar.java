/*Reemplazar las vocales 
con: 
a --> ai
e --> enter
i --> imes
o --> ober
u --> ufat*/
package EncriptacionBasica;

import java.util.Scanner;

public class Encriptar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       String palabra,otro="";
        System.out.print("Ingrese una palabra:\n>");
        palabra=sc.nextLine();
        //con array
        char array[]=palabra.toCharArray();
        for (int i = 0; i < array.length; i++) {
           switch ((char)array[i]) {
               case 'a':
                   otro+="ai";
                   break;
               case 'e':
                   otro+="enter";
                   break;
               case 'i':
                   otro+="imes";
                   break;
               case 'o':
                   otro+="ober";
                   break;
               case 'u':
                   otro+="ufat";
                   break;
               default:
                   otro+=array[i];
                   break;
           }
        }
        //sin array
        /*
        for (int i = 0; i < palabra.length(); i++) {
           switch (palabra.charAt(i)) {
               case 'a':
                   otro+="ai";
                   break;
               case 'e':
                   otro+="enter";
                   break;
               case 'i':
                   otro+="imes";
                   break;
               case 'o':
                   otro+="ober";
                   break;
               case 'u':
                   otro+="ufat";
                   break;
               default:
                   otro+=palabra.charAt(i);
                   break;
           }
        }
        */
        System.out.println("Palabra: "+palabra);
        System.out.println("Encriptado: "+otro);
    }
 }
    

