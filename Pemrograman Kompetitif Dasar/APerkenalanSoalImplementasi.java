import java.util.Scanner;
public class APerkenalanSoalImplementasi {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int baris = console.nextInt();
        int kolom = console.nextInt();

        int [][] arr = new int [baris] [kolom];
        
        for (int i = 0 ; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                arr [i][j] = console.nextInt();
            }
        }

        for (int i = 0 ; i < kolom ; i++) {
            for (int j = baris - 1; j >= 0; j--) {
                System.out.print(arr [j][i] + " ");
            }
            System.out.println();
        }
    }
}