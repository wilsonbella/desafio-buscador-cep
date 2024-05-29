import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        ConsultaCep consultaCep = new ConsultaCep();

        System.out.println("Digite um CEP para consulta:");
        var cep = entrada.nextLine();
        try {
            Endereco novoEndereco =  consultaCep.buscaEndereco("01001-000");
            System.out.println(novoEndereco);
            GeradorDeArquivo geradorDeArquivo = new GeradorDeArquivo();
            geradorDeArquivo.salvaJson(novoEndereco);
        } catch (RuntimeException | IOException e){
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação");
        }

 entrada.close();

    }
}