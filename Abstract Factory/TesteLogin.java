public class TesteLogin {
    public static void main(String[] args){
        Login loginCaracter = new LoginAplicacaoCaracter();
        loginCaracter.autentica("aluno", "123");

        Login loginWindow = new LoginAplicacaoWindow();
        loginWindow.autentica("aluno", "senhaErrada");
    }
}
