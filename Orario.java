import java.util.Calendar;
import java.util.GregorianCalendar;

public class Orario {
    
    //CAMPI STATICI
    private static char separatore = ':';
    
    private static boolean formato24 = true;
    
    //CAMPI
    private int ore, min;
    
    //COSTRUTTORI
    public Orario(int hh, int mm){
        ore = hh;
        min = mm;
    }

    public Orario() {
        GregorianCalendar adesso = new GregorianCalendar();
        ore = adesso.get(Calendar.HOUR_OF_DAY);
        min = adesso.get(Calendar.MINUTE);
    }

    public Orario(String s) {
        ore = Integer.parseInt(s.substring(0,2));
        min = Integer.parseInt(s.substring(3,5));
    }
    //METODI    
    public boolean equals(Orario altro) {
        return this.ore == altro.ore && this.min == altro.min;
    }

    public boolean isMinore(Orario altro) {
        return ore < altro.ore || (ore == altro.ore && min < altro.min);
    }

    public boolean isMaggiore(Orario altro) {
        return ore > altro.ore || (ore == altro.ore && min > altro.min);
    }

    public int QuantoManca(Orario altro) {
        return (altro.ore - ore) * 60 + altro.min - min;
    }

    public String toString() {
        String risultato;
        String stringaMin = (min < 10 ? "0" : "") + min;
        if(formato24) 
            risultato = String.valueOf(ore) + separatore + stringaMin;
        else{
            int oraRisultato;
            String suffisso;
            if(ore == 0) {
                oraRisultato = 12;
                suffisso = "am";
            }   else if (ore > 0 && ore < 12) {
                    oraRisultato = ore;
                    suffisso = "am";   
            }   else if (ore == 12) {
                    oraRisultato = 12;
                    suffisso = "pm";
            }   else {
                    oraRisultato = ore - 12;
                    suffisso = "pm";
            }
            risultato = String.valueOf(oraRisultato) + separatore + stringaMin + suffisso; 
        }
        return risultato;
    }

    public int getOre() {
        return ore;
    }

    public int getMinuti() {
        return min;
    }

    //METODI STATICI
    public static void setSeparatoreTo(char ch) {
        separatore = ch;
    }
    
    public static char getSeparatore() {
        return separatore;
    }

    public static void setFormato24(boolean b) {
        formato24 = b;
    }

    public static boolean isFormato24Attivo() {
        return formato24;
    }
}


