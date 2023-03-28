import java.awt.*;

import javax.swing.*;

public class TicTacToeGUI extends JFrame{
    TicTacToeBoard theBoard;
    private static int player = 1;
    private static JLabel restartText = new JLabel("Press the button to start again");
    private static JButton restartButton = new JButton("Restart");

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
        private void buttonPress(JButton button, JLabel text, TicTacToeBoard theBoard, int r, int c) {
            if (theBoard.isValidMove(r, c)) {
                theBoard.makeMove(r, c, player);
                if (player == 1) {
                    button.setText("X");
                    button.setForeground(Color.RED);
                    text.setFont(new Font("Serif", Font.PLAIN, 50));
                    text.setText("Player 2 place an O");
                    player++;
                } else {
                    button.setText("O");
                    button.setForeground(Color.BLUE);
                    text.setFont(new Font("Serif", Font.PLAIN, 50));
                    text.setText("Player 1 place an X");
                    player--;
                }
            } else {
                text.setFont(new Font("Serif", Font.PLAIN, 40));
                text.setText("Please Make Valid Move");
            }
            
            
            if (theBoard.getGameStatus() == 1) {
                text.setText("Player 1 Wins");
                restartText.setVisible(true);
                restartButton.setVisible(true);
            } else if (theBoard.getGameStatus() == 2) {
                text.setText("Player 2 Wins");
                restartText.setVisible(true);
                restartButton.setVisible(true);
            } else if (theBoard.getGameStatus() == -1) {
                text.setText("It's a Tie");
                restartText.setVisible(true);
                restartButton.setVisible(true);
            }
        }

