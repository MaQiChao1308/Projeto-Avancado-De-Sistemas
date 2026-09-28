import javax.swing.JOptionPane;

public class LoginAplicacaoWindow extends Login {

    @Override 
    protected void notificaAutenticacao(Object objAutentica) {
        JOptionPane.showMessageDialog(null, objAutentica);
    }
    
}