package edu.ejercicios.ListaSimple;

public class Nodo {
    private int dato;    //Dato que contendra el nodo
    private Nodo siguiente;  //el indicador del nodo, en este caso "siguiente" nos indicara lo que hay por delante del nodo

    //Constructor para agregar al inicio
    public Nodo (int dato, Nodo siguiente)
    {
        this.dato=dato;
        this.siguiente=siguiente;
    }

    //Constructor para agregar al final
    public Nodo (int dato)
    {
        this.dato=dato;
        this.siguiente=null;
    }

    public int getDato() {
        return dato;
    }
    public void setDato(int dato) {
        this.dato = dato;
    }
    public Nodo getSiguiente() {
        return siguiente;
    }
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}