public class Latihan2{
    public static void main(String[] args) {
        int Danendra[][] = {{1,9},{9,1}};
        int Adriansyah[][] = {{2,0,5},{2,0,5}};

        int MatrixHasil[][] = new int[2][3];

        for (int i = 0; i < 2; i++) { 
            for (int j = 0; j < 3; j++) { 
                for (int k = 0; k < 2; k++) 
                    MatrixHasil[i][j] += Danendra[i][k] * Adriansyah[k][j];
                    System.out.print(MatrixHasil[i][j] + " ");
            }
            System.out.println(""); 
        }

    }
}