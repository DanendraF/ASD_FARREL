public class ForTransversal {
    public static void main(String[] args) throws Exception {
        int umurPasien[] = new int[16];
        umurPasien[0] = 25;
        umurPasien[1] = 3;
        umurPasien[2] = 31;
        umurPasien[3] = 22;
        umurPasien[4] = 7;
        umurPasien[5] = 16;
        umurPasien[6] = 21;
        umurPasien[7] = 22;
        umurPasien[8] = 8;
        umurPasien[9] = 10;
        umurPasien[10] = 72;
        umurPasien[11] = 13;
        umurPasien[12] = 33;
        umurPasien[13] = 14;
        umurPasien[14] = 29;
        umurPasien[15] = 36;

        for (int umur : umurPasien) {
            if (umur >= 25) {
                System.out.println("umur pasien yang lebih dari 25 yaitu : ");
                System.out.println("Umur Pasien: " + umur);
            }
        }

    }
}
