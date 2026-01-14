package Controlador;

import java.util.Scanner;
import Modelo.Paciente;

public class Funciones {

    // Validadores

    // Validador de numeros
    public int validador(int minValue, int maxValue, String mensaje) {
        boolean validador = false;
        int op = 0;
        do {
            try {
                System.out.println(mensaje);
                op = new Scanner(System.in).nextInt();
                while (op < minValue || op > maxValue) {
                    System.out.println("Opcion no valida, ingresa nuevamente");
                    op = new Scanner(System.in).nextInt();
                }
                validador = true;
            } catch (Exception e) {
                System.out.println("Error porfavor Ingrese solo numeros");
            }
        } while (validador == false);
        return op;
    }

    // Validador de Mayoria de edad
    public String mayoriaEdad(int edad) {

        int edadPaciente = edad;
        String tipoPaciente = "";

        if (edadPaciente < 18) {
            return tipoPaciente = "Menor";
        } else {
            return tipoPaciente = "Adulto";
        }
    }

    // Creacion de Paciente

    Paciente p1 = null;
    Paciente p2 = null;
    Paciente p3 = null;
    Paciente p4 = null;

    // Funciones

    public void mostrarPacientes() {
        verPacientes(p1);
        verPacientes(p2);
        verPacientes(p3);
        verPacientes(p4);
    }

    public void verPacientes(Paciente c) {
        if (c != null) {

            System.out.println("############################################################################\n");
            System.out.println("#################Informacion Paciente por Paciente #########################\n");
            System.out.println("Nombre: " + c.getNombrePaciente() + "\n");
            System.out.println("Numero Documento: " + c.getCc() + "\n");
            System.out.println("Edad: " + c.getEdadPaciente() + "\n");
            System.out.println("Motivo de la coonsulta: " + c.getMotivoConsulta() + "\n");
            System.out.println("Telefono: \n" + c.getTelefonoPaciente().replace(",", "\n"));
            System.out.println("Tipo Paciente: " + c.getTipoPaciente() + "\n");
            System.out.println("Estado Paciente: " + c.getEstadoPaciente());
        }
    }

    public void addPaciente() {
        System.out.println("Ingrese el nombre del paciente: ");
        String nombrePaciente = new Scanner(System.in).nextLine();
        System.out.println("Ingrese el documento de identidad del paciente: ");
        String ccPaciente = new Scanner(System.in).nextLine();
        int edadPaciente = validador(0, 200, "Ingrese la edad del paciente ");
        System.out.println("Ingrese el motivo ");
        String motivoConsulta = new Scanner(System.in).nextLine();
        System.out.println("Ingrese el telefono del paciente ");
        String telefonoPaciente = new Scanner(System.in).nextLine();

        // Aqui verificamos 1 por uno los cupos actuales de los paceintes que tenemos
        // para llenar la capacidad propuesta la cual era de 4
        if (p1 == null) {
            p1 = new Paciente(nombrePaciente, ccPaciente, edadPaciente, motivoConsulta, telefonoPaciente, "registrado");
        } else {
            if (p2 == null) {
                p2 = new Paciente(nombrePaciente, ccPaciente, edadPaciente, motivoConsulta, telefonoPaciente,
                        "registrado");
            } else {
                if (p3 == null) {
                    p3 = new Paciente(nombrePaciente, ccPaciente, edadPaciente, motivoConsulta, telefonoPaciente,
                            "registrado");
                } else {
                    if (p4 == null) {
                        p4 = new Paciente(nombrePaciente, ccPaciente, edadPaciente, motivoConsulta, telefonoPaciente,
                                "registrado");
                    } else {

                        // Al acabarse los cupos le decimos al usuario que lamentablemente ya no se
                        // pueden registrar mas pacientes
                        System.out.println("""
                                #######################################################################
                                Los cupos actuales estan agotados, no se pueden registrar mas pacientes
                                #######################################################################
                                """);
                    }
                }
            }

        }
    }

    public void estadoPacientes() {
        atencionPaciente(p1);
        atencionPaciente(p2);
        atencionPaciente(p3);
        atencionPaciente(p4);
    }

    public void atencionPaciente(Paciente c) {
        if (c != null && c.getEstadoPaciente().equals("registrado")) {
            System.out.println("#######################################################");
            System.out.println("Paciente: " + c.getNombrePaciente());
            System.out.println("Estado de disponibilidad: " + c.getEstadoPaciente());
            int opp = validador(1, 2, "Quieres atender a este Paciente??\n1. SI\n2. NO");
            if (opp == 1) {
                c.setEstadoPaciente("atendido");
                System.out.println("El estado del paciente fue actualizado");
            } else {
                System.out.println("El paciente sigue en espera");
            }
        }
    }
}