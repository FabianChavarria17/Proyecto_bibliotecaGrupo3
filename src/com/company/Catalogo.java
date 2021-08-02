package com.company;
import javax.swing.*;
import com.company.*;
import com.sun.tools.javac.Main;

public class Catalogo{



    String codigoISBNLibro;
    String tituloLibro;
    String AutorLibro;
    String editoralLibro;
    Boolean dispLibro;

    public Catalogo(String codigoISBNLibro, String tituloLibro, String AutorLibro, String editoralLibro, boolean dispLibro) {
        this.codigoISBNLibro = codigoISBNLibro;
        this.tituloLibro = tituloLibro;
        this.AutorLibro = AutorLibro;
        this.editoralLibro = editoralLibro;
        this.dispLibro = dispLibro;
    }

    public String getCodigoISBNLibro() {
        return codigoISBNLibro;
    }

    public void setCodigoISBNLibro(String codigoISBNLibro) {
        this.codigoISBNLibro = codigoISBNLibro;
    }

    public String getTituloLibro() {
        return tituloLibro;
    }

    public void setTituloLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
    }

    public String getAutorLibro() {
        return AutorLibro;
    }

    public void setAutorLibro(String AutorLibro) {
        this.AutorLibro = AutorLibro;
    }

    public String getEditoralLibro() {
        return editoralLibro;
    }

    public void setEditoralLibro(String editoralLibro) {
        this.editoralLibro = editoralLibro;
    }

    public Boolean getDispLibro() {
        return dispLibro;
    }

    public void setDispLibro(boolean dispLibroLibro) {
        this.dispLibro = dispLibro;
    }

    public static void main(String[] args) {

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

        //Catalogo librosSolicitados[] = new Catalogo[5];

        BuscarLibro(librosregistrados);
        SolicitarLibro(librosregistrados);
    }
        public static void BuscarLibro(Catalogo[] librosregistrados){
            String ISBN = "1010";
            for (int i = 0; i < librosregistrados.length; i++){
                if(ISBN.equals(librosregistrados[i].codigoISBNLibro)){
                    System.out.println(librosregistrados[i].AutorLibro);
                    System.out.println(librosregistrados[i].editoralLibro);
                    System.out.println(librosregistrados[i].tituloLibro);
                    System.out.println(librosregistrados[i].dispLibro);

                }
            }



        }

        public static void SolicitarLibro(Catalogo[] librosregistrados){
            String titulo;



            titulo = JOptionPane.showInputDialog("Digite el titulo del libro:");

            for (int i = 0; i < librosregistrados.length; i++){
                if(titulo.equals(librosregistrados[i].tituloLibro)){
                    if(librosregistrados[i].dispLibro == true){
                        JOptionPane.showMessageDialog(null,"Libro solicitado");
                        librosregistrados[i].dispLibro = false;
                        System.out.println(librosregistrados[i].dispLibro);

                    } else if (librosregistrados[i].dispLibro == false){
                        JOptionPane.showMessageDialog(null,"Libro no disponible");
                    }


                }
            }


        }



}

