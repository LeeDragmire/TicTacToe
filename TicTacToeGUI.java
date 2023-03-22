
import java.awt.*;

import javax.swing.*;

public class TicTacToeGUI extends JFrame{
    public TicTacToeGUI() {
        this.setSize(500, 600);
        this.setPreferredSize(new Dimension(500, 600));
        this.setTitle("Tic Tac Toe");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(new TicTacToePanel());
        this.setVisible(true);
    }

    public class TicTacToePanel extends JPanel {
        public TicTacToePanel() {
            this.setSize(500, 600);
            this.setPreferredSize(new Dimension(500, 600));
            this.setLayout(null);
            JButton topLeft = new JButton("");
            JButton topMiddle = new JButton("");
            JButton topRight = new JButton("");
            JButton middleLeft = new JButton("");
            JButton middle = new JButton("");
            JButton middleRight = new JButton("");
            JButton bottomLeft = new JButton("");
            JButton bottomMiddle = new JButton("");
            JButton bottomRight = new JButton("");
            JLabel text = new JLabel("Player 1 place an X");
            topLeft.addActionListener(e -> {
                
            });
            topMiddle.addActionListener(e -> {
                
            });
            topRight.addActionListener(e -> {
                
            });
            middleLeft.addActionListener(e -> {
                
            });
            middle.addActionListener(e -> {
                
            });
            middleRight.addActionListener(e -> {
                
            });
            bottomLeft.addActionListener(e -> {
                
            });
            bottomMiddle.addActionListener(e -> {
                
            });
            bottomRight.addActionListener(e -> {
                
            });
            
            this.add(topLeft);
            this.add(topMiddle);
            this.add(topRight);
            this.add(middleLeft);
            this.add(middle);
            this.add(middleRight);
            this.add(bottomLeft);
            this.add(bottomMiddle);
            this.add(bottomRight);
            this.add(text);
            topLeft.setBounds(0, 100, 150, 150);
            topMiddle.setBounds(150, 100, 150, 150);
            topRight.setBounds(300, 100, 150, 150);
            middleLeft.setBounds(0, 250, 150, 150);
            middle.setBounds(150, 250, 150, 150);
            middleRight.setBounds(300, 250, 150, 150);
            bottomLeft.setBounds(0, 400, 150, 150);
            bottomMiddle.setBounds(150, 400, 150, 150);
            bottomRight.setBounds(300, 400, 150, 150);
            text.setBounds(30, 0, 500, 60);
            text.setFont(new Font("Serif", Font.PLAIN, 50));
            topLeft.setFont(new Font("Serif", Font.PLAIN, 50));
            topMiddle.setFont(new Font("Serif", Font.PLAIN, 50));
            topRight.setFont(new Font("Serif", Font.PLAIN, 50));
            middleLeft.setFont(new Font("Serif", Font.PLAIN, 50));
            middle.setFont(new Font("Serif", Font.PLAIN, 50));
            middleRight.setFont(new Font("Serif", Font.PLAIN, 50));
            bottomLeft.setFont(new Font("Serif", Font.PLAIN, 50));
            bottomMiddle.setFont(new Font("Serif", Font.PLAIN, 50));
            bottomRight.setFont(new Font("Serif", Font.PLAIN, 50));
        }
    }

    public static void main(String[] args) {
        new TicTacToeGUI();
    }
}