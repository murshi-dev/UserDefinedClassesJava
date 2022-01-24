import java.util.Scanner;

 public class CellPhoneTest
 {
 public static void main(String[] args)
 {
 String testMan; // To hold a manufacturer
 String testMod; // To hold a model number
 double testPrice; // To hold a price


 Scanner keyboard = new Scanner(System.in);


 System.out.print("Enter the manufacturer: ");
 testMan = keyboard.nextLine();

System.out.print("Enter the model number: ");
 testMod = keyboard.nextLine();

 System.out.print("Enter the retail price: ");
 testPrice = keyboard.nextDouble();

 CellPhone phone = new CellPhone(testMan, testMod, testPrice);


 System.out.println();
 System.out.println("Here is the data that you provided:");
 System.out.println("Manufacturer: " + phone.getManufact());
 System.out.println("Model number: " + phone.getModel());
 System.out.println("Retail price: " + phone.getRetailPrice());
 }
}