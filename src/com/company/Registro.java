package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Registro extends JFrame {
    private JPanel panel2;
    private JLabel UsuarioLabel;
    private JTextField txtUsuario;
    private JPasswordField txtContraseña;
    private JButton btnRegistrar;
    private JButton btnLogin;//Boton ya tengo cuenta
    private JLabel contraseñaLabel;

    public Registro(){
        super("Registro");
        this.setVisible(true);
        this.setLocation(800,400);
        this.setSize(300,300);
        setContentPane(panel2);

        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            Login abrir = new Login();
            abrir.setVisible(true);
            Registro.this.dispose();
            }
        });

        btnRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            String Usuario = txtUsuario.getText();
            String  Contraseña = txtContraseña.getText();

            Usuario obj = new Usuario();

            if(com.company.Usuario.VerificarUsuarioNuevo(Usuario)==-1) {
                obj.setUsername(Usuario);
                obj.setPassword(Contraseña);

                ListaUsuario.agregar(obj);
                JOptionPane.showMessageDialog(null,"SE REGISTRÓ CORRECTAMENTE");
            }else{
                JOptionPane.showMessageDialog(null,"ESTE USERNAME YA ESYA EN USO ");
                }
            }
        });




            }


}
