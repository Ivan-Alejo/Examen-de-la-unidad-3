import java.util.LinkedList;
import java.util.Stack;
import java.util.Collections;

public class Ordenar {
    public static void main(String[] args) {

        Stack<String> pila = new Stack<String>();
        int[] vec= new int[10];
        int c=0;

        pila.push(Integer.toString(8));
        pila.push(Integer.toString(9));
        pila.push(Integer.toString(56));
        pila.push(Integer.toString(-9));
        pila.push(Integer.toString(6));
        pila.push(Integer.toString(-2));
        pila.push(Integer.toString(5));
        pila.push(Integer.toString(0));
        pila.push(Integer.toString(100));
       pila.push(Integer.toString(-100));

     /* while (!pila.empty()){
           vec[c]=Integer.parseInt(pila.pop());
           c=c+1;
       }
       int aux;
       boolean band = false;
       while (!band){
           band =true;
           for ( int i= 0; i<9; i++ ){
               if(vec[i]<vec[i+1]){
                   aux=vec[i];
                   vec[i]= vec[i+1];
                   vec[i+1]=aux;
                   band=false;
               }
           }
       }
        for ( int i= 0; i<10; i++ )
       pila.push(Integer.toString(vec[i]));
       System.out.println(pila );*/

        while (!pila.empty()){
            vec[c]=Integer.parseInt(pila.pop());
            c=c+1;
        }
        int aux;
        boolean band = false;
        while (!band){
            band =true;
            for ( int i= 0; i<9; i++ ){
                if(vec[i]<vec[i+1]){
                    aux=vec[i];
                    vec[i]= vec[i+1];
                    vec[i+1]=aux;
                    band=false;
                }
            }
        }
        for ( int i= 0; i<10; i++ )
            pila.push(Integer.toString(vec[i]));
        System.out.println(pila );


    }
}









