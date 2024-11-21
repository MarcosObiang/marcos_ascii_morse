package src;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MorseAscii morseAscii = new MorseAscii();
        AsciiMorse asciiMorse = new AsciiMorse();

        while (true){
            System.out.println("Elije un numero para traducir: Ascii --> Morese (1) / Morse --> Ascii (2), para salir (3):");
            int numeroTraduccion = scanner.nextInt();
            scanner.nextLine();

            if(numeroTraduccion == 1){
                System.out.println("Introduce tu frase en Ascii: ");
                String asciiSentence = scanner.nextLine();

                String morseText = morseAscii.traducir(asciiSentence);

                System.out.println("Translated Morse (text): " + morseText);
            } else if (numeroTraduccion == 2) {
                System.out.println("Introduce tu frase en Morse: ");
                String morseSentence = scanner.nextLine();

                String asciiText = asciiMorse.traducir(morseSentence);

                System.out.println("Translated Ascii (text): " + asciiText);
            } else if (numeroTraduccion == 3){
                System.out.println("Saliendo...");
                break;
            } else {
                System.out.println("Introduce un numero valido");
            }
        }
        scanner.close();
    }
}
