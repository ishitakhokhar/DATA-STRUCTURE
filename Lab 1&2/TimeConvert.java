// WAP to convert seconds into hours, minutes & seconds and print in HH:MM:SS
// [e.g. 10000 seconds mean 2:46:40 (2 Hours, 46 Minutes, 40 Seconds)].

import java.util.Scanner;

public class TimeConvert {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of seconds : ");
        int totalSeconds = scanner.nextInt();

        int hours = totalSeconds / 3600;
        int remainingSeconds = totalSeconds % 3600;
        int minutes = remainingSeconds / 60;
        int seconds = remainingSeconds % 60;

        System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);
        scanner.close();
    }
}
