/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoconsultoriom;

/**
 *
 * @author ulacit
 */
public class Paciente {
    private int id;
    private String nombre;
    private String sangre;
    private int edad;
    private int peso;
    private int estatura;
    private Cola citas;
    private ListasDobles resetario;
    //arbol medicamentos

    /*public Paciente(int id, String nombre, String sangre) {
        this.id = id;
        this.nombre = nombre;
        this.sangre = sangre;
        resetario = new ListasDobles();
    }*/
    public Paciente(int id, String nombre, String sangre, int edad, int peso, int estatura) {
        this.id = id;
        this.nombre = nombre;
        this.sangre = sangre;
        this.edad=edad;
        this.peso=peso;
        this.estatura=estatura;
        this.resetario = new ListasDobles();
        this.citas = new Cola();
    }

    
    public Paciente(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSangre() {
        return sangre;
    }

    public void setSangre(String sangre) {
        this.sangre = sangre;
    }

    public ListasDobles getResetario() {
        return resetario;
    }

    public void setResetario(ListasDobles resetario) {
        this.resetario = resetario;
    }

    public Cola getCitas() {
        return citas;
    }

    public void setCitas(Cola citas) {
        this.citas = citas;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }
    
    
}
