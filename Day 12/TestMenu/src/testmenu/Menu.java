package testmenu;

import java.util.Scanner;

public class Menu {
    public Menu() {
        displayConversionSubMenu();
    }
    
    public void displayConversionSubMenu() {
        System.out.println("=== CONVERTION MENU ===");
        System.out.println("1.Grams To Ounces");
        System.out.println("2.Ounces To Grams");
        System.out.println("3.Kilograms To Stone");
        System.out.println("4.Stone To Kilograms");
        System.out.println("5.Pounds To Gram");
        System.out.println("6.Grams To Pounds");
        System.out.println("0.Exit");
        
        Conversion c1 = new Conversion();
        double weight;
        Scanner input1 = new Scanner(System.in);
        
        int choice1 = input1.nextInt();
        
        switch(choice1) {
            case 1 : System.out.print("Enter the weight in grams: ");
                     weight = input1.nextDouble();
                     System.out.println("Weight in ounce: " +c1.GramsToOunces(weight));
                     break;
            case 2 : System.out.print("Enter the weight in ounces: ");
                     weight = input1.nextDouble();
                     System.out.println("Weight in grams: " +c1.OunToGrams(weight));
                     break;
            case 3 : System.out.print("Enter the weight in kilograms: ");
                     weight = input1.nextDouble();
                     System.out.println("Weight in stones: " +c1.KgToStone(weight));                 
                     break;
            case 4 : System.out.print("Enter the weight in stone: ");
                     weight = input1.nextDouble();
                     System.out.println("Weight in kilograms: " +c1.StoneToKg(weight));
                     break;
            case 5 : System.out.print("Enter the weight in pounds: ");
                     weight = input1.nextDouble();
                     System.out.println("Weight in grams: " +c1.PoundsToGram(weight));
                     break;
            case 6 : System.out.print("Enter the weight in grams: ");
                     weight = input1.nextDouble();
                     System.out.println("Weight in pounds: " +c1.GramToPound(weight));
                     break;
            case 0 : System.exit(0); break; 
            default: displayConversionSubMenu();
        }
        displayConversionSubMenu();
    }

}
