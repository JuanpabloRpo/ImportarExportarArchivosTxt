import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader cp=new BufferedReader(new InputStreamReader(System.in));
        Operaciones op=new Operaciones();
        LinkedList<Persona> lista=new LinkedList<>();
        boolean digitando=true;
        while (digitando){
            System.out.println("Digite 1 para llenar la lista\n" +
                    "Digite 2 para exportar la lista\n" +
                    "Digite 3 para importar la lista\n" +
                    "Digite 4 para mostrar la lista\n" +
                    "Digite 5 para salir");
            int opcion =Integer.parseInt(cp.readLine());
            switch (opcion){
                case 1:
                    System.out.println("Digite 0 para llenar su lista aleatoriamente ó 1 para digitalizarla usted mismo: ");
                    if(Integer.parseInt(cp.readLine())==0){
                        System.out.println("Cuantos personas desea que se genere: ");
                        lista=op.llenarListaAleatoriamente(Integer.parseInt(cp.readLine()));
                    }else {
                        System.out.println("Cuantos personas desea ingresar: ");
                        lista=op.llenarLista(Integer.parseInt(cp.readLine()));
                    }

                    break;
                case 2:
                    Exportar exportar=new Exportar();
                    exportar.exportarARchivo(lista);
                    break;
                case 3:
                    Importar importar=new Importar();
                    LinkedList<Persona> listaImportada=importar.importarArchivo("Datos");
                    if (listaImportada!=null && lista.size()!=0){
                        System.out.println("Usted tiene una lista con elementos, desea importar y agregar los datos \n" +
                                "importados a los que ya tiene en su lista? \n" +
                                "Digite 1 para si ó 2 para importar la lista y perder su lista: ");
                        int añadir=Integer.parseInt(cp.readLine());
                        if (añadir==1){
                            for (Persona persona:listaImportada){
                                lista.add(persona);
                            }
                        } else {
                            lista=listaImportada;
                        }
                    }else if(listaImportada!=null){
                        lista=listaImportada;
                    }else {
                        System.out.println("\nEl sistema no ha podido encontrar el archivo\n");
                    }

                    break;
                case 4:
                    op.mostrarLista(lista);
                    break;
                case 5:
                    digitando=false;
                    break;
                default:
                    System.out.println("Numero mal digitado");
            }
        }




    }
}