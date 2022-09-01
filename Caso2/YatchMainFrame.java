import java.awt.Color;
//import java.awt.Graphics;
//import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class YatchMainFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private MainThread controller;
	private JLabel cont;
	private JLabel BateriasCarga;
	private JLabel PanelesEfi;
	private JLabel PanelesCPS;
	private JLabel yateSpd;
	private JLabel yateIt;
	
	
	public YatchMainFrame(String pTitle, MainThread pController) {
		super(pTitle);
		controller = pController; // frame ve al controller
		controller.setWindow(this); // controller ve al frame

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setBounds(0, 0, 1080, 780);
		this.setLocationRelativeTo(null);
		this.setLayout(null); // this allows this frame to locate the components with freedom in the screen
		this.setBackground(Color.white);
		this.initComponents();
		
		this.setVisible(true);		
	}

	public void setCountHour(int hour) {
		cont.setText(hour + "");
	}
	public void setBateriasCarga(float charge) {
		BateriasCarga.setText(charge + "Kw");
	}
	public void setPanelesEfi(float effec) {
		PanelesEfi.setText(effec * 100 + "%");
	}
	public void setPanelesCPS(float CPS) {
		PanelesCPS.setText(CPS + "Kw/h");
	}
	public void setyateSpd(float speed) {
		yateSpd.setText(speed + " Nudos");
	}
	public void setyateIt(float intake) {
		yateIt.setText(intake * Constants.YATCHINTAKE + " Kw/h");
	}
	
    private void initComponents() {
    	
    	JLabel Hora = new JLabel("Hora actual:");
    	Hora.setBounds(10, 20, 160, 10);
    	this.add(Hora);
    	
    	cont = new JLabel();
    	cont.setBounds(80, 20, 160, 10);
    	this.add(cont);
    	
    	
    	JLabel BateriasColumnTXT = new JLabel("Informacion de las Baterias: ");
    	BateriasColumnTXT.setBounds(10, 40, 160, 15);
    	this.add(BateriasColumnTXT);
    	
    	JLabel BateriasCantTXT = new JLabel("Cantidad: " + Constants.BATQUANTITY);
    	BateriasCantTXT.setBounds(10, 60, 160, 15);
    	this.add(BateriasCantTXT);

    	
    	JLabel BateriasCargaTXT = new JLabel("Carga: ");
    	BateriasCargaTXT.setBounds(10, 75, 160, 15);
    	this.add(BateriasCargaTXT);
    	
    	BateriasCarga = new JLabel();
    	BateriasCarga.setBounds(60, 75, 160, 15);
    	this.add(BateriasCarga);
    	

    	JLabel BateriasCapTXT = new JLabel("Capacidad: " + Constants.BATCAPACITY * Constants.BATQUANTITY);
    	BateriasCapTXT.setBounds(10, 90, 160, 15);
    	this.add(BateriasCapTXT);
    	
    	
    	
    	JLabel PanelesColumnTXT = new JLabel("Informacion de los Paneles: ");
    	PanelesColumnTXT.setBounds(10, 130, 160, 15);
    	this.add(PanelesColumnTXT);
   
    	JLabel PanelesCantTXT = new JLabel("Cantidad: " + Constants.PANQUANTITY);
    	PanelesCantTXT.setBounds(10, 145, 160, 15);
    	this.add(PanelesCantTXT);
    	
    	
    	
    	JLabel PanelesEfiTXT = new JLabel("Eficiencia: ");
    	PanelesEfiTXT.setBounds(10, 160, 160, 15);
    	this.add(PanelesEfiTXT);
    	
    	PanelesEfi = new JLabel();
    	PanelesEfi.setBounds(80, 160, 160, 15);
    	this.add(PanelesEfi);
    	
    	JLabel PanelesCPSTXT = new JLabel("Entrada: ");
    	PanelesCPSTXT.setBounds(10, 175, 160, 15);
    	this.add(PanelesCPSTXT);
    	
    	PanelesCPS = new JLabel();
    	PanelesCPS.setBounds(60, 175, 160, 15);
    	this.add(PanelesCPS);
    	
    	JLabel yateTXT = new JLabel("Informacion del Yate: ");
    	yateTXT.setBounds(10, 220, 160, 15);
    	this.add(yateTXT);

    	
    	JLabel yateSpdTXT = new JLabel("Velocidad: ");
    	yateSpdTXT.setBounds(10, 235, 160, 15);
    	this.add(yateSpdTXT);
    
    	yateSpd = new JLabel();
    	yateSpd.setBounds(70, 235, 160, 15);
    	this.add(yateSpd);
    	
    	
    	JLabel yateItTXT = new JLabel("Consumo: ");
    	yateItTXT.setBounds(10, 250, 160, 15);
    	this.add(yateItTXT);
    	
    	yateIt = new JLabel();
    	yateIt.setBounds(70, 250, 160, 15);
    	this.add(yateIt);
    	
    	
    	JButton btnStart = new JButton("Next Hour");  
    	btnStart.setBounds(10, 290, 160, 15);
    	btnStart.addActionListener(new ActionListener(){  
    		public void actionPerformed(ActionEvent e){  
    			controller.NextHour();
    		}  
    	});
    	this.add(btnStart);
    	
    }
}
