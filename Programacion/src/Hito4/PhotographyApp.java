package Hito4;

import javax.swing.*;
import java.awt.*;

public class PhotographyApp extends JFrame {

    public PhotographyApp() {
        // Configuración del marco
        setTitle("Photography");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Etiqueta y ComboBox para seleccionar el fotógrafo
        JLabel photographerLabel = new JLabel("Photographer:");
        photographerLabel.setBounds(10, 10, 100, 25);
        add(photographerLabel);

        String[] photographers = {"Ansel Adams", "Dorothea Lange", "Henri Cartier-Bresson"};
        JComboBox<String> photographerComboBox = new JComboBox<>(photographers);
        photographerComboBox.setBounds(120, 10, 150, 25);
        add(photographerComboBox);

        // Etiqueta y campo de texto para la fecha
        JLabel dateLabel = new JLabel("Photos after");
        dateLabel.setBounds(280, 10, 80, 25);
        add(dateLabel);

        JTextField dateField = new JTextField("02/27/2013");
        dateField.setBounds(370, 10, 100, 25);
        add(dateField);

        // Lista de fotos
        DefaultListModel<String> listModel = new DefaultListModel<>();
        listModel.addElement("Ballet dancer");
        listModel.addElement("Sunset in Vermont");

        JList<String> photoList = new JList<>(listModel);
        JScrollPane listScrollPane = new JScrollPane(photoList);
        listScrollPane.setBounds(10, 50, 200, 300);
        add(listScrollPane);

        // Imagen de muestra
        ImageIcon photoIcon = new ImageIcon("path/to/your/image.jpg"); // Ruta a tu imagen
        JLabel photoLabel = new JLabel(photoIcon);
        photoLabel.setBounds(220, 50, 350, 300); // Ajusta el tamaño y posición según tu imagen
        add(photoLabel);

        // Hacer visible el marco
        setVisible(true);
    }

    public static void main(String[] args) {
        // Ejecutar la aplicación en el hilo de despacho de eventos
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PhotographyApp();
            }
        });

    }
}
