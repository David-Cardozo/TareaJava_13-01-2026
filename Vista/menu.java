package Vista;

import Controlador.Funciones;

public class menu {

    public static void main(String[] args)  {
        Funciones f = new Funciones();
        int opcion =0;
        do {
            opcion = f.validador(1, 4, """
                                       ##############################################################
                                       1. Registrar pacientes
                                       2. Mostrar pacientes
                                       3. Atender pacientes
                                       4. Salir
                                       ##############################################################
                                       """);
            
            switch(opcion){
                case 1:
                    f.addPaciente();
                    break;
                case 2:
                    f.mostrarPacientes();
                    break;
                case 3:
                    f.estadoPacientes();
                    break;
            }
        } while (opcion != 4);
    }

}
