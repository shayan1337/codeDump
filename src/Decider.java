/*
* Utilises a TreeMap to store data and a comparator to decide the order of the storage of objects
* */
import java.util.TreeMap;

public class Decider
{
    public void calculate(Customer customer, Hotel Lakewood, Hotel Ridgewood, Hotel Bridgewood)
    {
        int lakewoodRent = 0;
        int ridgewoodRent = 0;
        int bridgewoodRent = 0;

        switch(customer.getCustomerType())
        {
            case "REGULAR":
                lakewoodRent = Lakewood.getRentForRegular(customer.getWeekDays(),customer.getWeekendDays());
                ridgewoodRent = Ridgewood.getRentForRegular(customer.getWeekDays(),customer.getWeekendDays());
                bridgewoodRent = Bridgewood.getRentForRegular(customer.getWeekDays(),customer.getWeekendDays());
                break;

            case "REWARD":
                lakewoodRent = Lakewood.getRentForReward(customer.getWeekDays(),customer.getWeekendDays());
                ridgewoodRent = Ridgewood.getRentForReward(customer.getWeekDays(),customer.getWeekendDays());
                bridgewoodRent = Bridgewood.getRentForReward(customer.getWeekDays(),customer.getWeekendDays());
                break;

            default:
                System.out.println("Inappropriate service type. We only serve Regular and Reward service types.");
                System.exit(0);
        }
        Lakewood.setTotalRent(lakewoodRent);
        Bridgewood.setTotalRent(bridgewoodRent);
        Ridgewood.setTotalRent(ridgewoodRent);

        // Using a comparator to sort the objects according to their totalRent value and their star ratings.
        SortHotels comparator = new SortHotels();
        TreeMap<Hotel,String> treeMap = new TreeMap<>(comparator);
        treeMap.put(Lakewood,"Lakewood");
        treeMap.put(Ridgewood,"Ridgewood");
        treeMap.put(Bridgewood,"Bridgewood");


        System.out.println("The cheapest hotel is : " + treeMap.firstEntry().getValue() + " $" + treeMap.firstKey().getTotalRent() );
    }
}