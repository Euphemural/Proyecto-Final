import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class renta extends Rentas {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					renta window = new renta();
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
	public renta() {
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
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setLayout(null);
		panel_1_3.setBackground(new Color(0, 128, 0));
		panel_1_3.setBounds(226, 111, 173, 27);
		frame.getContentPane().add(panel_1_3);
		
		JLabel lblHabitacionesDisponibles = new JLabel("Habitaciones disponibles");
		lblHabitacionesDisponibles.setForeground(Color.WHITE);
		lblHabitacionesDisponibles.setFont(new Font("Glacial Indifference", Font.PLAIN, 13));
		lblHabitacionesDisponibles.setBounds(8, 1, 162, 27);
		panel_1_3.add(lblHabitacionesDisponibles);
		
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
		panel.add(lblNewLabel_1_1_1_1_2_2);
		
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
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(172, 211, 107));
		panel_1.setBounds(226, 111, 173, 92);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("1 0");
		lblNewLabel_1_1_1_1.setBounds(57, 37, 60, 71);
		lblNewLabel_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1.setFont(new Font("Scripter", Font.PLAIN, 60));
		panel_1.add(lblNewLabel_1_1_1_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(87, 170, 253));
		panel_1_1.setBounds(474, 111, 173, 92);
		frame.getContentPane().add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("2");
		lblNewLabel_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1_1.setFont(new Font("Scripter", Font.PLAIN, 60));
		lblNewLabel_1_1_1_1_1.setBounds(75, 36, 28, 71);
		panel_1_1.add(lblNewLabel_1_1_1_1_1);
		
		JPanel panel_1_3_1 = new JPanel();
		panel_1_3_1.setLayout(null);
		panel_1_3_1.setBackground(new Color(0, 100, 236));
		panel_1_3_1.setBounds(0, 0, 173, 27);
		panel_1_1.add(panel_1_3_1);
		
		JLabel lblFueraDeServicio = new JLabel("Fuera de servicio");
		lblFueraDeServicio.setForeground(Color.WHITE);
		lblFueraDeServicio.setFont(new Font("Glacial Indifference", Font.PLAIN, 13));
		lblFueraDeServicio.setBounds(31, 0, 224, 27);
		panel_1_3_1.add(lblFueraDeServicio);
		
		JPanel panel_1_3_2 = new JPanel();
		panel_1_3_2.setLayout(null);
		panel_1_3_2.setBackground(new Color(255, 0, 0));
		panel_1_3_2.setBounds(226, 265, 173, 27);
		frame.getContentPane().add(panel_1_3_2);
		
		JLabel lblHabitacionesOcupadas = new JLabel("Habitaciones ocupadas");
		lblHabitacionesOcupadas.setForeground(Color.WHITE);
		lblHabitacionesOcupadas.setFont(new Font("Glacial Indifference", Font.PLAIN, 13));
		lblHabitacionesOcupadas.setBounds(15, -1, 157, 27);
		panel_1_3_2.add(lblHabitacionesOcupadas);
		
		JPanel panel_1_3_1_1 = new JPanel();
		panel_1_3_1_1.setLayout(null);
		panel_1_3_1_1.setBackground(new Color(252, 136, 31));
		panel_1_3_1_1.setBounds(474, 265, 173, 27);
		frame.getContentPane().add(panel_1_3_1_1);
		
		JLabel lblHabitacionesReservadas = new JLabel("Habitaciones reservadas");
		lblHabitacionesReservadas.setForeground(Color.WHITE);
		lblHabitacionesReservadas.setFont(new Font("Glacial Indifference", Font.PLAIN, 13));
		lblHabitacionesReservadas.setBounds(7, 0, 224, 27);
		panel_1_3_1_1.add(lblHabitacionesReservadas);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBackground(new Color(255, 85, 85));
		panel_1_2.setBounds(226, 265, 173, 92);
		frame.getContentPane().add(panel_1_2);
		panel_1_2.setLayout(null);
		
		JLabel lblNewLabel_1_1_1_1_3 = new JLabel("5");
		lblNewLabel_1_1_1_1_3.setBounds(69, 35, 26, 71);
		panel_1_2.add(lblNewLabel_1_1_1_1_3);
		lblNewLabel_1_1_1_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1_3.setFont(new Font("Scripter", Font.PLAIN, 60));
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBackground(new Color(253, 169, 94));
		panel_1_1_1.setBounds(474, 265, 173, 92);
		frame.getContentPane().add(panel_1_1_1);
		panel_1_1_1.setLayout(null);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("3");
		lblNewLabel_1_1_1_1_1_1.setBounds(72, 35, 28, 71);
		panel_1_1_1.add(lblNewLabel_1_1_1_1_1_1);
		lblNewLabel_1_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Scripter", Font.PLAIN, 60));
	}
}
