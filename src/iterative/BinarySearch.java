package iterative;

public class BinarySearch
{
    /*
    algorithm : binarySearch(search element)
    //arr is the array in which we search for element
    Start
    Step 1: 	low= 0
    Step 2: 	high = arr.size – 1
    Step 3:	while(low <= high) do the following  steps 4, 5, 7
    Step 4:	mid = (low + high) / 2
    Step 5:	if(searchElement == arr[mid]) then step 6.
    Step 6:	return true; 0r response = true
    Step 7:	if(searchElement < arr[mid]) then step 8 else step 9.
    Step 8:	high = mid – 1;
    Step 9: 	low  = mid + 1
    Step 10:	return false; or return response;
    end
     */

    private int[] arr;

    public BinarySearch(int[] arr)
    {
        this.arr = arr;
    }

    public boolean binarySearch(int e)
    {
        boolean r = false;
        int l = 0;
        int h = arr.length - 1;
        while (l <= h)
        {
            int mid = (l + h)/2;
            if (e == arr[mid])
            {
                r = true;
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
        int e = 70;
        BinarySearch o = new BinarySearch(arr);

        boolean r = o.binarySearch(e);
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

