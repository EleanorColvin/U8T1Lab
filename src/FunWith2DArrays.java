public class FunWith2DArrays
{
    public static int totalElements(int[][] arr)
    {
        return arr.length * arr[0].length;
    }

    public static void fourCorners(String[][] arr)
    {
        int x = arr.length - 1;
        int y = arr[0].length - 1;
        System.out.println(arr[0][0]);
        System.out.println(arr[0][y]);
        System.out.println(arr[x][0]);
        System.out.println(arr[x][y]);
    }

}
