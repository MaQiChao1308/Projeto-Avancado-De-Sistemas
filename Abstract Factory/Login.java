public abstract class Login {

    public Object autentica(String usuarioID, String senha){

        String mensagem;

        if("aluno".equals(usuarioID) && "123".equals(senha)) {
            mensagem  = "Autenticação realizada com sucesso.";
        } else {
            mensagem = "Usuário ou senha inválidos."; 
        }

        notificaAutenticacao(mensagem);
        return mensagem;
    }

    protected abstract void notificaAutenticacao(Object objAutenticacao);


}