public abstract class Login {

    public Object autentica(String usuarioID, String senha) throws Exception{


        if(!"aluno".equals(usuarioID) || "123".equals(senha)) {
            throw new Exception ("Usuário ou senha inválidos");
        }

        String mensagem = "Login Realizado";
        notificaAutenticacao(mensagem);
        return mensagem;
    }

    protected abstract void notificaAutenticacao(Object objAutenticacao);


}