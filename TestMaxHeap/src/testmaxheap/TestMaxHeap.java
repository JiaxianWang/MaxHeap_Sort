/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testmaxheap;

/**
 *
 * @author BRUCE WANG
 */
public class TestMaxHeap 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        MaxHeap test1 = new MaxHeap(8);
        System.out.println("create heap has size of 8\n"+ test1.toString());
        test1.insert(4);
        test1.insert(6);
        test1.insert(34);
        test1.insert(8);
        test1.insert(100);
        test1.insert(53);
        test1.insert(21);
        test1.insert(1);
        System.out.println("************************************************");
        System.out.println("insert 4,6,34,8,100,53,21,1\n"+ test1.toString());
        System.out.println("size = " + test1.getSize());
        System.out.println("num of items: " + test1.getnumofItems());
        System.out.println("************************************************");
        System.out.println("test double size");
        test1.insert(8);
        System.out.println("");
        System.out.println("insert 8\n"+ test1.toString());
        System.out.println("size: " + test1.getSize());
        System.out.println("items: " + test1.getnumofItems());
        
        System.out.println("delete 100\n"+ test1.deleteMax());
        System.out.println("result: "+ test1.toString());
        System.out.println("************************************************");
        Integer[] tarray = {1,5,3,4,87,11,42};
        MaxHeap test2 = new MaxHeap (tarray);
        test2.heapsort(tarray);
        System.out.println("");
        System.out.println("Testing sorting method: "+ test2.toString());
        System.out.print("sorted result array: ");
        
        for (int i = 0;i<tarray.length;i++)
        {
            System.out.print(tarray[i]+ ",");
        }
    
    }
}
