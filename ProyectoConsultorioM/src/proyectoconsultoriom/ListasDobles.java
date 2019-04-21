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
public class ListasDobles {
    class Nodo {
        Recetario recetario;
        Nodo ant, sig;
    }

    public Nodo raiz;

    public ListasDobles() {
        raiz = null;
    }

    void insertar(int pos, Recetario x) {
        if (pos <= cantidad() + 1) {
            Nodo nuevo = new Nodo();
            nuevo.recetario = x;
            if (pos == 1) {
                nuevo.sig = raiz;
                if (raiz != null) {
                    raiz.ant = nuevo;
                }
                raiz = nuevo;
            } else if (pos == cantidad() + 1) {
                Nodo reco = raiz;
                while (reco.sig != null) {
                    reco = reco.sig;
                }
                reco.sig = nuevo;
                nuevo.ant = reco;
                nuevo.sig = null;
            } else {
                Nodo reco = raiz;
                for (int f = 1; f <= pos - 2; f++) {
                    reco = reco.sig;
                }
                Nodo siguiente = reco.sig;
                reco.sig = nuevo;
                nuevo.ant = reco;
                nuevo.sig = siguiente;
                siguiente.ant = nuevo;
            }
        }
    }

    public Recetario extraer(int pos) {
        if (pos <= cantidad()) {
            Recetario informacion;
            if (pos == 1) {
                informacion = raiz.recetario;
                raiz = raiz.sig;
                if (raiz != null) {
                    raiz.ant = null;
                }
            } else {
                Nodo reco;
                reco = raiz;
                for (int f = 1; f <= pos - 2; f++) {
                    reco = reco.sig;
                }
                Nodo prox = reco.sig;
                reco.sig = prox.sig;
                Nodo siguiente = prox.sig;
                if (siguiente != null) {
                    siguiente.ant = reco;
                }
                informacion = prox.recetario;
            }
            return informacion;
        } else {
            return null;
        }
    }

    public void borrar(int pos) {

        if (pos <= cantidad()) {
            if (pos == 1) {
                raiz = raiz.sig;
                if (raiz != null) {
                    raiz.ant = null;
                } else {
                    Nodo reco = raiz;
                    for (int f = 1; f <= pos; f++) {
                        reco = reco.sig;
                    }
                    Nodo prox = reco.sig;
                    prox = prox.sig;
                    reco.sig = prox;
                    if (prox != null) {
                        prox.ant = reco;
                    }
                }
            }

        }
    }

    public void intercambiar(int pos1, int pos2) {

        if (pos1 <= cantidad() && pos2 <= cantidad()) {
            Nodo reco1 = raiz;
            for (int f = 1; f < pos1; f++) {
                reco1 = reco1.sig;
            }
            Nodo reco2 = raiz;
            for (int f = 1; f < pos2; f++) {
                reco2 = reco2.sig;
            }
            Recetario aux = reco1.recetario;
            reco1.recetario = reco2.recetario;
            reco2.recetario = aux;
        }
    }

    public int cantidad() {

        int cant = 0;
        Nodo reco = raiz;
        while (reco != null) {
            reco = reco.sig;
            cant++;
        }
        return cant;
    }

    public boolean existe(Recetario x) {
        Nodo reco = raiz;
        while (reco != null) {
            if (reco.recetario == x) {
                return true;
            }
            reco = reco.sig;
        }
        return false;
    }

    public boolean vacia() {
        if (raiz == null) {
            return true;
        } else {
            return false;
        }
    }

    public void imprimir() {
        Nodo reco = raiz;
        while (reco != null) {
            System.out.print(reco.recetario.getRecetario() + "-");
            reco = reco.sig;
        }
        System.out.println();
    }
}
