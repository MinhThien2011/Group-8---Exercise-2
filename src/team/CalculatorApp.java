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

    public class AdditionFrame extends JFrame {
    public AdditionFrame() {
        setTitle("Addition");
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        
        // Nhãn và ô nhập cho số 1
        JLabel label1 = new JLabel("Số 1:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.EAST;
        panel.add(label1, gbc);
        
        JTextField input1 = new JTextField(10);
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        panel.add(input1, gbc);
        
        // Nhãn và ô nhập cho số 2
        JLabel label2 = new JLabel("Số 2:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.EAST;
        panel.add(label2, gbc);
        
        JTextField input2 = new JTextField(10);
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        panel.add(input2, gbc);
        
        // Nút tính tổng
        JButton calcButton = new JButton("Tính Tổng (+)");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(calcButton, gbc);
        
        // Nhãn và ô hiển thị kết quả
        JLabel resultLabel = new JLabel("Kết quả:");
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        panel.add(resultLabel, gbc);
        
        JTextField resultField = new JTextField(10);
        resultField.setEditable(false);
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.WEST;
        panel.add(resultField, gbc);
        
        // Xử lý sự kiện và ngoại lệ
        calcButton.addActionListener(e -> {
            try {
                double num1 = Double.parseDouble(input1.getText().trim());
                double num2 = Double.parseDouble(input2.getText().trim());
                resultField.setText(String.valueOf(num1 + num2));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập số hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        });
        
        add(panel);
        pack();
        setLocationRelativeTo(null);
    }
}

    public class MultiplicationFrame extends JFrame {
        public MultiplicationFrame() {
            setTitle("Multiplication");
            JPanel panel = new JPanel(new GridBagLayout());
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.insets = new Insets(5, 5, 5, 5);

            JLabel label1 = new JLabel("Số 1:");
            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.anchor = GridBagConstraints.EAST;
            panel.add(label1, gbc);

            JTextField input1 = new JTextField(10);
            gbc.gridx = 1;
            gbc.gridy = 0;
            gbc.anchor = GridBagConstraints.WEST;
            panel.add(input1, gbc);

            JLabel label2 = new JLabel("Số 2:");
            gbc.gridx = 0;
            gbc.gridy = 1;
            gbc.anchor = GridBagConstraints.EAST;
            panel.add(label2, gbc);

            JTextField input2 = new JTextField(10);
            gbc.gridx = 1;
            gbc.gridy = 1;
            gbc.anchor = GridBagConstraints.WEST;
            panel.add(input2, gbc);

            JButton calcButton = new JButton("Tính Tích (×)");
            gbc.gridx = 0;
            gbc.gridy = 2;
            gbc.gridwidth = 2;
            gbc.anchor = GridBagConstraints.CENTER;
            panel.add(calcButton, gbc);

            JLabel resultLabel = new JLabel("Kết quả:");
            gbc.gridx = 0;
            gbc.gridy = 3;
            gbc.gridwidth = 1;
            gbc.anchor = GridBagConstraints.EAST;
            panel.add(resultLabel, gbc);

            JTextField resultField = new JTextField(10);
            resultField.setEditable(false);
            gbc.gridx = 1;
            gbc.gridy = 3;
            gbc.anchor = GridBagConstraints.WEST;
            panel.add(resultField, gbc);

            calcButton.addActionListener(e -> {
                try {
                    double num1 = Double.parseDouble(input1.getText().trim());
                    double num2 = Double.parseDouble(input2.getText().trim());
                    resultField.setText(String.valueOf(num1 * num2));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(this, "Vui lòng nhập số hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            });

            add(panel);
            pack();
            setLocationRelativeTo(null);
        }
    }
      public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CalculatorApp().setVisible(true));
    }

}
