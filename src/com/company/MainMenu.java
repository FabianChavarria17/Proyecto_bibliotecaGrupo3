package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.company.Catalogo;

public class MainMenu extends JFrame {
    private JPanel panel3;
    private JLabel MensajeBienvenida;
    private JTextField txtBuscar;
    private JButton btnBuscar;
    private JButton btnDevolver;
    private JButton btnSalir;
    private JButton solicitarLibroButton;


    public MainMenu(){
        setContentPane(panel3);
        this.setVisible(true);
        this.setSize(400,300);
        this.setLocation(800,400);

        Catalogo libro1 = new Catalogo("1010", "Don Quijote", "Rafael Garcia Marquez", "Patito",true);
        Catalogo libro2 = new Catalogo("1011", "Harry Potter", "Mario Martinez", "Universal",true);
        Catalogo libro3 = new Catalogo("1012", "Maze Runner", "Viviana Zeledon", "Alba",true);
        Catalogo libro4 = new Catalogo("1013", "Sinsajo", "Pedro Fuente", "Critica",true);
        Catalogo libro5 = new Catalogo("1014", "Biblioteca de los Muertos", "Carlos Mora", "Gredos",true);


        Catalogo librosregistrados[] = new Catalogo[5];

        librosregistrados[0] = libro1;
        librosregistrados[1] = libro2;
        librosregistrados[2] = libro3;
        librosregistrados[3] = libro4;
        librosregistrados[4] = libro5;

        btnBuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buscar = txtBuscar.getText();
                String dispo = "";

                for (int i = 0; i < librosregistrados.length; i++){
                    if(buscar.equals(librosregistrados[i].codigoISBNLibro) || buscar.equals(librosregistrados[i].tituloLibro)){
                        if(librosregistrados[i].dispLibro == true){
                            dispo += "Si";


                        } else{
                            dispo += "No";
                        }


                        JOptionPane.showMessageDialog(null, "Editorial: " + librosregistrados[i].editoralLibro + "\n" + "Autor: " + librosregistrados[i].AutorLibro + "\n" + "Titulo: " + librosregistrados[i].tituloLibro + "\n" + "Codigo ISBN: " + librosregistrados[i].codigoISBNLibro + "\n" +"Disponibilidad: " + dispo  );

                    }
                }

            }
        });


        btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            MainMenu.this.dispose();
            }
        });
        btnDevolver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        solicitarLibroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }


}
