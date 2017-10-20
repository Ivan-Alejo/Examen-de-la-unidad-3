import java.io.*;
import java.util.Stack;
public class Palindromo {

    public static void main(String[] args) {
       palabra("AnulalaLuna" );
    }

    public static void palabra(String P) {
     System.out.println("¿La oracion/palabra "+P+" es palindromo? "+ Palindromo(P));
    }
    public static boolean Palindromo(String Cadena){
        Stack<Character> pila=new Stack<Character>();
        for (int i=0; i<Cadena.length(); i++){
            pila.push(Cadena.charAt(i));
        }

        String X="";
        while(!pila.empty()){
            X+=pila.pop();
        }

        if(X.equalsIgnoreCase(Cadena)){
            return true;
        }
        else{return false;}
    }
}





