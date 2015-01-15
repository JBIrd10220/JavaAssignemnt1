/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaassignment1;

import java.util.Date;

/**
 *
 * @author c0622834
 */
public class Order {
    

    private String customerID;
    private String customerName;
    private Date timeRecieved;
    private Date timeProcessed;
    private Date timeFulfilled;
    private String notes;
   
    /*
   public Order (String customerID, String customerName)
   {
       this.customerID = customerID;
       this.customerName = customerName;
   }
   */
   public String makeOrder (String customerID, String customerName)
   {
       if (customerID.equals("") || customerName.equals(""))
       {
           return "ERROR: No Id or Name";
       }
       else 
       {
           return null;
       }
   }
   
   public String getCustomerID()
   {
       return customerID;
   }
   
   public void setCustomerID(String customerID)
   {
       this.customerID = customerID;
   }
   
   public String getCusomterName()
   {
       return customerName;
   }
   
   public void setCustomerName(String customerName)
   {
       this.customerName = customerName;
   }
   
   
    
}
