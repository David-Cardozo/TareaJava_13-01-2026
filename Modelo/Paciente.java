package Modelo;

import Controlador.Funciones;

public class Paciente {
    // En esta clase de objeto Clinica vamos a declarar las variables necesarias,
    // asi como crear un constructor, get an set y la funcion
    // que nos va a actualizar el dato del paciente y nos dira si este es mayor o
    // menor de edad
    String nombrePaciente;
    String cc;
    int edadPaciente;
    String motivoConsulta;
    String telefonoPaciente;
    String tipoPaciente;
    String estadoPaciente;

    // En el constructor no pedimos el tipo de paciente pues este se calcula
    // automaticamente con al funcion mayoriaEdad()
    public Paciente(String nombrePaciente, String cc, int edadPaciente, String motivoConsulta, String telefonoPaciente,
            String estadoPaciente) {
        Funciones f = new Funciones();
        this.nombrePaciente = nombrePaciente;
        this.cc = cc;
        this.edadPaciente = edadPaciente;
        this.motivoConsulta = motivoConsulta;
        this.telefonoPaciente = telefonoPaciente;
        this.tipoPaciente = f.mayoriaEdad(edadPaciente);
        this.estadoPaciente = estadoPaciente;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public int getEdadPaciente() {
        return edadPaciente;
    }

    public void setEdadPaciente(int edadPaciente) {
        this.edadPaciente = edadPaciente;
    }

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }

    public String getTelefonoPaciente() {
        return telefonoPaciente;
    }

    public void setTelefonoPaciente(String telefonoPaciente) {
        this.telefonoPaciente = telefonoPaciente;
    }

    public String getTipoPaciente() {
        return tipoPaciente;
    }

    public String getEstadoPaciente() {
        return estadoPaciente;
    }

    public void setEstadoPaciente(String estadoPaciente) {
        this.estadoPaciente = estadoPaciente;
    }

}