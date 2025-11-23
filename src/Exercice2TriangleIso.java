import java.util.*;
public class Exercice2TriangleIso {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Hauteur : ");
        int n = sc.nextInt();
        sc.close();
        for (int i = 1; i <= n; i++) {
            for (int s = 0; s < n - i; s++) {
                System.out.print(" ");
            }
            for (int e = 0; e < 2 * i - 1; e++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
	}

}
