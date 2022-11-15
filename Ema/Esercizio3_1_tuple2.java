package Ema;

import java.util.Stack;

public class Esercizio3_1_tuple2 {

    public static void main(String[] args) {

        String m = "())(())";
        int[] posizione = controllo(m);
        if (posizione[0] == 1) {
            System.out.println("FUNZIONA");
        } else {
            System.out.println("NON FUNZIONA");
            System.out.println("Prima parentesi sbagliata alla posizione " + posizione[1]);
        }

    }

    public static int[] controllo(String s) {
        int i = 0;
        int conta = 1;
        Stack<Character> myStack = new Stack<Character>();
        while (i <= s.length() - 1) {
            char c = s.charAt(i);
            if (c == '(') {
                myStack.push(c);
                
            } else {
                if (myStack.empty() != true) {
                    myStack.pop();
                    
                } else {
                    return new int[] { 0, conta++ };
                }
            }
            conta++;
            i++;
        }
        return new int[] { 1, 0 };
    }
}
