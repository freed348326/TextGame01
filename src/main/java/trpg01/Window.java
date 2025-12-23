package trpg01;

import javax.swing.*;

public class Window extends JFrame {
    public Window(){
        JFrame frame = new JFrame();
        JPanel button_panel = new JPanel();

        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(16*80,9*80);
    }
}
