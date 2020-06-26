/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proy_Twitter.client.components.barraNavegacion;


import Proy_Twitter.client.vistaTemplate.VistaPrincipalComponent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author lenovo
 */
public class NavegacionUsuarioComponents implements ActionListener{
    
    private NavegacionUsuarioTemplate navegacionusuariotemplate;
    private VistaPrincipalComponent vistaprincipalcomponent;
    
    public NavegacionUsuarioComponents(VistaPrincipalComponent vistaprincipalcomponent){
        this.navegacionusuariotemplate = new NavegacionUsuarioTemplate(this);
        this.vistaprincipalcomponent = vistaprincipalcomponent;
    }
      
    @Override
    public void actionPerformed(ActionEvent e) {
        vistaprincipalcomponent.mostrarComponentes(e.getActionCommand().trim());
    }
    
    public NavegacionUsuarioTemplate getBarraNavegacionTemplate(){
        return navegacionusuariotemplate;
    }
    
   
    
}
