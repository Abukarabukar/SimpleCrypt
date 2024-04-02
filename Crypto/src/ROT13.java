import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import static java.lang.Character.toLowerCase;

public class ROT13 {

    private char[] shiftedAlphabet;
    private char[] originalAlphabet;

    ROT13() {
    }

    int distance;
    int reShift;
    public ROT13(char start, char mid) {

        this.originalAlphabet = new char[26];
        this.shiftedAlphabet = new char[26];

        int shift = mid - start; // Calculate the shift distance
        reShift = start - mid;
        distance = shift;
        for (int i = 0; i < 26; i++) {
            originalAlphabet[i] = (char) ('a' + i); // Fill the original alphabet
            shiftedAlphabet[i] = (char) ('a' + (i + shift) % 26); // Fill the shifted alphabet
        }
    }



    public String crypt(String text) throws UnsupportedOperationException {
        StringBuilder encrytMessage = new StringBuilder();
//        text = text.toLowerCase();
        for (int i = 0; i < text.length(); i++) {
            Character ch = text.charAt(i);
            if (Character.isLetter(ch)) {
                if (65 <= ch && ch <= 90) {

                    encrytMessage.append((char) ((ch - 'A' + distance) % 26 + 'A'));
                } else {
                    encrytMessage.append((char) ((ch - 'a' + distance) % 26 + 'a'));

                }
            } else {
                encrytMessage.append(ch);
            }


        }
        return encrytMessage.toString();
    }


    Scanner input = new Scanner(System.in);






    public String encrypt(String text) {

        StringBuilder encryptedText = new StringBuilder();

        String encryptedLine = crypt(text);
        encryptedText.append(encryptedLine);

        System.out.println(encryptedText);

        return encryptedText.toString();
    }

    public String decrypt(String text) {
        StringBuilder encrytMessage = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            Character ch = text.charAt(i);
            if (Character.isLetter(ch)) {
                if (65 <= ch && ch <= 90) {

                    encrytMessage.append((char) ((ch - 'A' - distance + 26) % 26 + 'A'));
                } else {
                    encrytMessage.append((char) ((ch - 'a' - distance + 26) % 26 + 'a'));

                }
            } else {
                encrytMessage.append(ch);
            }


        }
        return encrytMessage.toString();
    }

    public static String rotate(String s, Character c) {
        int index = s.indexOf(c);
        if (index != -1) {
            return s.substring(index) + s.substring(0, index);
        }
        return s;

    }



}