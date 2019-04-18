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

//buscar por id return paciente

public class Listas {
    class Nodo {
        Paciente paciente;
        Nodo sig;
    }
    
    public Nodo raiz, ultimo;
    public Listas() {
        this.raiz = null;
        this.ultimo = null;
    }

    private boolean vacia() {
        if (this.raiz == null) {
            return true;
        }
        return false;
    }

    private int cantidad() {
        if (vacia()) {
            return 0;
        }
        int cont = 0;
        Nodo temp = raiz;
        while (temp != null) {
            cont++;
            temp = temp.sig;
        }
        return cont;
    }

    public void insertar(int pos, Paciente x) {
        if (pos <= cantidad() + 1) {
            Listas.Nodo nuevo;
            nuevo = new Listas.Nodo();
            nuevo.paciente = x;
            nuevo.sig = null;
            if (pos == 1) {
                nuevo.sig = raiz;
                raiz = nuevo;
            } else {
                if (pos == cantidad() + 1) {
                    Nodo reco = raiz;
                    while (reco.sig != null) {
                        reco = reco.sig;
                    }
                    reco.sig = nuevo;
                    nuevo.sig = null;
                } else {
                    Nodo reco = raiz;
                    for (int i = 0; i < pos - 2; i++) {
                        reco = reco.sig;
                    }
                    Nodo siguiente = reco.sig;
                    reco.sig = nuevo;
                    nuevo.sig = siguiente;
                }
            }
        }
    }

    public String mostrar() {
        Nodo temp = raiz;
        String msg = "";
        if (!vacia()) {
            while (temp != null) {
                msg = msg + temp.paciente.getNombre() + " Sangre "+temp.paciente.getSangre()+"-> ";
                temp = temp.sig;
            }
            System.out.println(msg + " NULL ");
            return msg = msg + " NULL ";
        }
        return "Lista vacia";
    }

    public Paciente extraer(int pos) {
        if (pos <= cantidad()) {
            Paciente informacion;
            if (pos == 1) {
                informacion = raiz.paciente;
                raiz = raiz.sig;
            } else {
                Nodo reco;
                reco = raiz;
                for (int i = 0; i <= pos - 2; i++) {
                    reco = reco.sig;
                }
                Nodo prox = reco.sig;
                reco.sig = prox.sig;
                informacion = prox.paciente;
            }
            return informacion;
        }
        return null;
    }

    public Paciente getPaciente(int id){
        Nodo temp = raiz;
        while(temp!=null){
            if(temp.paciente.getId()==id)
                return temp.paciente;
            temp=temp.sig;
        }
        return null;
    }
    public void borrar(int pos) {
        if (pos <= cantidad()) {
            if (pos == 1) {
                raiz = raiz.sig;
            } else {
                Nodo reco;
                reco = raiz;
                for (int i = 0; i < pos - 2; i++) {
                    reco = reco.sig;
                }
                Nodo prox = reco.sig;
                reco.sig = prox.sig;
            }
        }
    }

    public void intercambiar(int pos1, int pos2) {
        if (pos1 <= cantidad() && pos2 <= cantidad()) {
            Nodo reco1 = raiz;
            for (int i = 0; i < pos1; i++) {
                reco1 = reco1.sig;
            }
            Nodo reco2 = raiz;
            for (int i = 0; i < pos2; i++) {
                reco2 = reco2.sig;
            }
            Paciente aux = reco1.paciente;
            reco1.paciente = reco2.paciente;
            reco2.paciente = aux;
        }
    }

    
    
    public boolean existe(int x){
        Nodo reco=raiz;
        while(reco!=null){
            if(reco.paciente.getId()==x)
                return true;
            reco=reco.sig;
        }
        return false;
    }
    
    public int buscar(int x){
        int cont=1;
        Nodo reco=raiz;
        while(reco!=null){
            if(reco.paciente.getId()==x)
                return cont;
            cont++;
            reco=reco.sig;
        }
        return -1;
    }
}
