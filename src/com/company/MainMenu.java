package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
