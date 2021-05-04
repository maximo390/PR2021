
package Tp1_Maximo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Suma {
    public static int suma(int a, int b){
        return a+b;
    }
    public static int resta(int a, int b){
        return a-b;
    }
    public static int producto(int a, int b){
        return a*b;
    }
    public static int division(int a, int b){
        return a/b;
    }
    public static void main(String[] args) {
        BufferedReader lector=new BufferedReader(new InputStreamReader(System.in));
        try {
            String terminar="no";
            PrintWriter teclado=new PrintWriter("texto.txt");
            while(!terminar.equals("si")){

                int numUno=0, numDos=0;
                char operacion=' ';
                String entrada="";
                int resultado=0;
                System.out.println("Ingrese la operacion: ");
                entrada=lector.readLine();
                int lugar=entrada.indexOf('+');
                if(lugar==-1){
                   lugar=entrada.indexOf('-'); 
                }
                if(lugar==-1){
                   lugar=entrada.indexOf('*'); 
                }
                if(lugar==-1){
                   lugar=entrada.indexOf('/'); 
                }
                numUno=Integer.parseInt(entrada.substring(0, lugar));
                operacion=entrada.substring(lugar, lugar+1).charAt(0);
                numDos=Integer.parseInt(entrada.substring(lugar+1));
                switch(operacion){
                    case '+': resultado=suma(numUno,numDos);
                            break;
                    case '-':resultado=resta(numUno,numDos);
                            break;
                    case '*':resultado=producto(numUno,numDos);
                            break;
                    case '/':resultado=division(numUno,numDos);
                            break;            
                }
                
                String cadena=entrada+"="+resultado;
                teclado.println(cadena);
                System.out.println("Desea terminar si/no: ");                 
                terminar=lector.readLine();
                
            }
            //System.in
            teclado.close();
        } catch (IOException ex) {
            Logger.getLogger(Suma.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

