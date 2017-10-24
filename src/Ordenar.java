import java.util.LinkedList;
import java.util.Stack;
import java.util.Collections;

public class Ordenar {

    public static void main(String[] args) {

        Stack<String> pila = new Stack<String>();
        int[] vec= new int[11];
        int c=0;int d=0;

        pila.push(Integer.toString(8));
        pila.push(Integer.toString(9));
        pila.push(Integer.toString(56));
        pila.push(Integer.toString(-9));
        pila.push(Integer.toString(6));
        pila.push(Integer.toString(-2));
        pila.push(Integer.toString(8));
        pila.push(Integer.toString(6));
        pila.push(Integer.toString(100));
        pila.push(Integer.toString(-100));
        pila.push(Integer.toString(0));

        while (!pila.empty()){
            vec[c]=Integer.parseInt(pila.pop());
            c=c+1;
        }
        int z;
        boolean b =false;
        while (!b){
            b =true;
            for ( int i= 0; i<10; i++ ){
                if(vec[i] > vec[i+1]){
                    z=vec[i];
                    vec[i]= vec[i+1];
                    vec[i+1]=z;
                    b=false;
                }
            }
        }
        for ( int i= 0; i<11; i++ )
            pila.push(Integer.toString(vec[i]));
        System.out.println(pila );


    while (!pila.empty()){
           vec[d]=Integer.parseInt(pila.pop());
           d=d+1;
       }
       int x;
       boolean y = false;
       while (!y){
           y =true;
           for ( int i= 0; i<10; i++ ){
               if(vec[i]<vec[i+1]){
                   x=vec[i];
                   vec[i]= vec[i+1];
                   vec[i+1]=x;
                   y=false;
               }
           }
       }
        for ( int j= 0; j<11; j++ )
       pila.push(Integer.toString(vec[j]));
       System.out.println(pila );



    }
}











