import java.util.Scanner;
import java.util.Random;
public class DieRoller {
    public static void main(String [] args){
        Random rnd = new Random();
        boolean done=false;
        int sum=0;
        boolean done2=false;
        Scanner in = new Scanner(System.in);
        String cont;




        do {
            int roll=0;
            System.out.println("Roll | Die 1 | Die 2 | Die 3 | Sum");
            System.out.println("----------------------------------");
            do {
                int die1 = rnd.nextInt(1, 7);
                int die2 = rnd.nextInt(1, 7);
                int die3 = rnd.nextInt(1, 7);
                roll++;
                sum = die1 + die2 + die3;

                if (roll < 10) {
                    System.out.println(roll + "    | " + die1 + "     | " + die2 + "     | " + die3 + "     | " + sum);
                } else {
                    System.out.println(roll + "   | " + die1 + "     | " + die2 + "     | " + die3 + "     | " + sum);
                }

                if (die1 == die2 && die2 == die3) {
                    done = true;
                }
            } while (!done);
            System.out.println("Would you like to roll again? [Y/N]");
            cont = in.nextLine();
            if (cont.equals("N")||cont.equals("n")){
                done2=true;
                System.out.println("Goodbye!");
            }else if (cont.equals("Y") || cont.equals("y")){
                System.out.println("Restarting...");
                done = false;
            }else{
                System.out.println("That is not a valid input");
            }
        }while(!done2);
    }
}
