import java.util.Scanner;

public class oddorevenchecker {
    public static void main(String[] args) {
        Scanner checker = new Scanner(System.in);
        System.out.println("Give me a number");
        int integer = checker.nextInt();

    if (integer % 2 == 0) {
        System.out.println("This number is even");
}
    else {
        System.out.println("This number is odd");
    }
checker.close();
}
}