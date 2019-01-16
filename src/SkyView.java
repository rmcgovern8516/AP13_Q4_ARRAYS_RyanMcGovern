public class SkyView
{

    public double[][] view;

    public SkyView(int numRows, int numCols, double[] scanned)
    {
        view = new double[numRows][numCols];
        int x = 0;
            for (int row = 0; row<numRows; row++)
            {
                if (row % 2 == 0)
                {
                    for (int col = 0; col<numCols; col++)
                    {
                        view[row][col] = scanned[x];
                        x++;
                    }
                }
                else
                {
                    for (int col = numCols-1; col>=0; col--)
                    {
                        view[row][col] = scanned[x];
                        x++;
                    }
                }
            }
    }

    public  double getAverage(int startRow, int endRow, int startCol, int endCol)
    {
        double output = 0;
        int count = 0;
        for (int row = startRow; row<=endRow; row++)
        {
            for (int col = startCol; col<=endCol; col++)
            {
                output += view[row][col];
                count++;
            }
        }
        output = output/count;
        return output;
    }
}
