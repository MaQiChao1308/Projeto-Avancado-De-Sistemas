public class TesteLogin {

    private static void executarLogin(Login login, String usuario, String senha) throws Exception {
        login.autentica(usuario, senha);
    }

    public static void main(String[] args) {
        Login login = new LoginAplicacaoCaracter();
        Login login1 = new LoginAplicacaoWindow();

        try {
            executarLogin(login, "aluno", "123");
            executarLogin(login1, "aluno", "senhaErrada");
        } catch (Exception e) {
            System.err.println("Falha no login: " + e.getMessage());
        }
    }
}

