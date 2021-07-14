package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame {


    private JPanel panel1;
    private JPasswordField txtcontraseña;
    private JButton btningresar;
    private JButton btnregistrar;
    private JLabel contraseñaLabel;
    private JLabel usuarioLabel;
    private JTextField txtUsuario;

    public Login(){
        super("Login");
        setContentPane(panel1);
        this.setSize(300,200);
        this.setLocation(800,400);

        btnregistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Registro abrir = new Registro();
                abrir.setVisible(true);
                Login.this.dispose();
            }});


        btningresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String contraseña = txtcontraseña.getText();
                String usuario = txtUsuario.getText();

                int pos = Usuario.VerificarLogueo(usuario,contraseña);
                if(pos==-1){
                    JOptionPane.showMessageDialog(null,"USUARIO O CONTRASEÑA INCORRECTOS");
                }else{
                    MainMenu abrir = new MainMenu();
                    abrir.setVisible(true);
                    Login.this.dispose();

                }
            }
        });
    }






}
