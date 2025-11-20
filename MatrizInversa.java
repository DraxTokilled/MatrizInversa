import java.io.*;

public class MatrizInversa {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("matriz.txt"));
        double[][] m = new double[2][2];

        // Leer matriz 2x2 desde archivo
        m[0][0] = Double.parseDouble(br.readLine().trim());
        m[0][1] = Double.parseDouble(br.readLine().trim());
        m[1][0] = Double.parseDouble(br.readLine().trim());
        m[1][1] = Double.parseDouble(br.readLine().trim());
        br.close();

        // Determinante
        double det = m[0][0] * m[1][1] - m[0][1] * m[1][0];

        if (det == 0) {
            System.out.println("La matriz NO tiene inversa (determinante = 0).");
            return;
        }

        // Matriz inversa
        double[][] inv = {
            {  m[1][1] / det, -m[0][1] / det },
            { -m[1][0] / det,  m[0][0] / det }
        };

        // Guardar salida
        PrintWriter pw = new PrintWriter("matriz_inversa.txt");
        pw.println(inv[0][0] + " " + inv[0][1]);
        pw.println(inv[1][0] + " " + inv[1][1]);
        pw.close();

        System.out.println("Inversa generada. Revisa matriz_inversa.txt");
    }
}
