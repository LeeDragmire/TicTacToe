
import java.awt.*;

import javax.swing.*;

public class TicTacToeGUI extends JFrame{
    TicTacToeBoard theBoard;
    private static int player = 1;


    public TicTacToeGUI() {
        theBoard = new TicTacToeBoard();
        

        this.setSize(500, 600);
        this.setPreferredSize(new Dimension(500, 600));
        this.setTitle("Tic Tac Toe");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(new TicTacToePanel());
        this.setVisible(true);
        this.setResizable(false);
    }

    public class TicTacToePanel extends JPanel {
        private static void buttonPress(JButton button, JLabel text, TicTacToeBoard theBoard, int r, int c) {
             if (theBoard.isValidMove(r, c)) {
                    theBoard.makeMove(r, c, player);
                    if (player == 1) {
                        button.setText("X");
                        text.setText("Player 2 place an O");
                        player++;
                    } else {
                        button.setText("O");
                        text.setText("Player 1 place an X");
                        player--;
                    }
                } else {
                    text.setFont(new Font("Serif", Font.PLAIN, 40));
                    text.setText("Please Make Valid Move");
                }
            
            if (theBoard.getGameStatus() == 1) {
                text.setText("Player 1 Wins");
            } else if (theBoard.getGameStatus() == 2) {
                text.setText("Player 2 Wins");
            } else if (theBoard.getGameStatus() == -1) {
                text.setText("It's a Tie");
            }
        }

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
                buttonPress(topLeft, text, theBoard, 0, 0);
            });
            topMiddle.addActionListener(e -> {
                buttonPress(topMiddle, text, theBoard, 0, 1);
            });
            topRight.addActionListener(e -> {
                buttonPress(topRight, text, theBoard, 0, 2);
            });
            middleLeft.addActionListener(e -> {
                buttonPress(middleLeft, text, theBoard, 1, 0);
            });
            middle.addActionListener(e -> {
                buttonPress(middle, text, theBoard, 1, 1);
            });
            middleRight.addActionListener(e -> {
                buttonPress(middleRight, text, theBoard, 1, 2);
            });
            bottomLeft.addActionListener(e -> {
                buttonPress(bottomLeft, text, theBoard, 2, 0);
            });
            bottomMiddle.addActionListener(e -> {
                buttonPress(bottomMiddle, text, theBoard, 2, 1);
            });
            bottomRight.addActionListener(e -> {
                buttonPress(bottomRight, text, theBoard, 2, 2);
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