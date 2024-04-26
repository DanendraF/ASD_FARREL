public class Latihan1{
    public static void main(String[] args) {
        int Danendra[][] = {{0,7},{7,0}};
        int Adriansyah[][] = {{1,9},{1,9}};

        int MatrixHasil[][] =  new int[2][2];

        for (int i = 0; i < Danendra.length; i++){
            for (int j = 0; j < Adriansyah.length; j++){
                MatrixHasil[i][j] = Danendra[i][j] - Adriansyah[i][j];
                System.out.print(MatrixHasil[i][j] + " "); 
            }
            System.out.println("");
        }

    }
}