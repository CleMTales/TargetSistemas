import java.util.ArrayList;
import java.util.Scanner;

public class questao_5 {
    public questao_5() {
        String string, stringRev = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a String que será escrita ao contrário: ");
        string = sc.nextLine();
        for (int i = string.length() - 1; i >= 0; i--){
            stringRev = stringRev.concat(String.valueOf(string.charAt(i)));
        }
        System.out.println("String original : " + string);
        System.out.println("String ao contrário : " + stringRev);

    }
}
