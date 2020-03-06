
package testmaxheap;

public class MaxHeap 
{
    private Integer[] array;
    private int size;
    private int numofitems;

    public MaxHeap(int n){
        size = n+1;
        array = new Integer[size];
        numofitems = 0;
    }

    public MaxHeap(Integer[] Array)
    {
        size = Array.length+1;
        array = new Integer[size];
        numofitems = 0;
        
        for (Integer i : Array) 
        {
            insert(i);
        }
    }
    
    public void insert(int n)
    {
        if((numofitems+1) >= size)
        {
            DoubleSize();
            insert(n);
            return;
        }
        int temp;
        int index = numofitems + 1;        
        array[index] = n;
        while((index / 2) != 0 && n > array[index/2])
        {
            temp = array[index/2];
            array[index] = temp;
            array[index/2] = n;
            index /= 2;      
        }
        numofitems += 1;
        return;
    }
    
    
    
    private void DoubleSize()
    {
        int i;
        size = (size-1)*2+1;
        
        Integer[] newarray = new Integer[size];
        
        for(i=1; i<array.length; i++)
        {
            newarray[i] = array[i];
        }
        array = newarray;
    }
    
    public int deleteMax()
    {
        int maxnum = array[1];
        
        if(array[2] == null)
        {
            numofitems--;
            array[1] = null;
            return maxnum;
        }
        
        else
        {
            array[1] = array[numofitems];
            array[numofitems] = null;
                    int temp;
        int index = 1;
        int n = array[1];
        while(true)
        {
            if((2*index < numofitems) && n < array[2*index])
            {
                temp = array[2*index];
                array[index] = temp;
                array[2*index] = n;
                index *= 2;
            } 
            
            else if((2*index+1) < numofitems && n < array[2*index+1])
            {
                temp = array[2 * index + 1];
                array[index] = temp;
                array[2*index+1] = n;
                index *= 2;
            }
            else{
                break;
            }
        }
            
            numofitems -= 1;
        }
        return maxnum;
    }
    
    
    public String toString()
    {
        int i;
        String result = "";
        
        for(i = 1; i < size; i++) 
        {
            result += array[i] + ",";
        }
        return result;
    }
    
    public static void heapsort(Integer[] Array) 
    {
        int i;
        MaxHeap heap = new MaxHeap(Array);
        for(i=Array.length-1; i>0; i--)
        {
            Array[i] = heap.deleteMax();
        }
    }

    public int getSize() 
    {
        return size - 1;
    }

    public int getnumofItems() 
    {
        return numofitems;
    }
}
