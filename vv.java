import java.util.*;

public class vv {
static void LeftRotate(int a[], int n, int k)
{

	for(int i = 0; i <= n; i++)
	{
		if(i<k)
		{
			System.out.print(a[n + i - k] + " ");
		}
		else
		{
			System.out.print(a[i - k] + " ");
		}
	}
	System.out.println();
}
	

public static void main(String args[])
{
	int Array[] = {1, 2, 3, 4, 5};
	int N = Array.length;

	int K = 2;
	LeftRotate(Array, N, K);

}
}

    
