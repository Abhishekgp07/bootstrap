package org.bootstrap.ArrayProgm;

public class Pgm {
    public static void main(String[] args) {
        int seq[] = new int[100];

        for (int i = 0; i < 100; i++) {
            int number = 9 * (i + 1);

            int lastDigit = number % 10;
            int secDigit = (number / 10) % 10;

            if (lastDigit == secDigit + 3 || secDigit == lastDigit + 3) {
                number = -number;
            }

            seq[i] = number;
        }


        for (int num : seq) {
            System.out.print(num + " ");
        }
    }
}
