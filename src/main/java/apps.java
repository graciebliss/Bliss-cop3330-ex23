/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Gracie Bliss
 */
import java.util.*;
public class apps {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Process
        System.out.print("Is the car silent when you turn the key? ");
        String silent = in.nextLine();
        silent=silent.toLowerCase();

        if(silent.equals("y"))
        {
            System.out.print("Are the battery terminals corroded? ");
            String corroded = in.nextLine();
            corroded=corroded.toLowerCase();

            if(corroded.equals("y"))
            {
                System.out.println("Clean and replace terminals and try again.");
                return;
            }
            else
            {
                System.out.println("Replace the cables and try again.");
                return;
            }
        }
        else
        {
            System.out.print("Does the car make a slicking noise? ");
            String slicking = in.nextLine();
            slicking=slicking.toLowerCase();

            if(slicking.equals("y"))
            {
                System.out.println("Replace the battery.");
                return;
            }
            else
            {
                System.out.print("Does the car crank up but fail to start? ");
                String crankUp = in.nextLine();
                crankUp= crankUp.toLowerCase();

                if(crankUp.equals("y"))
                {
                    System.out.println("Check the spark plug connections");
                    return;
                }
                else
                {
                    System.out.print("Does the engine start and then die? ");
                    String startDie = in.nextLine();
                    startDie=startDie.toLowerCase();

                    if(startDie.equals("y"))
                    {
                        System.out.print("Does your car have a fuel injection? ");
                        String injection = in.nextLine();
                        injection=injection.toLowerCase();

                        if(injection.equals("y"))
                        {
                            System.out.println("Get it in for service.");
                            return;
                        }
                        else
                        {
                            System.out.println("Check to ensure the choke is opening and closing.");
                            return;
                        }
                    }
                    else
                    {
                        System.out.println("This should not be possible.");
                        return;
                    }
                }
            }
        }
    }

}
