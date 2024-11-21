package src;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        MorseAscii morseAscii = new MorseAscii();
        AsciiMorse asciiMorse = new AsciiMorse();

        while (true){
            System.out.println("Elije un numero para traducir: Ascii --> Morese (1) / Morse --> Ascii (2):");
            int numeroTraduccion = scaner.nextInt();

            if(numeroTraduccion == 1){
                System.out.println("Introduce tu frase en Ascii: ");
                String morseSentence = scaner.nextLine();

                String asciiText = MorseAscii.traducir(morseSentence);

                System.out.println("Translated Morse (text): " + asciiText);
                scaner.close();
            } else if (numeroTraduccion == 2) {
                System.out.println("Introduce tu frase en Morse: ");
                String morseSentence = scaner.nextLine();

                String asciiText = asciiMorse.traducir(morseSentence);

                System.out.println("Translated Ascii (text): " + asciiText);
                scaner.close();
            } else {
                System.out.println("Introduce un numero valido");
            }
        }


    }
}
