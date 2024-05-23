package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import javax.swing.JTextPane;

public class Login {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1155, 773);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JScrollPane scrollPane = new JScrollPane();
		frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 153, 0));
		scrollPane.setViewportView(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.gridheight = 3;
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 5;
		gbc_panel_2.gridy = 0;
		panel.add(panel_2, gbc_panel_2);
		
		JLabel imagenDelHotel = new JLabel("");
		imagenDelHotel.setIcon(new ImageIcon(Login.class.getResource("/Vista/Imagenes/Imagen del Hotel.png")));
		imagenDelHotel.setBounds(0, 0, 507, 734);
		panel_2.add(imagenDelHotel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setLayout(null);
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 2;
		gbc_panel_1.gridy = 1;
		panel.add(panel_1, gbc_panel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/Vista/Imagenes/Logo del hotel.png")));
		lblNewLabel.setBounds(170, 10, 155, 161);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Hotel Lumia");
		lblNewLabel_1.setFont(new Font("Sansita", Font.PLAIN, 55));
		lblNewLabel_1.setBounds(117, 168, 262, 68);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Suites & Spa");
		lblNewLabel_2.setFont(new Font("adelline personal use only", Font.PLAIN, 40));
		lblNewLabel_2.setBounds(171, 246, 169, 61);
		panel_1.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setFont(new Font("Inter", Font.PLAIN, 20));
		textField.setBackground(Color.decode("#DEA650"));
		textField.setBounds(61, 363, 374, 41);
		panel_1.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Inter", Font.PLAIN, 20));
		passwordField.setBackground(Color.decode("#DEA650"));
		passwordField.setBounds(61, 454, 374, 41);
		panel_1.add(passwordField);
		
		JButton botonRegistro = new JButton("Registro");
		botonRegistro.setBackground(Color.decode("#DEA650"));
		botonRegistro.setFont(new Font("Inter", Font.BOLD, 32));
		botonRegistro.setBounds(148, 599, 221, 47);
		panel_1.add(botonRegistro);
		
		botonRegistro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Acción a realizar cuando se hace clic en el botón
                frame.dispose();
                
                // Mostrar la ventana de login
                Registro registroVentana = new Registro();
                registroVentana.setVisible(true);

            }
        });
		
		JButton botonIngresar = new JButton("Ingresar");
		botonIngresar.setBackground(Color.decode("#DEA650"));
		botonIngresar.setFont(new Font("Inter", Font.BOLD, 32));
		botonIngresar.setBounds(148, 542, 221, 47);
		panel_1.add(botonIngresar);
		
		JLabel lblNewLabel_3 = new JLabel("¿Olvidaste tu contraseña?");
		lblNewLabel_3.setForeground(new Color(0, 128, 255));
		lblNewLabel_3.setFont(new Font("Inter SemiBold", Font.PLAIN, 24));
		lblNewLabel_3.setBounds(97, 505, 310, 27);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("ID Empleado");
		lblNewLabel_4.setFont(new Font("Inter", Font.PLAIN, 24));
		lblNewLabel_4.setBounds(61, 317, 163, 36);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("Contraseña");
		lblNewLabel_4_1.setFont(new Font("Inter", Font.PLAIN, 24));
		lblNewLabel_4_1.setBounds(61, 414, 163, 36);
		panel_1.add(lblNewLabel_4_1);
	}

	public void setVisible(boolean visible) {
		frame.setVisible(visible);
		
	}
}
