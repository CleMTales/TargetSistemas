import java.util.ArrayList;
import java.util.Scanner;

public class questao_2 {
    public questao_2() {
        int fib_a = 0, fib_b = 0, num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o número a ser procurado na sequencia de Fibonacci: ");
        num = sc.nextInt();
        System.out.println("O número " + num + (fibonacci(num) ? " " : " não ") + "se encontra presente na sequência de Fibonacci.");

    }


    public boolean fibonacci(int n) {
        ArrayList<Integer> fib = new ArrayList<>();
        fib.add(0);
        fib.add(1);
        if (n < 0)
            return false;
        if (n == 1 || n == 0)
            return true;

        for (int i = 1; fib.get(i) < n; i++) {
            fib.add(fib.get(i - 1) + fib.get(i));
            System.out.println(fib.get(i));
        }

        if (fib.get(fib.size() - 1) == n)
            return true;
        else return false;
    }
}
