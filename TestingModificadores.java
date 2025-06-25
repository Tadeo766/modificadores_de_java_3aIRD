
import paquete.Clase1;

public class TestingModificadores {
    
    public static void main(String[] args) {
        ClasePadre unPapa = new ClasePadre();
        ClaseHijo unHijo = new ClaseHijo();
        Clase1 objeto1 = new Clase1();

        System.out.println();
        System.out.println(unPapa.toString());

        // modificar el campo publico
        unPapa.campo1 = 28;
        unPapa.setCampo2(12); //modificar el campo privado

        System.out.println(unPapa.toString());

        //comportamientode campo privado y publico en el hijo
        unHijo.campo1 = 32; //campo publico heredado
        unHijo.setCampo2(-45); //campo privado heredado
        unHijo.setCampo3(12);//campo privado heredado

        System.out.println(unHijo.toString());

        //comportamiento de campos de una clase en un paquete
        objeto1.x = 56; //campo publico
        objeto1.setY(42);//campo privado
        // objeto1.z = 98; no se puede acceder porque no esta en el mismo paquete y es tipo protected
        System.out.println(objeto1.toString());
    }
}
