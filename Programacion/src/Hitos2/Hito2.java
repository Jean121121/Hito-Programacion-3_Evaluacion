/*package Hitos2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Hito2 extends JFrame {
    JTextArea resumen;

    public Hito2(){
        Container marco = this.getContentPane();
        this.setTitle("Test Event: Files");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        JPanel izquierda = new JPanel();
        seccionIzquierda(izquierda);
        izquierda.setPreferredSize(new Dimension(390,500));
        izquierda.setBackground(Color.blue);
        marco.add(izquierda, BorderLayout.WEST);



        JPanel derecha = new JPanel();
        seccionDerecha(derecha);
        derecha.setPreferredSize(new Dimension(400,500));
        derecha.setBackground(Color.gray);
        marco.add(derecha, BorderLayout.EAST);



        this.setSize(new Dimension(800, 500));
        this.setVisible(true);
    }

    private void seccionDerecha(JPanel derecha) {
        resumen = new JTextArea();

        JScrollPane minimarco = new JScrollPane(resumen);
        minimarco.setPreferredSize(new Dimension(400,420));
        minimarco.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        minimarco.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        derecha.add(minimarco);

        JButton close = new JButton("Close");
        close.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        derecha.add(close);


    }

    private void seccionIzquierda(JPanel izquierda) {
        //Creo una variablo JCombobox en la que metere un modelo con los elementos a elegir
        JComboBox sele = new JComboBox();
        sele.setPreferredSize(new Dimension(200,25));
        //Creo el modelo donde meter los elementos a seleccionar
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        //aniado el modelo en el JComboBox
        sele.setModel(model);

        //Creo una lista donde añado los nombres de los archivos a seleccionar
        List<String> textos = new ArrayList<>();
        textos.add("python.txt");
        textos.add("c.txt");
        textos.add("java.txt");
        //aniado los elementos al modelo
        for (int i=0; i<textos.size(); i++){
            model.addElement(textos.get(i));
        }
        //Creo el boton de close para cerrar la ventana
        JButton clear = new JButton("Clear");
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resumen.setText("");
            }
        });

        sele.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object source = e.getSource();

                if(source == sele){
                    if(sele.getModel().getSelectedItem().equals("java.txt")){

                        String filePath = "java.txt";
                        //Aniado la excepcion para los errores de lectura
                        try{
                            StringBuilder contenido = new StringBuilder();
                            File file = new File(filePath);
                            FileReader fr = new FileReader(file);
                            BufferedReader br = new BufferedReader(fr);
                            StringBuilder content = new StringBuilder();
                            String line;
                            while((line = br.readLine())!= null){
                                content.append(line).append("\n");
                            }
                            resumen.setText(content.toString());
                            br.close();
                            fr.close();

                        }catch (IOException a){
                            a.printStackTrace();
                            JOptionPane.showMessageDialog( izquierda, "Fichero no encontrado","Error",JOptionPane.ERROR_MESSAGE);

                        }
                    } else if (sele.getModel().getSelectedItem().equals("c.txt")) {

                        String filePath = "c.txt";
                        //Aniado la excepcion para los errores de lectura
                        try{
                            StringBuilder contenido = new StringBuilder();
                            File file = new File(filePath);
                            FileReader fr = new FileReader(file);
                            BufferedReader br = new BufferedReader(fr);
                            StringBuilder content = new StringBuilder();
                            String line;
                            while((line = br.readLine())!= null){
                                content.append(line).append("\n");
                            }
                            resumen.setText(content.toString());
                            br.close();
                            fr.close();

                        }catch (IOException a){
                            a.printStackTrace();
                        }
                    } else if (sele.getModel().getSelectedItem().equals("python.txt")) {

                        String filePath = "python.txt";
                        //Aniado la excepcion para los errores de lectura
                        try{
                            StringBuilder contenido = new StringBuilder();
                            File file = new File(filePath);
                            FileReader fr = new FileReader(file);
                            BufferedReader br = new BufferedReader(fr);
                            StringBuilder content = new StringBuilder();
                            String line;
                            while((line = br.readLine())!= null){
                                content.append(line).append("\n");
                            }
                            resumen.setText(content.toString());
                            br.close();
                            fr.close();

                        }catch (IOException a){
                            a.printStackTrace();
                        }

                    }

                }
            }
        });

        //Aniado al panel lo elementos creados
        izquierda.add(sele);
        izquierda.add(clear);



    }

    public static void main(String[] args) {new Hito2();}

}
*/