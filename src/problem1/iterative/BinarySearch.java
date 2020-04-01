package problem1.iterative;

public class BinarySearch
{
    private int[] arr;

    public BinarySearch(int[] arr)
    {
        this.arr = arr;
    }

    public int binarySearch(int e)
    {
        int r = -1;
        int l = 0;
        int h = arr.length - 1;
        while (l <= h)
        {
            int mid = (l + h)/2;
            if (e == arr[mid])
            {
                r = mid;
                break;
            }
            else if (e < arr[mid])
            {
                h = mid - 1;
            }
            else
            {
                l = mid + 1;
            }
        }
        return r;
    }

    public static void main(String[] args)
    {
        int[] arr = {10,20,30,40,50,60,70};
        int e = 10;
        BinarySearch o = new BinarySearch(arr);

        int r = o.binarySearch(e);
        if (r<0)
        {
            System.out.println("null");
        }
        else
        {
            System.out.println(r);
        }
    }
}
