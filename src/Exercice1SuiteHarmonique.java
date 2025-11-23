import java.util.*;
public class Exercice1SuiteHarmonique {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

        System.out.print("Entrez n : ");
        int n = sc.nextInt();
        sc.close();
        double somme = 0.0;

        for (int i = 1; i <= n; i++) {
            somme += 1.0 / i;
        }

        System.out.println("La somme harmonique de " + n + " = " + somme);
    }
	
}
