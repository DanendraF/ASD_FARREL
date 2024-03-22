public class UangKembalian {

    public static void main(String[] args) {

        int[] banyakUang = {0, 0, 1, 1, 3, 0, 2, 1};
        int[] uangPecahan = {100000, 50000, 20000, 10000, 5000, 2000, 1000, 500};

        System.out.println("Uang kembalian terdiri dari:");

        for (int i = 0; i < banyakUang.length; i++) {

            if (banyakUang[i] > 0) {
                System.out.printf("%d lembar uang pecahan %d%n", banyakUang[i], uangPecahan[i]);
            }

        }

    }

}