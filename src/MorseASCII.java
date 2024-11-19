import java.util.HashMap;
import java.util.Scanner;

public class MorseASCII {
    HashMap<String, String> morseAscii = new HashMap<String, String>();

    public MorseASCII() {
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

    }





    public String morseToAscii(String morseSentence) {
        StringBuilder asciiText = new StringBuilder();

        String[] words = morseSentence.split(" ");

        for (String word : words) {
            String[] morseSymbols = word.split(" ");

            for (String morseSymbol : morseSymbols) {
                String letter = morseAscii.get(morseSymbol);
                if (letter != null) {
                    asciiText.append(letter);
                }
            }

            asciiText.append(" ");
        }

        return asciiText.toString().trim();
    }

}
