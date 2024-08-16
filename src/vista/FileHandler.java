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
import java.io.*;

public class FileHandler {

    private File currentFile;

    public FileHandler() {
        this.currentFile = null;
    }

    // Método para abrir un archivo
    public String openFile(JTextArea textArea, JFrame parent) {
        JFileChooser fileChooser = new JFileChooser();
        int option = fileChooser.showOpenDialog(parent);
        if (option == JFileChooser.APPROVE_OPTION) {
            currentFile = fileChooser.getSelectedFile();
            try (BufferedReader reader = new BufferedReader(new FileReader(currentFile))) {
                textArea.read(reader, null);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(parent, "Error al abrir el archivo", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        return currentFile != null ? currentFile.getAbsolutePath() : null;
    }

    // Método para guardar el archivo
    public void saveFile(JTextArea textArea, JFrame parent) {
        if (currentFile != null) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(currentFile))) {
                textArea.write(writer);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(parent, "Error al guardar el archivo", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            saveFileAs(textArea, parent);
        }
    }

    // Método para guardar como
    public void saveFileAs(JTextArea textArea, JFrame parent) {
        JFileChooser fileChooser = new JFileChooser();
        int option = fileChooser.showSaveDialog(parent);
        if (option == JFileChooser.APPROVE_OPTION) {
            currentFile = fileChooser.getSelectedFile();
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(currentFile))) {
                textArea.write(writer);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(parent, "Error al guardar el archivo", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
