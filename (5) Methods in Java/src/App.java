import java.util.Scanner;
import java.util.Random;

public class App {

    public static void main(String[] args) throws Exception {
        
        //Declaration
        int userInput;

        //Instantiate
        try(Scanner input = new Scanner(System.in)) {
            System.out.print(
              "1. Addition \n"
            + "2. Subtraction \n" 
            + "3. Multiplication \n"
            + "4. Division \n"
            + "5. Modulo \n"
            + "Type Number Here: ");
            userInput = input.nextInt();
            System.out.println("-----------------------------------------------------------------------");
            System.out.println();
        };  

        calculate(userInput);
        System.out.println();
        System.out.println(
            "(@" + "\u0052" + "\u0061" + "\u0066" + "\u0061" 
            + "\u0065" + "\u006C" + " " + "\u004D" + "\u0061" + "\u0072"
            + "\u0069" + "\u0062" + "\u006F" + "\u006A" + "\u006F"
            + "\u0063)"
            );
    }

    public static int calculate(int userInput) {
        //Instantiation
        
        Random random = new Random();
        
        //Initialization

        int addition, subtraction, multiplication, division, modulo;
        int addition2, subtraction2, multiplication2, division2, modulo2;
        
        //Conditional Process

        if (userInput == 1) {
            addition = random.nextInt(10) + 1;
            addition2 = random.nextInt(10) + 1;
            System.out.println("Addition: " + addition + " + " + addition2 + " = " + (addition + addition2));
            return addition;
        } else if (userInput == 2) {
            subtraction = random.nextInt(10) + 1;
            subtraction2 = random.nextInt(10) + 1;
            System.out.println("Subtraction: " + subtraction + " - " + subtraction2 + " = " + (subtraction - subtraction2));
            return subtraction;
        } else if (userInput == 3) {
            multiplication = random.nextInt(10) + 1;
            multiplication2 = random.nextInt(10) + 1;
            System.out.println("Multiplication: " + multiplication + " * " + multiplication2 + " = " + (multiplication * multiplication2));
            return multiplication;
        } else if (userInput == 4) {
            division = random.nextInt(10) + 1;
            division2 = random.nextInt(10) + 1;
            System.out.println("Division: " + division + " / " + division2 + " = " + (division / division2));
            return division;
        } else if (userInput == 5) {
            modulo = random.nextInt(10) + 1;
            modulo2 = random.nextInt(10) + 1;
            System.out.println("Modulo: " + modulo + " % " + modulo2 + " = " + (modulo % modulo2));
            return modulo;
        }
        else if (userInput != 1 || userInput != 2 || userInput != 3 || userInput != 4 || userInput != 5) {
            System.out.println("Error! Fuck off!");
            return userInput;
        } else {
            return -1;
        }
    }
}
