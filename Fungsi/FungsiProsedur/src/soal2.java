public class soal2 {
    static void membacaKata(String input){
        System.out.println(input);
        for (int i = 0; i < input.length(); i++){
            System.out.print("*");
        }
    }   
    public static void main(String[] args) {
        membacaKata("Pemrograman Java Mudah");
    }
}