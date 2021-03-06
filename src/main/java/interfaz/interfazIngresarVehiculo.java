/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;
import Conexiones.Procedimientos;
import Estructuras.nodo;
import Gestion.gestionVehiculo;
import static interfaz.interfazServMant.res;
import java.awt.Image;
import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author win8
 */
public class interfazIngresarVehiculo extends javax.swing.JFrame {
    static File fotito;
    String filename = null;
    static ResultSet res;
    int cont; 
    
    public interfazIngresarVehiculo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        label1 = new javax.swing.JLabel();
        entradaPlaca = new javax.swing.JTextField();
        placa = new javax.swing.JLabel();
        costoDía = new javax.swing.JLabel();
        año = new javax.swing.JLabel();
        kilometraje = new javax.swing.JLabel();
        estilo = new javax.swing.JLabel();
        vin = new javax.swing.JLabel();
        puertas = new javax.swing.JLabel();
        mpg = new javax.swing.JLabel();
        transmisión = new javax.swing.JLabel();
        Fotolbl = new javax.swing.JLabel();
        marca = new javax.swing.JLabel();
        color = new javax.swing.JLabel();
        capacidad = new javax.swing.JLabel();
        maletas = new javax.swing.JLabel();
        entradaCosto = new javax.swing.JTextField();
        entradaAño = new javax.swing.JTextField();
        entradaKilometraje = new javax.swing.JTextField();
        entradaEstilo = new javax.swing.JComboBox<>();
        entradaVIN = new javax.swing.JTextField();
        entradaPuertas = new javax.swing.JTextField();
        entradaMPG = new javax.swing.JTextField();
        entradaCapacidad = new javax.swing.JTextField();
        foto = new javax.swing.JLabel();
        cargarFoto = new javax.swing.JButton();
        entradaMaletas = new javax.swing.JTextField();
        entradaMarca = new javax.swing.JComboBox<>();
        entradaColor = new javax.swing.JComboBox<>();
        entradaTransmision = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        entradaSede = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        txtruta = new javax.swing.JTextField();
        maletas1 = new javax.swing.JLabel();
        entradaEstado = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 153));
        setForeground(new java.awt.Color(0, 102, 153));

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));

        label1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("Registro de Vehiculos");

        placa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        placa.setForeground(new java.awt.Color(255, 255, 255));
        placa.setText("Placa:");

        costoDía.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        costoDía.setForeground(new java.awt.Color(255, 255, 255));
        costoDía.setText("Costo por día:");

        año.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        año.setForeground(new java.awt.Color(255, 255, 255));
        año.setText("Año:");

        kilometraje.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        kilometraje.setForeground(new java.awt.Color(255, 255, 255));
        kilometraje.setText("Kilometraje:");

        estilo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        estilo.setForeground(new java.awt.Color(255, 255, 255));
        estilo.setText("Estilo:");

        vin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        vin.setForeground(new java.awt.Color(255, 255, 255));
        vin.setText("Número de VIN:");

        puertas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        puertas.setForeground(new java.awt.Color(255, 255, 255));
        puertas.setText("Número puertas:");

        mpg.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mpg.setForeground(new java.awt.Color(255, 255, 255));
        mpg.setText("MPG:");

        transmisión.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        transmisión.setForeground(new java.awt.Color(255, 255, 255));
        transmisión.setText("Tipo de Transmisión:");

        Fotolbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Fotolbl.setForeground(new java.awt.Color(255, 255, 255));
        Fotolbl.setText("Foto:");

        marca.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        marca.setForeground(new java.awt.Color(255, 255, 255));
        marca.setText("Marca:");

        color.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        color.setForeground(new java.awt.Color(255, 255, 255));
        color.setText("Color:");

        capacidad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        capacidad.setForeground(new java.awt.Color(255, 255, 255));
        capacidad.setText("Capacidad:");

        maletas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        maletas.setForeground(new java.awt.Color(255, 255, 255));
        maletas.setText("Cantidad de Maletas:");

        entradaEstilo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        foto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cargarFoto.setText("Cargar imagen");
        cargarFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarFotoActionPerformed(evt);
            }
        });

        entradaMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        entradaColor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        entradaTransmision.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sede:");

        entradaSede.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        maletas1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        maletas1.setForeground(new java.awt.Color(255, 255, 255));
        maletas1.setText("Estado:");

        entradaEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(placa)
                                            .addComponent(costoDía)
                                            .addComponent(año)
                                            .addComponent(kilometraje)
                                            .addComponent(estilo))
                                        .addGap(21, 21, 21)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(entradaCosto)
                                            .addComponent(entradaPlaca)
                                            .addComponent(entradaAño)
                                            .addComponent(entradaKilometraje)
                                            .addComponent(entradaEstilo, 0, 122, Short.MAX_VALUE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(mpg)
                                        .addGap(86, 86, 86)
                                        .addComponent(entradaMPG, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(vin)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(entradaVIN, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(puertas)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(entradaPuertas, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(label1)))
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(67, 67, 67)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Fotolbl)
                        .addGap(18, 18, 18)
                        .addComponent(cargarFoto)
                        .addGap(18, 18, 18)
                        .addComponent(txtruta, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(transmisión)
                            .addComponent(marca)
                            .addComponent(color)
                            .addComponent(capacidad)
                            .addComponent(maletas)
                            .addComponent(jLabel1)
                            .addComponent(maletas1))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(entradaCapacidad)
                            .addComponent(entradaMaletas)
                            .addComponent(entradaMarca, 0, 118, Short.MAX_VALUE)
                            .addComponent(entradaColor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(entradaTransmision, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(entradaSede, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(entradaEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label1)
                    .addComponent(jLabel1)
                    .addComponent(entradaSede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entradaPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(placa)
                    .addComponent(transmisión)
                    .addComponent(entradaTransmision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(costoDía)
                    .addComponent(marca)
                    .addComponent(entradaCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entradaMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(año)
                    .addComponent(color)
                    .addComponent(entradaAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entradaColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kilometraje)
                    .addComponent(capacidad)
                    .addComponent(entradaKilometraje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entradaCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(maletas)
                            .addComponent(entradaMaletas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(entradaEstilo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(estilo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(vin)
                            .addComponent(entradaVIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(puertas, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(entradaPuertas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mpg)
                            .addComponent(entradaMPG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(jButton1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(maletas1)
                            .addComponent(entradaEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Fotolbl)
                            .addComponent(cargarFoto)
                            .addComponent(txtruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
//        gestionVehiculo gestion = new gestionVehiculo();
//            int copiaPlaca = Integer.parseInt(interfazIngresarVehiculo.entradaPlaca.getText());
//            int copiaCosto = Integer.parseInt(interfazIngresarVehiculo.entradaCosto.getText());
//            int copiaAño = Integer.parseInt(interfazIngresarVehiculo.entradaAño.getText());
//            int copiaKilometraje = Integer.parseInt(interfazIngresarVehiculo.entradaKilometraje.getText());
//            int copiaEstado = 1;
//            int copiaEstilo = Integer.parseInt(interfazIngresarVehiculo.entradaEstilo.getSelectedItem().toString());
//            String copiaVIN =interfazIngresarVehiculo.entradaVIN.getText();
//            int copiaPuertas = Integer.parseInt(interfazIngresarVehiculo.entradaPuertas.getText());
//            int copiaMPG = Integer.parseInt(interfazIngresarVehiculo.entradaMPG.getText());
//            int copiaTransmision = Integer.parseInt(interfazIngresarVehiculo.entradaTransmision.getSelectedItem().toString());
//            int copiaMarca = Integer.parseInt(interfazIngresarVehiculo.entradaMarca.getSelectedItem().toString());
//            int copiaColor = Integer.parseInt(interfazIngresarVehiculo.entradaColor.getSelectedItem().toString());
//            int copiaCapacidad = Integer.parseInt(interfazIngresarVehiculo.entradaCapacidad.getText());
//            int copiaMaletas = Integer.parseInt(interfazIngresarVehiculo.entradaMaletas.getText());
//            int copiaSede = Integer.parseInt(interfazIngresarVehiculo.entradaSede.getSelectedItem().toString());
//            File copiaFoto = fotito;
//            gestion.ingresarVehiculo(copiaPlaca, copiaMaletas, copiaAño, copiaPuertas, copiaMPG, copiaCosto, copiaVIN, copiaKilometraje, copiaPuertas, copiaTransmision, copiaFoto, copiaColor, copiaMarca, copiaEstado, copiaEstilo, copiaSede);
//            
//            private byte[] foto;
//placa vin costo año capacidad puertas maletas mpg kilo foto transmi color marca estado estilo sede 
        if(entradaPlaca.getText().isEmpty()||entradaCosto.getText().isEmpty()||entradaKilometraje.getText().isEmpty()||entradaVIN.getText().isEmpty()||entradaPuertas.getText().isEmpty()
                || entradaMPG.getText().isEmpty()||entradaCapacidad.getText().isEmpty()||entradaMaletas.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Ingrese todos los datos","Información",JOptionPane.INFORMATION_MESSAGE);            
        }else{
            res = Conexiones.Conexion.consulta("Select COUNT(placa)from esquema.Vehiculo where placa='"+entradaPlaca.getText()+"'");
            try{
                while(res.next()){
                    cont= res.getInt(1);
                }
            }catch(SQLException e){
            }
            if(cont>=1){
                JOptionPane.showMessageDialog(this, "Este elemento ya existe","Informacion",JOptionPane.INFORMATION_MESSAGE);
            }else{
                System.out.println("Llega aca");
                try {
                    Procedimientos.ingresoVehiculo(entradaPlaca.getText(),entradaVIN.getText(),entradaCosto.getText(),entradaAño.getText(),entradaCapacidad.getText(),entradaPuertas.getText(),
                            entradaMaletas.getText(),entradaMPG.getText(),entradaKilometraje.getText(),filename,entradaTransmision.getSelectedItem().toString(),entradaColor.getSelectedItem().toString(),
                            entradaMarca.getSelectedItem().toString(),entradaEstado.getSelectedItem().toString(),entradaEstilo.getSelectedItem().toString(),entradaSede.getSelectedItem().toString());
                } catch (SQLException e) {
                }
                JOptionPane.showMessageDialog(this, "Los datos han sido guardados correctamente");
            }
        }        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cargarFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarFotoActionPerformed
        // TODO add your handling code here:
//        int resultado;
//        cargarImagen buscador = new cargarImagen();
//        //Filtros
//        FileNameExtensionFilter formato = new FileNameExtensionFilter("Images","jpn","png","gif","bmp");
//        cargarImagen.jFileChooser3.setFileFilter(formato);
//        
//        resultado = cargarImagen.jFileChooser3.showOpenDialog(null);
//        if (JFileChooser.APPROVE_OPTION == resultado){
//            fotito = cargarImagen.jFileChooser3.getSelectedFile();
//            
//            try{
//                ImageIcon ImgIcon = new ImageIcon(fotito.toString());
//                
//                Icon icono = new ImageIcon(ImgIcon.getImage().getScaledInstance(foto.getWidth(), foto.getHeight(), Image.SCALE_DEFAULT));
//            
//                foto.setIcon(icono);
//            }catch (Exception ex){
//                JOptionPane.showMessageDialog(null, "Error al abrir:  "+ ex);
//            }
//            
//            
//        }
        JFileChooser elegida = new  JFileChooser();
        FileNameExtensionFilter fil = new FileNameExtensionFilter("JPG, PNG & GIF","jpg","png");
        elegida.setFileFilter(fil);
        elegida.showOpenDialog(null);
        File f = elegida.getSelectedFile();
        filename = f.getAbsolutePath();
        txtruta.setText(filename);
        System.out.println(filename);
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(foto.getWidth(),foto.getHeight(),Image.SCALE_SMOOTH));
        foto.setIcon(imageIcon);
        
    }//GEN-LAST:event_cargarFotoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fotolbl;
    private javax.swing.JLabel año;
    private javax.swing.JLabel capacidad;
    private javax.swing.JButton cargarFoto;
    private javax.swing.JLabel color;
    private javax.swing.JLabel costoDía;
    public static javax.swing.JTextField entradaAño;
    public static javax.swing.JTextField entradaCapacidad;
    public static javax.swing.JComboBox<String> entradaColor;
    public static javax.swing.JTextField entradaCosto;
    private javax.swing.JComboBox<String> entradaEstado;
    public static javax.swing.JComboBox<String> entradaEstilo;
    public static javax.swing.JTextField entradaKilometraje;
    public static javax.swing.JTextField entradaMPG;
    public static javax.swing.JTextField entradaMaletas;
    public static javax.swing.JComboBox<String> entradaMarca;
    public static javax.swing.JTextField entradaPlaca;
    public static javax.swing.JTextField entradaPuertas;
    private static javax.swing.JComboBox<String> entradaSede;
    public static javax.swing.JComboBox<String> entradaTransmision;
    public static javax.swing.JTextField entradaVIN;
    private javax.swing.JLabel estilo;
    public static javax.swing.JLabel foto;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel kilometraje;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel maletas;
    private javax.swing.JLabel maletas1;
    private javax.swing.JLabel marca;
    private javax.swing.JLabel mpg;
    private javax.swing.JLabel placa;
    private javax.swing.JLabel puertas;
    private javax.swing.JLabel transmisión;
    private javax.swing.JTextField txtruta;
    private javax.swing.JLabel vin;
    // End of variables declaration//GEN-END:variables
}
