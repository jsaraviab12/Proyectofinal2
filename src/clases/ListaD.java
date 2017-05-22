/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Jesus
 */
public class ListaD {
 public class ListaDoble {
     private NodoD head;
    private NodoD tail;
    private int size;

    public ListaDoble() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public int getSize() {
        return this.size;
    }
    public boolean estaVacia(){
        return (this.head == null);
    }

    public void insertarInicio(Personas datos) {
        NodoD nuevo = new NodoD(datos);
        if (this.head == null) {
            this.head = nuevo;
            this.tail = nuevo;
        } else {
            nuevo.enlazarSiguiente(head);
            head.enlazarAnterior(nuevo);
            this.head = nuevo;
        }
        size++;
    }
      public void eliminarInicio(){
        if(! estaVacia())
            if(head.getSiguiente() != null){
                 head =head.getSiguiente();
                //cabecera.anterior=null;
            }
        
    }

    public void insertarFinal(Personas datos) {
        NodoD nuevo = new NodoD(datos);
        if (this.head == null) {
            this.head = nuevo;
            this.tail = nuevo;
        } else {
            tail.enlazarSiguiente(nuevo);
            nuevo.enlazarAnterior(tail);
            this.tail = nuevo;
        }
    }
    
   
   

 }
}
