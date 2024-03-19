
// Camada de Negócio

import javax.swing.JOptionPane;

class GerenciadorDePessoas {
    private Pessoa[] pessoas;
    private int contador;

    public GerenciadorDePessoas(int tamanho) {
        pessoas = new Pessoa[tamanho];
        contador = 0;
    }

    public void adicionarPessoa(Pessoa pessoa) {
        if (contador < pessoas.length) {
            pessoas[contador++] = pessoa;
            JOptionPane.showMessageDialog(null, "Pessoa adicionada com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Não é possível adicionar mais pessoas. Vetor cheio.");
        }
    }

    public void listarPessoas() {
        StringBuilder lista = new StringBuilder("Lista de Pessoas:\n");
        for (int i = 0; i < contador; i++) {
            lista.append("Nome: ").append(pessoas[i].getNome()).append(", Idade: ").append(pessoas[i].getIdade()).append("\n");
        }
        JOptionPane.showMessageDialog(null, lista.toString());
    }
}