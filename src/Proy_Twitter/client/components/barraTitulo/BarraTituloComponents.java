/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proy_Twitter.client.components.barraTitulo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author lenovo
 */
public class BarraTituloComponents implements ActionListener{
    
    BarraTituloTemplate barratitulotemplate;
    
    public BarraTituloComponents(){
        barratitulotemplate = new BarraTituloTemplate(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {//5114650
        
        if(e.getSource() == barratitulotemplate.getbEstrellas()){
        JOptionPane.showMessageDialog(null, "Te muestra los tweets destacados" , "Inicio", 1);
        }
        if(e.getSource() == barratitulotemplate.getbImagen()){
        JOptionPane.showMessageDialog(null, "Te muestra la carpeta para agregar imagenes" , "Crear Tweet", 1);
        }
        if(e.getSource() == barratitulotemplate.getbGif()){
        JOptionPane.showMessageDialog(null, "Te muestra los gif que puedes agregar" , "Crear Tweet", 1);
        }
        if(e.getSource() == barratitulotemplate.getbTendencias()){
        JOptionPane.showMessageDialog(null, "Te permite crear un tweet con una encuesta" , "Crear Tweet", 1);
        }
        if(e.getSource() == barratitulotemplate.getbEmojis()){
        JOptionPane.showMessageDialog(null, "Te muestra los emojis que puedes agregar" , "Crear Tweet", 1);
        }
        if(e.getSource() == barratitulotemplate.getbCalendario()){
        JOptionPane.showMessageDialog(null, "Te permite programar la pulicación de un tweet" , "Crear Tweet", 1);
        }
        if(e.getSource() == barratitulotemplate.getbTwittear()){
        mostrarTweet();
        }
    }
    
    public void mostrarTweet(){
        String tweet = barratitulotemplate.gettTweet().getText();
        JOptionPane.showMessageDialog(null, tweet, "Advertencia", 1);
    }
    public BarraTituloTemplate getBarraTituloTemplate(){
        return barratitulotemplate;
    }
    
}
