/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

 */
package vista;
/*
/**
 *
 * @author Elicho

public class StringAnalyzer {
    
}
 */


public class StringAnalyzer {
    
    private String text;

    public StringAnalyzer(String text) {
        this.text = text;
    }

    // Método para contar palabras
    public int countWords() {
        if (text == null || text.isEmpty()) {
            return 0;
        }
        String[] words = text.trim().split("\\s+");
        return words.length;
    }

    // Método para obtener la primera palabra
    public String getFirstWord() {
        if (text == null || text.isEmpty()) {
            return "";
        }
        String[] words = text.trim().split("\\s+");
        return words.length > 0 ? words[0] : "";
    }

    // Método para obtener la última palabra
    public String getLastWord() {
        if (text == null || text.isEmpty()) {
            return "";
        }
        String[] words = text.trim().split("\\s+");
        return words.length > 0 ? words[words.length - 1] : "";
    }
    
 // Método para obtener la primera letra
    public char getFirstLetter() {
        if (text == null || text.isEmpty()) {
            return '\0';
        }
        return text.charAt(0);
    }

    // Método para obtener la última letra
    public char getLastLetter() {
        if (text == null || text.isEmpty()) {
            return '\0';
        }
        return text.charAt(text.length() - 1);
    }

    // Método para obtener la letra del centro
    public char getMiddleLetter() {
        if (text == null || text.isEmpty()) {
            return '\0';
        }
        int middleIndex = text.length() / 2;
        return text.charAt(middleIndex);
    }

    // Método para obtener la palabra central
    public String getCentralWord() {
        if (text == null || text.isEmpty()) {
            return "";
        }
        String[] words = text.trim().split("\\s+");
        int middleIndex = words.length / 2;
        return words.length > 0 ? words[middleIndex] : "";
    }    
    
}
