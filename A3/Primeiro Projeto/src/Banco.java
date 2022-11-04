import java.util.Scanner;

public class Banco {
    Scanner input = new Scanner(System.in);

    String nomeNoCartao;
    double numCartao;
    double codigoSeguranca;
    double validadeDoCartao;

    void cadastrarCartao() {
        System.out.println("Insira o nome do proprietario do cartao: ");
        nomeNoCartao = input.nextLine();

        System.out.println("Insira o número do cartao: ");
        numCartao = input.nextDouble();

        System.out.println("Insira o código de segurança do cartao: ");
        codigoSeguranca = input.nextDouble();

        System.out.println("Insira a data de validade do cartao: ");
        validadeDoCartao = input.nextDouble();

    }

}
