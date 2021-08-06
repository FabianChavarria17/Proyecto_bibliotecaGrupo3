package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DevolverLibro extends JFrame {

    private JPanel panel1;
    private JTextField txtDevolver;
    private JButton btnDevolver;
    private JButton btnReturnMenu;
    private JButton btnSalir;

    public DevolverLibro(){
        this.setVisible(true);
        this.setSize(300,300);
        this.setLocation(800,400);

        //volver al menu
        btnReturnMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainMenu abrir = new MainMenu();
                abrir.setVisible(true);
                DevolverLibro.this.dispose();
            }
        });

        //Cerrar el programa
        btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DevolverLibro.this.dispose();
            }
        });

        //Boton para devolver el libro
        btnDevolver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }


}
