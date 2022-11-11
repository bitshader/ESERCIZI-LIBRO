import prog.io.*;

public class Saluto {
    public static void main(String[] args) {

        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        String nome = in.readLine("Ciao come ti chiami? ");

        out.println("Buongiorno " + nome + "!");
    }
}
