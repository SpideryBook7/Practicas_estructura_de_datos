import java.util.Scanner;

public class practica1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("introduce el limite inferior:");
        int li = scan.nextInt();
        System.out.println("introduce el limite superior:");
        int ls = scan.nextInt();
        int sumatoria = Sum(li, ls);

        System.out.println("La suma de los cuadrados es: " + sumatoria);
        scan.close();
    }

    private static int Sum(int li, int ls) {
        if (li > ls) {
            return 0;
        } else {
            int cuadrados = li * li;
            return cuadrados + Sum(li + 1, ls);
        }
    }
}
