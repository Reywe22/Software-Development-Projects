import java.util.Scanner;

public class inputoutput {
    public static void main(String[] args) {
        String cualto = "";
         Scanner scan = new Scanner(System.in);
        System.out.println("Miop tiene cualto");
        cualto = scan.next();

    if (cualto.equalsIgnoreCase("si")) {
        System.out.println("Aqui le tengo su peido.");
}
    else {
        System.out.println("Bueno, este pedido es mioo.");
    }
scan.close();
}}