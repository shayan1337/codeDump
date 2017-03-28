/**
 * Used to store the customer data. Number of days of stay are stored here as well.*/
 class Customer {

     private String customerType;
     private int weekDays;
     private int weekendDays;
     Customer(String customerType, int weekDays, int weekendDays)
     {
         this.customerType = customerType;
         this.weekDays = weekDays;
         this.weekendDays = weekendDays;
     }

     public String getCustomerType()
     {
         return customerType;
     }

     public int getWeekDays()
     {
         return weekDays;
     }

     public int getWeekendDays()
     {
         return weekendDays;
     }
}
