/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoconsultoriom;

import java.util.Date;

/**
 *
 * @author ulacit
 */
public class Admin {
    //pila doctor
    Listas paciente = new Listas();
    Pila doctores = new Pila();
    
    /*public void ejemplo_insertar(int id, String nombre, String sangre){
        Paciente pac2 = new Paciente(id,nombre,sangre);
        paciente.insertar(0, pac2);
    }*/
    
    public void registrarDoctor(String nombre, int id, int edad, int peso, int estatura, String sangre, String usuario, String contrasena){
        Doctor doc = new Doctor(id,nombre,sangre,estatura,peso);
        doc.setUsuario(usuario);
        doc.setPass(contrasena);
        doctores.insertarDato(doc);
    }
    
    public void registrarPaciente(int id, String nombre, String sangre, int edad, int peso, int estatura){
        //int id, String nombre, String sangre
        Paciente paciente = new Paciente( id,  nombre,  sangre, edad, peso, estatura);
        this.paciente.insertar(1, paciente);
        this.paciente.mostrar();
    }
    
    public Paciente buscarPaciente(int id){
        int pos=paciente.buscar(id);
        if(pos!=-1)
            return paciente.getPaciente(pos);
        return null;
    }
    public Doctor loginDoctor(String usuario, String pass){
        return doctores.loginDoctor(usuario, pass);
    }
    
    public void agregarCita(Paciente paciente, Date fecha, String hora, String motivo){
        Cola cita = paciente.getCitas();
        cita.insertar(new Citas(fecha,hora,motivo));
    }
    
    public void mostrarCitas(Paciente paciente){
        paciente.getCitas().imprimir();
    }
    
    public Date getCitasFecha(Cola cita){
        return cita.getRaiz().cita.getFecha();
    }
    public String getCitasHora(Cola cita){
        return cita.getRaiz().cita.getHora();
    }
    public String getCitasMotivo(Cola cita){
        return cita.getRaiz().cita.getMotivo();
    }
    public Cola resetCitas(Paciente paciente){
        return paciente.getCitas();
    }
}
