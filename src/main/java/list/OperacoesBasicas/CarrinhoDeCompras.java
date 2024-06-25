package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> listaItens;

    public CarrinhoDeCompras() {
        this.listaItens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        listaItens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        for (Item i : listaItens) {
            if (i.getNome().equalsIgnoreCase(nome)) {
                itensParaRemover.add(i);
            }
        }

        listaItens.removeAll(itensParaRemover);
    }

    public double calcularValorTotal() {
        double valorTotal = 0.0;
        for (Item i : listaItens) {
            double preco = i.getPreco();
            int quantidade = i.getQuantidade();
            double valorProduto = preco * quantidade;
            valorTotal += valorProduto;
        }
        return valorTotal;
    }

    public void exibirItens() {
        System.out.println(listaItens);
    }

    public static void main(String[] args) {

        CarrinhoDeCompras carrinhoCompras = new CarrinhoDeCompras();

        System.out.println("O valor total do carrinho é de: R$"+carrinhoCompras.calcularValorTotal());

        carrinhoCompras.adicionarItem("Teclado", 200.00, 1);
        System.out.println("O valor total do carrinho é de: R$"+carrinhoCompras.calcularValorTotal());

        carrinhoCompras.adicionarItem("Monitor", 730.00, 2);
        carrinhoCompras.adicionarItem("Mouse", 120.00, 7);
        System.out.println("O valor total do carrinho é de: R$"+carrinhoCompras.calcularValorTotal());

        carrinhoCompras.exibirItens();
        carrinhoCompras.removerItem("Mouse");

        System.out.println("O valor total do carrinho é de: R$"+carrinhoCompras.calcularValorTotal());
        carrinhoCompras.exibirItens();

    }


}
