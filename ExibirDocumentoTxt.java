package br.ufc.poo.petshop.Interfaces;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExibirDocumentoTxt extends JFrame {

    private JTextArea textArea;

    public ExibirDocumentoTxt() {
        super("Exibir Documento TXT");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null); 

     
        Font fonteTextArea = new Font("Arial", Font.PLAIN, 14);

        textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setFont(fonteTextArea);

        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        getContentPane().add(scrollPane, BorderLayout.CENTER);

        JPanel topPanel = new JPanel();
        topPanel.setBackground(Color.DARK_GRAY);
        topPanel.setLayout(new BorderLayout());

        JLabel labelInfo = new JLabel("Clientes Cadastrados");
        labelInfo.setForeground(Color.WHITE);
        labelInfo.setFont(new Font("Arial", Font.BOLD, 18));

        topPanel.add(labelInfo, BorderLayout.CENTER);

        getContentPane().add(topPanel, BorderLayout.NORTH);

        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));

        JButton backButton = new JButton("Voltar");
        backButton.addActionListener(e -> voltarParaOutraJanela());
        bottomPanel.add(backButton);

        JSlider verticalSlider = new JSlider(JSlider.VERTICAL, 0, 100, 0);
        verticalSlider.addChangeListener(e -> navegarNoDocumento(verticalSlider.getValue()));
        bottomPanel.add(verticalSlider);

        getContentPane().add(bottomPanel, BorderLayout.SOUTH);

        carregarDocumentoTxt("clientes.txt");
    }

    private void carregarDocumentoTxt(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            StringBuilder content = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }

            textArea.setText(content.toString());

        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao carregar o arquivo: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void voltarParaOutraJanela() {
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
        dispose(); 
    }

    private void navegarNoDocumento(int value) {
        int scrollPosition = (int) ((double) value / 100 * textArea.getDocument().getLength());
        textArea.setCaretPosition(scrollPosition);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
                e.printStackTrace();
            }

            ExibirDocumentoTxt exibirDocumentoTxt = new ExibirDocumentoTxt();
            exibirDocumentoTxt.setVisible(true);
        });
    }
}