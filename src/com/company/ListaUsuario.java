package com.company;
import java.util.Vector;

public class ListaUsuario
{
    //Clase vector que guarda los datos de los usuarios
    private static Vector<Usuario> datos = new Vector<Usuario>();
        public static void agregar(Usuario obj){
            datos.addElement(obj);
        }
        public static void eliminar(int pos){
            datos.removeElementAt(pos);
        }
        public static Vector mostrar(){
            return datos;
        }



}
