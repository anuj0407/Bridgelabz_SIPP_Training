import java.util.Scanner;

class DigitFrequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = input.nextLong();

        int[] freq = new int[10];
        while (number > 0) {
            int digit = (int)(number % 10);
            freq[digit]++;
            number = number / 10;
        }
        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " occurs " + freq[i] + " times.");
            }
        }

    }
}