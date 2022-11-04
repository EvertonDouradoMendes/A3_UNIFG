import java.util.Scanner;

public class Financeiro {
    Scanner input = new Scanner(System.in);

    double renda;
    double despesa;
    double gastosFixos;
    double gastosFlutuantes;
    double saldo;

    void cadastrarRenda() {
        System.out.println("Insira sua renda: ");
        renda = input.nextDouble();
    }

    void cadastrarGastosFixos() {
        System.out.println("Insira seus Gastos Fixos: ");
        gastosFixos = input.nextDouble();
    }

    void cadastrarGastosFlutuantes() {
        System.out.println("Insira seus Gastos Flutuantes: ");
        gastosFlutuantes = input.nextDouble();
    }

    void verDespesa() {
        despesa = gastosFixos - gastosFlutuantes;

        System.out.println("A despesa é de: " + despesa);
    }

    void verSaldo() {
        saldo = renda - despesa;

        System.out.println("O saldo é de: " + saldo);
    }

}
