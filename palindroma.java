/* 
public class palindroma {

public static boolean palindroma(String s) {

    int lung = s.length();
    if(lung <= 1 )
        return true;
    else if (s.chartAt(0) != s.charAt(lung - 1))
        return false;
    else return palindroma(s.substring(1, lung - 1));
}
}
*/