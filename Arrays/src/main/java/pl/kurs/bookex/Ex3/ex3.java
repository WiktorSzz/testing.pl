package pl.kurs.bookex.Ex3;

public class ex3 {
    public static void main(String[] args) {

        int ints[] = {333, 12, 30, 1, 67};


         int  min, max;

         min = max = ints[0];
        if (ints[1] < min) min = ints[1];
        if (ints[1] > max) max = ints[1];
        if (ints[2] < min) min = ints[2];
        if (ints[2] > max) max = ints[2];
        if (ints[3] < min) min = ints[3];
        if (ints[3] > max) max = ints[3];
        if (ints[4] < min) min = ints[4];
        if (ints[4] > max) max = ints[4];
        if (ints[5] < min) min = ints[5];
        if (ints[5] > max) max = ints[5];
        if (ints[6] < min) min = ints[6];
        if (ints[6] > max) max = ints[6];
        if (ints[7] < min) min = ints[7];
        if (ints[7] > max) max = ints[7];
        if (ints[8] < min) min = ints[8];
        if (ints[8] > max) max = ints[8];
        if (ints[9] < min) min = ints[9];
        if (ints[9] > max) max = ints[9];
        System.out.println("Najmniejsza i największa wartość: " +min+ " " +max);

    }
}
