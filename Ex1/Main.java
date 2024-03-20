package Ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char op;
        float n1;
        float n2;
        Calculadora calc = new Calculadora();

        do {
            System.out.print("Digite o tipo da operação(+, -, x, :): ");
            op = input.nextLine().charAt(0);
        } while(op != '+' && op != '-' && op != 'x' && op != ':');

        if (op == '+') {
            System.out.print("Digite o 1° numero: ");
            n1 = Float.parseFloat(input.nextLine());
            System.out.print("Digite o 2° numero: ");
            n2 = Float.parseFloat(input.nextLine());
            calc.n1 = n1;
            calc.n2 = n2;
            calc.Som();
        } else if (op == '-') {
            System.out.print("Digite o 1° numero: ");
            n1 = Float.parseFloat(input.nextLine());
            System.out.print("Digite o 2° numero: ");
            n2 = Float.parseFloat(input.nextLine());
            calc.n1 = n1;
            calc.n2 = n2;
            calc.Sub();
        } else if (op == ':') {
            System.out.print("Digite o 1° numero: ");
            n1 = Float.parseFloat(input.nextLine());
            do {
                System.out.print("Digite o 2° numero: ");
                n2 = Float.parseFloat(input.nextLine());
            } while (n2 == 0);
            calc.n1 = n1;
            calc.n2 = n2;
            calc.Div();
        } else if (op == 'x') {
            System.out.print("Digite o 1° numero: ");
            n1 = Float.parseFloat(input.nextLine());
            System.out.print("Digite o 2° numero: ");
            n2 = Float.parseFloat(input.nextLine());
            calc.n1 = n1;
            calc.n2 = n2;
            calc.Mul();
        }
        System.out.println(calc.n1 +" "+ op +" "+ calc.n2 +" = " + calc.result);
    }
}
