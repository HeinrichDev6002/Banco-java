import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    Window(){
        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);

        JPanel blackPanel = new JPanel();
        blackPanel.setBackground(Color.black);

        JPanel cyanPanel = new JPanel();
        cyanPanel.setBackground(Color.cyan);

        JPanel yellowPanel = new JPanel();
        yellowPanel.setBackground(Color.yellow);





        this.setSize(600, 600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(146,45,56));
        this.setLayout(new BorderLayout());

        bluePanel.setPreferredSize(new Dimension(100, 100));
        redPanel.setPreferredSize(new Dimension(100, 100));
        blackPanel.setPreferredSize(new Dimension(100, 100));
        cyanPanel.setPreferredSize(new Dimension(100, 100));
        yellowPanel.setPreferredSize(new Dimension(100, 100));

        this.add(bluePanel,BorderLayout.NORTH);
        this.add(redPanel,BorderLayout.SOUTH);
        this.add(blackPanel,BorderLayout.CENTER);
        this.add(cyanPanel,BorderLayout.EAST);
        this.add(yellowPanel,BorderLayout.WEST);


        this.setVisible(true);



    }
}
