public class TituloR extends Titulo {
    
    private double juros;
    private String cliente;

    public TituloR(String newDescricao, double newValor, int newDataVencimento, String newCliente, double newJuros) {
        super(newDescricao, newValor, newDataVencimento);
        this.juros = newJuros;
        this.cliente = newCliente;
    }

    public TituloR(String newDescricao, double newValor, int newDataVencimento, String newCliente) {
        this(newDescricao, newValor, newDataVencimento, newCliente, 0.001);
    }

    @Override
    public boolean Pagamento(int dataAtual, String newConta)
    {
        double valorPagar= 0;

        if(this.getEstado() == "Aberto")
        {
            if(!this.Vencido(dataAtual))
            {
                valorPagar = this.valor;
            }
            else
            {
                valorPagar = this.valor + (this.valor * this.juros);
            }

            Bancario b = new Bancario(newConta, valorPagar,1);
            this.bancario = b;
            this.estado = 2;

            return true;

        }
        else
        {
            return false;
        }
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "TituloR [juros=" + juros + ", cliente=" + cliente + ", estado=" + estado + ", descricao=" + descricao
                + ", valor=" + valor + ", dataVencimento=" + dataVencimento + ", bancario=" + bancario + "]";
    }


}
