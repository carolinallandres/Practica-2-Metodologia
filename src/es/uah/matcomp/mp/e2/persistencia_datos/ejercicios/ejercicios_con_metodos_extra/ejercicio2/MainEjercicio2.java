package es.uah.matcomp.mp.e2.persistencia_datos.ejercicios.ejercicios_con_metodos_extra.ejercicio2;

import es.uah.matcomp.mp.e2.persistencia_datos.ejercicios.ejercicios_con_metodos_extra.GsonUtil;

public class MainEjercicio2 {
    public static void main(String[] args) {

        MyLine linea=new MyLine(4,6,4,6);
        GsonUtil.guardarObjetoEnArchivo("linea.json",linea);
        MyLine lineaCargada=GsonUtil.cargarObjetoDesdeArchivo("linea.json", MyLine.class);
        System.out.println("Linea: "+lineaCargada);
    }
}