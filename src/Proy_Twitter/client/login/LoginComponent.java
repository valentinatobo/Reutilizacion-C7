package Proy_Twitter.client.login;

import Proy_Twitter.client.vistaTemplate.VistaPrincipalComponent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author lenovo
 */
public class LoginComponent implements ActionListener {

    private LoginTemplate logintemplate;
    private VistaPrincipalComponent vistaPrincipaltemplate;

    public LoginComponent(){
        this.logintemplate = new LoginTemplate(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //JOptionPane.showMessageDialog(null, "Oprimido" , "Advertencia", 1);
        if(e.getActionCommand() == "Iniciar sesión" ){
            this.mostrarDatosUsuario();
            this.entrar();
        }
        if(e.getActionCommand() == "Registrate" ){
        JOptionPane.showMessageDialog(null, "Oprimió botón registrarse" , "Advertencia", 1);
        }
        if(e.getActionCommand() == "¿Olvidaste tu contraseña?" ){
        JOptionPane.showMessageDialog(null, "Oprimió botón recuperar contraseña" , "Advertencia", 1);
        }
        if(e.getSource() == logintemplate.getBVerContraseña()){
        JOptionPane.showMessageDialog(null, "Oprimido botón ver contraseña" , "Advertencia", 1);
        }
        if(e.getSource() == logintemplate.getBVerMas()){
        JOptionPane.showMessageDialog(null, "Oprimido botón ver mas" , "Advertencia", 1);
        }
    }

    public void mostrarDatosUsuario(){
        String nomUsuario = logintemplate.getNombre().getText();
        String claveUsuario = new String(logintemplate.getContraseña().getPassword());
        JOptionPane.showMessageDialog(null, nomUsuario + "\n" + claveUsuario , "Advertencia", 1);
    }
    
    public void entrar(){
        if(vistaPrincipaltemplate == null){
            this.vistaPrincipaltemplate = new VistaPrincipalComponent(this);
        }else{
            this.vistaPrincipaltemplate.getVistaPrincipalTemplate().setVisible(true);
        logintemplate.setVisible(false);}
    }
    public LoginTemplate getLoginTemplate() {
        return logintemplate;
    }
}
