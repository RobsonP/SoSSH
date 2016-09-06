/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FullScreenFrame.java
 *
 * Created on 25.04.2012, 01:34:34
 */
package gui;

import instance.Instance_hold;
import javax.swing.JPanel;
import uk.co.caprica.vlcj.component.EmbeddedMediaPlayerComponent;
import uk.co.caprica.vlcj.runtime.windows.WindowsMouseHook;

/**
 *
 * @author RobsonP
 */
public class FullScreenFrame extends javax.swing.JFrame {
    private EmbeddedMediaPlayerComponent empc;
    private final FS_KeyListener mkl = new FS_KeyListener();
    private final FS_MouseListener mml = new FS_MouseListener();
    private final MPlayer_EventListener mpel = new MPlayer_EventListener();
    
    private WindowsMouseHook wmh;
    /** Creates new form FullScreenFrame */
    public FullScreenFrame() {
        initComponents();       
        
        this.setIconImage(Instance_hold.getIm_hold().getNeu12());
        
        this.addKeyListener(mkl);
                
        empc = new EmbeddedMediaPlayerComponent();
        empc.getMediaPlayer().addMediaPlayerEventListener(mpel);
        
        wmh = new WindowsMouseHook(this.empc.getVideoSurface());
        wmh.addMouseMotionListener(mml);
        
        wmh.start();
         
        this.jPanel_View.add(empc);
        this.setVisible(false);
    }
    
    public void cpymedpl(EmbeddedMediaPlayerComponent empc) {
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_View = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        javax.swing.GroupLayout jPanel_ViewLayout = new javax.swing.GroupLayout(jPanel_View);
        jPanel_View.setLayout(jPanel_ViewLayout);
        jPanel_ViewLayout.setHorizontalGroup(
            jPanel_ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel_ViewLayout.setVerticalGroup(
            jPanel_ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_View, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_View, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public EmbeddedMediaPlayerComponent getEmpc() {
        return empc;
    }

    public WindowsMouseHook getWmh() {
        return wmh;
    }
    
    public void setWmh(WindowsMouseHook wmh) {
        this.wmh = wmh;
    }

    public FS_MouseListener getMml() {
        return mml;
    }

    public JPanel getjPanel_View() {
        return jPanel_View;
    }

    public void setjPanel_View(JPanel jPanel_View) {
        this.jPanel_View = jPanel_View;
    }

    public MPlayer_EventListener getMpel() {
        return mpel;
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel_View;
    // End of variables declaration//GEN-END:variables
}