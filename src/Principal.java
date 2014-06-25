import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JSplitPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Principal {

	private JFrame frame;
	private JButton tablero[][];

	/**
	 * This is a classic game in Mexico called Gato!
	 * You have to make a line at least 3 symbols that could be either X or O 
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JSplitPane splitPane = new JSplitPane();
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		frame.getContentPane().add(splitPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		splitPane.setRightComponent(panel);
		panel.setLayout(new GridLayout(3, 3, 0, 0));
		
		JPanel panel_1 = new JPanel();
		splitPane.setLeftComponent(panel_1);
		
		JButton btnReset = new JButton("reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				reset();
			}
		});
		panel_1.add(btnReset);
		tablero = new JButton[3][3];
		for (int i = 0; i<3; i++)
		{
			for(int j = 0;j<3;j++)
			{
				tablero[i][j] = new JButton("");
				panel.add(tablero[i][j]);
				tablero[i][j].setActionCommand(""+i+" "+j);
				tablero[i][j].addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
						String[] spl_ret = e.getActionCommand().split(" ");
						int a = Integer.parseInt(spl_ret[0]);
						int b = Integer.parseInt(spl_ret[1]);
					}
					
				}
				);
			}
		}
	}
	
	private void reset()
	{
		System.out.println("Reset method");

	}

}
