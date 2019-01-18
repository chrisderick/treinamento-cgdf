package AppEcommerce.Console;
import AppEcommerce.Console.core.Cliente;
import AppEcommerce.Console.core.Produto;
import AppEcommerce.Console.core.enums.TipoTelefone;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        NovoCliente();
    }

    public static void NovoProduto() {
        Scanner scanner = new Scanner(System.in);
        Produto produto = new Produto(scanner.nextLine(), scanner.nextDouble(), scanner.nextDouble());
        System.out.println(produto.descricao);
    }

    public static void NovoCliente() {
        Scanner scanner = new Scanner(System.in);
        Cliente cliente = new Cliente(scanner.nextLine());
        cliente.AddTelefone(scanner.nextLine(), TipoTelefone.valueOf(scanner.nextLine()));
        cliente.AddEndereco("Conjunto A", "70000-000", "Asa Sul", "Brasília", "DF", "Brasil");

        System.out.println(cliente.telefones.get(0).getNumero());
        System.out.println(cliente.telefones.get(0).getTipoTelefone());

    }
}
