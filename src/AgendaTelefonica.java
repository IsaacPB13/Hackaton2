import java.util.Arrays;

public class AgendaTelefonica {

    Contacto list[] = new Contacto[10];

    //Lizeth
    public void existeContacto(Contacto c){


    }

    //Erick
    public void listarContactos(){


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
