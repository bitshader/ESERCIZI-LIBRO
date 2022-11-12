import prog.io.*;

public class ExCinquePuntoQuattroV2 {

    public static void main(String[] args) {

        int[] arraySmallerThan10 = { 10, 4, 5, 6, 7, 8, 2 };
        int[] arraySmallerThan20 = { 20, 4, 5, 6, 7, 8, 2, 1, 4, 5, 6, 7, 8, 2 };
        int[] arraySmallerThan30 = { 30, 4, 5, 6, 7, 8, 2, 1, 4, 5, 6, 7, 8, 21, 4, 5, 6, 7, 8, 21, 4, 5, 6, 7, 8, 2 };
        problema(arraySmallerThan10);
        problema(arraySmallerThan20);
        problema(arraySmallerThan30);
    }

    public static void problema(int[] input) {
        ConsoleOutputManager out = new ConsoleOutputManager();

        int MAX = 10;
        int[] A = new int[MAX];
        int pos = 0;
        for (int n : input) {
            A[pos] = n;
            pos = pos + 1;
            if (pos >= MAX) {
                MAX = MAX * 2;
                int[] tmp_A = new int[MAX];
                for (int i = 0; i < A.length; i++) {
                    tmp_A[i] = A[i];
                }
                A = tmp_A;
            }
        }
        for (int i = 0; i < A.length; i++) {
            out.print(A[i] + " ");
        }
        out.println();
    }
}