package com.company;

import java.util.Vector;

public class Usuario
{
    /*Clase usuario aca guardamos y administramos a los nuevos usuarios*/
    private String username;
    private String password;
    private String rango;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    //Metodo verificar, con este metodo sabemos si es un usuario nuevo y podemos verificar que no exista en el sistema
    public static int VerificarUsuarioNuevo(String usuario){
        Vector lista = mostrar();
        Usuario obj;
            for(int i=0;i<lista.size(); i++ ){
                obj = (Usuario) lista.elementAt(i);
                if(obj.getUsername().equalsIgnoreCase(usuario)){
                    return i;
                }
            }
            return -1;
    }

    //Verifca que el usuario exista en el sistema
    public static int VerificarLogueo(String usuario, String contraseña){
        Vector lista = mostrar();
        Usuario obj;
        for(int i=0; i<lista.size();i++){
            obj=(Usuario) lista.elementAt(i);
            if(obj.getUsername().equalsIgnoreCase(usuario) && obj.getPassword().equalsIgnoreCase(contraseña)){
            return i;
            }
        }
        return -1;
    }


    public static Vector mostrar(){
        return ListaUsuario.mostrar();
    }
}
