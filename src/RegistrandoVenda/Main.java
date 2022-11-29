package RegistrandoVenda;

public class Main {
    public static void main(String[] args) {
        Produto produto_1 = new Produto(58, "Cerveja", 40, 15, false);
        Vendedor vendedor_1 = new Vendedor("Alírio", 103, "Rua 1");
        Venda venda1 = new Venda();
        venda1.setProduto(produto_1);
        venda1.setVendedor(vendedor_1);
        venda1.setQuantidadeItens(2);
        venda1.calcularValor();
        venda1.calcularComissao();
        venda1.imprimir();

        Produto produto_2 = new Produto(12, "Camisa", 100, 80, true);
        Vendedor vendedor_2 = new Vendedor("Machado", 98, "Rua 2");
        Venda venda2 = new Venda();
        venda2.setProduto(produto_2);
        venda2.setVendedor(vendedor_2);
        venda2.setQuantidadeItens(3);
        venda2.efetuarDesconto(0.10);
        venda2.calcularValor();
        venda2.calcularComissao();
        venda2.imprimir();

        Venda venda_3 = new Venda();
        venda3.setProduto(produto_2);
        venda3.setVendedor(vendedor_2);
        venda3.setQuantidadeItens(2);
        venda3.efetuarDesconto(0.30);
        venda3.calcularValor();
        venda3.calcularComissao();
        venda3.imprimir();

    }
}
