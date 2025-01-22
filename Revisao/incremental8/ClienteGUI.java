package Revisao.incremental8;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

public class ClienteGUI {
    private JFrame frame;
    private JTextField nomeField, cpfField, enderecoField, telefoneField, emailField;
    private JTextArea clienteArea;
    private ArrayList<Cliente> clientes;

    public ClienteGUI() {
        clientes = new ArrayList<>();
        frame = new JFrame("Cadastro de Clientes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        
        JPanel panel = new JPanel(new GridLayout(7, 2));

        
        panel.add(new JLabel("Nome:"));
        nomeField = new JTextField();
        panel.add(nomeField);

        panel.add(new JLabel("CPF:"));
        cpfField = new JTextField();
        panel.add(cpfField);

        panel.add(new JLabel("Endereço:"));
        enderecoField = new JTextField();
        panel.add(enderecoField);

        panel.add(new JLabel("Telefone:"));
        telefoneField = new JTextField();
        panel.add(telefoneField);

        panel.add(new JLabel("Email:"));
        emailField = new JTextField();
        panel.add(emailField);

        
        JButton salvarButton = new JButton("Salvar");
        JButton excluirButton = new JButton("Excluir Todos");
        panel.add(salvarButton);
        panel.add(excluirButton);

        
        clienteArea = new JTextArea();
        clienteArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(clienteArea);

        
        salvarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                salvarCliente();
            }
        });

        excluirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                excluirTodosClientes();
            }
        });

        frame.add(panel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    private void salvarCliente() {
        String nome = nomeField.getText().trim();
        String cpf = cpfField.getText().trim();
        String endereco = enderecoField.getText().trim();
        String telefone = telefoneField.getText().trim();
        String email = emailField.getText().trim();

        if (nome.isEmpty() || cpf.isEmpty() || endereco.isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Os campos Nome, CPF e Endereço são obrigatórios!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Cliente cliente = new Cliente(nome, cpf, endereco, telefone, email);
        clientes.add(cliente);
        atualizarListaClientes();
        limparCampos();
        JOptionPane.showMessageDialog(frame, "Cliente salvo com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    }

    private void excluirTodosClientes() {
        clientes.clear();
        atualizarListaClientes();
        JOptionPane.showMessageDialog(frame, "Todos os clientes foram excluídos!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    }

    private void atualizarListaClientes() {
        clienteArea.setText("");
        for (Cliente cliente : clientes) {
            clienteArea.append(cliente.toString() + "\n");
        }
    }

    private void limparCampos() {
        nomeField.setText("");
        cpfField.setText("");
        enderecoField.setText("");
        telefoneField.setText("");
        emailField.setText("");
    }

    public static void main(String[] args) {
        new ClienteGUI();
    }
}

