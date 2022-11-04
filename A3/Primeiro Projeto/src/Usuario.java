import java.util.Scanner;

public class Usuario {
    Scanner input = new Scanner(System.in);

    String login;
    String senha;
    String nome;
    String cpf;
    String email;
    String dataNascimento;
    String endereco;
    String cidade;
    String bairro;
    String estado;
    String cep;
    Boolean premissao;

    void criarUsuario() {
        login = input.nextLine();
        senha = input.nextLine();
        nome = input.nextLine();
        cpf = input.nextLine();
        email = input.nextLine();
        dataNascimento = input.nextLine();
        endereco = input.nextLine();
        cidade = input.nextLine();
        bairro = input.nextLine();
        estado = input.nextLine();
        cep = input.nextLine();

    }

}
