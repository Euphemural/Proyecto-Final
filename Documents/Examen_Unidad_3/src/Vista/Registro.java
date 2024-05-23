package Vista;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class Registro {

    private JFrame frame;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Registro window = new Registro();
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
    public Registro() {
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
        panel.setLayout(null);

        JLabel Logo = new JLabel(new ImageIcon(Registro.class.getResource("/Vista/Imagenes/Logo del Hotel Red.png")));
        Logo.setSize(75, 72);
        Logo.setLocation(0, 0);
        panel.add(Logo);

        JLabel lblNewLabel = new JLabel("Hotel Lumia");
        lblNewLabel.setForeground(Color.decode("#DEA650"));
        lblNewLabel.setFont(new Font("Sansita", Font.PLAIN, 40));
        lblNewLabel.setBounds(82, 10, 190, 37);
        panel.add(lblNewLabel);

        JLabel lblNewLabel_2 = new JLabel("¡BIENVENIDO!");
        lblNewLabel_2.setForeground(new Color(255, 255, 255));
        lblNewLabel_2.setFont(new Font("Sansita", Font.PLAIN, 50));
        lblNewLabel_2.setBounds(417, 52, 263, 65);
        panel.add(lblNewLabel_2);

        JPanel panel_1 = new JPanel();
        panel_1.setBounds(256, 148, 593, 522);
        panel.add(panel_1);
        panel_1.setLayout(null);

        JLabel lblNewLabel_3 = new JLabel("Nuevo usuario");
        lblNewLabel_3.setForeground(Color.decode("#DEA650"));
        lblNewLabel_3.setFont(new Font("Inter", Font.PLAIN, 40));
        lblNewLabel_3.setBounds(163, 10, 273, 49);
        panel_1.add(lblNewLabel_3);

     // Campo de correo electrónico
        JTextField emailField = new JTextField();
        emailField.setText("Correo Electronico");
        emailField.setForeground(Color.LIGHT_GRAY);
        emailField.setBackground(new Color(204, 153, 0));
        emailField.setBounds(60, 124, 471, 36);
        emailField.setFont(new Font("Inter", Font.PLAIN, 25));
        panel_1.add(emailField);
        emailField.setColumns(10);

        emailField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                if (emailField.getText().equals("Correo Electronico")) {
                    emailField.setText("");
                    emailField.setForeground(Color.BLACK);
                }
            }

            public void focusLost(java.awt.event.FocusEvent evt) {
                if (emailField.getText().isEmpty()) {
                    emailField.setText("Correo Electronico");
                    emailField.setForeground(Color.LIGHT_GRAY);
                }
            }
        });

        //Campo del Nombre
        JTextField campoNombre = new JTextField();
        campoNombre.setText("Nombre(s)");
        campoNombre.setForeground(Color.LIGHT_GRAY);
        campoNombre.setBackground(new Color(204, 153, 0));
        campoNombre.setBounds(60, 190, 223, 36);
        campoNombre.setFont(new Font("Inter", Font.PLAIN, 25));
        panel_1.add(campoNombre);
        campoNombre.setColumns(10);
        
        campoNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                if (campoNombre.getText().equals("Nombre(s)")) {
                	campoNombre.setText("");
                	campoNombre.setForeground(Color.BLACK);
                }
            }

            public void focusLost(java.awt.event.FocusEvent evt) {
                if (campoNombre.getText().isEmpty()) {
                	campoNombre.setText("Nombre(s)");
                	campoNombre.setForeground(Color.LIGHT_GRAY);
                }
            }
        });

        //Campo del Apellido
        JTextField campoApellido = new JTextField();
        campoApellido.setText("Apellido(s)");
        campoApellido.setForeground(Color.LIGHT_GRAY);
        campoApellido.setBackground(new Color(204, 153, 0));
        campoApellido.setBounds(309, 190, 222, 36);
        campoApellido.setFont(new Font("Inter", Font.PLAIN, 25));
        panel_1.add(campoApellido);
        campoApellido.setColumns(10);
        
        campoApellido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                if (campoApellido.getText().equals("Apellido(s)")) {
                	campoApellido.setText("");
                	campoApellido.setForeground(Color.BLACK);
                }
            }

            public void focusLost(java.awt.event.FocusEvent evt) {
                if (campoApellido.getText().isEmpty()) {
                	campoApellido.setText("Apellido(s)");
                	campoApellido.setForeground(Color.LIGHT_GRAY);
                }
            }
        });

        // Campo de la fecha de nacimiento
        JLabel fechaNacimientoLabel = new JLabel("Fecha de nacimiento (D/M/A):");
        fechaNacimientoLabel.setFont(new Font("Inter", Font.PLAIN, 20));
        fechaNacimientoLabel.setBounds(60, 250, 300, 30);
        panel_1.add(fechaNacimientoLabel);

        String[] dias = new String[31];
        for (int i = 0; i < 31; i++) {
            dias[i] = String.valueOf(i + 1);
        }
        JComboBox<String> diaCombo = new JComboBox<>(dias);
        diaCombo.setBounds(60, 290, 70, 36);
        panel_1.add(diaCombo);

        String[] meses = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"};
        JComboBox<String> mesCombo = new JComboBox<>(meses);
        mesCombo.setBounds(140, 290, 70, 36);
        panel_1.add(mesCombo);

        String[] anos = new String[100];
        int year = 2024;
        for (int i = 0; i < 100; i++) {
            anos[i] = String.valueOf(year - i);
        }
        JComboBox<String> anoCombo = new JComboBox<>(anos);
        anoCombo.setBounds(220, 290, 90, 36);
        panel_1.add(anoCombo);

        //Imagen de lampara
        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setIcon(new ImageIcon(Registro.class.getResource("/Vista/Imagenes/Imagen de Lampara.png")));
        lblNewLabel_1.setBounds(728, 0, 411, 441);
        panel.add(lblNewLabel_1);
        
        //Campo del sexo
        String[] sexo = {"Masculino", "Femenino", "Prefiero no decirlo"};
        JComboBox<String> sexoCombo = new JComboBox<>(sexo);
        sexoCombo.setBounds(384, 290, 147, 36);
        panel_1.add(sexoCombo);
        
        JLabel lblSexo = new JLabel("Sexo:");
        lblSexo.setFont(new Font("Inter", Font.PLAIN, 20));
        lblSexo.setBounds(384, 250, 61, 30);
        panel_1.add(lblSexo);
        
        //Campo del telefono
        JTextField campoTelefono = new JTextField();
        campoTelefono.setText("Telefono");
        campoTelefono.setForeground(Color.LIGHT_GRAY);
        campoTelefono.setFont(new Font("Inter", Font.PLAIN, 25));
        campoTelefono.setColumns(10);
        campoTelefono.setBackground(new Color(204, 153, 0));
        campoTelefono.setBounds(60, 359, 223, 36);
        panel_1.add(campoTelefono);
        
        campoTelefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                if (campoTelefono.getText().equals("Telefono")) {
                	campoTelefono.setText("");
                	campoTelefono.setForeground(Color.BLACK);
                }
            }

            public void focusLost(java.awt.event.FocusEvent evt) {
                if (campoTelefono.getText().isEmpty()) {
                	campoTelefono.setText("Telefono");
                	campoTelefono.setForeground(Color.LIGHT_GRAY);
                }
            }
        });
        
        //Boton de Volver
        JButton botonVovler = new JButton("Volver");
        botonVovler.setForeground(Color.WHITE);
        botonVovler.setBackground(Color.RED);
        botonVovler.setBounds(60, 461, 105, 36);
        panel_1.add(botonVovler);
        
        botonVovler.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Acción a realizar cuando se hace clic en el botón
                frame.dispose();
                
                // Mostrar la ventana de login
                Login loginWindow = new Login();
                loginWindow.setVisible(true);

            }
        });
        
        //Boton para seguir
        JButton btnSiguiente = new JButton("Siguiente");
        btnSiguiente.setForeground(Color.WHITE);
        btnSiguiente.setBackground(Color.decode("#DEA650"));
        btnSiguiente.setBounds(426, 461, 105, 36);
        panel_1.add(btnSiguiente);

    }
    
	public void setVisible(boolean visible) {
		frame.setVisible(visible);
		
	}
}
