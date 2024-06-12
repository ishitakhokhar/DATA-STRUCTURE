
//  WAP to convert umber of days into year, week & days [e.g. 375 days mean 1 year, 1
// week and 3 days].
import java.util.Scanner;

public class Year {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of days : ");
        int totaldays = scanner.nextInt();

        int Years = totaldays / 365;
        int remainingDays = totaldays % 365;
        int weeks = remainingDays / 7;
        int days = remainingDays % 7;
        System.out.printf("%d days mean %d year(s), %d week(s), and %d day(s).\n",
                totaldays, Years, weeks, days);
        scanner.close();
    }
}
