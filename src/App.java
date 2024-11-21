import java.util.Scanner;

public class App {


    public static void main(String[] args) throws Exception {
        ASCIIMorse asciiMorse = new ASCIIMorse();
        Scanner scanner = new Scanner(System.in);
        String expression = "";
        System.out.println("Hola que quieres traducir");
        expression=scanner.nextLine();
        System.out.println(asciiMorse.traducir(expression));
        scanner.close();
        

    }
}
