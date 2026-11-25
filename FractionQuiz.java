import java.util.Scanner;

public class FractionQuiz
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
		int correct = 0;
        int total = 0;
		String input = "";
		System.out.println("Let the Fraction Quiz Begin. Answers should be in lowest terms. Good luck!");
		System.out.println();
        while (!input.equals("quit"))
        {
            Fraction f1 = new Fraction();
            Fraction f2 = new Fraction();
            int random = (int)(Math.random() * 4);
            String operator;
            Fraction answer;
            if (random == 0)
            {
                operator = "+";
                answer = f1.add(f2);
            }
            else if (random == 1)
            {
                operator = "-";
                answer = f1.subtract(f2);
            }
            else if (random == 2)
            {
                operator = "*";
                answer = f1.multiply(f2);
            }
            else
            {
                operator = "/";
                answer = f1.divide(f2);
            }

            System.out.print(f1 + " " + operator + " " + f2 + " = ");
            input = in.nextLine();
            if (input.equals("quit"))
            {
                break;
            }

            Fraction userAnswer = new Fraction(input);
            total++;

            if (userAnswer.equals(answer))
            {
                System.out.println("Correct!");
                correct++;
            }
            else
            {
                System.out.println("Wrong, the answer was "
                        + answer);
            }

            System.out.println();
        }

        System.out.println();

        if (total > 0)
        {
            Fraction score = new Fraction(correct, total);

            int percentage = (int)Math.round(
                    score.toDouble() * 100);

            System.out.println("You answered " + score
                    + " correctly, for a score of "
                    + percentage + " percent!");
        }
        else
        {
            System.out.println("No questions were answered.");
        }

        in.close();
    }
}
