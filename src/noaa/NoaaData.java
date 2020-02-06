/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noaa;

/**
 *
 * @author Frederick A. Aaron
 */
public class NoaaData
{
   private MetaData metadata;
   private Results results[];

   public MetaData getMetadata()
   {
      return metadata;
   }

   public void setMetadata(MetaData metadata)
   {
      this.metadata = metadata;
   }

   public Results[] getResults()
   {
      return results;
   }

   public void setResults(Results[] results)
   {
      this.results = results;
   }

}
