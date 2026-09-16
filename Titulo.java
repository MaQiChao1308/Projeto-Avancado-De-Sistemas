public abstract class Titulo{

    public static final int ABERTO = 0;
    public static final int CANCELADO = 1;
    public static final int QUITADO = 2;
    protected int estado;
    protected String descricao;
    protected double valor;
    protected int dataVencimento;
    protected Bancario bancario;

    public Titulo(int estado, String descricao, double valor, int dataVencimento, Bancario bancario) {
        this.estado = estado;
        this.descricao = descricao;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
        this.bancario = bancario;
    }

    public abstract boolean Pagamento(int dataAtual, String newConta);

    public boolean Vencido(int dataAtual){

        if(this.dataVencimento < dataAtual)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean Cancela(int dataAtual){

        if(this.estado == ABERTO && this.Vencido(dataAtual) == false)
        {
            this.estado = CANCELADO;
            return true;
        }
        else
        {
            return false;
        }
    }

    public String getEstado

    public static int getAberto() {
        return ABERTO;
    }

    public static int getCancelado() {
        return CANCELADO;
    }

    public static int getQuitado() {
        return QUITADO;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(int dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Bancario getBancario() {
        return bancario;
    }

    public void setBancario(Bancario bancario) {
        this.bancario = bancario;
    }

}