package problem1.recursive;

public class BinarySearch
{
    private int[] arr;

    public BinarySearch(int[] arr)
    {
        this.arr = arr;
    }

    public int binarySearch(int e,int l,int h)
    {
        if (l > h)
        {
            return -1;
        }

        int mid = (l + h) / 2;

        if (e == arr[mid])
        {
            return mid;
        }
        else if (e < arr[mid])
        {
            return binarySearch(e, l, mid - 1);
        }
        else
        {
            return binarySearch(e, mid + 1, h);
        }
    }

    public static void main(String[] args)
    {
        int[] arr = {10,20,30,40,50,60,70};
        int e = 70;
        BinarySearch o = new BinarySearch(arr);
        int l = 0;
        int h = arr.length - 1;
        int r = o.binarySearch(e,l,h);
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
