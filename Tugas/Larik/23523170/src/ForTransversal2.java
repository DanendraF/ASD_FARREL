public class ForTransversal2 {
    public static void main(String[] args) throws Exception {
        int umurPasien[] = {22, 44, 32, 25, 14, 7, 20, 19, 18, 24, 16, 12, 37, 43};


        System.out.println("umur pasien yang lebih dari 25 yaitu :");
        
        for (int i = 0; i < umurPasien.length; i++) {
            int umur = umurPasien[i];
        
            if (umur > 25) {
                System.out.println("Umur : " + umur);
            }
        }

    }
}
