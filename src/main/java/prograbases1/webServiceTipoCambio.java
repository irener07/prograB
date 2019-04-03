/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prograbases1;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
/**
 *
 * @author
 */
public class webServiceTipoCambio {

    public static void main(String[] args) throws IOException {

        try {
            Document doc = Jsoup.connect("http://indicadoreseconomicos.bccr.fi.cr/indicadoreseconomicos/cuadros/frmvercatcuadro.aspx?CodCuadro=400").userAgent("googleChrome/73.0.3683.86").get();
            Elements temp = doc.select("div.celda400");

            int i = 0;

            for (Element celda400 : temp) {
                i++;
                System.out.println(i + " " + celda400.getElementsByTag("a").first().text());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
