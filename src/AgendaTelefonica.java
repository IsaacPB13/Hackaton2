public class AgendaTelefonica {
    Contacto list[] = new Contacto[10];

    //Lizeth
    public boolean existeContacto(Contacto c){

        for (Contacto contacto : list) {

            if (contacto != null &&
                    contacto.getNombre().equalsIgnoreCase(c.getNombre()) &&
                    contacto.getApellido().equalsIgnoreCase(c.getApellido())) {

                return true;
            }
        }

        return false;     }

    public boolean añadirContacto(Contacto c) {

        if (c.getNombre() == null || c.getNombre().trim().isEmpty() ||
                c.getApellido() == null || c.getApellido().trim().isEmpty()) {

            System.out.println("Nombre o apellido no válidos");
            return false;
        }

        if (existeContacto(c)) {
            System.out.println("El contacto ya existe");
            return false;
        }

        for (int i = 0; i < list.length; i++) {

            if (list[i] == null) {
                list[i] = c;
                System.out.println("Contacto añadido");
                return true;
            }
        }

        System.out.println("La agenda está llena");
        return false;
    }



 //Erick
 public void listarContactos(){


 }

 //Ivonne
 public void buscaContacto(String nombre, String apellido){


 }

 //Jesus
 public void eliminarContacto(Contacto c){


 }

 //Michael
 public void modificarTelefono(String nombre, String apellido, String nuevoTelefono){


 }

 //Isaac
 public void agendaLlena(){


 }

 //Isaac
 public void espacioLibres(){


 }
}




