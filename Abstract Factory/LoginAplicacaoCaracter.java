public class LoginAplicacaoCaracter extends Login{
    
    @Override 
    protected void notificaAutenticacao(Object objAutenticacao){
        System.out.println(objAutenticacao);
    }
}
