public class TituloP extends Titulo {
    private String fornecedor;

    public TituloP(String newDescricao, double newValor, int newDataVencimento, String newFornecedor) {
        super(ABERTO, newDescricao, newValor, newDataVencimento, null);
        this.fornecedor = newFornecedor;
    }

    
    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }
    
    @Override
    public boolean Pagamento(int dataAtual, String newConta) {
        if (this.getEstado() == ABERTO) {
            this.setEstado(QUITADO);
            this.setBancario(new Bancario(newConta, this.getValor(), Bancario.DEBITO));
            return true;
        }
        return false;
    }
    public String getFornecedor() {
        return this.fornecedor;
    }

    public String toString(){
        return "Descricao:" + this.getDescricao();
    }
}