package parqueadero;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fredy
 */
public class operacion extends JFrame implements ActionListener {
public operacion(){
	
}

    private static JButton[][] btn = new JButton[8][8];

    public operacion() {
        setTitle("Parqueadero");
        setSize(650, 600);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(8, 8));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        construir();
        setVisible(true);
    }

    private void construir() {
        for (int i = 0; i < btn.length; i++) {
            for (int j = 0; j < btn[i].length; j++) {
                String a, b;
                a = Integer.toString(i);
                b = Integer.toString(j);
                btn[i][j] = new JButton(a + b);

                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        btn[i][j].setBackground(Color.WHITE);
                    } else {
                        btn[i][j].setBackground(Color.WHITE);
                    }
                } else {
                    if (j % 2 != 0) {
                        btn[i][j].setBackground(Color.WHITE);
                    } else {
                        btn[i][j].setBackground(Color.WHITE);

                    }
                    add(btn[i][j]);
//                 
                }

            }

        }
        for (int i = 0; i < btn.length; i++) {
            for (int j = 0; j < btn[i].length; j++) {
                btn[i][j].addActionListener(this);

            }

        }
    }
    

    //eventos
    @Override
    public void actionPerformed(ActionEvent e) {
        int ra = (int) (Math.random() * 8 + 0);

        for (int i = 0; i < btn.length - ra; i++) {
            for (int j = 0; j < btn[i].length - ra; j++) {

                btn[i][j].setIcon(new ImageIcon(getClass().getResource("/img/4.png")));

            }
        }

    }

 

}
