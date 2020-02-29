public class BinaryTreeWithArray {

  int arr[];
  int lastindex;
 // Constructor to create blank tree
  public BinaryTreeWithArray(int size)
  {
    arr= new int[size];
    lastindex = 0;
  }
  // method to insert the value
  public void insert(int value)
  {
    if(arr.length-1 == lastindex)
    {
      System.out.println("array is full");
    }
    else
    {
      arr[lastindex+1]= value;
      lastindex++;
    }
  }
  // method for inorder traversal
  public  void levelordertraversal()
  {
    for(int i=1;i<=lastindex;i++)
    {
      System.out.println(arr[i]);
    }
  }
}
