package com.company;

import javax.swing.*;

public class Facturacion
{
    int codigoFactura;
    double precio;
    int dias;


    public Facturacion(int codigoFactura, double precio, int dias) {
        this.codigoFactura = codigoFactura;
        this.precio = precio;
        this.dias=dias;

    }


    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public int getCodigoFactura() {
        return codigoFactura;
    }

    public void setCodigoFactura(int codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


    public void calcularTotal(int precio){
        int total;
        total= precio*dias;
    }

    public String imprimirFactura(){
        return "Bienevenido usuario";
}



}
