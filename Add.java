class Add{
	public static int sum(int[] a, int sum){
		for(int i=0;i<=a.length-1;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Sum of Array elements:"+sum);
		return sum;
	}

public static void main(String args[]){
		int a[]={5,6,4,9,7,6};
		int sum=0;
		sum(a,sum);
}
}
