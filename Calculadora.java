package com.mycompany.calculadora;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Calculadora extends JFrame 
            implements ActionListener{

    JLabel lValor1, lValor2, lSoma;
    JTextField tfValor1, tfValor2, tfSoma;
    JButton bSomar, bLimpar, bSair;


    public Calculadora() {
        setLayout(new FlowLayout());

        lValor1 = new JLabel("Valor 1");
        add(lValor1);

        tfValor1 = new JTextField(5);
        tfValor1.addActionListener(this);
        add(tfValor1);

        lValor2 = new JLabel("Valor 2");
        add(lValor2);

        tfValor2 = new JTextField(5);
        tfValor2.addActionListener(this);
        add(tfValor2);

        lSoma = new JLabel("Soma");
        add(lSoma);

        tfSoma = new JTextField(5);
        tfSoma.addActionListener(this);
        add(tfSoma);

        bSomar = new JButton("Somar");
        bSomar.addActionListener(this);
        add(bSomar);
        
        bLimpar = new JButton("Limpar");
        bLimpar.addActionListener(this);
        add(bLimpar);
        
        bSair = new JButton("Sair");
        bSair.addActionListener(this);
        add(bSair);
        

        setSize(800, 600);
        setVisible(true);
    }

    public static void main(String [] args){
        Calculadora s = new Calculadora();
        s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==bSomar){
            JOptionPane.showMessageDialog(this,
                    "Salvo com sucesso!");
        }else
        if(ae.getSource()==bLimpar){
            tfNome.setText("");
            tfId.setText("");
        }else
        if(ae.getSource()==bSair){
            System.exit(0);
        }
        if(ae.getSource()== tfSoma){
             tfId.requestFocus();
        }
        
      
    }    
}