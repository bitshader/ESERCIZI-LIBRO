import prog.io.*;
class SommaVettori {
    public static void main(String[] args) {
    
        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();
//leggi la lunghezza dei vettori
        int lunghezza = in.readInt("Lunghezza dei vettori? ");
//leggi il primo vettore
        out.println("Lettura primo vettore");
        int[] vett1 = leggiVettore(in, lunghezza);
//leggi il secondo vettore
        out.println("Lettura secondo vettore");
        int[] vett2 = leggiVettore(in, lunghezza);
//calcola il vettore somma
        int[] somma = new int[lunghezza];
        for (int i = 0; i < somma.length; i++)
            somma[i] = vett1[i] + vett2[i];
//costruisci le stringhe che rappresentano i tre vettori
        String strVett1 = generaStringa(vett1);
        String strVett2 = generaStringa(vett2);
        String strSomma = generaStringa(somma);
//scrivi le stringhe
        out.println("Vettore 1: [" + strVett1 + "]");
        out.println("Vettore 2: [" + strVett2 + "]");
        out.println("Vettore 3: [" + strSomma + "]");
    }

    private static int[] leggiVettore(ConsoleInputManager input, int lung) {
        int[] vettore = new int[lung];
        for (int i = 0; i < vettore.length; i++)
            vettore[i] = input.readInt("Elemento " + i + "? ");
        return vettore;
    }

    private static String generaStringa(int[] vettore) {
        String risultato = "";
        for (int i = 0; i < vettore.length; i++)
            risultato += vettore[i] + (i < vettore.length - 1 ? " " : "");
        return risultato;
    }
}
