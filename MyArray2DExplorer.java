
/**
 * Write a description of class MyArray2DExplorer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyArray2DExplorer
{
    /**
     * Constructor for objects of class MyArray2DExplorer
     */
    public MyArray2DExplorer()
    {
    }
    public boolean evenRow(int[][] in, int row){
        for(int col = 0; col < in.length; col++){
             if(in[row][col] % 2 != 0) return false;
            }
        return true;     
    }
    public boolean oddColSum(int[][] nums, int col){
        int sum = 0;
        for(int row = 0; row < nums.length; row++){
            sum += nums[row][col];
        }
        return sum%2 != 0;
    }
    public int[] minRowPractice(int[][] nums){
        int min = Integer.MAX_VALUE;
        int minLoc = 0;
        for(int row = 0; row < nums.length; row++){
            for(int col = 0; col < nums.length; col++){
                if(min > nums[row][col]){
                    min = nums[row][col];
                    minLoc = row;
                }
            }
        }
        return nums[minLoc];
    }
    public int[] colMaxs(int[][] matrix){
        int[] result = new int[4];
        for(int row = 0; row < 4; row++){
            int max = Integer.MIN_VALUE;
            for(int col = 0; col < 3; col++){
                if(max < matrix[col][row]) max = matrix[col][row];
            }
            result[row] = max;
        }
        return result;
    }
    public int[] allRowSums(int[][] data){
        int[] result = new int[3];
        for(int row = 0; row < data.length; row++){
            int sum = 0;
            for(int col = 0; col < data[row].length; col++){
                sum += data[row][col];
            }
            result[row] = sum;
        }
        return result;
    }
    public double[] averageCol(int[][] nums){
        double[] result = new double[4];
        for(int row = 0; row < 4; row++){
            double avg = 0;
            for(int col = 0; col < 3; col++){
                 avg += nums[col][row];
            }
            result[row] = (double) avg/3;
        }
        return result;
    }
    public int smallEven(int[][] matrix){
        int result = Integer.MAX_VALUE;
        for(int row = 0; row < matrix.length; row++){
            
            for(int col = 0; col < matrix[row].length; col++){
                 if(result > matrix[row][col] && (matrix[row][col]%2 == 0))
                 result = matrix[row][col];
            }
        }
        return result;
    }
    public int biggestRow(int[][] nums){
        int result = 0;
        int[] store = new int[3];

        for(int row = 0; row < nums.length; row++){
            int sum = 0;
            for(int col = 0; col < nums[row].length; col++){
                sum += nums[row][col];
            }
            store[row] = sum;
        }
        if(store[1] > store[0] && store[1] > store[2]) result = 1;
        else if(store[2] > store[1] && store[2] > store[0]) result = 2;
        return result;
    }  
}
                
          
