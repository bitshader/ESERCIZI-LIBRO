package EsempiLibro;
import prog.io.*;

public class SommaInColonna {
    
    public static void main(String[] args){

        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        //Righe utilizzate per costruire il risultato
        String rigaMeno = "----------";
        String spazi = "         ";
        int op1, op2, somma;

        //lettura dati
        op1 = in.readInt("Inserisci il primo operatore: ");
        op2 = in.readInt("Inserisci il secondo operatore: ");

        //Calcolo della somma
        somma = op1 + op2;

        //Costruzione delle stringhe che rappresentano i valori
        String strOp1 = String.valueOf(op1);
        String strOp2 = String.valueOf(op2);
        String strSomma = String.valueOf(somma);

        //Costruzione delle righe da stampare

        String riga1 = spazi.substring(0, strSomma.length() - strOp1.length()) + strOp1 + "+";
        String riga2 = spazi.substring(0, strSomma.length() - strOp2.length());
        String riga3 = rigaMeno.substring(0, strSomma.length());

        //Visualizzazione della somma
        out.println(riga1);
        out.println(riga2);
        out.println(riga3);
        out.println(strSomma);


    }
}
