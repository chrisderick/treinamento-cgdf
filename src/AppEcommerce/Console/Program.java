package AppEcommerce.Console;
import AppEcommerce.Console.core.Cliente;
import AppEcommerce.Console.core.Produto;
import AppEcommerce.Console.core.enums.TipoTelefone;

import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        NovoCliente();
    }

    private Produto NovoProduto() {
        Scanner s = new Scanner(System.in);
        Produto produto = new Produto(s.nextLine(), s.nextDouble(), s.nextDouble());
        System.out.println(produto.getDescricao());
        return produto;
    }

    private static void NovoCliente() {
        Scanner s = new Scanner(System.in);
        Cliente cliente = new Cliente(s.nextLine());
        cliente.AddTelefone(s.nextLine(), TipoTelefone.values()[s.nextInt()]);
        cliente.AddEndereco("Conjunto A", "70000-000", "Asa Sul", "Brasília", "DF", "Brasil");

        System.out.println(cliente.getTelefones().get(0).getNumero());
        System.out.println(cliente.getTelefones().get(0).getTipoTelefone());

    }
}
