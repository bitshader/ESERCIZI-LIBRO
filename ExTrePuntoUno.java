import prog.io.*;



public class ExTrePuntoUno {
    
    public static void main(String[] args){

        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        int num = in.readInt("Inserire numeratore prima frazione ");
        int den = in.readInt("Inserire denominatore seconda frazione ");
        Frazione f1 = new Frazione(num, den);

        num = in.readInt("Inserire numeratore seconda frazione ");
        den = in.readInt("Inserire denominatore seconda frazione ");
        Frazione f2 = new Frazione(num , den);

        if (f1.isMaggiore(f2))
            out.println(f2 + " " + f1);
        else {
            out.print(f1);
            out.println(" " + f2);
        }

            


            
        
         
    
    
    }    


}
