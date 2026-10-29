import javax.swing.*;
import java.awt.event.*;

public class JMenu1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Menu Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JLabel label = new JLabel("Basic Menu for Java!", SwingConstants.CENTER);
        frame.add(label);

        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu helpMenu = new JMenu("Help");

        JMenuItem newItem = new JMenuItem("New");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem exitItem = new JMenuItem("Exit");

        JMenuItem cutItem = new JMenuItem("Cut");
        JMenuItem copyItem = new JMenuItem("Copy");
        JMenuItem pasteItem = new JMenuItem("Paste");

        JMenuItem aboutItem = new JMenuItem("About");

        newItem.addActionListener(e ->
            JOptionPane.showMessageDialog(frame, "New file created!")
        );

        openItem.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            int option = fileChooser.showOpenDialog(frame);
            if (option == JFileChooser.APPROVE_OPTION) {
                String fileName = fileChooser.getSelectedFile().getName();
                JOptionPane.showMessageDialog(frame, "You selected: " + fileName);
            }
        });

        exitItem.addActionListener(e ->
            System.exit(0)
        );

        cutItem.addActionListener(e ->
            JOptionPane.showMessageDialog(frame, "Cut action triggered")
        );

        copyItem.addActionListener(e ->
            JOptionPane.showMessageDialog(frame, "Copy action triggered")
        );

        pasteItem.addActionListener(e ->
            JOptionPane.showMessageDialog(frame, "Paste action triggered")
        );

        aboutItem.addActionListener(e ->
            JOptionPane.showMessageDialog(frame, "This is a basic menu app. Only for Interaction", "About", JOptionPane.INFORMATION_MESSAGE)
        );

        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        editMenu.add(cutItem);
        editMenu.add(copyItem);
        editMenu.add(pasteItem);

        helpMenu.add(aboutItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        frame.setJMenuBar(menuBar);
        frame.setVisible(true);
    }
}