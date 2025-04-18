
public class arugo02_01 {
    public static void main(String[] args) {
        int[] STR = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        // Invertendo o vetor
        for (int i = 0; i < STR.length / 2; i++) {
            // Troca os elementos
            int temp = STR[i];
            STR[i] = STR[STR.length - 1 - i];
            STR[STR.length - 1 - i] = temp;
        }

        // Exibindo o vetor invertido
        System.out.print("STR={");
        for (int i = 0; i < STR.length; i++) {
            if (i == STR.length - 1) {
                System.out.print(STR[i]+"}");
            } else {
                System.out.print(STR[i] + ",");
            }
        }
    }
}

