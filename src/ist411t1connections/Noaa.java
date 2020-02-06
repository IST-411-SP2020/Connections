package ist411t1connections;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


 /**
 *
 * @author Ryan Urbanski, Albana Beqo, James Bristow II, Logan Pratt, Fred Aaron
 */

public class Noaa
{
   public Noaa(){
      String accessToken = "DiQSujhXdqsBIqtaBhHhRGvpINuEcnhq";
      Gson gson = new Gson();
      String response;
      int size;

      try
      {
         URL url = new URL("https://www.ncdc.noaa.gov/cdo-web/api/v2/datasets");
         HttpURLConnection connection = null;

         connection = (HttpURLConnection) url.openConnection();
         // Add Access Token to the Header
         connection.setRequestProperty("token", accessToken);

         BufferedReader br = new BufferedReader(
                 new InputStreamReader(connection.getInputStream()));
         response = br.readLine();

         // Parse Data into Noaa Object
         NoaaData noaa = gson.fromJson(response, NoaaData.class);

         // Print original Data from the API
         System.out.println("Original JSON Data.");
         System.out.println(response + "\n");

         // Print out data from the Noaa Objects
         System.out.println("Result Set");
         System.out.println("----------");
         System.out.printf("Count  %10s\n", noaa.getMetadata().getResultset().getCount());
         
         System.out.printf("Offset %10s\n", noaa.getMetadata().getResultset().getOffset());
         System.out.printf("limit  %10s\n", noaa.getMetadata().getResultset().getLimit());

         // Print data from array in Noaa Object
         size = noaa.getResults().length;
         for (int i = 0; i < size; i++)
         {
            System.out.println("Item " + i);
            System.out.println("--------");
            System.out.printf("Uid            %1s\n", noaa.getResults()[i].getUid());
            System.out.printf("Min Date       %1s\n", noaa.getResults()[i].getMindate());
            System.out.printf("Max Date       %1s\n", noaa.getResults()[i].getMaxdate());
            System.out.printf("name           %1s\n", noaa.getResults()[i].getName());
            System.out.printf("Data Coverage  %1s\n", noaa.getResults()[i].getDatacoverage());
            System.out.printf("ID             %1s\n", noaa.getResults()[i].getId());
            System.out.println();
         }
      } catch (IOException ex)
      {
         System.out.println(ex);
      }finally
      {
      }
   }
   
}
