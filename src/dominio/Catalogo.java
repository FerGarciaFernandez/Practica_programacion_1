package dominio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class catalogo{
    private ArrayList<Coche> coleccionCoches = new ArrayList<>();
    private String nombreFichero = "catalogo.txt";

    public catalogo(){
        cargarCoches();
    }

    public void annadirCoche(Coches coches){
        coleccionCoches.add(coche);
        volcarCoches();
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(Coche coche : coleccionCoches) sb.append(coche + "\n");
        return sb.toString();
    }

    private void volcarCoches(){
        try{
            FileWriter fw = new FileWriter(nombreFichero);
            for(Coche coche : coleccionCoches){
                fw.write(coche.getMarca() + " " + 
                        coche.getNumeroMatricula()  + "\n");
            }
            fw.close();
        }catch(IOException e){
            System.out.println("Ha habido un problema al intentar escribir en el fichero " + nombreFichero); 
        }
    }

    private void cargarCoches(){
        try{
            File fichero = new File(nombreFichero);
            if (fichero.createNewFile()) System.out.println("Se ha creado el fichero " + nombreFichero); 
            Scanner sc = new Scanner(fichero);
            while(sc.hasNext()){
                coleccionCoches.add(new Coche(sc.next(), sc.next()));
            }
        }catch(IOException e){
            System.out.println("Ha habido un problema al intentar leer en el fichero " + nombreFichero);
            System.out.println(e); 
        }
    }
}
