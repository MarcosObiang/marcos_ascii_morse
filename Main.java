import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        HashMap<String, String> morseAscii = new HashMap<String, String>();

        // Morse code mapping to ascii
        morseAscii.put(".-", "A");
        morseAscii.put("-...", "B");
        morseAscii.put("-.-.", "C");
        morseAscii.put("-..", "D");
        morseAscii.put(".", "E");
        morseAscii.put("..-.", "F");
        morseAscii.put("--.", "G");
        morseAscii.put("....", "H");
        morseAscii.put("..", "I");
        morseAscii.put(".---", "J");
        morseAscii.put("-.-", "K");
        morseAscii.put(".-..", "L");
        morseAscii.put("--", "M");
        morseAscii.put("-.", "N");
        morseAscii.put("---", "O");
        morseAscii.put(".--.", "P");
        morseAscii.put("--.-", "Q");
        morseAscii.put(".-.", "R");
        morseAscii.put("...", "S");
        morseAscii.put("-", "T");
        morseAscii.put("..-", "U");
        morseAscii.put("...-", "V");
        morseAscii.put(".--", "W");
        morseAscii.put("-..-", "X");
        morseAscii.put("-.--", "Y");
        morseAscii.put("--..", "Z");

        System.out.println("Introduce tu frase en morse: ");
        String morseSentence = scaner.nextLine();

        // Translate Morse code to ASCII (text)
        String asciiText = morseToAscii(morseSentence, morseAscii);

        // Output the result
        System.out.println("Translated ASCII (text): " + asciiText);
        scaner.close();
    }

    // Method to convert a Morse code sentence to ASCII text
    public static String morseToAscii(String morseSentence, HashMap<String, String> morseAscii) {
        StringBuilder asciiText = new StringBuilder();

        // Split the sentence by " " (used for word separation in Morse code)
        String[] words = morseSentence.split(" ");

        for (String word : words) {
            // Split each word by single space to get individual Morse symbols
            String[] morseSymbols = word.split(" ");

            // Translate each Morse symbol into its corresponding ASCII letter
            for (String morseSymbol : morseSymbols) {
                String letter = morseAscii.get(morseSymbol);
                if (letter != null) {
                    asciiText.append(letter);
                }
            }

            // Add a space after each word (except the last word)
            asciiText.append(" ");
        }

        // Remove the trailing space
        return asciiText.toString().trim();
    }

}
