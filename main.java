import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner checker = new Scanner(System.in);
        System.out.println("Give me a number");
        int integer = checker.nextInt();

    if (integer > 0) {
        System.out.println("This number is positive");
}
    else if (integer < 0) {
    System.out.println("This number is negative");
}
    else {
    System.out.println("This number is a positive or negative");
}
    checker.close();
}
    
}