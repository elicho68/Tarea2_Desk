/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

/**
 *
 * @author Elicho
 */
import javax.swing.*;
import javax.swing.text.BadLocationException;
import java.awt.datatransfer.*;
import java.io.IOException;

public class TextEditorHandler {

    // Método para copiar el texto seleccionado
    public void copyText(JTextArea textArea) {
        textArea.copy();
    }

    // Método para cortar el texto seleccionado
    public void cutText(JTextArea textArea) {
        textArea.cut();
    }

    // Método para pegar el contenido del portapapeles
    public void pasteText(JTextArea textArea) {
        textArea.paste();
    }

    // Método para buscar una palabra en el texto
    public int findText(JTextArea textArea, String word) {
        String text = textArea.getText();
        return text.indexOf(word);
    }

    // Método para reemplazar una palabra en el texto
    public void replaceText(JTextArea textArea, String findWord, String replaceWord) {
        String text = textArea.getText();
        text = text.replace(findWord, replaceWord);
        textArea.setText(text);
    }


    // Otros métodos de manejo de texto...

    // Método para traducir el texto a clave Murciélago
    public String translateToMurcielago(String text) {
        StringBuilder translatedText = new StringBuilder();
        for (char c : text.toCharArray()) {
            switch (Character.toLowerCase(c)) {
                case 'm': translatedText.append('0'); break;
                case 'u': translatedText.append('1'); break;
                case 'r': translatedText.append('2'); break;
                case 'c': translatedText.append('3'); break;
                case 'i': translatedText.append('4'); break;
                case 'e': translatedText.append('5'); break;
                case 'l': translatedText.append('6'); break;
                case 'a': translatedText.append('7'); break;
                case 'g': translatedText.append('8'); break;
                case 'o': translatedText.append('9'); break;
                default: translatedText.append(c); // Deja los demás caracteres sin cambio
            }
        }
        return translatedText.toString();
    }
  

}

