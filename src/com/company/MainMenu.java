package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.company.*;

public class MainMenu extends JFrame {
    private JPanel panel3;
    private JLabel MensajeBienvenida;
    private JTextField txtBuscar;
    private JButton btnBuscar;
    private JButton btnDevolver;
    private JButton btnSalir;



    public MainMenu(){
        setContentPane(panel3);
        this.setVisible(true);
        this.setSize(400,300);
        this.setLocation(800,400);

        //Buscador
        txtBuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }


}
