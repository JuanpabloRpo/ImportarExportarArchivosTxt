import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;


public class Operaciones {

    public Operaciones() {
    }
    public LinkedList<Persona> llenarLista(int cantidad) throws IOException {
        BufferedReader cp=new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Persona> lista=new LinkedList<>();
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el nombre:");
            String nombre=cp.readLine();
            System.out.println("Ingrese la edad:");
            int edad=Integer.parseInt(cp.readLine());
            System.out.println("Ingrese 1 si su sexo es Femenino o 2 si su sexo es Masculino:");
            int opcionSexo=Integer.parseInt(cp.readLine());
            char sexo;
            if(opcionSexo==1){
                sexo='M';
            }else {
                sexo='H';
            }
            System.out.println("Ingrese su cedula:");
            int cedula=Integer.parseInt(cp.readLine());
            lista.add(new Persona(nombre,edad,sexo,cedula));
        }
        System.out.println("\nLlenado de lista completo\n");
        return lista;
    }

    public LinkedList<Persona> llenarListaAleatoriamente(int cantidad){
        Random rm=new Random();
        LinkedList<Persona> lista=new LinkedList<>();

        // Lista de nombres de hombres
        List<String> nombresHombres = Arrays.asList(
                "Antonio García",
                "Carlos Martínez",
                "Fernando López",
                "Javier González",
                "Luis Pérez",
                "Manuel Fernández",
                "Miguel Ángel Rodríguez",
                "Pablo Sánchez",
                "Rafael Díaz",
                "Sergio Gómez",
                "Víctor Romero",
                "Alberto Morales",
                "Ángel Vargas",
                "Francisco Javier Ruiz",
                "David Torres",
                "José Antonio Ramírez",
                "Roberto Silva",
                "Pedro Castro",
                "Raúl Ortega",
                "Ricardo Mendoza"
        );

        // Lista de nombres de mujeres
        List<String> nombresMujeres = Arrays.asList(
                "Ana Martínez",
                "Beatriz González",
                "Carmen Rodríguez",
                "Dolores López",
                "Elena Fernández",
                "Francisca García",
                "Isabel Sánchez",
                "Laura Pérez",
                "María Gómez",
                "Marta Ramírez",
                "Mercedes Morales",
                "Nuria Díaz",
                "Patricia Vargas",
                "Rosa María Romero",
                "Sara Torres",
                "Teresa Silva",
                "Victoria Ortega",
                "Yolanda Ruiz",
                "Juana Castro",
                "Celia Mendoza"
        );

        for (int i = 0; i < cantidad; i++) {
            String nombre;
            int edad=(rm.nextInt(80-15)+1)+15;
            char sexo;
            if (rm.nextBoolean()){
                sexo='H';
                nombre=nombresHombres.get(rm.nextInt(19+1));
            }else {
                sexo='M';
                nombre=nombresMujeres.get(rm.nextInt(19+1));
            }
            int cedula=(rm.nextInt(100000-10000)+1)+10000;
            lista.add(new Persona(nombre,edad,sexo,cedula));
        }
        System.out.println("\nLlenado de lista completo\n");
        return lista;

    }

    public void mostrarLista(LinkedList<Persona> lista){
        for(Persona persona: lista){
            System.out.println("Nombre: "+persona.getNombre()+"\n");
            System.out.println("Edad: "+persona.getEdad()+"\n");
            System.out.println("Sexo: "+persona.getSexo()+"\n");
            System.out.println("Cedula: "+persona.getCedula()+"\n");
            System.out.println("-------------------------------------");
        }
    }
}
