import java.util.Scanner;
import java.util.Stack;

public class decimaltobiner {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Masukkan bilangan dalam desimal : ");
        int angka = input.nextInt();
        System.out.printf("Hasil konversi bilangan desimal " + angka + " ke biner adalah : ");

        Stack<Integer> Stackbiner = new Stack<>();
        while (angka != 0) {
            int x = angka % 2;

            // Push x ke stack
            Stackbiner.push(x);
            angka /= 2;
        }

        while (!Stackbiner.isEmpty()) {
            // Pop dan print biner
            System.out.print(Stackbiner.pop());
        }
    }
}