import java.util.Scanner;

public class App {


    public static void main(String[] args) throws Exception {
        ASCIIMorse asciiMorse = new ASCIIMorse();
        MorseASCII morseAscii = new MorseASCII();
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2= new Scanner(System.in);
        int opcion;
        String expression = "";
        System.out.println("Hola elige la opcion que desees:");
        System.out.println("Pulsa 1 si quieres traducir de morse a ascii");
        System.out.println("Pulsa 2 si quieres traducir de ascii a morse");
        opcion=scanner.nextInt();

        if(opcion==1){
            System.out.println("Has elegido 1 (Morse ----> ASCII)");
            expression=scanner2.nextLine();
            String traduccion=morseAscii.morseToAscii(expression.trim());

            System.out.println(traduccion);

        }

        if(opcion==2){
            System.out.println("Has elegido 2 (ASCII ----> Morse)");
            expression=scanner2.nextLine();
            String traduccion=asciiMorse.traducir(expression);

            System.out.println(traduccion);
        }
        scanner.close();
        scanner2.close();
        

    }
}
