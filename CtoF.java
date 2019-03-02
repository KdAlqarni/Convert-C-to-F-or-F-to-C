/**
 * Khalid Alqarni
 */
import java.util.Scanner;


public class CtoF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nThis program will convert Celcius to Farenheit or the way around.\n");
	    System.out.println("To convert Celcius to Farenheit Enter: 1\nTo convert Farenheit to Celcius Enter: 2\n");
	    int userInput = input.nextInt();

        if (userInput == 1){
            System.out.println("Enter Celcius number:\n");
            double cels = input.nextDouble();
            double fah = (9.0/5)*cels+32;
            System.out.printf("%-5.1f \t \t%-5.1f\n", cels, fah);
        }
        else if ( userInput == 2){
            System.out.println("Enter Farenheit number:\n");
            double fah = input.nextDouble();
            double cels = (5.0/9)*(fah -32);
            System.out.printf("%-5.1f \t\t\t\t%-5.1f\n", fah, cels);
        }
        
        else{
            System.out.println("Invaild Input!!\n");
        }

        // double Cels;
        // double Fah;
        // for (double i = 40; i >=32; i--){
        //     Cels = i;
        //     Fah = (9.0/5)*Cels+32;
        //     System.out.printf("%-5.1f \t \t%-5.1f\n", Cels, Fah);
        // }
        // System.out.println();
        // System.out.println("Fahrenheit\t\t\tCelsius \t");

        // for (double i = 120; i >= 30; i = i-10){
        //     Fah = i;
        //     Cels = (5.0/9)*(Fah -32);
        //     System.out.printf("%-5.1f \t\t\t\t%-5.1f\n", Fah, Cels);

        // }

    }
}

