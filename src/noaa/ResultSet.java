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
public class ResultSet
{
   private String offset;
   private String count;
   private String limit;

   public String getOffset()
   {
      return offset;
   }

   public void setOffset(String offset)
   {
      this.offset = offset;
   }

   public String getCount()
   {
      return count;
   }

   public void setCount(String count)
   {
      this.count = count;
   }

   public String getLimit()
   {
      return limit;
   }

   public void setLimit(String limit)
   {
      this.limit = limit;
   }
   
}
