package es.uah.matcomp.mp.e2.persistencia_datos.ejercicios.ejercicios_con_metodos_extra.ejercicio2;

public class MyPoint {
    private int x;
    private int y;

    //CONSTRUCTORES

    public MyPoint(){
        x=0;
        y=0;
    }

    public MyPoint(int x, int y){
        this.x=x;
        this.y=y;
    }

    //GETTERS

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int[] getXY(){
        return new int[]{x,y};
    }

    //SETTERS

    public void setY(int y) {
        this.y = y; 
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setXY(int x,int y){
        this.x=x;
        this.y=y;
    }

    //MÉTODOS

    public String toString(){
        return "("+x+","+y+")";
    }

    public double distance(int x,int y){    //Devuelve la longuitud entre un punto y una coordenada
        int xn=x-this.x;
        int yn=y-this.y;
        return Math.sqrt(xn*xn+yn*yn);
    }

    public double distance(MyPoint another){    //Devuelve la distancia entre un punto y otro objeto punto
        return distance(another.x,another.y);
    }

    public double distance(){       //Devuelve la distancia al origen(0,0)
        return Math.sqrt(x*x+y*y);
    }
}

