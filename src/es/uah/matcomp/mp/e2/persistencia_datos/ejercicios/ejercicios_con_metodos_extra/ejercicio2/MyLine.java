package es.uah.matcomp.mp.e2.persistencia_datos.ejercicios.ejercicios_con_metodos_extra.ejercicio2;

public class MyLine {
    private MyPoint begin;
    private MyPoint end;

    //CONSTRUCTORES

    public MyLine(int x1,int y1, int x2, int y2){
        this.begin=new MyPoint(x1,y1);
        this.end=new MyPoint(x2,y2);
    }

    public MyLine (MyPoint begin,MyPoint end){
        this.begin=begin;
        this.end=end;
    }

    //GETTERS

    public MyPoint getBegin() {
        return begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    public int getBeginX(){
        return begin.getX();
    }

    public int getBeginY(){
        return begin.getY();
    }

    public int getEndX(){
        return end.getX();
    }

    public int getEndY(){
        return end.getY();
    }

    public int[] getBeginXY(){
        return begin.getXY();
    }

    //SETTERS

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }

    public void  setBeginX(int x){
        begin.setX(x);
    }

    public void  setBeginY(int y){
        begin.setY(y);
    }

    public void  setEndX(int x){
        end.setX(x);
    }

    public void  setEndY(int y){
        end.setY(y);
    }

    public void setBeginXY(int x,int y){
        begin.setXY(x,y);
    }

    public int[] getEndXY(){
        return end.getXY();
    }

    public void setEndXY(int x,int y){
        end.setXY(x,y);
    }

    //MÉTODOS

    public double getLength(){  //Devuelve longuitud
        return begin.distance(end);
    }

    public double getGradient(){    //Devuelve ángulo de inclinación con el eje x

        int xDiff=end.getX()-begin.getX();
        int yDiff=end.getY()-begin.getY();
        return Math.atan2(yDiff,xDiff);
    }

    public String toString(){
        return "MyLine[begin="+begin+",end="+end+"]";
    }
}
