package zeus.playground.swing.dialog;

import java.awt.*;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * A sample modal dialog that displays a message and waits for the user to click the OK button.
 */
public class AboutDialog extends JDialog
{
    public AboutDialog(JFrame owner)
    {
        super(owner, "ToolBox", true);

        Font f1 = new Font("Serif", Font.BOLD, 80);
        Font f2 = new Font("Serif", Font.BOLD, 22);

        // add HTML label to center
        JLabel label1 = new JLabel("<html><br /><br />Tool Box</html>", JLabel.CENTER);
        label1.setFont(f1);
        add(label1, BorderLayout.NORTH);

        JLabel label2 = new JLabel("<html><i>Created By KG<i></html>", JLabel.CENTER);
        label1.setFont(f2);
        add(label2, BorderLayout.CENTER);

        // OK button closes the dialog
        JButton ok = new JButton("OK");
        ok.addActionListener(event -> setVisible(false));

        // add OK button to southern border
        JPanel panel = new JPanel();
        panel.add(ok);
        add(panel, BorderLayout.SOUTH);

        pack();
    }
}
