package team;


import javax.swing.*;
import java.awt.*;

public class CalculatorApp extends JFrame {
    public CalculatorApp() {
        setTitle("Calculator App");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        // Tiêu đề MENU
        JLabel titleLabel = new JLabel("MENU", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        add(titleLabel, BorderLayout.NORTH);
        
        // Panel chứa 4 nút chức năng
        JPanel buttonPanel = new JPanel(new GridLayout(2, 2, 10, 10));
        JButton addButton = new JButton("Addition (+)");
        JButton subButton = new JButton("Subtraction (-)");
        JButton mulButton = new JButton("Multiplication (×)");
        JButton divButton = new JButton("Division (÷)");
        
        // Cài đặt font cho nút
        addButton.setFont(new Font("Arial", Font.PLAIN, 16));
        subButton.setFont(new Font("Arial", Font.PLAIN, 16));
        mulButton.setFont(new Font("Arial", Font.PLAIN, 16));
        divButton.setFont(new Font("Arial", Font.PLAIN, 16));
        
        buttonPanel.add(addButton);
        buttonPanel.add(subButton);
        buttonPanel.add(mulButton);
        buttonPanel.add(divButton);
        
        add(buttonPanel, BorderLayout.CENTER);
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CalculatorApp().setVisible(true));
    }



}
