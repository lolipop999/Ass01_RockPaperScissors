import java.security.KeyStore;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String playerA = "";
        String playerB = "";
        String trash = "";
        boolean playAgain = true;
        boolean invalid = true;
        String again = "";
        Scanner in = new Scanner(System.in);

        do
        {
            do {
                System.out.print("Player A move [R, P, S]: ");

                playerA = in.nextLine();
                in.nextLine();

                if (playerA.equals("R"))
                {
                    invalid = false;
                }
                else
                {
                    if (playerA.equals("P"))
                    {
                        invalid = false;
                    }
                    else
                    {
                        if (playerA.equals("S"))
                        {
                            invalid = false;
                        }
                        else
                        {
                            invalid = true;
                        }
                    }
                }
            }
            while (invalid);

            do {
                System.out.print("Player B move [R, P, S]: ");

                playerB = in.nextLine();
                in.nextLine();

                if (playerB.equals("R"))
                {
                    invalid = false;
                }
                else
                {
                    if (playerB.equals("P"))
                    {
                        invalid = false;
                    }
                    else
                    {
                        if (playerB.equals("S"))
                        {
                            invalid = false;
                        }
                        else
                        {
                            invalid = true;
                        }
                    }
                }
            }
            while (invalid);

            if (playerA == playerB)
            {
                System.out.println("Tie");
            }
            else if (playerA.equals("P"))
            {
                if (playerB.equals("R"))
                {
                    System.out.println("Player A wins. Paper beats Rock");
                }
                else if (playerB.equals("S"))
                {
                    System.out.println("Player B wins. Scissors beats Paper");
                }
            }
            else if (playerA.equals("R"))
            {
                if (playerB.equals("P"))
                {
                    System.out.println("Player B wins. Paper beats Rock");
                }
                else if (playerB.equals("S"))
                {
                    System.out.println("Player A wins. Rock beats Scissors");
                }
            }
            else if (playerA.equals("S"))
            {
                if (playerB.equals("P"))
                {
                    System.out.println("Player A wins. Scissors beats Paper");
                }
                else if (playerB.equals("R"))
                {
                    System.out.println("Player B wins. Rock beats Scissors");
                }
            }

            System.out.print("Would you like to play again [Y, N]: ");
            again = in.nextLine();
            in.nextLine();
            if (again.equals("Y"))
            {
                playAgain = true;
            }
            else
            {
                playAgain = false;
            }
        }
        while (playAgain);

    }
}
