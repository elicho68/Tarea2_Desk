/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

/**
 *
 * @author Elicho
 */
public class StringBuilderAnalyzer {
    
    private String text;

    public StringBuilderAnalyzer(String text) {
        this.text = text;
    }

    // Método para contar repeticiones de una letra específica (incluyendo variantes con acento)
    private int countOccurrences(char... characters) {
        int count = 0;
        for (char c : text.toCharArray()) {
            for (char target : characters) {
                if (c == target) {
                    count++;
                }
            }
        }
        return count;
    }

    // Repeticiones de "A", "a", "á"
    public int countA() {
        return countOccurrences('A', 'a', 'á');
    }

    // Repeticiones de "E", "e", "é"
    public int countE() {
        return countOccurrences('E', 'e', 'é');
    }

    // Repeticiones de "I", "i", "í"
    public int countI() {
        return countOccurrences('I', 'i', 'í');
    }

    // Repeticiones de "O", "o", "ó"
    public int countO() {
        return countOccurrences('O', 'o', 'ó');
    }

    // Repeticiones de "U", "u", "ú"
    public int countU() {
        return countOccurrences('U', 'u', 'ú');
    }

    // Método para contar palabras con cantidad de caracteres par
    public int countEvenLengthWords() {
        String[] words = text.trim().split("\\s+");
        int count = 0;
        for (String word : words) {
            if (word.length() % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    // Método para contar palabras con cantidad de caracteres impar
    public int countOddLengthWords() {
        String[] words = text.trim().split("\\s+");
        int count = 0;
        for (String word : words) {
            if (word.length() % 2 != 0) {
                count++;
            }
        }
        return count;
    }
}
