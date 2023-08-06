package pl.kurs.bookex.Ex1;

import java.util.Arrays;

public class BookExercises {
    public static void main(String[] args) {
        int sample[] = new int[20];
        int i;

        for (i = 3; i < 10; i++) {
            sample[i] = i;
        }

        for (i = 8; i < 20; i++) {
            System.out.println("element sample[" + i + "]: " + sample[i]);
        }

        System.out.println(sample);
        System.out.println(Arrays.toString(sample));

    }
}
