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
//busqueda por id  return doc
//busqueda por nombre return doc

public class Cola {
    class Nodo {
        Citas cita;
        Nodo sig;
    }
    
    public Nodo raiz,fondo,temp; 

    public Nodo getRaiz() {
        return raiz;
    }

    public Nodo getFondo() {
        return fondo;
    }
    
    
    Cola() {
        //Declaración de nodo
        raiz=null;
        fondo=null;
        this.temp = this.raiz;
    }

    public void resetTemp() {
        this.temp = this.raiz;
    }
    
    boolean vacia (){
        //Devuelve el estado de la raiz
        if (raiz == null)
            return true;
        else
            return false;
    }

    void insertar (Citas cita){
        //Crear nodo nuevo y asignar direccion a los punteros
        Nodo nuevo;
        nuevo = new Nodo ();
        nuevo.cita = cita;
        nuevo.sig = null;
        if (vacia ()) {
            raiz = nuevo;
            fondo = nuevo;
        } else {
            fondo.sig = nuevo;
            fondo = nuevo;
        }
        this.temp = this.raiz;
    }

    Citas extraer (){//si no existe da null(cuidado)
        //Extrae parecido al de la pila
        if (!vacia ()) {
            Citas cita = raiz.cita;
            if (raiz == fondo){
                raiz = null;
                fondo = null;
            } else {
                raiz = raiz.sig;
            }
            return cita;
        } else
            return null;
    }

    public void imprimir() {
        //Recorre la cola
        Nodo reco=raiz;
        System.out.println("Listado de todos los elementos de la cola.");
        while (reco!=null) {
            System.out.print(reco.cita.getFecha()+" hora: "+reco.cita.getHora()+" - ");
            reco=reco.sig;
        }
        System.out.println();
    }
}