        void drawLine(Graphics g) {
            Graphics2D g2d = (Graphics2D) g;
            if (theBoard.winCords(theBoard.getBoard())[0][0] == 0 && theBoard.winCords(theBoard.getBoard())[1][1] == 2) {
                if (theBoard.getGameStatus() == 1) {
                    g2d.setColor(Color.RED);
                } else if (theBoard.getGameStatus() == 2) {
                    g2d.setColor(Color.BLUE);
                }
                g2d.setStroke(new BasicStroke(5));
                // g2d.drawLine(75, 75, 375, 175);
            }
        }


        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            drawLine(g);
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
                if (theBoard.getGameStatus() == 1 || theBoard.getGameStatus() == 2 || theBoard.getGameStatus() == -1) {
                    topLeft.setEnabled(false);
                    topMiddle.setEnabled(false);
                    topRight.setEnabled(false);
                    middleLeft.setEnabled(false);
                    middle.setEnabled(false);
                    middleRight.setEnabled(false);
                    bottomLeft.setEnabled(false);
                    bottomMiddle.setEnabled(false);
                    bottomRight.setEnabled(false);
                }
                // repaint();
            });
            topMiddle.addActionListener(e -> {
                buttonPress(topMiddle, text, theBoard, 0, 1);
                if (theBoard.getGameStatus() == 1 || theBoard.getGameStatus() == 2 || theBoard.getGameStatus() == -1) {
                    topLeft.setEnabled(false);
                    topMiddle.setEnabled(false);
                    topRight.setEnabled(false);
                    middleLeft.setEnabled(false);
                    middle.setEnabled(false);
                    middleRight.setEnabled(false);
                    bottomLeft.setEnabled(false);
                    bottomMiddle.setEnabled(false);
                    bottomRight.setEnabled(false);
                }
                // repaint();
            });
            topRight.addActionListener(e -> {
                buttonPress(topRight, text, theBoard, 0, 2);
                if (theBoard.getGameStatus() == 1 || theBoard.getGameStatus() == 2 || theBoard.getGameStatus() == -1) {
                    topLeft.setEnabled(false);
                    topMiddle.setEnabled(false);
                    topRight.setOpaque(true);
                    topRight.setEnabled(false);
                    middleLeft.setEnabled(false);
                    middle.setEnabled(false);
                    middleRight.setEnabled(false);
                    bottomLeft.setEnabled(false);
                    bottomMiddle.setEnabled(false);
                    bottomRight.setEnabled(false);
                }
                // repaint();
            });
            middleLeft.addActionListener(e -> {
                buttonPress(middleLeft, text, theBoard, 1, 0);
                if (theBoard.getGameStatus() == 1 || theBoard.getGameStatus() == 2 || theBoard.getGameStatus() == -1) {
                    topLeft.setEnabled(false);
                    topMiddle.setEnabled(false);
                    topRight.setEnabled(false);
                    middleLeft.setEnabled(false);
                    middle.setEnabled(false);
                    middleRight.setEnabled(false);
                    bottomLeft.setEnabled(false);
                    bottomMiddle.setEnabled(false);
                    bottomRight.setEnabled(false);
                }
                // repaint();
            });
            middle.addActionListener(e -> {
                buttonPress(middle, text, theBoard, 1, 1);
                if (theBoard.getGameStatus() == 1 || theBoard.getGameStatus() == 2 || theBoard.getGameStatus() == -1) {
                    topLeft.setEnabled(false);
                    topMiddle.setEnabled(false);
                    topRight.setEnabled(false);
                    middleLeft.setEnabled(false);
                    middle.setEnabled(false);
                    middleRight.setEnabled(false);
                    bottomLeft.setEnabled(false);
                    bottomMiddle.setEnabled(false);
                    bottomRight.setEnabled(false);
                }
                // repaint();
            });
            middleRight.addActionListener(e -> {
                buttonPress(middleRight, text, theBoard, 1, 2);
                if (theBoard.getGameStatus() == 1 || theBoard.getGameStatus() == 2 || theBoard.getGameStatus() == -1) {
                    topLeft.setEnabled(false);
                    topMiddle.setEnabled(false);
                    topRight.setEnabled(false);
                    middleLeft.setEnabled(false);
                    middle.setEnabled(false);
                    middleRight.setEnabled(false);
                    bottomLeft.setEnabled(false);
                    bottomMiddle.setEnabled(false);
                    bottomRight.setEnabled(false);
                }
                // repaint();
            });
            bottomLeft.addActionListener(e -> {
                buttonPress(bottomLeft, text, theBoard, 2, 0);
                if (theBoard.getGameStatus() == 1 || theBoard.getGameStatus() == 2 || theBoard.getGameStatus() == -1) {
                    topLeft.setEnabled(false);
                    topMiddle.setEnabled(false);
                    topRight.setEnabled(false);
                    middleLeft.setEnabled(false);
                    middle.setEnabled(false);
                    middleRight.setEnabled(false);
                    bottomLeft.setEnabled(false);
                    bottomMiddle.setEnabled(false);
                    bottomRight.setEnabled(false);
                }
                // repaint();
            });
            bottomMiddle.addActionListener(e -> {
                buttonPress(bottomMiddle, text, theBoard, 2, 1);
                if (theBoard.getGameStatus() == 1 || theBoard.getGameStatus() == 2 || theBoard.getGameStatus() == -1) {
                    topLeft.setEnabled(false);
                    topMiddle.setEnabled(false);
                    topRight.setEnabled(false);
                    middleLeft.setEnabled(false);
                    middle.setEnabled(false);
                    middleRight.setEnabled(false);
                    bottomLeft.setEnabled(false);
                    bottomMiddle.setEnabled(false);
                    bottomRight.setEnabled(false);
                }
                // repaint();
            });
            bottomRight.addActionListener(e -> {
                buttonPress(bottomRight, text, theBoard, 2, 2);
                if (theBoard.getGameStatus() == 1 || theBoard.getGameStatus() == 2 || theBoard.getGameStatus() == -1) {
                    topLeft.setEnabled(false);
                    topMiddle.setEnabled(false);
                    topRight.setEnabled(false);
                    middleLeft.setEnabled(false);
                    middle.setEnabled(false);
                    middleRight.setEnabled(false);
                    bottomLeft.setEnabled(false);
                    bottomMiddle.setEnabled(false);
                    bottomRight.setEnabled(false);
                }
                // repaint();
            });
            restartButton.addActionListener(e -> {
                theBoard = new TicTacToeBoard();
                text.setText("Player 1 place an X");
                topLeft.setText("");
                topMiddle.setText("");
                topRight.setText("");
                middleLeft.setText("");
                middle.setText("");
                middleRight.setText("");
                bottomLeft.setText("");
                bottomMiddle.setText("");
                bottomRight.setText("");

                topLeft.setEnabled(true);
                topMiddle.setEnabled(true);
                topRight.setEnabled(true);
                middleLeft.setEnabled(true);
                middle.setEnabled(true);
                middleRight.setEnabled(true);
                bottomLeft.setEnabled(true);
                bottomMiddle.setEnabled(true);
                bottomRight.setEnabled(true);

                restartText.setVisible(false);
                restartButton.setVisible(false);

                player = 1;

                // repaint();
            });

            this.add(restartText);
            this.add(restartButton);
            this.add(text);            
            this.add(topLeft);
            this.add(topMiddle);
            this.add(topRight);
            this.add(middleLeft);
            this.add(middle);
            this.add(middleRight);
            this.add(bottomLeft);
            this.add(bottomMiddle);
            this.add(bottomRight);

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
            restartText.setBounds(0, 220, 500, 60);
            restartButton.setBounds(150, 290, 150, 50);

            text.setFont(new Font("Serif", Font.PLAIN, 50));
            restartText.setFont(new Font("Serif", Font.PLAIN, 40));
            restartButton.setFont(new Font("Serif", Font.PLAIN, 40));
            topLeft.setFont(new Font("Serif", Font.PLAIN, 50));
            topMiddle.setFont(new Font("Serif", Font.PLAIN, 50));
            topRight.setFont(new Font("Serif", Font.PLAIN, 50));
            middleLeft.setFont(new Font("Serif", Font.PLAIN, 50));
            middle.setFont(new Font("Serif", Font.PLAIN, 50));
            middleRight.setFont(new Font("Serif", Font.PLAIN, 50));
            bottomLeft.setFont(new Font("Serif", Font.PLAIN, 50));
            bottomMiddle.setFont(new Font("Serif", Font.PLAIN, 50));
            bottomRight.setFont(new Font("Serif", Font.PLAIN, 50));

            restartText.setVisible(false);
            restartButton.setVisible(false);


        }
    }

    public static void main(String[] args) {
        new TicTacToeGUI();
    }
}