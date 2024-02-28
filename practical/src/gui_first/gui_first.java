package gui_first;

import javax.swing.*;
import java.awt.event.*;

public class gui_first extends JFrame {
    private JTextField inputTextField;
    private JLabel messageLabel;
    
    public gui_first() {
        setTitle("String Manipulation");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        
        messageLabel = new JLabel("Input any String:");
        messageLabel.setBounds(20, 20, 150, 20);
        add(messageLabel);
        
        inputTextField = new JTextField();
        inputTextField.setBounds(180, 20, 150, 20);
        add(inputTextField);
        
        JButton checkPalindromeButton = new JButton("Check Palindrome");
        checkPalindromeButton.setBounds(20, 60, 150, 30);
        checkPalindromeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = inputTextField.getText();
                if (isPalindrome(input)) {
                    JOptionPane.showMessageDialog(null, "The input is a palindrome.");
                } else {
                    JOptionPane.showMessageDialog(null, "The input is not a palindrome.");
                }
            }
        });
        add(checkPalindromeButton);
        
        JButton reverseButton = new JButton("Reverse");
        reverseButton.setBounds(180, 60, 150, 30);
        reverseButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = inputTextField.getText();
                String reversed = reverseString(input);
                JOptionPane.showMessageDialog(null, "Reversed string: " + reversed);
            }
        });
        add(reverseButton);
        
        JButton findVowelsButton = new JButton("Find Vowels");
        findVowelsButton.setBounds(20, 110, 150, 30);
        findVowelsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = inputTextField.getText();
                String vowels = findVowels(input);
                JOptionPane.showMessageDialog(null, "Vowels in the string: " + vowels);
            }
        });
        add(findVowelsButton);
    }
    
    private boolean isPalindrome(String str) {
        StringBuilder reversed = new StringBuilder(str).reverse();
        return str.equalsIgnoreCase(reversed.toString());
    }
    
    private String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
    
    private String findVowels(String str) {
        StringBuilder vowels = new StringBuilder();
        for (char c : str.toCharArray()) {
            if ("AEIOUaeiou".indexOf(c) != -1) {
                vowels.append(c);
            }
        }
        return vowels.toString();
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new gui_first().setVisible(true);
            }
        });
    }
}

