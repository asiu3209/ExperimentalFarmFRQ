import java.util.ArrayList;

public class ExperimentalFarm
{
    private Plot[][] farmPlots;

    public ExperimentalFarm(Plot[][] p)
    {
        farmPlots = p;
    }

    /** Returns the plot with the highest yield
     * for a given crop type, as described in part (a).
     */
    public Plot getHighestYield(String c)
    {
        Plot highest = null;
        int largest = 0;
        for (int i = 0; i<farmPlots.length;i++){
            for (int j = 0;j<farmPlots[0].length;j++){
                if (farmPlots[i][j].getCropType().equals(c) && farmPlots[i][j].getCropYield() >= largest){
                    largest = farmPlots[i][j].getCropYield();
                    highest = farmPlots[i][j];
                }
            }
        }
        return highest; // stub value
    }

    /** Returns true if all plots in a given column in
     * the two-dimensional array farmPlots
     * contain the same type of crop, or false otherwise,
     * as described in part (b).
     */
    public boolean sameCrop(int col)
    {
        String temp = farmPlots[0][col].getCropType();
        for (int i = 1;i<farmPlots.length;i++){
            if (!(farmPlots[i][col].getCropType().equals(temp))){
                return false;
            }
        }

        return true; // stub value
    }

    /** Returns an arraylist of Plots
     * that are growing crop "crop",
     * as described in part (c).
     */
    public ArrayList<Plot> plotsWithCrop(String crop)
    {
        ArrayList<Plot> temp = new ArrayList<Plot>();
        for (int i = 0;i<farmPlots.length;i++){
            for(int j = 0;j<farmPlots[0].length;j++){
                if (farmPlots[i][j].getCropType().equals(crop)){
                    temp.add(farmPlots[i][j]);
                }
            }
        }

        return temp; // stub value
    }
}
