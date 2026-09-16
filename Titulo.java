public abstract class Titulo{

    public static final int ABERTO = 0;
    public static final int CANCELADO = 1;
    public static final int QUITADO = 2;

    protected int estado;
    protected String descricao;
    protected double valor;
    protected int dataVencimento;
    protected Bancario bancario;

    public Titulo(String descricao, double valor, int dataVencimento) {

        this.estado = 0;
        this.descricao = descricao;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
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

    public String getEstado()
    {
        if(this.estado == ABERTO) return "Aberto";
        if(this.estado == CANCELADO) return "Cancelado";
        if(this.estado == QUITADO) return "Quitado";

        return "SEM ESTADO";
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

    @Override
    public boolean equals(Object o) {
    {
        Titulo t = (Titulo) o;

        if(this.getDescricao().equals(t.getDescricao()))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
       
    }

    @Override
    public String toString() {
        return "Titulo [estado=" + estado + ", descricao=" + descricao + ", valor=" + valor + ", dataVencimento="
                + dataVencimento + ", bancario=" + bancario + "]";
    }

}