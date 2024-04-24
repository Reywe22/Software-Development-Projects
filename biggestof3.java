import java.util.Scanner;

public class biggestof3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me an number");
        int number = scanner.nextInt();
        
        System.out.println("Give me another number");
        int number2 = scanner.nextInt();

        System.out.println("Give me another number");
        int number3 = scanner.nextInt();

    if (number > number2 && number > number2) {
        System.out.println("First number (" + number + ") is bigger than second integer (" + number2 +") and is bigger than third integer (" + number3 +")");
} 
    else if (number2 > number && number2 > number3) {
        System.out.print("Second number (" + number2 + ") is bigger than first number (" + number +") and is bigger than third number (" + number3 +")");
}
    else if (number3 > number && number3 > number2) {
        System.out.print("Third number (" + number3 + ") is bigger than first number (" + number +") and is bigger than second number (" + number2 +")");
}
    else {
        System.out.println("All number are the same");
    }
scanner.close();
}}