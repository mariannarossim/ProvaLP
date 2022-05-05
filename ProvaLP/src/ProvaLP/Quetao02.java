package ProvaLP;																																																																																																				// ASS	EUGENIO ALVES

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Quetao02 extends JFrame {

	private JPanel contentPane;
	private JTextField vids;
	private JTextField vclasses;
	private JTextField vtags;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Quetao02 frame = new Quetao02();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Quetao02() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 518, 355);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		vids = new JTextField();
		vids.setBounds(215, 53, 86, 20);
		contentPane.add(vids);
		vids.setColumns(10);
		
		vclasses = new JTextField();
		vclasses.setBounds(215, 91, 86, 20);
		contentPane.add(vclasses);
		vclasses.setColumns(10);
		
		vtags = new JTextField();
		vtags.setColumns(10);
		vtags.setBounds(215, 134, 86, 20);
		contentPane.add(vtags);
		
		JLabel lblNewLabel = new JLabel("Qtde de Seletores IDs ");
		lblNewLabel.setBounds(45, 44, 140, 38);
		contentPane.add(lblNewLabel);
		
		JLabel lblQtdeDeSeletores = new JLabel("Qtde de Seletores Classes");
		lblQtdeDeSeletores.setBounds(45, 82, 195, 38);
		contentPane.add(lblQtdeDeSeletores);
		
		JLabel lblQtdeDeSeletores_1 = new JLabel("Qtde de Seletores Tags ");
		lblQtdeDeSeletores_1.setBounds(45, 120, 140, 49);
		contentPane.add(lblQtdeDeSeletores_1);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.BLUE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int valor_ids;
				int valor_classes;
				int valor_tags;
				
				int total_ids;
				int total_classes;
				int total_tags;
				int total_pontos;
				
				valor_ids = Integer.parseInt(vids.getText());
				valor_classes = Integer.parseInt(vclasses.getText());
				valor_tags = Integer.parseInt(vtags.getText());
				
				total_ids = valor_ids * 100;
				
				total_classes = valor_classes * 10;
				
				total_tags = valor_tags * 1;
				
				total_pontos = total_ids + total_classes + total_tags;
				
				
				JOptionPane.showMessageDialog(null, String.format("A quantidade total de pontos é: %d" + total_pontos + "\n Ids = " + total_ids +
						", Classes = " + total_classes + ", Tags = %d" , total_tags ,JOptionPane.INFORMATION_MESSAGE));
	
				
			}
		});
		btnNewButton.setBounds(204, 197, 105, 23);
		contentPane.add(btnNewButton);
	}
}
