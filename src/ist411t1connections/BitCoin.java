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

/**
 *
 * @author Ryan Urbanski, Albana Beqo, James Bristow II, Logan Pratt, Fred Aaron
 * reviewed by Albana 
 */
public class BitCoin
{

   /**
    */
   public BitCoin()
   {
      Gson gson = new Gson();
      HttpURLConnection connection = null;
      String response;
      int size;

      try
      {
         URL url = new URL("https://api.bitcoincharts.com/v1/markets.json");
         connection = (HttpURLConnection) url.openConnection();
         connection.connect();
         BufferedReader br = new BufferedReader(
                 new InputStreamReader(connection.getInputStream()));

         //BitCoin does not name its array append a name to the beginning of the data
         response = "{\"bitcoin\":";
         response += (br.readLine());
         response += "}";
         
         // Print the original data received from the API
         System.out.println("Original JSON data.");
         System.out.println(response + "\n");

         // Parse the data into Bitcoin Object
         BitCoinData data = gson.fromJson(response, BitCoinData.class);

         // Print values of each array element
         size = data.getBitcoin().length;
         for (int i = 0; i < size; i++)
         {
            System.out.println("Item " + i);
            System.out.println("------");
            System.out.printf("Currency          %1s\n", data.getBitcoin()[i].getCurrency());
            System.out.printf("Latest Trade      %1s\n", data.getBitcoin()[i].getLatest_trade());
            System.out.printf("Weighted Price    %1s\n", data.getBitcoin()[i].getLatest_trade());
            System.out.printf("Bid               %1s\n", data.getBitcoin()[i].getBid());
            System.out.printf("High              %1s\n", data.getBitcoin()[i].getHigh());
            System.out.printf("Ask               %1s\n", data.getBitcoin()[i].getAsk());
            System.out.printf("Low               %1s\n", data.getBitcoin()[i].getLow());
            System.out.printf("Close             %1s\n", data.getBitcoin()[i].getClose());
            System.out.printf("Avg               %1s\n", data.getBitcoin()[i].getAvg());
            System.out.printf("Symbol            %1s\n", data.getBitcoin()[i].getSymbol());
            System.out.printf("Duration          %1s\n", data.getBitcoin()[i].getDuration());
            System.out.printf("Currency Volume   %1s\n", data.getBitcoin()[i].getCurrency_volume());
            System.out.printf("Volume            %1s\n", data.getBitcoin()[i].getVolume());
            System.out.println();
         }

         System.out.println(data.toString());
      } catch (MalformedURLException ex)
      {
         System.out.println(ex);
         Logger.getLogger(BitcoinFields.class.getName()).log(Level.SEVERE, null, ex);
      } catch (IOException ex)
      {
         System.out.println(ex);
         Logger.getLogger(BitcoinFields.class.getName()).log(Level.SEVERE, null, ex);
      } finally
      {
         connection.disconnect();
      }
   }

}
