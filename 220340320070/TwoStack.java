class TwoStack{
	int arr[];
	int top1;
	int top2;
	 
	 TwoStack(int size){
		arr = new int[size];
		top1 = -1;
		top2 = arr.length;
	 }

		public boolean isEmpty(){
				return(top1==-1 && top2==arr.length);
				
		public boolean isFull(){
				return(top1+1 == top2);
		}
		
		public void display(){
			for(int i=0;i<=top1;i++)
				System.out.println(arr[i]);
				
			for(int j=arr.length-1;j>=top2;j--)
				System.out.println(arr[j]);
			
			}
		
		}
		
		public static void main(String[]args)
		
		{
		
		
			TwoStack t = new TwoStack(6);
			
			t.push1(5);
			t.push2(10);
			t.push2(15);
			t.push1(11);
			t.push2(7);
			t.push2(40);
			System.out.println("Before pop");
			t.display;
			System.out.println("After pop");
			t.pop1();
			t.pop2();
			t.display();
			}
}