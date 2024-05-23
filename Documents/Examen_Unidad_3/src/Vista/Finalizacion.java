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
import javax.swing.SwingConstants;

public class Finalizacion {

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
                	Finalizacion window = new Finalizacion();
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
    public Finalizacion() {
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
        
        JLabel lblNewLabel_4 = new JLabel("Sus datos se han registrado de forma exitosa y se ha generado su ID de empleado");
        lblNewLabel_4.setBounds(56, 79, 501, 76);
        panel_1.add(lblNewLabel_4);
        
        JLabel lblNewLabel_5 = new JLabel("Su gerente deberia de entregarle su identificacion en breve. En caso de no hacerlo, favor de contactar a la gerencia.");
        lblNewLabel_5.setBounds(56, 344, 469, 95);
        panel_1.add(lblNewLabel_5);

        String[] dias = new String[31];
        for (int i = 0; i < 31; i++) {
            dias[i] = String.valueOf(i + 1);
        }

        String[] meses = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"};

        String[] anos = new String[100];
        int year = 2024;
        for (int i = 0; i < 100; i++) {
            anos[i] = String.valueOf(year - i);
        }

        //Imagen de lampara
        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setIcon(new ImageIcon(Registro.class.getResource("/Vista/Imagenes/Imagen de Lampara.png")));
        lblNewLabel_1.setBounds(728, 0, 411, 441);
        panel.add(lblNewLabel_1);
        
        //Campo del sexo
        String[] sexo = {"Masculino", "Femenino", "Prefiero no decirlo"};

    }
    
	public void setVisible(boolean visible) {
		frame.setVisible(visible);
		
	}
}

