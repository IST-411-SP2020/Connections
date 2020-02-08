package ist411t1connections;

/**
 *
 * @author Ryan Urbanski, Albana Beqo, James Bristow II, Logan Pratt, Fred Aaron
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
