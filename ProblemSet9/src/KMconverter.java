import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;



public class KMconverter {
	private JFrame frame;
    private JLabel inputLabel;
    private JLabel outputLabel;
    private JTextField inputField;
    private JTextField outputField;
    private JButton calcButton;
    private JPanel topPanel;
    private JPanel centerPanel;
    private JPanel bottomPanel;
    private JRadioButton miles= new JRadioButton("Miles");
    private JRadioButton yards= new JRadioButton("Yards");
    
    /**
     * Create a window and show it on screen.
     */
    public KMconverter()
    {
    	makeComponents();
    	makePanels();
        makeFrame();
    }
    
    // ---- swing stuff to build the frame and all its components ----
    
    /**
     * Create the Swing frame and its content.
     */
    private void makeFrame()
    {
        frame = new JFrame("Miles and Yards calculator");  
        makeMenuBar(frame);
        Container contentPane = frame.getContentPane();
        
        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
        
        contentPane.add(topPanel);
        contentPane.add(centerPanel);
        contentPane.add(bottomPanel);

        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
    
    /**
     * Create the components for the window.
     */
    private void makeComponents()
    {
    	inputLabel = new JLabel("Enter distance in kilometers:");
    	inputLabel.addMouseListener(new MouseAdapter() {
    		public void mouseEntered(MouseEvent e) { handleMouseEntered();}
    	});
    	outputLabel = new JLabel("Distance:");
        inputField = new JTextField(5);
        outputField = new JTextField(5);
        outputField.setEditable(false);
        calcButton = new JButton("Calculate");
        calcButton.addActionListener(e -> calculate());
        
        
    }
    
    /*
     * Add components to the panels
     */
    private void makePanels()
    {
        topPanel = new JPanel();
        topPanel.add(inputLabel);
        topPanel.add(inputField);
        centerPanel = new JPanel();
        centerPanel.add(outputLabel);
        centerPanel.add(outputField);
        
        bottomPanel = new JPanel();
        bottomPanel.add(calcButton);
        ButtonGroup bg= new ButtonGroup();
        bg.add(miles);
        bg.add(yards);
        
        centerPanel.add(miles);
        centerPanel.add(yards);
    }
    
    /*
     * Add menu bar and menu items to a frame
     */
    private void makeMenuBar(JFrame frame)
    {
    	//Create and add menu bar to the frame
    	JMenuBar menubar = new JMenuBar();
    	frame.setJMenuBar(menubar);
    	
    	//Add a menu to the menu bar
    	JMenu helpMenu = new JMenu("File");
    	menubar.add(helpMenu);
    	
    	//Add menu item to help menu
    	JMenuItem aboutItem = new JMenuItem("quit");
    	aboutItem.addActionListener(e -> aboutDisplay());
    	helpMenu.add(aboutItem);   	
    }
    
    private void calculate()
    {
    	String text = inputField.getText();
		Double miles = Double.parseDouble(text) * 0.62137;
		Double yards = Double.parseDouble(text) * 1093.61;
		
		if(this.miles.isSelected()) {
			outputField.setText(miles.toString());			
		}
		else if(this.yards.isSelected()) {
			outputField.setText(yards.toString());
		}
    }
    
    private void aboutDisplay()
    {
    	System.exit(0);
    }
    
    private void handleMouseEntered()
    {
    	inputLabel.setForeground(Color.BLUE);
    }
}