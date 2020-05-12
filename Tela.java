package ExerciciosAula10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Tela extends JFrame{
    JLabel label;

    public Tela(){
        super("Texto");
        criarLabel();
        criarBotao();
    }
    public void criarLabel(){
        JPanel painel = new JPanel();
        painel.setLayout(new FlowLayout());

         label = new JLabel("Texto");

        painel.add(label);
        add(painel, BorderLayout.CENTER);
    }
    public void criarBotao(){
        JPanel painel1 = new JPanel();
        painel1.setLayout(new FlowLayout());

        MostrarAction mostrarAction = new MostrarAction();
        JButton mostrar = new JButton("Mostrar");
        mostrar.addActionListener(mostrarAction);

        LimparAction limparAction = new LimparAction();
        JButton limpar = new JButton("Limpar");
        limpar.addActionListener(limparAction);

        SairAction sairAction = new SairAction();
        JButton sair = new JButton("Sair");
        sair.addActionListener(sairAction);

        painel1.add(mostrar);
        painel1.add(limpar);
        painel1.add(sair);
        add(painel1, BorderLayout.SOUTH);
    }

    public class MostrarAction implements ActionListener{
        
        public void actionPerformed(ActionEvent event){
            String r = JOptionPane.showInputDialog("Digite o texto");
            label.setText(r);
        }
    }
    public class LimparAction implements ActionListener{
        
        public void actionPerformed(ActionEvent event){
            label.setText("");
        }
    }
    public class SairAction implements ActionListener{
        
        public void actionPerformed(ActionEvent event){
            System.exit(0);
        }
    }

    public static void main(String...args){
        Tela tela = new Tela();
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setSize(530,260);
        tela.setVisible(true);
    }
}