package Loja;
public class Estoque {
    private Produto produto;
    private Fornecedor fornecedor;
    private int quantidade;

    public Estoque() {
    }

    public Estoque(Produto produto, Fornecedor fornecedor, int quantidade) {
        this.produto = produto;
        this.fornecedor = fornecedor;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public boolean equals(Object o) {
        Estoque e = (Estoque) o;
        return this.getProduto().getCodigo().equals(e.getProduto().getCodigo()) &&
               this.getFornecedor().getCodigo().equals(e.getFornecedor().getCodigo());
    }
}
