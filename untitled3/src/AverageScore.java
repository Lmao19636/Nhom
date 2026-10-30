import java.util.Scanner;
public class AverageScore
{
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double score1, score2, score3, average;
        System.out.print("enter:");
        score1 = scanner.nextDouble();
        System.out.print("enter 2:");
        score2 = scanner.nextDouble();
        System.out.print("enter 3:");
        score3 = scanner.nextDouble();
        average = (score1 +score2 + score3)/ 3.0;
        // If the score was greater than 95, let the user know
        // that's a great score
        if (average > 95)
            System.out.println("that great:");
    }
}