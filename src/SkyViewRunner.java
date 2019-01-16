public class SkyViewRunner {

    public static void main(String[] args)
    {
        //Create 1D and 2D Arrays
        double[] scan = {0.3,0.7,0.8,0.4,1.4,1.1,0.2,0.5,0.2,1.6,0.6,0.9};
        double[] scan2 = {0.3,0.7,0.8,0.4,1.4,1.1};

        SkyView sv1 = new SkyView(4,3,scan);
        SkyView sv2 = new SkyView(3,2,scan2);


        //Print 2D Arrays
        for(int i = 0; i<4; i++)
        {
            for(int j = 0; j<3; j++)
            {
                System.out.print(sv1.view[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

        for(int i = 0; i<3; i++)
        {
            for(int j = 0; j<2; j++)
            {
                System.out.print(sv2.view[i][j]+" ");
            }
            System.out.println();
        }


        //Print Averages
        System.out.println();
        System.out.println("The average for SkyView1 is: "+sv1.getAverage(1,3,0,2));
        System.out.println("The average for SkyView2 is: "+sv2.getAverage(0,1,0,1));
    }
}
