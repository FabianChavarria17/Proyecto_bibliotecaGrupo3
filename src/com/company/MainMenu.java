package com.company;

import javax.swing.*;
import java.awt.event.*;

import com.company.Catalogo;

import java.io.FileWriter;
import java.io.IOException;

public class MainMenu extends JFrame {
    private JPanel panel3;
    private JLabel MensajeBienvenida;
    private JTextField txtBuscar;
    private JButton btnBuscar;
    private JButton btnDevolver;
    private JButton btnSalir;
    private JButton solicitarLibroButton;
    private JButton btnFactura;


    public MainMenu(){
        super("Main Menu");
        setContentPane(panel3);
        this.setVisible(true);
        this.setResizable(false);
        this.setSize(500,400);
        this.setLocation(800,400);


        Catalogo libro1 = new Catalogo("1010", "Don Quijote", "Miguel de Cervantes", "Lengua Viva",true);
        Catalogo libro2 = new Catalogo("1011", "Harry Potter y la piedra filosofal", "J.K. Rowling", "Salamandra Bolsillo",true);
        Catalogo libro3 = new Catalogo("1012", "Maze Runner", "James Dashner", "Delacorte Press",true);
        Catalogo libro4 = new Catalogo("1013", "Sinsajo", "Suzanne Collins", "Turtleback Books",true);
        Catalogo libro5 = new Catalogo("1014", "Biblioteca de los Muertos", "Glenn Cooper", "Grijalbo",true);
        Catalogo libro6 = new Catalogo("1015", "El Hobbit", "J.R.R Tolkien", "Norma",true);
        Catalogo libro7 = new Catalogo("1016", "1984", "George Orwell", "Baker Street Press",true);
        Catalogo libro8 = new Catalogo("1017", "Hamlet", "William Shakespeare", "Baker Street Press",true);
        Catalogo libro9 = new Catalogo("1018", "Dracula", "Bram Stoker", "Dover Publications",true);
        Catalogo libro10 = new Catalogo("1019", "Un Mago de Terramar", "Ursula K. Le Guin", "Minotauro",true);
        Catalogo libro11 = new Catalogo("1020", "Orgullo y Prejuicio", "Jane Austen", "Penguin",true);
        Catalogo libro12 = new Catalogo("1021", "Los Pilares de la Tierra", "Ken Follett", "Plaza & Janes",true);
        Catalogo libro13 = new Catalogo("1022", "El Principito", "Antoine de Saint-Exupéry", "Salamandra",true);


        Catalogo librosregistrados[] = new Catalogo[12];

        librosregistrados[0] = libro1;
        librosregistrados[1] = libro2;
        librosregistrados[2] = libro3;
        librosregistrados[3] = libro4;
        librosregistrados[4] = libro5;
        librosregistrados[5] = libro6;
        librosregistrados[6] = libro7;
        librosregistrados[7] = libro8;
        librosregistrados[8] = libro9;
        librosregistrados[9] = libro10;
        librosregistrados[10] = libro11;
        librosregistrados[11] = libro12;
        librosregistrados[12] = libro13;

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


                        JOptionPane.showMessageDialog(null, "Editorial: " + librosregistrados[i].editoralLibro + "\n" + "Autor: " + librosregistrados[i].AutorLibro + "\n" + "Titulo: " + librosregistrados[i].tituloLibro + "\n" + "Codigo ISBN: " + librosregistrados[i].codigoISBNLibro + "\n" +"Disponible: " + dispo  );

                    }
                }
                txtBuscar.setText("");
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

                String devolverTitulo = txtBuscar.getText();

                for (int i = 0; i < librosregistrados.length; i++){
                    if(devolverTitulo.equals(librosregistrados[i].tituloLibro)){
                        if(librosregistrados[i].dispLibro == false){
                            JOptionPane.showMessageDialog(null,"El libro ha sido devuelto con exito");
                            librosregistrados[i].dispLibro = true;
                            System.out.println(librosregistrados[i].dispLibro);

                        } else if (librosregistrados[i].dispLibro == true){
                            JOptionPane.showMessageDialog(null,"El libro no puede ser devuelto, ya que todavia no ha sido alquilado");
                        }


                    }
                }
                txtBuscar.setText("");


            }
        });

        solicitarLibroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String solicitarTitulo = txtBuscar.getText();

                for (int i = 0; i < librosregistrados.length; i++){
                    if(solicitarTitulo .equals(librosregistrados[i].tituloLibro)){
                        if(librosregistrados[i].dispLibro == true){
                            JOptionPane.showMessageDialog(null,"Libro solicitado con exito");
                            librosregistrados[i].dispLibro = false;
                            System.out.println(librosregistrados[i].dispLibro);

                        } else if (librosregistrados[i].dispLibro == false){
                            JOptionPane.showMessageDialog(null,"Libro no disponible, intente mas tarde");
                        }


                    }
                }
                txtBuscar.setText("");
            }
        });

        btnFactura.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FileWriter factura = null;
                try {
                    factura = new FileWriter("C:/Users/XPC/Desktop/factura.txt");
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
                int precio = 100;
                int cantidadLibros = 0;
                int dias = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de dias de prestamo: "));
                int total = 0;

                for (int i = 0; i < librosregistrados.length; i++){
                    if(librosregistrados[i].dispLibro == false){
                        cantidadLibros = cantidadLibros + 1;
                        total = cantidadLibros * (precio * dias);
                    }
                }
                JOptionPane.showMessageDialog(null,"Imprimiendo factura...");
                try {
                    factura.write("Sistema Biblioteca" + "\n" + "Cantidad de libros prestados: " + cantidadLibros + "\n" + "Total de dias de prestamo: "+ dias + "\n" + "Precio por libro: ₡"+ precio + "\n" + "Monto total a cancelar: ₡"+total);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
                try {
                    factura.close();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }


            }
        });
    }


}
