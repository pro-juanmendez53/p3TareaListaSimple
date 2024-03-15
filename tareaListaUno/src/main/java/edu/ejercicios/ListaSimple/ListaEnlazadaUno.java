package edu.ejercicios.ListaSimple;

public class ListaEnlazadaUno{
    private Nodo inicio;
    private Nodo fin;
    private int canElementos;
    public ListaEnlazadaUno()
    {
        this.inicio=null;
        this.fin=null;
    }

   public boolean estaVacia()
    {
        return inicio==null && fin==null;
    }  //metodo para verificar si la lista esta vacia

    public void agregarInicio(int dato)
    {
        if (estaVacia())
        {
            inicio= new Nodo(dato);  //validamos si esta vacia, si lo esta agregamos y decimos que inicio y fin seran el nodo ingresado
            fin= inicio;
        }
        else
        {
            inicio= new Nodo(dato, inicio);  //almacenamos el dato en en nuevo nodo e indicamos que el que sigue seria el "inicio"
        }
        canElementos++;
    }

    public void agregarAlFinal(int dato)
    {
        if (estaVacia())
        {                        //se verifica que si esta vacia, pues entonces agregamos al inicio, en este caso llamamos al metodo anterior
            agregarInicio(dato);
        }
        else
        {
            fin.setSiguiente(new Nodo(dato)); //establezco el siguiente del nodo fin en ese momento, y se crea un nuevo nodo que almacena el dato
            fin=fin.getSiguiente();  //luego decimos que el nuevo fin, seria el fin de la lista enlazada
            canElementos++;
        }
    }

    public String mostrarLista()
    {
        String salida= "";
        Nodo aux; //creamos nodo auxiliar que recorrera la lista para mostrar el dato de cada nodo
        aux=inicio;
        while (aux!=null) //ciclo que se detendra al llegar al ultimo nodo
        {
            salida+= aux.getDato()+ " "; //me mostrara el dato del nodo en el que se encuentra el nodo auxiliar en ese momento
            aux= aux.getSiguiente();  //recorremos el auxiliar
        }
        return salida;
    }

    public void mostrarListaAlFinal(Nodo nodo) {
        if (nodo == null)     //Validamos si el nodo es nulo, de serlo lo retornara asi nada mas
        {
            return;
        }
        mostrarListaAlFinal(nodo.getSiguiente());  //usando recursividad, llamamos al metodo con el nodo siguiente, primero recorrera los nodos siguientes
        System.out.print(nodo.getDato() + " ");   //y ya luego imprimiremos el dato del nodo actual
    }


    public int eliminarInicio()
    {
        int datoEliminado=inicio.getDato();
        if (!estaVacia())  //verificamos si la lista no esta vacia
        {
            if (inicio==fin)
            {                //si el inicio es igual al final, significa que solo hay un elemento
                inicio=null;
                fin=null;     //borramos el unico dato, especificando que inicio y fin son null
            }
            else
            {
                inicio= inicio.getSiguiente();  //decimos que el inicio ahora sera el siguiente y se elimina el inicio actual
            }
            canElementos--;
        }
        return datoEliminado;
    }

    public int eliminarAlFinal()
    {
        int datoEliminado=fin.getDato();
        Nodo aux;  //creamos nodo auxilair para poder recorrer la lista
        aux=inicio;
        if(!estaVacia())
        {
            if(inicio==fin) //verificamos si solo hay un nodo y procedemos a eliminarlo
            {
                inicio=null;
                fin=null;
            }
            else
            {
                while(aux.getSiguiente()!=fin) //se recorre elauxiliar hasta que llegue a una casilla del final
                {
                    aux= aux.getSiguiente();  //va recorriendo el auxiliar la lista
                }
                fin=aux;    //decimos que el fin sera el auxiliar el cual estaria colocado anterior del ultimo nodo
                fin.setSiguiente(null); //aca desenlazamos el nodo final y de esa forma se borra el ultimo

            }
            canElementos--;
        }
        return datoEliminado;
    }

    public void agregarEnMedio(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (estaVacia())
        {
            agregarInicio(dato); // verificamos si esta vacia, si lo esta se agrega al inicio
            return;
        }
        Nodo aux;  //creamos nodo auxiliar
        aux=inicio;
        while (aux.getSiguiente() != null && aux.getSiguiente().getDato() < dato) //verificamos que aux no sea nulo  y tambien ubicamos donde insertar el nuevo
        {
            aux = aux.getSiguiente();
        }
        nuevo.setSiguiente(aux.getSiguiente());  //insertamos el nuevo nodo despues del auxiliar
        aux.setSiguiente(nuevo);
        canElementos++;
    }

    public void eliminarRepetidos() {
        if (estaVacia() || canElementos == 1)
        {
            System.out.println("Lista Vacia o Lista De Un Solo Dato");
            return;
        }
        Nodo aux;
        aux=inicio;
        while (aux != null) {
            Nodo comparador;
            comparador=aux;
            while (comparador.getSiguiente() != null)   // recorrera los nodos siguientes al auxiliar
            {
                if (comparador.getSiguiente().getDato() == aux.getDato()) { // al tener el nodo auxiliar y el comparador, si estos en algun momento son iguales
                    comparador.setSiguiente(comparador.getSiguiente().getSiguiente());  //se eliminara uno
                    canElementos--;
                } else {
                    comparador = comparador.getSiguiente();
                }
            }
            aux = aux.getSiguiente();
        }
    }

   public int obtenerDato(int numPosicion)
   {
       Nodo aux;
       aux=inicio;
       int contador=0;  //variable para rastrear la posicion actual mientras recorremos la lista
       while (aux != null) //se recorrera mientras el aux no sea nulo, porque de serlo significa que termianmos la lista
       {
           contador++;
           if (contador == numPosicion) {   //comparamos si nuestro rastreador es igual a la posicon que buscamos, significa que hemos llegado
               return aux.getDato();  //retornamos el dato
           }
           aux = aux.getSiguiente();  //si aun no lo encontramos avanzamos al sigueinte nodo de la lista
       }
       System.out.println("Posicon ingresada invalida " + numPosicion);
       return 0;
   }

    public Nodo getInicio() {
        return inicio;
    }
    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }
    public Nodo getFin() {
        return fin;
    }
    public void setFin(Nodo fin) {
        this.fin = fin;
    }
    public int getCanElementos() {
        return canElementos;
    }
    public void setCanElementos(int canElementos) {
        this.canElementos = canElementos;
    }
}