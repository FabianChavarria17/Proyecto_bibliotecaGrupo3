package com.company;
import javax.swing.*;
import com.company.*;
import com.sun.tools.javac.Main;

public class Catalogo {


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


}

