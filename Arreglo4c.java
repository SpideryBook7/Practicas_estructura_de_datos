import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Arreglo4c {

    // para abrir un bufer de entrada
    public static BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
    public static String entrada;

    // metodo que regresa un arreglo de double y recibe un parametro entero
    public static double[] leerPromedios(int n) throws IOException {
        double[] proms = new double[n];
        System.out.println("Introduccion de los promedios de cada estudiante");
        for (int i = 0; i < n; i++) {
            System.out.println("Escribe el promedio individual del estudiante con el id" + i + ":");
            entrada = bufer.readLine();
            proms[i] = Double.parseDouble(entrada);
        }
        return proms;// regresa todos los elementos del arreglo proms
    }

    public static double calcularPromedioGrupo(double[] p) {
        double suma = 0;
        for (int i = 0; i < p.length; i++)
            suma = suma + p[i];

        return suma / p.length;
    }

    // metodo que no regresa valores y recibe un arreglo
    public static void imprimirPromeidos(double[] proms) {
        int i = 0;
        System.out.println("Promedios individuales del grupo");
        System.out.println("ID alumno  Promedio individual");
        System.out.println("-------------------------------");
        for (double prom : proms) { // for extendido
            System.out.println("  " + i + "        " + prom);
            i++;
        }
    }

    public static void main(String[] args) throws IOException {
        final int T = 5; // declarando una constante
        double promedioGrupo;

        // para abrir un bufer de entrada
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;

        // declaracion y construyendo el arreglo
        int[] arreglo = new int[5];
        // un arreglo de chars
        char[] caracteres = new char[T];

        // declaracion y contruir un arreglo de double
        double[] promedios = { 9.1, 8.6, 7.4, 5.3, 9.2, 6.5 };

        // declaacion de un arreglo de valoresbooleanos
        boolean[] datos;
        int t; // tamaño variabñe de arreglos

        // un arreglo de valores double
        double[] valoresDoubles;

        // inicializamos todas las casillas del arrgelo en 0
        for (int i = 0; i < 5; i++)
            arreglo[i] = 0;

        System.out.println("arreglo: ");// mal forma de aplicar la funcion ya que el resultado es el espacio en memoria
        System.out.println(arreglo);

        System.out.println("contenido del arreglo"); // forma correcta de hacer el procedimiento, y imprimir
        for (int i = 0; i < arreglo.length; i++)
            System.out.println("arreglo[" + i + "] = " + arreglo[i]);

        // leer los valores del arreglo caracteres
        System.out.println("Escribe los valores del arreglo");
        for (int i = 0; i < T; i++) {
            System.out.println("Escribe el valor [" + i + "]:");
            entrada = bufer.readLine();
            caracteres[i] = entrada.charAt(0);
        }
        System.out.println("contenido del arreglo caracteres:");
        for (int i = 0; i < caracteres.length; i++) {
            System.out.println("caracteres[" + i + "]= " + caracteres[i]);

            System.out.println("escribe el tamaño del arreglo de datos");
            entrada = bufer.readLine();
            t = Integer.parseInt(entrada);

            datos = new boolean[t]; // construimos el arreglo con el tamaño t

            // relllenando datos con valores booleanos
            for (i = 0; i < t; i++) {
                System.out.println("Escribe el valor [" + i + "] de datos:");
                entrada = bufer.readLine();
                datos[i] = Boolean.parseBoolean(entrada);
            }
            // mostrando los valores del arreglo datos, usando un for extendido
            for (boolean unDato : datos)
                System.out.println(unDato);

            System.out.println("Escribe el tamaño del arreglo de valores double");
            entrada = bufer.readLine();
            t = Integer.parseInt(entrada);

            valoresDoubles = new double[t]; // construimos el arreglo con el tamaño t

            // rellenando valoresDoubles con valores double
            for (i = 0; i < t; i++) {
                System.out.println("Escribe el valor [" + i + "] de valores double:");
                entrada = bufer.readLine();
                valoresDoubles[i] = Double.parseDouble(entrada);
            }

            // mostrando los valores del arreglo valoresDoubles, usando un for extendido
            for (double unValor : valoresDoubles)
                System.out.println(unValor);

            promedioGrupo = calcularPromedioGrupo(promedios);

            // calcular el promedio de un grupo
            System.out.println();
            System.out.println("escribe el tamaño del grupo");
            entrada = bufer.readLine();
            t = Integer.parseInt(entrada); // t es el tamaño del grupo

            promedios = leerPromedios(t);
            imprimirPromeidos(promedios);
            promedioGrupo = calcularPromedioGrupo(promedios);
            System.out.println("el promedio de grupo es " + promedioGrupo);

        }
    }
}
