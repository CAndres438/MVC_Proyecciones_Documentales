package vista;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.sql.SQLException;
import java.util.*;
import controlador.ControladorRequerimientos;
import java.awt.Dimension;
import javax.swing.border.EmptyBorder;
import modelo.vo.TransmisionesModelo;
import modelo.vo.Requerimiento_1Vo; 
import modelo.vo.Requerimiento_2Vo; 
import modelo.vo.Nombres_alias;

public class VistaRequerimientos  extends JFrame implements ActionListener {
    public static final ControladorRequerimientos controlador = new ControladorRequerimientos();
    private JButton boton1,boton2,boton3,boton4;
    private JLabel label[] =new JLabel[3];
    private JLabel label_1, labe2;
    private JLabel labeltitulo, label1;
    private JTable tabla;
    private JScrollPane scrollPanel;
    private JTextField input[] = new  JTextField[4];
    private JTextField input_1, inputt;
    private JTextField input_2, inputtt;
    private JTextField input_3, inputttt;
    TransmisionesModelo obo = new TransmisionesModelo();
    Nombres_alias obi = new Nombres_alias();
    
    
    
   public VistaRequerimientos(){
    setLayout(null);
        labeltitulo=new JLabel("Te reto a programarlo SAS");
        labeltitulo.setFont(new Font ("araboto",Font.BOLD,20));
        labeltitulo.setForeground(new Color(229,9,127));
        labeltitulo.setBounds(230, 1, 550, 100);
        add(labeltitulo);
        label_1=new JLabel("Alias:");
        label_1.setBounds(20, 280, 550, 100);
        label_1.setFont(new Font ("araboto",Font.BOLD,9));
        label_1.setForeground(new Color(187,181,181));
        add(label_1);
        label_1=new JLabel("Nombre:");
        label_1.setBounds(150, 280, 550, 100);
        label_1.setFont(new Font ("araboto",Font.BOLD,9));
        label_1.setForeground(new Color(187,181,181));
        add(label_1);
        label_1=new JLabel("Apellido:");
        label_1.setBounds(295, 280, 550, 100);
        label_1.setFont(new Font ("araboto",Font.BOLD,9));
        label_1.setForeground(new Color(187,181,181));
        add(label_1); 
        boton1 = new JButton("Borrar") ;
        boton1.setBounds(480, 280, 80, 20);
        boton1.setFont(new Font ("araboto",Font.BOLD,9));
        boton1.setBackground(new Color(50,48,48));
        boton1.setForeground( new Color(229, 9, 127));
        add(boton1);
        boton1.addActionListener(this);
        boton2 = new JButton("Ver Trans");
        boton2.setBounds(580, 280, 80, 20);
        boton2.setFont(new Font ("araboto",Font.BOLD,9));
        boton2.setBackground(new Color(50,48,48));
        boton2.setForeground( new Color(229, 9, 127));
        add(boton2);
        boton2.addActionListener(this);
        boton3 = new JButton("Agr.Trans");
        boton3.setBounds(680, 280, 80, 20);
        boton3.setFont(new Font ("araboto",Font.BOLD,9));
        boton3.setBackground(new Color(50,48,48));
        boton3.setForeground( new Color(229, 9, 127));
        add(boton3); 
        boton3.addActionListener(this);   
        for (int i=0; i < 3 ;i++){
             label[i]=new JLabel();
             input[i]=new JTextField();
             input[i].setBounds(620, 140+i*40, 140, 20);
             input[i].setBorder(new EmptyBorder(0,5,0,2));
             input[i].setPreferredSize(new Dimension(100,20)); 
             input[i].setFont(new Font ("araboto",Font.BOLD,10));
             input[i].setBackground(new Color(50,48,48));
             input[i].setForeground(new Color(229, 9, 127));
            add(input[i]); }   
        boton4 = new JButton("Agr.Alias");
        boton4.setBounds(480, 320, 280, 20);
        boton4.setFont(new Font ("araboto",Font.BOLD,9));
        boton4.setBackground(new Color(50,48,48));
        boton4.setForeground( new Color(229, 9, 127));
        add(boton4);
        boton4.addActionListener(this);{
            input_1=new JTextField("");
            input_1.setBounds(45, 320, 100, 20);
            input_1.setBackground(new Color(50,48,48));
            input_1.setBorder(new EmptyBorder(0,5,0,2));
            input_1.setFont(new Font ("araboto",Font.BOLD,9));
            input_1.setForeground( new Color(229, 9, 127));
            add(input_1);
            input_2=new JTextField("");
            input_2.setBounds(190, 320, 100, 20);
            input_2.setBackground(new Color(50,48,48));
            input_2.setBorder(new EmptyBorder(0,5,0,2));
            input_2.setFont(new Font ("araboto",Font.BOLD,9));
            input_2.setForeground( new Color(229, 9, 127));
            add(input_2);
            input_3=new JTextField("");
            input_3.setBounds(335, 320, 100, 20);
            input_3.setBackground(new Color(50,48,48));
            input_3.setBorder(new EmptyBorder(0,5,0,2));
            input_3.setFont(new Font ("araboto",Font.BOLD,9));
            input_3.setForeground( new Color(229, 9, 127));
            add(input_3);}

        label[0].setText("Alias");
        label[1].setText("Título Documental");
        label[2].setText("Fecha de Transmisión");    
        for (int i=0; i < 3 ;i++){
            label[i].setBounds(480, 140+i*40, 150, 20);
            label[i].setFont(new Font ("araboto",Font.BOLD,10));
            label[i].setForeground(new Color(187,181,181));
            add(label[i]);
       }
       tabla= new JTable();
       scrollPanel= new JScrollPane();
       scrollPanel.setBounds(20, 110, 410, 190);
       scrollPanel.setViewportView(tabla);
       scrollPanel.setBackground(new Color(50,48,48));
       scrollPanel.setForeground(new Color(229,9,127));
       scrollPanel.setBorder(new EmptyBorder(0,5,0,2));
       tabla.setFont(new Font ("araboto",Font.BOLD,10));
       tabla.setForeground( new Color(229, 9, 127));
       tabla.setBackground(new Color(50,48,48));
       scrollPanel.setForeground(new Color(229,9,127));
       add(scrollPanel);



   }
@Override
public void actionPerformed(ActionEvent e) {
    if (e.getSource() == boton1){
   
        try {
     String s1 [] = new String[4];
     s1[0]= "Sobrenombre";
     s1[1]= "Título";
     s1[2]= "Transmisión";
     s1[3]= "Ususario_visualizador";

      ArrayList<Requerimiento_1Vo> r1= controlador.consultarRequerimiento1();
      String matriz[][] = new String [r1.size()][4];
            for(int i=0; i < r1.size();i++){
                       matriz[i][0]= (r1.get(i).getUsuAlias_fk()+"");
                       matriz[i][1]= (r1.get(i).getTitulo_fk());
                       matriz[i][2]= (r1.get(i).getTransFecha());  
                       matriz[i][3]= (r1.get(i).getUsuarioVisualizador()); 
                       }
    
       Modelo_tabla M1 = new Modelo_tabla(matriz,s1);
       tabla.setModel(M1);
      
                    } catch (Exception e1) {
                        System.out.println("Se ha producido el siguiente error:" + e1.getMessage());
                        e1.printStackTrace();
                    }
    }
    
    if (e.getSource() == boton2){
       try {
     String s1 [] = new String[4];
     s1[0]= "Sobrenombre";
     s1[1]= "Título";
     s1[2]= "Transmisión";
     s1[3]= "Ususario_visualizador";

     ArrayList<Requerimiento_2Vo> r2= controlador.consultarRequerimiento2();
     String matriz[][] = new String [r2.size()][4];
           for(int i=0; i < r2.size();i++){
                       matriz[i][0]= (r2.get(i).getUsuAlias_fk()+"");
                       matriz[i][1]= (r2.get(i).getTitulo_fk());
                       matriz[i][2]= (r2.get(i).getTransFecha());  
                       matriz[i][3]= (r2.get(i).getUsuarioVisualizador()); 
                       }
   
      Modelo_tabla M1 = new Modelo_tabla(matriz,s1);
      tabla.setModel(M1);
      
     
                   } catch (Exception e1) {
                       System.out.println("Se ha producido el siguiente error:" + e1.getMessage());
                       e1.printStackTrace();
                   }
        
   }
    if (e.getSource() == boton3){
  try {
    
    obo.setUsuAlias_fk(input[0].getText());
    obo.setTitulo_fk(input[1].getText());
    obo.setTransFecha(input[2].getText());
  
    try {
      
        controlador.consultartransmision(obo);
     } catch (SQLException e1) {
        e1.printStackTrace();
     }

   
  } catch (Exception e2) {
      JOptionPane.showMessageDialog(null, "Recuerde que ID_Transmision solo reciben numeros      Tambien revise que todos los campos esten llenos");
  }}
  
   if (e.getSource() == boton4){
 try {
    obi.setUsuAlias(input_1.getText());
    obi.setUsuNombre(input_2.getText());
    obi.setUsuApellido(input_3.getText());
   
    try {
      
        controlador.consultarusuario(obi);
     } catch (SQLException e1) {
       e1.printStackTrace();
     }

   
  } catch (Exception e2) {
     JOptionPane.showMessageDialog(null, "Ey!");
  }}}}


    


