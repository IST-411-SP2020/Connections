/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ist411t1connections;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 *
 * @author loganpratt
 */
public class Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gson gson  = new Gson();
        HttpURLConnection connection = null;
        
        try {
            URL url = new URL("https://api.bitcoincharts.com/v1/markets.json");//"//https://www.ncdc.noaa.gov/cdo-web/api/v2/datasets?Auth");
            //String accessToken = "bcmSfMEsrTedUuwYATBRFMHKgjcWJfil";
            connection = (HttpURLConnection) url.openConnection();
            //connection.setRequestProperty("Authorization", "Bearer " + accessToken);
            connection.connect();
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(connection.getInputStream()));
            System.out.println(br.readLine());
                
        } catch (MalformedURLException ex) {
            Logger.getLogger(Lab3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Lab3.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            connection.disconnect();
        }
    }
    
}
