import java.util.ArrayList;
import java.util.Arrays;

public class AgendaTelefonica {

    Contacto list[] = new Contacto[10];
    int numeroDeContacto;

    //Lizeth
    public void existeContacto(Contacto c){


    }

    //Erick
    public void listarContactos(){
        ArrayList<String> nombres = new ArrayList<>();
        for(int i = 0 ; i<list.length ; i++){
            if(list[i]!= null){
                nombres.add(list[i].getNombre() + " " + list[i].getApellido() + " - " + list[i].getTelefono());
            }

        }
        nombres.sort(null);
        for (String nom: nombres){
            System.out.println(nom);
        }
    }

    //Ivonne
    public String buscaContacto(String nombre, String apellido){

        return Arrays.stream(list)
                .filter(contact -> contact != null)
                .filter(contact ->
                        contact.getNombre().equals(nombre) &&
                                contact.getApellido().equals(apellido))
                .findFirst()
                .map(contact -> String.valueOf(contact.getTelefono()))
                .orElse("Not Found");

    }

    //Jesus
    public void eliminarContacto(Contacto c){
        for (int i =0;i < list.length;i++){
            if(list[i] != null && list[i].equals(c)) {

                for (int j = i; j < list.length - 1; j++) {
                    list[j] = list[j + 1];
                }//for (recorre contactos)
                list[list.length - 1] = null;
                System.out.println("El contacto " + c.getNombre() + " se elimino correctamente de la agenda");
                this.numeroDeContacto--; //TODO Modificar en base a variable de registro
                return;
            }//if
        }//for (recorre el arreglo)
        System.out.println("El contacto " + c.getNombre() +" no se encuentra en la  agenda");

    }//eliminarContacto

    //Michael
    public void modificarTelefono(String nombre, String apellido, String nuevoTelefono){
        for (int i = 0 ; i < list.length ; i++)
        {

                 if (list[i] != null && list[i].getNombre().equals(nombre) && list[i].getApellido().equals(apellido) )
                 {
                    int nuevoTel = Integer.parseInt(nuevoTelefono);
                    list[i].setTelefono(nuevoTel);
                    System.out.println("Número de telefono modificado");
                    return;
                 }
        }
        System.out.println("No existe el contacto");
    }

    //Isaac
    public boolean agendaLlena(){

        boolean lleno = true;
        for(int i=0; i<list.length; i++){

            if(list[i]==null){

                lleno = false;
                break;
            }
        }

        return lleno;
    }

    //Isaac
    public void espaciosLibres(){

        int espacios=0;
        for(int i=0; i<list.length; i++){

            if(list[i]==null){

                espacios+=1;
            }
        }
        System.out.println("Espacios libres en la agenda: "+espacios);
    }
}
