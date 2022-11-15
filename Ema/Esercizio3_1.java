package Ema;
import java.util.Stack;

public class Esercizio3_1 {
    
static int conta = 1;
    public static void main(String[] args) {
        
        String m = "((()))()))";
        
        if(controllo(m) == true){
            System.out.println("FUNZIONA");
        }else{
            System.out.println("NON FUNZIONA");
            System.out.println("Prima parentesi sbagliata alla posizione " + conta);
        }
    
    }

    public static boolean controllo(String s){
        int i=0;
        Stack<Character> myStack = new Stack<Character>();
        while(i<= s.length()-1){
            char c = s.charAt(i);
            if(c == '('){
                myStack.push(c);
                conta++;
            }
            else{
                if(myStack.empty() != true){
                myStack.pop();
                conta++;
            }
                else{
                    return false;
                }
            }
            i++;
        }
        return true;
    }
}
    
