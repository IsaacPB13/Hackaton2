import java.util.ArrayList;
import java.util.Arrays;

public class AgendaTelefonica {

    Contacto list[] = new Contacto[10];

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


    }

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
