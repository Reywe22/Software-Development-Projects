import java.util.Scanner;

public class afofbasements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input: ");
        String inputStr = scanner.nextLine();

        int floor = 0;
        int position = 0;

        for (int i = 0; i < inputStr.length(); i++) {
            char ch = inputStr.charAt(i);

            if (ch == '(') {
                floor++;
            } 
            else if (ch == ')') {
                floor--;
            }
            if (position == 0 && floor == -1) {
                position = i + 1;
            }
        }

        System.out.println(floor);
        System.out.println(position);
        scanner.close();
    }
}