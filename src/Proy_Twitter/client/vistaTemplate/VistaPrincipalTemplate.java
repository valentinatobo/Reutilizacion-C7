
package Proy_Twitter.client.vistaTemplate;

import Proy_Twitter.client.components.barraTitulo.BarraTituloComponents;
import Proy_Twitter.servicies.ObjGraficosService;
import Proy_Twitter.servicies.RecursosService;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;

/**
 *
 * @author Admin
 */
public class VistaPrincipalTemplate extends JFrame {

    private RecursosService sRecursos;
    private ObjGraficosService sObjGraficos;
    private VistaPrincipalComponent vistaprincipalcomponent; 

    private JPanel pPrincipal, pInicio, pBuscar, pNavegacion;
    
    public VistaPrincipalTemplate(VistaPrincipalComponent vistaprincipalcomponent) {
        
        sRecursos = RecursosService.getService();
        sObjGraficos = ObjGraficosService.getService();
        this.vistaprincipalcomponent = vistaprincipalcomponent;
        
        CrearJpanels();
        this.setTitle("Vista Principal");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1320, 750);
        setLocationRelativeTo(this);
        setLayout(null);
        setVisible(true);
    }

    public void CrearJpanels(){
        
        pNavegacion = sObjGraficos.construirJPanel(0, 0, 280, 750, null, sRecursos.getBorderLado());
        this.add(pNavegacion);
        pInicio = sObjGraficos.construirJPanel(280, 0, 690, 170, null, sRecursos.getBorderTodos());
        this.add(pInicio);
        pPrincipal = sObjGraficos.construirJPanel(280, 170, 690, 680, null, null);
        this.add(pPrincipal);
        pBuscar = sObjGraficos.construirJPanel(970, 0, 330, 750, null, sRecursos.getBorderLadoD());
        this.add(pBuscar);
        
    }
    
    public JPanel getPPrincipal(){
        return pPrincipal;
    }
    public JPanel getPInicio(){
        return pInicio;
    }
    public JPanel getPNavegacion(){
        return pNavegacion;
    }
    public JPanel getPBuscar(){
        return pBuscar;
    }
}