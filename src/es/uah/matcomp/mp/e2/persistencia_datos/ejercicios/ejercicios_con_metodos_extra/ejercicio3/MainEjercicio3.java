package es.uah.matcomp.mp.e2.persistencia_datos.ejercicios.ejercicios_con_metodos_extra.ejercicio3;

import es.uah.matcomp.mp.e2.persistencia_datos.ejercicios.ejercicios_con_metodos_extra.GsonUtil;

public class MainEjercicio3 {
    public static void main(String[] args) {
        Circle[] lista={new Circle(1),new Circle(2),new Circle(3)};
        GsonUtil.guardarArray("circulos.json",lista);
        Circle[] lista2=GsonUtil.cargarArray("circulos.json", Circle[].class);
        for (Circle c : lista2) {
            System.out.println(c);
        }
    }
}