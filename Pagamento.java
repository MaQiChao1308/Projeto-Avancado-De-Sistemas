public boolean Pagamento(int dataAtual, String newConta){
    double valorPagar= 0;
    if(this.getEstado() == "Aberto"){
        if(!this.vencido(dataAtual)){
            valorPagar = this.newValor;
        }else{
            valorPagar = this.valor * this.juros;
        }
        Bancario b = new Bancario(newConta, valorPagar,1);
        this.bancario = b;
        this.estado = 2;
        return true
    }else{
        return false;
    }
}