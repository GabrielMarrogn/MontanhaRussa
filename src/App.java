import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {

            int qtd = sc.nextInt();
            int alturaMin = sc.nextInt();
            int alturaMax = sc.nextInt();
            int calc = 0;

            for (int i = 0; i < qtd; i++) {
                int pessoa = sc.nextInt();
                if (pessoa >= alturaMin && pessoa <= alturaMax) {
                    calc++;
                }
            }

            System.out.println(calc);
        }

        sc.close();
    }
}
