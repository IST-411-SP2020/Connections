package ist411t1connections;

/**
 *
 * @author Ryan Urbanski, Albana Beqo, James Bristow II, Logan Pratt, Fred Aaron
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
