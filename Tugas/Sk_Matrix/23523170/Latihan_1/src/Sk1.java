import java.util.Random;

//DANENDRA FARREL - 23523170
public class Sk1 {
    public static void main(String[] args) {

        int matrix[][] = {{7, 3, 3}, {5, 0, 8}, {2, 4, 9}};
        int GenapD = 0;
        int GanjilD = 0;

        //Matrix
        System.out.println("Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        //GanjilGenap
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 == 0) {
                    GenapD++;
                } else {
                    GanjilD++;
                }
            }
        }

        // Print the results
        System.out.println("Banyak Bilangan Genap: " + GenapD);
        System.out.println("Banyak Bilangan Ganjil: " + GanjilD);
    }
}