import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.io.File;
public class Importar {

    public Importar() {
    }

    public LinkedList<Persona> importarArchivo(String nombreArchivo) throws IOException{
        String ruta = "Datos.txt";
        File archivo = new File(ruta);
        if (!archivo.exists()) {
            return null;
        }

            String rutaArchivo = nombreArchivo + ".txt";
        LinkedList<Persona> listaDePersonas = new LinkedList<>();
        String line;
        String nombre="";
        char sexo='0';
        int edad=0;
        int cedula=0;
        try (BufferedReader cp = new BufferedReader(new FileReader(rutaArchivo))){
            while ((line = cp.readLine()) != null){

                if (line.startsWith("Nombre: ")){
                    nombre=line.substring(8);
                    continue;
                }
                if (line.startsWith("edad: ")){
                    edad=Integer.parseInt(line.substring(6));
                    continue;
                }
                if (line.startsWith("sexo: ")){
                    sexo=line.substring(6).charAt(0);
                    continue;
                }
                if (line.startsWith("cedula: ")){
                    cedula=Integer.parseInt(line.substring(8));
                    continue;
                }
                listaDePersonas.add(new Persona(nombre,edad,sexo,cedula));
            }
            System.out.println("\nArchivo importado correctamente\n");
        }catch (IOException e) {
            e.printStackTrace();
        }


        return listaDePersonas;
    }
}
