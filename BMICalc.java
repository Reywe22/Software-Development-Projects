import java.util.Scanner;

public class BMICalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean stop = false;
        double BMI = -1;
        try {
            while (!stop) {
                System.out.println("Do you prefer to measure your BMI in metric or imperial? (Type 'exit' to exit)");
                String awjfd = scanner.nextLine().toLowerCase();

                if (awjfd.equals("exit")) {
                    stop = true;
                    continue;
                }

                try {
                    if (!awjfd.equals("imperial") && !awjfd.equals("metric")) {
                        throw new Exception("Your input is invalid, try again.");
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    scanner.nextLine(); 
                    continue;
                }

                if (awjfd.equals("metric")) {
                    System.out.println("Tell me your weight in kgs (Kilograms)");
                    double kilograms;
                    try {
                        kilograms = scanner.nextDouble();
                    } catch (Exception e) {
                        System.out.println("Your input was not a number.");
                        scanner.nextLine(); 
                        continue;
                    }
                    scanner.nextLine(); 

                    System.out.println("Tell me your height in meters (With Decimals if needed)");
                    double heightM;
                    try {
                        heightM = scanner.nextDouble();
                    } catch (Exception e) {
                        System.out.println("Your input was not a number.");
                        scanner.nextLine(); 
                        continue;
                    }
                    scanner.nextLine(); 

                    BMI = kilograms / (heightM * heightM);
                    System.out.printf("Your BMI is %.2f%n", BMI); 
                } else if (awjfd.equals("imperial")) {
                    System.out.println("Tell me your weight in Pounds");
                    double pounds;
                    try {
                        pounds = scanner.nextDouble();
                    } catch (Exception e) {
                        System.out.println("Your input was not a number.");
                        scanner.nextLine(); 
                        continue;
                    }
                    scanner.nextLine(); 

                    System.out.println("Tell me your height in inches");
                    double heightIn;
                    try {
                        heightIn = scanner.nextDouble();
                    } catch (Exception e) {
                        System.out.println("Your input was not a number.");
                        scanner.nextLine(); 
                        continue;
                    }
                    scanner.nextLine(); 

                    BMI = (pounds / (heightIn * heightIn)) * 703;
                    System.out.printf("Your BMI is %.2f%n", BMI);
                }

                if (BMI >= 0 && BMI <= 18) {
                    System.out.println("You are UnderWeight");
                } else if (BMI >= 19 && BMI <= 24) {
                    System.out.println("You are Healthy.");
                } else if (BMI >= 25 && BMI <= 29) {
                    System.out.println("You are OverWeight");
                } else if (BMI >= 30 && BMI <= 39) {
                    System.out.println("You are Obese");
                } else if (BMI >= 40 && BMI <= 65) {
                    System.out.println("You are Extremely Obese.");
                }
            }
        } catch (Exception e) {
            System.out.println("an error has occured.");
        }
        scanner.close();
    }
}
