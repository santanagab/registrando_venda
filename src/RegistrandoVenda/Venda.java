package RegistrandoVenda;

public class Venda {

    private Produto produto;
    private Vendedor vendedor;
    private int desconto;
    private int quantidadeItens;
    private float valor;

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public int getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }

    public void setQuantidadeItens(int quantidadeItens) {
        this.quantidadeItens = quantidadeItens;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public void calcular_valor() {

        if ((produto.getValorVenda() - desconto) < produto.getValorCusto()) {
            this.valor = produto.getValorCusto() * quantidadeItens;
        } else {
            this.valor = (produto.getValorVenda() - desconto) * quantidadeItens;
        }

    }

    public void calcular_comissao() {
        var comissao = valor * vendedor_percentual;

        if (getProduto().isPromocao()) {
            this.vendedor.setComissao(comissao / 2);
        } else {
            this.vendedor.setComissao(comissao);
        }

    }

    public void efetuar_desconto(int porcentagem_desconto) {
        this.desconto = produto.getValorVenda() * porcentagem_desconto;
    }

    public void imprimir() {
        System.out.println("COD Vendedor: " + vendedor.getCodigo());
        System.out.println("Vendedor: " + vendedor.getNome());
        System.out.println("Comissão: " + vendedor.getComissao() + "%");
        System.out.println("COD Produto: " + produto.getCodigo());
        System.out.println("Descrição Produto: " + produto.getDescricao());
        System.out.println("QTD Itens: " + quantidadeItens);
        System.out.println("Valor Produto: R$ " + produto.getValorVenda());

        if (produto.isPromocao()) {
            System.out.println("Produto em promoção");
        } else {
            System.out.println("Produto não está na promoção");
        }

        System.out.println("Valor Desconto: R$ " + desconto);
        System.out.println("Valor Total: R$ " + valor);

        System.out.println();

    }
}
