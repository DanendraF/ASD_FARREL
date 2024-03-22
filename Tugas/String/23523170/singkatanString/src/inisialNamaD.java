import java.util.Scanner;

public class inisialNamaD {
    public static void main(String[] args) throws Exception {

        System.out.println("==============================");
        System.out.println("=== PROGRAM PEMBUAT INISAL ===");
        System.out.println("==============================");
        System.out.println("Masukan Nama Lengkap (akhiri dengan titik!) :");

        Scanner input = new Scanner(System.in);
        String singkatan = "";
        String kata;

        while (true) {
            kata = input.next();

            if (kata.endsWith(".")) {
                singkatan += kata.substring(0, kata.length() - 1).toUpperCase().charAt(0);
                break;
            } else {
                singkatan += kata.toUpperCase().charAt(0);
            }
        }

        System.out.println(singkatan);
        input.close();
    }
}
