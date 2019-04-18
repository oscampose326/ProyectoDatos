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
public class ArbolMedicamentos {
    class Nodo
      {
        Medicamentos info;
        Nodo izq, der;
      }
      Nodo raiz;

      public ArbolMedicamentos() {
          raiz=null;
      }
      
      public void insertar (Medicamentos info)
      {
          Nodo nuevo;
          nuevo = new Nodo ();
          nuevo.info = info;
          nuevo.izq = null;
          nuevo.der = null;
          if (raiz == null)
              raiz = nuevo;
          else
          {
              Nodo anterior = null, reco;
              reco = raiz;
              while (reco != null)
              {
                  anterior = reco;
                  if (info.id < reco.info.id)
                      reco = reco.izq;
                  else
                      reco = reco.der;
              }
              if (info.id < anterior.info.id)
                  anterior.izq = nuevo;
              else
                  anterior.der = nuevo;
          }
      }

      private void imprimirPre (Nodo reco)
      {
          if (reco != null)
          {
              System.out.print(reco.info.nombre + " ");
              imprimirPre (reco.izq);
              imprimirPre (reco.der);
          }
      }

      public void imprimirPre ()
      {
          imprimirPre (raiz);
          System.out.println();
      }

      private void imprimirEntre (Nodo reco)
      {
          if (reco != null)
          {    
              imprimirEntre (reco.izq);
              System.out.print(reco.info.nombre + " ");
              imprimirEntre (reco.der);
          }
      }

      public void imprimirEntre ()
      {
          imprimirEntre (raiz);
          System.out.println();
      }

      private void imprimirPost (Nodo reco)
      {
          if (reco != null)
          {
              imprimirPost (reco.izq);
              imprimirPost (reco.der);
              System.out.print(reco.info.nombre + " ");
          }
      }

      public void imprimirPost ()
      {
          imprimirPost (raiz);
          System.out.println();
      }
}
