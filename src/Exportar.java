import java.io.IOException;
import java.util.LinkedList;
import java.io.FileWriter;



public class Exportar {
    public Exportar() {
    }

    public void exportarARchivo(LinkedList<Persona> listaDePersonas){

        if (listaDePersonas.isEmpty()){
            System.out.println("\nLista vacia, por favor ingrese los datos\n");
        }else {
            try (FileWriter archivo = new FileWriter("Datos.txt")){
                for (Persona persona:listaDePersonas){
                    archivo.write("Nombre: "+persona.getNombre()+ "\n");
                    archivo.write("edad: "+persona.getEdad()+ "\n");
                    archivo.write("sexo: "+persona.getSexo()+ "\n");
                    archivo.write("cedula: "+persona.getCedula()+ "\n");
                    archivo.write("-----------------------------"+ "\n");
                }
                archivo.write("");
                System.out.println("\nArchivo exportado correctamente\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
