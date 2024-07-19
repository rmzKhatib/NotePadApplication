import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class GUI {

    JFrame window;
    JTextArea textArea;
    JScrollPane scrollPane;
    public static void main(String[] args) {

        new GUI();

    }
    public GUI() {

        createWindow();
        createTextArea();

        window.setVisible(true);

    }
    public void createWindow() {
        window = new JFrame("NotePad"); // window title
        window.setSize(800, 600); // window size
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // allows you to close the window

    }
    public void createTextArea() {

        textArea = new JTextArea();

        scrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);// Initialize Scroll Bar
        scrollPane.setBorder(BorderFactory.createEmptyBorder());
        window.add(scrollPane); // Adds scroll bar
    }
}
