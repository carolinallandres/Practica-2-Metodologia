package es.uah.matcomp.mp.e2.persistencia_datos.ejemplo2.ejemplo_con_metodos_extra;

import es.uah.matcomp.mp.e2.persistencia_datos.ejercicios.ejercicios_con_metodos_extra.GsonUtil;

public class MainAlumno {

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Uso: java -jar PracticaPresentar.jar <init|show|update|delete> <fichero>");
            return;
        }
        String operacion=args[0];
        String fichero=args[1];
        switch (operacion) {
            case "init":
                Alumno alumno=new Alumno("Juan",20,"Matemáticas y computación");
                GsonUtil.guardarObjetoEnArchivo(fichero, alumno);
                System.out.println("Fichero creado: "+fichero);
                return;
            case "show":
                Alumno alumnoCargado=GsonUtil.cargarObjetoDesdeArchivo(fichero,Alumno.class);
                if (alumnoCargado != null) {
                    System.out.println("Nombre: "+alumnoCargado.getNombre());
                    System.out.println("Edad: "+alumnoCargado.getEdad());
                    System.out.println("Curso: "+alumnoCargado.getCurso());
                }
                else{
                    System.out.println("No se pudo leer el fichero: "+fichero);
                }
                return;
            case "update":
                if (args.length<4) {
                    System.out.println("Uso: update <fichero> <nombre|edad|curso> <valor>");
                    return;
                }
                String campo=args[2];
                String valor = args[3];
                Alumno a = GsonUtil.cargarObjetoDesdeArchivo(fichero,Alumno.class);
                if (a==null) {
                    System.out.println("No se pudo leer el fichero");
                    return;
                }
                if (campo.equals("nombre")) {
                    a.setNombre(valor);
                    GsonUtil.guardarObjetoEnArchivo(fichero,a);
                    System.out.println("Atributo actualizado correctamente");
                    return;
                }
                if (campo.equals("edad")) {
                    try {
                        int edad=Integer.parseInt(valor);
                        a.setEdad(edad);
                        GsonUtil.guardarObjetoEnArchivo(fichero, a);
                        System.out.println("Atributo actualizado correctamente");
                    }
                    catch (NumberFormatException e) {
                        System.out.println("Error: la edad debe ser un número entero");
                    }
                    return;
                }
                if (campo.equals("curso")) {
                    a.setCiclo(valor);
                    GsonUtil.guardarObjetoEnArchivo(fichero,a);
                    System.out.println("Atributo actualizado correctamente");
                    return;
                }
                System.out.println("No existe el atributo");
                return;
            case "delete":
                if (GsonUtil.eliminarFichero(fichero)) {
                    System.out.println("Fichero eliminado correctamente: "+fichero);
                }
                else {
                    System.out.println("No se pudo eliminar el fichero");
                }
                return;
            default:
                System.out.println("Operación inválida. Usa init,show,delete o update.");
                return;
        }
    }
}