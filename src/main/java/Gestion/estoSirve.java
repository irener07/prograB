/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion;

import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JList;

/**
 *
 * @author win8
 */
public class estoSirve {
    private Icon cargarImagen(String url) throws IOException{
        Image imagen;
        imagen=ImageIO.read(new URL(url));
        imagen=imagen.getScaledInstance(35,35,Image.SCALE_FAST);
        ImageIcon imgIcon=new ImageIcon(imagen);
        Icon iconImage=(Icon)imgIcon;
        return iconImage;
    }
    if (!"  ".equals(nombre_libreria.getSelectedItem().toString()) && nombre_libro.getText().equals("") && tema.getSelectedItem().toString().equals("   ") && pmenor.getText().equals("") && pmayor.getText().equals("")){
                //Envia al current  de la lista de big_mama al segundo noto de la listaa
                A_big_mama.lista_big_mama.goToStart();
                A_big_mama.lista_big_mama.current = A_big_mama.lista_big_mama.current.getNext();
                
                //Recorre la lista big mama
                while (A_big_mama.lista_big_mama.current != null){
                    //Busca la libreria correspondiente
                    if (A_big_mama.lista_big_mama.current.getElement().nombre.equals(nombre_libreria.getSelectedItem().toString())){
                        //Envia el current de la lista de libros al segundo nodo
                        A_big_mama.lista_big_mama.current.getElement().libros.goToStart();
                        A_big_mama.lista_big_mama.current.getElement().libros.current = A_big_mama.lista_big_mama.current.getElement().libros.current.getNext();

                        //Recorre la lista de libros
                        while (A_big_mama.lista_big_mama.current.getElement().libros.current != null){
                            if (A_big_mama.lista_big_mama.current.getElement().libros.current.getElement().cantidad_disponible >0){
                                
                                String Datos = A_big_mama.lista_big_mama.current.getElement().libros.current.getElement().identificador;
                                String Datos1 = A_big_mama.lista_big_mama.current.getElement().libros.current.getElement().nombre;
                                String Datos2 = A_big_mama.lista_big_mama.current.getElement().libros.current.getElement().tema;

                                modelo.addRow(O);
                                modelo.setValueAt(Datos, contador, 0);
                                modelo.setValueAt(Datos1, contador, 1);
                                modelo.setValueAt(Datos2, contador, 2);
                                modelo.setValueAt(btn1, contador, 3);
                                modelo.setValueAt(btn2, contador, 4);

                                contador =  contador + 1;
                            }
                
                            A_big_mama.lista_big_mama.current.getElement().libros.current = A_big_mama.lista_big_mama.current.getElement().libros.current.getNext();
                        } 
                    }
                
                    A_big_mama.lista_big_mama.current = A_big_mama.lista_big_mama.current.getNext();
                }
                
    import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendEmail {

	public static void main(String[] args) {

		final String username = "holaprofeporfapasenos@gmail.com";
		final String password = "cartaguitocampeon";

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props,
		  new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		  });

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("no-reply@gmail.com"));
			message.setRecipients(Message.RecipientType.TO,
				InternetAddress.parse("luisga.dittel@gmail.com"));
			message.setSubject("Testing Subject");
			message.setText("Dear Mail Crawler,"
				+ "\n\n No spam to my email, please!");

			Transport.send(message);

			System.out.println("Done");

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}
                
}
//Código de cargar imagenes en un label desde el archivo

int resultado;


CargarFoto ventana = new CargarFoto();

FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPG y PNG","jpg","png");

ventana.jfchCargarfoto.setFileFilter(filtro);

resultado= ventana.jfchCargarfoto.showOpenDialog(null);


if (JFileChooser.APPROVE_OPTION == resultado){


        fichero = ventana.jfchCargarfoto.getSelectedFile();

        try{

               ImageIcon icon = new ImageIcon(fichero.toString());

Icon icono = new ImageIcon(icon.getImage().getScaledInstance(lblFoto.getWidth(), lblFoto.getHeight(), Image.SCALE_DEFAULT));

lblFoto.setText(null);
               
               lblFoto.setIcon( icono );


        }catch(Exception ex){

           
JOptionPane.showMessageDialog(null, "Error abriendo la                   imagen "+ ex);
                 
        }
    private void cargarJList(ArrayList<String> arrayList, JList jlist){
        DefaultListModel listModel = new DefaultListModel();
        for(int i=0; i<arrayList.size(); i++) {
            listModel.add(i, arrayList.get(i));
        }
        jlist.setModel(listModel);
    }
    private void seleccionarItemList(){
        String itemSelecionado=(String)this.jListResultados.getSelectedValue();
        this.jTextDireccion.setText(itemSelecionado);
    }
    
 }
