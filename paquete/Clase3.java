package paquete;

public class Clase3 {
    Clase1 objeto1 = new Clase1();

    public void setDataClase1(){
        objeto1.x = 10;//usando la varible publica de clase 1 sin herencia
        //Solo si la variable x es estatica en clase 1
        // Clase1.x = 9;
        objeto1.w = 29; //aunque no bherda, puede usar 
        objeto1.restW();


    }
}
