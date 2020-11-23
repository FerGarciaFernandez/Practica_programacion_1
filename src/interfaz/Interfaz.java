package interfaz;

import dominio.*;

public class Interfaz{
    public static void mostrarAyuda(){
        System.out.println("Pendiente de programar."); 
    }
    public static void ejecutar(String[] parametros){
        try{
            String instruccion = parametros[0];
            Catalogo catalogo = new Catalogo();
            switch(instruccion){
                case "add":
                    catalogo.annadirCoche(new Coche(parametros[1], parametros[2]));
                    System.out.println("Contacto añadido");
                    break;
                case "list":
                    System.out.println(contacto);
                    break;
                case "--help": case "-h":
                    mostrarAyuda();
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    mostrarAyuda();    

            }
        }catch(java.lang.ArrayIndexOutOfBoundsException e){
            System.out.println("Opción incorrecta");
            mostrarAyuda(); 
        } 
    }
}
