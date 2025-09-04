package main;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class JanelaDaVida extends JFrame {

 private MinhaVida minhaVida;
 private JTextArea areaDeTexto;
 private JButton btnLinhaCompleta;
 private JButton btnInfancia;
 private JButton btnAdolescencia;
 private JButton btnVidaAtual;
 private JButton btnSonhos;

 public JanelaDaVida() {
     this.minhaVida = new MinhaVida();

     setTitle("Linha do Tempo de " + minhaVida.nomeCompleto);
     setSize(800, 600);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setLocationRelativeTo(null); 
     setLayout(new BorderLayout(10, 10)); 

     inicializarComponentes();
     adicionarListeners(); 
 }

 private void inicializarComponentes() {
     JPanel painelBotoes = new JPanel();
     painelBotoes.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10)); 

     btnLinhaCompleta = new JButton("Linha do Tempo Completa");
     btnInfancia = new JButton("Infância");
     btnAdolescencia = new JButton("Adolescência");
     btnVidaAtual = new JButton("Vida Atual");
     btnSonhos = new JButton("Sonhos e Metas");
     
     painelBotoes.add(btnLinhaCompleta);
     painelBotoes.add(btnInfancia);
     painelBotoes.add(btnAdolescencia);
     painelBotoes.add(btnVidaAtual);
     painelBotoes.add(btnSonhos);

     areaDeTexto = new JTextArea("Bem-vindo(a) à minha linha do tempo!\nClique em um botão para começar.");
     areaDeTexto.setFont(new Font("Monospaced", Font.PLAIN, 14));
     areaDeTexto.setEditable(false); 
     areaDeTexto.setLineWrap(true); 
     areaDeTexto.setWrapStyleWord(true);
     areaDeTexto.setMargin(new Insets(10, 10, 10, 10));

     JScrollPane scrollPane = new JScrollPane(areaDeTexto);

     add(painelBotoes, BorderLayout.NORTH);
     add(scrollPane, BorderLayout.CENTER);
 }
 
 private void adicionarListeners() {
     btnLinhaCompleta.addActionListener(e -> {
         String texto = minhaVida.getLinhaDoTempoCompletaAsString();
         areaDeTexto.setText(texto);
         areaDeTexto.setCaretPosition(0); 
     });

     btnInfancia.addActionListener(e -> {
         String texto = minhaVida.getDetalhesDaFaseAsString(FaseDaVida.INFANCIA);
         areaDeTexto.setText(texto);
         areaDeTexto.setCaretPosition(0);
     });

     btnAdolescencia.addActionListener(e -> {
         String texto = minhaVida.getDetalhesDaFaseAsString(FaseDaVida.ADOLESCENCIA);
         areaDeTexto.setText(texto);
         areaDeTexto.setCaretPosition(0);
     });

     btnVidaAtual.addActionListener(e -> {
         String texto = minhaVida.getDetalhesDaFaseAsString(FaseDaVida.VIDA_ATUAL);
         areaDeTexto.setText(texto);
         areaDeTexto.setCaretPosition(0);
     });

     btnSonhos.addActionListener(e -> {
         String texto = minhaVida.getSonhosEMetasAsString();
         areaDeTexto.setText(texto);
         areaDeTexto.setCaretPosition(0);
     });
 }

 public static void main(String[] args) {
     SwingUtilities.invokeLater(() -> {
         JanelaDaVida janela = new JanelaDaVida();
         janela.setVisible(true); 
     });
 }
}