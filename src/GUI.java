import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class GUI {

    JFrame window;
    JTextArea textArea;
    JScrollPane scrollPane;
    JMenuBar menuBar;
    JMenu menuFile, menuEdit, menuFormat, menuColor;
    JMenuItem iNew, iOpen, iSave, iSaveAs, iExit;
    public static void main(String[] args) {

        new GUI();

    }
    public GUI() {

        createWindow();
        createTextArea();
        createMenuBar();
        createFileMenu();

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
    public void createMenuBar() {

        menuBar = new JMenuBar();
        window.setJMenuBar(menuBar); // adds menu bar

        menuFile = new JMenu("File");
        menuBar.add(menuFile);

        menuEdit = new JMenu("Edit");
        menuBar.add(menuEdit);

        menuFormat = new JMenu("Format");
        menuBar.add(menuFormat);

        menuColor = new JMenu("Color");
        menuBar.add(menuColor);

    }
    public void createFileMenu() {

        iNew = new JMenuItem("New");
        menuFile.add(iNew);

        iOpen = new JMenuItem("Open");
        menuFile.add(iOpen);

        iSave = new JMenuItem("Save");
        menuFile.add(iSave);

        iSaveAs = new JMenuItem("Save As");
        menuFile.add(iSaveAs);

        iExit = new JMenuItem("Exit");
        menuFile.add(iExit);

    }

}
