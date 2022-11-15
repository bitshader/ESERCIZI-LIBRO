package Ema;

import java.util.Stack;

public class Esercizio3_2 {

    public static void main(String[] args) {

        String m = ")()(())()()))())))(";
        int soluzione = controllo(m);

        System.out.println("la soluzione ammonta a " + soluzione);

    }

    public static int controllo(String s) {
        int i = 0;
        int sol = 0;
        Stack<Character> myStack = new Stack<Character>();
        while (i <= s.length() - 1) {
            char c = s.charAt(i);
            if (c == '(') {
                myStack.push(c);
                
            } else {
                
                if (myStack.empty() != true) {
                    myStack.pop();
                    sol = sol + 2;
                } 
            }
            
            i++;
        }
        return sol;
    }
}
