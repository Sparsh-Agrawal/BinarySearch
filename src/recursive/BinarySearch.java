package recursive;

public class BinarySearch
{
    /*
    Algorithm : binarySearch(searchElement, low, high)
    Start:
    Step1: 		if(low > high) then step 2, else step 3.
    Step 2: 		return false;
    Step 3: 		mid = (low + high) / 2;
    Step 4:		 if(searchElement == arr[mid]) then step 5, else step 6
    Step 5:		 return true;
    Step 6:		 if(searchElement < arr[mid]) then step 7, else step 8
    Step 7:		 return binarySearch(searchElement , low , mid - 1)
    Step 8:		 return binarySearch(searchElement, mid + 1, high)
    end
     */

    private int[] arr;

    public BinarySearch(int[] arr)
    {
        this.arr = arr;
    }

    public boolean binarySearch(int e,int l,int h)
    {
        if (l > h)
        {
            return false;
        }

        int mid = (l + h) / 2;

        if (e == arr[mid])
        {
            return true;
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
        boolean r = o.binarySearch(e,l,h);
        if (r)
        {
            System.out.println("element found");
        }
        else
            {
                System.out.println("Element not found");
            }
    }


}

