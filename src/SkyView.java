public class SkyView
{

    public SkyView(int numRows, int numCols, double[] scanned)
    {
        double[][] view = new double[numRows][numCols];
        for (int x=0; x<scanned.length; x++)
        {
            for (int row = 0; row<numRows; row++)
            {
                if (row % 2 == 0)
                {
                    for (int col = numCols-1; col>=0; col--)
                    {
                        view[row][col] = scanned[x];
                    }
                }
                else if (row % 2 == 1)
                {
                    for (int col = numCols-1; col>=0; col--)
                    {
                        view[row][col] = scanned[x];
                    }
                }
            }
        }
    }
}
