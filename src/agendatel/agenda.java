package agendatel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class agenda extends JFrame {
     numero datos[] = new numero[20];
    JPanel panelInicio = new JPanel();
    JTextField txtValor1 = new JTextField();
    JTextField txtValor2 = new JTextField();
    JTextField txtValor3 = new JTextField();
    JLabel lblResultado = new JLabel("guardar");
    int valor1 = 0;
    char simbolo = ' ';
    
    public agenda() {
        this.setVisible(true);
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
     public static boolean modificardato(int numerotel, numero arreglo[]) {

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] != null && arreglo[i].getNumerotel() == numerotel) {
                return true;
            }
        }
        return false;
    }

    public static String modificar(int numerotel, String nombre, String correo, numero arreglo[]) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] != null && arreglo[i].getNumerotel() == numerotel) {
                arreglo[i].setNombre(nombre);
                arreglo[i].setCorreo(correo);
                return "¡Se Actualizo Con Exito!";
            }

        }
        return "no se modifico";
    }
    
    public void insertarPanel() {
        this.getContentPane().add(panelInicio);
        panelInicio.setBackground(Color.white);
        panelInicio.setLayout(null);
    }
    
   public static String nuevo(int numerotel, String nombre, String correo, agenda[] arreglo) {
    boolean lleno = true; 
    for (int i = 0; i < arreglo.length; i++) {
        if (arreglo[i] == null) {
            arreglo[i] = new agenda(numerotel, nombre, correo);
            lleno = false; 
            break;
        } else if (arreglo[i].getNumerotel() == numerotel) {
            return " \n ¡NUMERO EXISTENTE!"; 
        }
    }

  
    if (!lleno) {
         JOptionPane.showMessageDialog(null, "se guardo con exito");
         return "";
    } else {
         JOptionPane.showMessageDialog(null, "espacio lleno");
         return "";
    }
}

    
    
    
    
    
     public static String buscar(int numerotel, numero arreglo[]) {
          for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] != null && arreglo[i].getNumerotel() == numerotel) {
                return "" + arreglo[i].getNombre() + " " + "correo : " + arreglo[i].getCorreo();
                
                
                    
                }  
        }
         JOptionPane.showMessageDialog(null, "contacto no existente");
        return "";
    }
    

    public void insertarEtiquetas() {
        JLabel lblValor1 = new JLabel("Telefono");
        lblValor1.setBounds(50, 40, 300, 20);
        panelInicio.add(lblValor1);
        JLabel lblValor2 = new JLabel("Nombre");
        lblValor2.setBounds(50, 90, 200, 15);
        panelInicio.add(lblValor2);
        JLabel lblValor3 = new JLabel("Correo");
        lblValor3.setBounds(50, 130, 200, 15);
        panelInicio.add(lblValor3);
    }

    public void insertarTexto() {
        txtValor1.setBounds(140, 40, 210, 30);
        panelInicio.add(txtValor1);
        txtValor1.repaint();
        
        txtValor2.setBounds(140, 80, 210, 30);
        panelInicio.add(txtValor2);
        txtValor2.repaint();
        
        txtValor3.setBounds(140, 120, 210, 30);
        panelInicio.add(txtValor3);
        txtValor3.repaint();
    }

    public void insertarBotones() {
        JButton btng = new JButton("guardar");
        btng.setBounds(370, 36, 130, 50);
        panelInicio.add(btng);
        btng.repaint();
        
        ActionListener agregarg = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
        //       System.out.println(nuevo(numerotel, nombre, correo, datos));
            }
        };
        btng.addActionListener(agregarg);
        
        
        
        
        
        
        JButton btnb = new JButton("buscar");
        btnb.setBounds(510, 36, 130, 50);
        panelInicio.add(btnb);
        btnb.repaint();
        
        ActionListener agregarb = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(buscar(numerotel, datos));
            }
        };
        btnb.addActionListener(agregarb);
        
        JButton btna = new JButton("actualizar");
        btna.setBounds(370, 100, 130, 50);
        panelInicio.add(btna);
        btna.repaint();
        
        ActionListener agregara = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
            }
        };
        btna.addActionListener(agregara);
        
        JButton btne = new JButton("eliminar");
        btne.setBounds(510, 100, 130, 50);
        panelInicio.add(btne);
        btne.repaint();
        
        ActionListener agregare = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String union = "";
                for (int i = 0; i < txtValor1.getText().length() - 100; i++) {
                    union = union + txtValor1.getText().charAt(i);
            }
                txtValor1.setText(union);
                        
                            
                        }
        };
        btne.addActionListener(agregare);
    }
    
     private int numerotel;
     private String nombre, correo;

    public agenda(int numerotel, String nombre, String correo) {
        this.numerotel = numerotel;
        this.nombre = nombre;
        this.correo = correo;
    }

    public int getNumerotel() {
        return numerotel;
    }

    public void setNumerotel(int numerotel) {
        this.numerotel = numerotel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
      
}
