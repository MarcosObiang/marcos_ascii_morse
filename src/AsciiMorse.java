package src;

import java.util.HashMap;

public class AsciiMorse {

    HashMap<String, String> equivalencias = new HashMap<>();
    String[] asciiCharacters = {
        "A", "B", "C", "CH", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", 
        "N", "Ñ", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z",
        "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", ".", ",", "?", "\"", 
        "/", "=", "+", "-", "(", ")" 
    };

    String[] morseCharacters = {
        ".-", "-...", "-.-.", "----", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
        "-.", "--.--", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..",
        "-----", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
        ".-.-.-", "--..--", "..--..", ".-..-.","-..-.","-...-", ".-.-.", "-....-", "-.--.-", "-.--.-)"
    };

    public AsciiMorse(){
        for (int i = 0; i < asciiCharacters.length; i++) {
            equivalencias.put(asciiCharacters[i], morseCharacters[i]);
        }

    }

String traducir(String expression){
        String result = "";
        expression=expression.toUpperCase();
      for(int i=0;i<expression.length();i++){

            char character = expression.charAt(i);
            if(character==' '){
                character='.';
                result+=equivalencias.get(String.valueOf(character)) + " ";

            }else {
                result+=equivalencias.get(String.valueOf(character)) + " ";
            }


            }
            return result;

        }
    }







