import java.util.*;

class arr2

{

public static void main(String args[])

{

Scanner sc = new Scanner(System.in);

int i,n, search, c=0;

System.out.println("Enter the number of elements:");

n = sc.nextInt();

int[] a = new int[n];

System.out.println("Enter the elements"); 
for (i=0;i<n;i++){



a[i] = sc.nextInt();
}

System.out.println("Enter the element to be seached");

search = sc.nextInt();

//Perform search operation

for (i=0;i<n;i++){

if(a[i]== search ){

System.out.println("Element "+search+" found at "+i+" position");

c=1;


}

}

if( c ==0)

{



System.out.println("Element "+search+" not found");

}

}
}