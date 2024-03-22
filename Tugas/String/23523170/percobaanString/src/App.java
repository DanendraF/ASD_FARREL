public class App {
    public static void main(String[] args) throws Exception {
        String kataKata = "23523170 Danendra Farrel Adriansyah";
        // Isilah kataKata dengan NIM dan nama lengkap Anda
        
        char hasil_charAt;
        int hasil_length;
        String hasil_substring_1;
        String hasil_substring_2;
        boolean hasil_contains;
        String hasil_join;
        

        hasil_charAt = kataKata.charAt(5);
        hasil_length = kataKata.length();
        hasil_substring_1 = kataKata.substring(0, 5);
        hasil_substring_2 = kataKata.substring(5, 10);
        hasil_contains = kataKata.contains("Farrel");
        hasil_join = String.join(kataKata, " dan ", " tambahan ");

        System.out.println("Yang format dicoba sendiri yaa!");

    }
}

// charAt: Mengembalikan karakter pada indeks tertentu dalam sebuah string.
// length: Mengembalikan panjang dari sebuah string atau array.
// substring: Mengembalikan bagian dari sebuah string berdasarkan indeks awal dan akhir.
// contains: Memeriksa apakah sebuah string mengandung substring tertentu.
// join: Menggabungkan semua elemen dari sebuah array menjadi sebuah string dengan menggunakan delimiter tertentu.
