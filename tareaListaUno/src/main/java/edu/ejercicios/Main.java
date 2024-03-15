package edu.ejercicios;

import edu.ejercicios.ListaSimple.ListaEnlazadaUno;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
//invertir, obtener dato, eliminar duplicado, tamaño

        ListaEnlazadaUno listaSimple = new ListaEnlazadaUno();
        listaSimple.agregarInicio(5);
        listaSimple.agregarInicio(3);
        listaSimple.agregarAlFinal(9);
        listaSimple.agregarAlFinal(5);

        System.out.println(listaSimple.mostrarLista());

      //  System.out.println(listaSimple.obtenerDato(2));


      //listaSimple.agregarEnMedio(2);
//
      // listaSimple.eliminarRepetidos();
//
       //System.out.println(listaSimple.mostrarLista() );
//       System.out.println("Cantidad de datos: " + listaSimple.getCanElementos());

       // listaSimple.mostrarListaAlFinal(listaSimple.getInicio());



//        listaSimple.eliminarInicio();
//        listaSimple.agregarAlFinal(5);
//        System.out.println(listaSimple.mostrarLista());
//
      //listaSimple.eliminarAlFinal();
//
     // System.out.println(listaSimple.mostrarLista());

    }
}