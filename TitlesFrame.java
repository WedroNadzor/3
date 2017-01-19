/*
 * Decompiled with CFR 0_118.
 */
import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class TitlesFrame
extends JFrame {
    public TitlesFrame() {
        this.initUI();
    }   

    private void initUI() {
        /** Відповідає за вивід вікна з рисунком
        * @param setSize-ромір вікна
        */
        this.setTitle("\u041a\u0440\u0438\u0432\u044b\u0435 \u0444\u0438\u0433\u0443\u0440\u044b");
        this.setDefaultCloseOperation(3);
        this.add(new TitlesPanel(94));
        this.setSize(350, 350);
        this.setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            
        
               @Override
            public void run() {
                /** Викликає класс TitlesFrame зупска програми 
                 */
                TitlesFrame ps = new TitlesFrame();
                ps.setVisible(true);
            }
        });
    }

}

