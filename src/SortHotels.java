/*
* A little bit of if-else . oops! :p */
import java.util.Comparator;

public class SortHotels implements Comparator<Hotel>
{
    public int compare(Hotel a, Hotel b)
    {
        if(a.getTotalRent()>b.getTotalRent())
            return 1;
        if(a.getTotalRent()<b.getTotalRent())
            return -1;
        else
        {
            if(a.getRating()>b.getRating())
                return -1;
            else
                return 1;
        }
    }
}