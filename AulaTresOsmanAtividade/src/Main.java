// Camada de Visão

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        GerenciadorDePessoas gerenciador = new GerenciadorDePessoas(5);

        int opcao;
        do {
            String escolha = JOptionPane.showInputDialog("Escolha uma opção:\n1. Adicionar Pessoa\n2. Listar Pessoas\n3. Sair");
            opcao = Integer.parseInt(escolha);

            switch (opcao) {
                case 1:
                    String nome = JOptionPane.showInputDialog("Digite o nome da pessoa:");
                    int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da pessoa:"));
                    Pessoa novaPessoa = new Pessoa(nome, idade);
                    gerenciador.adicionarPessoa(novaPessoa);
                    break;
                case 2:
                    gerenciador.listarPessoas();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Saindo do programa. Até logo!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida! Tente novamente.");
                    break;
            }
        } while (opcao != 3);
    }
}