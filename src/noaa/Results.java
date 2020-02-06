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
public class Results
{
   private String uid;
   private String mindate;
   private String maxdate;
   private String name;
   private String datacoverage;
   private String id;

   public String getUid()
   {
      return uid;
   }

   public void setUid(String uid)
   {
      this.uid = uid;
   }

   public String getMindate()
   {
      return mindate;
   }

   public void setMindate(String mindate)
   {
      this.mindate = mindate;
   }

   public String getMaxdate()
   {
      return maxdate;
   }

   public void setMaxdate(String maxdate)
   {
      this.maxdate = maxdate;
   }

   public String getName()
   {
      return name;
   }

   public void setName(String name)
   {
      this.name = name;
   }

   public String getDatacoverage()
   {
      return datacoverage;
   }

   public void setDatacoverage(String datacoverage)
   {
      this.datacoverage = datacoverage;
   }

   public String getId()
   {
      return id;
   }

   public void setId(String id)
   {
      this.id = id;
   }


}
