import javax.swing.JOptionPane;

public class LoginAplicacaoWindow extends Login {

    @Override 
    protected void notificaAutenticacao(Object objAutenticacao){
        JOptionPane.showMessageDialog(null, objAutenticacao);
    }
    
}