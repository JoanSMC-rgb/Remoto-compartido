
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int numero = scan.nextInt();
        scan.close();

        int centenas = numero / 100;
        int unidades = numero % 10;
        int decenas = numero % 100 / 10;

        System.out.println(centenas + "/" + decenas + "/" + unidades);
        int cifraMayor, cifraMenor, cifraIntermedia;

        if(centenas > unidades && centenas > decenas) {
            cifraMayor = centenas;
            if(decenas>unidades) {
                cifraIntermedia = decenas;
                cifraMenor = unidades;
            } else {
                cifraIntermedia = unidades;
                cifraMenor = decenas;
            }
        } else if(decenas > unidades && decenas > centenas) {
            cifraMayor = decenas;
            if(centenas>unidades) {
                cifraIntermedia = centenas;
                cifraMenor = unidades;
            } else {
                cifraIntermedia = unidades;
                cifraMenor = centenas;
            }
        } else {
            cifraMayor = unidades;
            if(decenas > centenas) {
                cifraIntermedia = decenas;
                cifraMenor = centenas;
            } else {
                cifraIntermedia = centenas;
                cifraMenor = decenas;
            }
        }

        int result = cifraMayor * 100 +
                cifraIntermedia * 10 + cifraMenor;

        System.out.println("El número mayor es: " + result);
    }
}