public class soal1 {
    
    static String bilangan(int input){

        if (input > 0 && input < 10){
            return "satuan";
        } else if (input >= 10 && input <= 100){
            return "puluhan";
        } else if (input >= 100 && input < 1000){
            return "ratusan";
        } else if (input >= 1000 && input <= 10000){
            return "ribuan";
        } else {
            return "bilangan tidak valid";
        }
    }

    public static void main(String[] args) {
        String output = bilangan(77);
        System.out.println(output);
    }

}
