import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JLayeredPane;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JTable;
import javax.swing.JButton;
import com.toedter.calendar.JCalendar;
import java.awt.Button;
import java.awt.Rectangle;
import java.awt.Canvas;
import com.toedter.calendar.JDayChooser;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.DebugGraphics;
import javax.swing.JScrollPane;

public class cuarta extends Rentas {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cuarta window = new cuarta();
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
	public cuarta() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 720, 455);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 173, 418);
		panel.setBackground(new Color(253, 169, 94));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblSuitesSpa = new JLabel("Suites & Spa");
		lblSuitesSpa.setBounds(50, 25, 154, 27);
		panel.add(lblSuitesSpa);
		lblSuitesSpa.setForeground(Color.BLACK);
		lblSuitesSpa.setFont(new Font("adelline personal use only", Font.PLAIN, 16));
		
		JLabel lblHotelLumia = new JLabel("Hotel Lumia");
		lblHotelLumia.setForeground(new Color(0, 0, 0));
		lblHotelLumia.setFont(new Font("Subway", Font.PLAIN, 18));
		lblHotelLumia.setBounds(50, 5, 154, 27);
		panel.add(lblHotelLumia);
		
		JLabel lblNewLabel_1_1_1_1_2_1_1_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1_1_2_1_1_1_1_1.setBounds(-40, -14, 140, 56);
		panel.add(lblNewLabel_1_1_1_1_2_1_1_1_1_1);
		lblNewLabel_1_1_1_1_2_1_1_1_1_1.setIcon(new ImageIcon("C:\\Users\\Tequila\\Downloads\\snapedit_1715568571329 (2) (1) (1) (1).png"));
		lblNewLabel_1_1_1_1_2_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1_2_1_1_1_1_1.setFont(new Font("Scripter", Font.PLAIN, 22));
		
		JLabel lblRentas = new JLabel("Rentas");
		lblRentas.setForeground(Color.WHITE);
		lblRentas.setFont(new Font("Scripter", Font.PLAIN, 22));
		lblRentas.setBounds(50, 118, 63, 27);
		panel.add(lblRentas);
		
		JLabel lblNewLabel_1_1 = new JLabel("Habitaciones");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Scripter", Font.PLAIN, 22));
		lblNewLabel_1_1.setBounds(50, 168, 118, 27);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Clientes");
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Scripter", Font.PLAIN, 22));
		lblNewLabel_1_1_1.setBounds(50, 218, 71, 27);
		panel.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel = new JLabel("Inicio");
		lblNewLabel.setBounds(48, 68, 50, 27);
		panel.add(lblNewLabel);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Scripter", Font.PLAIN, 22));
		
		JLabel lblNewLabel_1_1_1_1_2 = new JLabel("");
		lblNewLabel_1_1_1_1_2.setIcon(new ImageIcon("C:\\Users\\Tequila\\Downloads\\ICONOS FIGMA\\snapedit_1715629297483 (1).png"));
		lblNewLabel_1_1_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1_2.setFont(new Font("Scripter", Font.PLAIN, 22));
		lblNewLabel_1_1_1_1_2.setBounds(11, 106, 35, 35);
		panel.add(lblNewLabel_1_1_1_1_2);
		
		JLabel lblNewLabel_1_1_1_1_2_1 = new JLabel("");
		lblNewLabel_1_1_1_1_2_1.setIcon(new ImageIcon("C:\\Users\\Tequila\\Downloads\\ICONOS FIGMA\\snapedit_1715629394454.png"));
		lblNewLabel_1_1_1_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1_2_1.setFont(new Font("Scripter", Font.PLAIN, 22));
		lblNewLabel_1_1_1_1_2_1.setBounds(10, 157, 35, 35);
		panel.add(lblNewLabel_1_1_1_1_2_1);
		
		JLabel lblNewLabel_1_1_1_1_2_1_1 = new JLabel("");
		lblNewLabel_1_1_1_1_2_1_1.setIcon(new ImageIcon("C:\\Users\\Tequila\\Downloads\\ICONOS FIGMA\\snapedit_1715630352746.png"));
		lblNewLabel_1_1_1_1_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1_2_1_1.setFont(new Font("Scripter", Font.PLAIN, 22));
		lblNewLabel_1_1_1_1_2_1_1.setBounds(10, 208, 35, 35);
		panel.add(lblNewLabel_1_1_1_1_2_1_1);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Tarifas");
		lblNewLabel_1_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_2.setFont(new Font("Scripter", Font.PLAIN, 22));
		lblNewLabel_1_1_1_2.setBounds(50, 268, 63, 27);
		panel.add(lblNewLabel_1_1_1_2);
		
		JLabel lblNewLabel_1_1_1_1_2_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1_1_2_1_1_1.setIcon(new ImageIcon("C:\\Users\\Tequila\\Downloads\\ICONOS FIGMA\\snapedit_1715629214200 (1).png"));
		lblNewLabel_1_1_1_1_2_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1_2_1_1_1.setFont(new Font("Scripter", Font.PLAIN, 22));
		lblNewLabel_1_1_1_1_2_1_1_1.setBounds(16, 258, 35, 35);
		panel.add(lblNewLabel_1_1_1_1_2_1_1_1);
		
		JLabel lblNewLabel_1_1_1_2_1 = new JLabel("Cerrar sesion");
		lblNewLabel_1_1_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_2_1.setFont(new Font("Scripter", Font.PLAIN, 22));
		lblNewLabel_1_1_1_2_1.setBounds(45, 383, 125, 27);
		panel.add(lblNewLabel_1_1_1_2_1);
		
		JLabel lblNewLabel_1_1_1_1_2_1_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1_1_2_1_1_1_1.setIcon(new ImageIcon("C:\\Users\\Tequila\\Downloads\\ICONOS FIGMA\\sign-out-icon-vector-removebg-preview (1).png"));
		lblNewLabel_1_1_1_1_2_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1_2_1_1_1_1.setFont(new Font("Scripter", Font.PLAIN, 22));
		lblNewLabel_1_1_1_1_2_1_1_1_1.setBounds(11, 373, 35, 35);
		panel.add(lblNewLabel_1_1_1_1_2_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_2_1_1_1_1_1_2 = new JLabel("");
		lblNewLabel_1_1_1_1_2_1_1_1_1_1_2.setBounds(-219, -3, 802, 52);
		panel.add(lblNewLabel_1_1_1_1_2_1_1_1_1_1_2);
		lblNewLabel_1_1_1_1_2_1_1_1_1_1_2.setIcon(new ImageIcon("C:\\Users\\Tequila\\Downloads\\Diseño sin título (9).png"));
		lblNewLabel_1_1_1_1_2_1_1_1_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1_2_1_1_1_1_1_2.setFont(new Font("Scripter", Font.PLAIN, 22));
		
		JLabel lblNewLabel_1_1_1_1_2_2 = new JLabel("");
		lblNewLabel_1_1_1_1_2_2.setIcon(new ImageIcon("C:\\Users\\Tequila\\Downloads\\ICONOS FIGMA\\home-icon-free-vector-removebg-preview (1) (1).png"));
		lblNewLabel_1_1_1_1_2_2.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1_2_2.setFont(new Font("Scripter", Font.PLAIN, 22));
		lblNewLabel_1_1_1_1_2_2.setBounds(11, 55, 35, 35);
		lblNewLabel_1_1_1_1_2_2.setOpaque(false);
		panel.add(lblNewLabel_1_1_1_1_2_2);
		
		JPanel panel_1_3_3 = new JPanel();
		panel_1_3_3.setLayout(null);
		panel_1_3_3.setBackground(new Color(255, 128, 64));
		panel_1_3_3.setBounds(0, 98, 173, 54);
		panel.add(panel_1_3_3);
		
		JLabel lblNewLabel_1_1_1_1_2_1_1_1_1_1_2_1 = new JLabel("");
		lblNewLabel_1_1_1_1_2_1_1_1_1_1_2_1.setIcon(new ImageIcon("C:\\Users\\Tequila\\Downloads\\Diseño sin título (9).png"));
		lblNewLabel_1_1_1_1_2_1_1_1_1_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1_2_1_1_1_1_1_2_1.setFont(new Font("Scripter", Font.PLAIN, 22));
		lblNewLabel_1_1_1_1_2_1_1_1_1_1_2_1.setBounds(-44, 0, 522, 52);
		frame.getContentPane().add(lblNewLabel_1_1_1_1_2_1_1_1_1_1_2_1);
		
		JLabel lblNewLabel_1_1_1_1_2_1_1_1_1_1_2_1_1 = new JLabel("");
		lblNewLabel_1_1_1_1_2_1_1_1_1_1_2_1_1.setIcon(new ImageIcon("C:\\Users\\Tequila\\Downloads\\Diseño sin título (9).png"));
		lblNewLabel_1_1_1_1_2_1_1_1_1_1_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1_2_1_1_1_1_1_2_1_1.setFont(new Font("Scripter", Font.PLAIN, 22));
		lblNewLabel_1_1_1_1_2_1_1_1_1_1_2_1_1.setBounds(263, 0, 522, 52);
		frame.getContentPane().add(lblNewLabel_1_1_1_1_2_1_1_1_1_1_2_1_1);
		
		JLabel lblQueTipoDe = new JLabel("Selecciona la reserva");
		lblQueTipoDe.setForeground(new Color(255, 255, 255));
		lblQueTipoDe.setFont(new Font("Scripter", Font.PLAIN, 22));
		lblQueTipoDe.setBounds(355, 146, 197, 27);
		frame.getContentPane().add(lblQueTipoDe);
		
		JPanel panel_1_3_3_1 = new JPanel();
		panel_1_3_3_1.setLayout(null);
		panel_1_3_3_1.setBackground(new Color(253, 169, 94));
		panel_1_3_3_1.setBounds(357, 65, 173, 54);
		frame.getContentPane().add(panel_1_3_3_1);
		
		JLabel lblDeMayo = new JLabel("15 de mayo");
		lblDeMayo.setBounds(22, 10, 130, 47);
		panel_1_3_3_1.add(lblDeMayo);
		lblDeMayo.setForeground(Color.WHITE);
		lblDeMayo.setFont(new Font("Scripter", Font.PLAIN, 30));
		
		Button button_1_1 = new Button("Volver");
		button_1_1.setForeground(Color.WHITE);
		button_1_1.setFont(new Font("Glacial Indifference", Font.PLAIN, 20));
		button_1_1.setBackground(Color.RED);
		button_1_1.setBounds(187, 377, 79, 27);
		frame.getContentPane().add(button_1_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(new Color(255, 255, 255));
		scrollPane.setBounds(243, 176, 415, 161);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"Clave de reserva", "Cliente"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(122);
		table.getColumnModel().getColumn(1).setPreferredWidth(363);
		scrollPane.setViewportView(table);
		
		JPanel panel_1_3_3_1_1 = new JPanel();
		panel_1_3_3_1_1.setLayout(null);
		panel_1_3_3_1_1.setBackground(new Color(254, 194, 141));
		panel_1_3_3_1_1.setBounds(223, 134, 456, 224);
		frame.getContentPane().add(panel_1_3_3_1_1);
	}
}