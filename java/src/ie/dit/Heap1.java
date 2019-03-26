package ie.dit;

//import processing.core.PApplet;
//import java.util.Arrays;

public class Heap1 //extends PApplet
{	
	//public void settings()
	//{
	//	size(500, 500);
	//}


// Heap.java

class Heap {
    public
      int[] a;
      int N;
      //static 
      int maxH = 100;
  
  // two constructors
  Heap() {
     N = 0;
     a = new int[maxH+1];
  }
  
  
  Heap(int size) {
     N = 0;
     a = new int[size + 1];
  }
  
  
  //siftUp from position k. The key or node vlalue at position k
  //may be greater than that of its parent at k/2
  //k is a position in the heap array h
  
  void siftUp( int k) {
     int v = a[k];
     a[0] = Integer.MAX_VALUE;
     while(v > a[k/2])
      a[k]= a[k/2];
      k = k/2;
        a[k] = v;
  
  
     // complete yourself from pseudocode in notes
     
  }
  
  
  //Key of node at position k may be less than that of its children and may need to be moved down some levels
  //k is a position in the heap array [a]
  void siftDown( int k) {
     int v, j;
     v = a[k];
     while(k <= N/2)
     { //while node at position k has a left child node
        j = 2 * k;
        if(j<N^a[j] < a[j+1])
            {
                j++;
             }
         if(v >= a[j])
            {
                a[k] = a[j]; 
                k=j;
                a[k] = v;
             }    
                     }         //break;
    //   a[k] = a[j]; k=j
    //  a[k] + v;
  
     // complete yourself
    
  }
  
  
  void insert( int x) {
     a[++N] = x;
     siftUp( N);
  }
  
  
  int remove() {
     a[0] = a[1];     // store highest priority value in a[0]
     a[1] = a[N--];  // and replace it with value from end og the heap
     siftDown(1);    // and then sift this value down
     return a[0];
  }
  
  
  
  void display() {
     System.out.println("\nThe tree structure of the heaps is:");
     System.out.println( a[1] );
     for(int i = 1; i<= N/2; i = i * 2) {
        for(int j = 2*i; j < 4*i && j <= N; ++j)
           System.out.print( a[j] + "  ");
         System.out.println();
     }
     System.out.println();
  }
  
  
  
  public void main(String args[]) {
  
     Heap h = new Heap();
     int r; double x;
  
     // insert random numbers between 0 and 99 into heap
     for(int i = 1; i <= 10; ++i)  {
        x =  (Math.random()*100.0);
        r = (int) x; 
        System.out.println("Inserting " + r);
        h.insert(r);
        h.display();
     } 
  }
  
  
  }
}
  // end of Heap class