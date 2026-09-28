public class LoginAplicacaoCaracter extends Login {
    
    @Override 
    protected void notificaAutenticacao(Object objAutentica) {
        System.out.println(objAutentica);
    }
}
