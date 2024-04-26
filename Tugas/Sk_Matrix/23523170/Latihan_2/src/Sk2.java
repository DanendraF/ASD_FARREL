public class Sk2 {
    //DANENDRA FARREL - 23523170
    public static void main(String[] args) {
        // Kunci
        char[] kunciJawaban = {'A', 'C', 'B'};

        // Jawaban
        char[] jawabanMahasiswa = {'A', 'C', 'D'};

        //jumlah jawaban yang benar
        int jumlahBenar = 0;
        for (int i = 0; i < kunciJawaban.length; i++) {
            if (jawabanMahasiswa[i] == kunciJawaban[i]) {
                jumlahBenar++;
            }
        }

        // hasil
        System.out.println("Jumlah jawaban yang benar: " + jumlahBenar);
    }
}