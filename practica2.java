import java.util.Scanner;

public class practica2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        int Nume1 = scanner.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int Nume2 = scanner.nextInt();

        int mcd = calcularMCD2(Nume1, Nume2);
        System.out.println("El MCD de " + Nume1 + " y " + Nume2 + " es: " + mcd);

        scanner.close();
    }

    // Función para calcular el MCD utilizando el algoritmo de Euclides con un bucle for
    public static int calcularMCD(int a, int b) {
        int temp;
        for (; b != 0;) {
            temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int calcularMCD2(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            int temp = b;
            b = a % b;
            a = temp;
            return calcularMCD(a, b);
        }
    }
}
