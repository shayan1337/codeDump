/* A blueprint for the hotels. Included a a few getters and a setter method.
  the totalRent member variable class is used to store the total amount for every
  object(hotels) invoked.
*/
public class Hotel
{
      private int weekdayRateForRegular;
      private int weekdayRateForReward;
      private int weekendRateForReward;
      private int weekendRateForRegular;
      private int rating;
      private int totalRent;


    Hotel(int weekdayRateForRegular,int weekendRateForRegular,int weekdayRateForReward,int weekendRateForReward,int rating)
    {
        this.weekdayRateForRegular = weekdayRateForRegular;
        this.weekendRateForRegular = weekendRateForRegular;
        this.weekdayRateForReward = weekdayRateForReward;
        this.weekendRateForReward = weekendRateForReward;
        this.rating = rating;
    }

    int getRentForRegular(int weekdays, int weekendDays)

    {
        return (weekdays * weekdayRateForRegular) + (weekendDays * weekendRateForRegular);
    }

    int getRentForReward(int weekdays , int weekendDays)
    {
        return (weekdays * weekdayRateForReward) + (weekendDays * weekendRateForReward);
    }

    public int getWeekdayRateForRegular()
    {
        return weekdayRateForRegular;
    }

    public int getWeekendRateForRegular()
    {
        return weekendRateForRegular;
    }

    public int getWeekdayRateForReward()
    {
        return weekdayRateForReward;
    }

    public int getWeekendRateForReward()
    {
        return weekendRateForReward;
    }

    public int getRating()
    {
        return rating;
    }

    public void setTotalRent(int totalRent)
    {
        this.totalRent = totalRent;
    }

    public int getTotalRent()
    {
        return totalRent;
    }
}


