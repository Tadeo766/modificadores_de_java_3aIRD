package paquete;

public class Clase1 {
    public int x;
    private int y;
    protected int z;
    int w; //default
    

    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    
    //  metodo con modificador de accedo default
    void restW(){
        this.w -= 20;
    }

    @Override
    public String toString() {
        return "Clase1 [x=" + x + ", y=" + y + ", z=" + z + "]";
    }

    
}
