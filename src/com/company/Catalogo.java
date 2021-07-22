package com.company;

public class Catalogo {

    String codigoISBNLibro;
    String tituloLibro;
    String AutorLibro;
    String editoralLibro;

    public Catalogo(String codigoISBNLibro, String tituloLibro, String AutorLibro, String editoralLibro) {
        this.codigoISBNLibro = codigoISBNLibro;
        this.tituloLibro = tituloLibro;
        this.AutorLibro = AutorLibro;
        this.editoralLibro = editoralLibro;
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

    public static void main(String[] args) {

        Catalogo libro1 = new Catalogo("1010", "Don Quijote", "Rafael Garcia Marquez", "Patito");
        Catalogo libro2 = new Catalogo("1011", "Harry Potter", "Mario Martinez", "Universal");
        Catalogo libro3 = new Catalogo("1012", "Maze Runner", "Viviana Zeledon", "Alba");
        Catalogo libro4 = new Catalogo("1013", "Sinsajo", "Pedro Fuente", "Critica");
        Catalogo libro5 = new Catalogo("1014", "Biblioteca de los Muertos", "Carlos Mora", "Gredos");


        Catalogo librosregistrados[] = new Catalogo[5];

        librosregistrados[0] = libro1;
        librosregistrados[1] = libro2;
        librosregistrados[2] = libro3;
        librosregistrados[3] = libro4;
        librosregistrados[4] = libro5;

        //Catalogo librosSolicitados[] = new Catalogo[5];

        BuscarLibro(librosregistrados);
    }
        public static void BuscarLibro(Catalogo[] librosregistrados){
            String ISBN = "1010";
            for (int i = 0; i < librosregistrados.length; i++){
                if(ISBN.equals(librosregistrados[i].codigoISBNLibro)){
                    System.out.println(librosregistrados[i].AutorLibro);
                    System.out.println(librosregistrados[i].editoralLibro);
                    System.out.println(librosregistrados[i].tituloLibro);

                }
            }



        }



}

