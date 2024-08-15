import java.util.Scanner;

public class viaje {
    int tiquete;

public viaje(int tiquete){
    this.tiquete=tiquete;
    Scanner sc = new Scanner(System.in);


System.out.println("Ingrese su edad: ");
int edad =sc.nextInt();

if (edad < 2){
System.out.println("Prohibido Viajar");
}

if (edad >= 2 && edad < 5 ){
System.out.println("El viaje es gratuito");
}

if (edad >=5 && edad <11){
    tiquete=tiquete * 1/2;
    System.out.println("El valor del tiquete es de: "+tiquete);
}

if (edad >= 11 && edad <15){
    tiquete=tiquete * 3/4;
    System.out.println("El valor del tiquete es de: "+tiquete);
}

if (edad >= 15 ){
    System.out.println("Precio normal");
}


}

public static void main(String[] args) {
    viaje v1 =new viaje(1000000);
}

}

