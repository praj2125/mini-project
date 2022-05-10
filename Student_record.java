import java.util.Scanner;

class Student_data{
	
	int count=0;
	Scanner sc=new Scanner(System.in);
	
	Student head=null;
	Student tail=null;
	
	static class Student{
		int id;
		String name;
		double per;
		char gender;
		Student next;
		Student prev;
		
		Student(int id,String name,double per,char gender){
			this.name=name;
			this.id=id;
			this.per=per;
			this.gender=gender;
			next=null;
			prev=null;
		}
	}
		
		void insert(){
			
			int n=0;
		do{
			try{
			System.out.println("=================================================================");
			System.out.print("Enter ID Of Student : ");
			int id=sc.nextInt();
			
			System.out.print("Enter Name Of Student : ");
			sc.nextLine();
			String name=sc.nextLine();
			
			System.out.print("Enter Percentage Of Student : ");
			double per=sc.nextDouble();
			
			System.out.print("Enter Gender (M/F) : ");
			char gender=sc.next().charAt(0);
			if(gender==('m')||  gender==('M') ||gender==('f')||  gender==('F')){
			}
			
			else{
				throw new Exception();
			}

			System.out.println("================================================================");
			
			Student S=new Student(id,name,per,gender);
			if(head==null){
				head=S;
				tail=S;
			}
			else{
				tail.next=S;
				S.prev=tail;
				tail=S;
			}
			count++;
			}
			catch(Exception e){
				System.out.println("			* You Enter Wrong Input *");
				System.out.println("				* Try Again *");
				}
			
			System.out.println("IF YOU WANT TO INSERT ANOTHER STUDENT RECORD PRESS 1 OTHERWISE PRESS 0 FOR EXIT");
			sc.nextLine();
			n=sc.nextInt();
			}while(n==1);
		}
		
		void remove(){
			try{
			System.out.println("Enter ID You Want To Remove");
			int I=sc.nextInt();
			
			Student temp=head;
			
			if(head==null){
				System.out.println("No Record Found.");
				return;
			}
			if(count==1){
				removeAll();
				return;
			}
			
			if(temp.id==I){
				temp=head.next;
				temp.prev=null;
				head=temp;
			}
			else {
				while(temp != null){
					if(temp.id==I)
						break;
					temp=temp.next;
				}
					if(temp.next==null){
						tail=temp.prev;
						tail.next=null;
						temp=null;
						return;
					}
					temp.prev.next=temp.next;
					temp.next=temp.prev;
					
			}
			
			}
			catch(Exception e){
				System.out.println("			* You Entered Wrong Input *");
				System.out.println("				* Try Again *");
				
			}
			count--;
			sc.nextLine();
			
		}
		
		void removeAll(){
			head=null;
			count=0;
		}
		
		void display(){
			Student temp=head;
			System.out.println("	Name		ID	Percentage	Gender(M/F)	");
			System.out.println("===========================================================================");
			while(temp != null){
				System.out.println("	"+temp.name+"	"+temp.id+"	"+temp.per+"		"+temp.gender);
				temp=temp.next;
			}
			
			System.out.println("===========================================================================");
		}
		
		void search(){
			try{
				
			System.out.print("Enter ID You Want To Search : ");
			sc.nextLine();
			int I=sc.nextInt();
			
			Student temp=head;
			if(head == null){
				
				System.out.println("ID NOT FOUND");
				
			}else{
				
			while(temp != null){
				if(I == temp.id){
				System.out.println("===========================================================================");
				System.out.println("	Name		ID	Percentage	Gender(M/F)	");
				System.out.println("	"+temp.name+"	"+temp.id+"	"+temp.per+"		"+temp.gender);
				System.out.println("===========================================================================");
				break;
				}
				temp=temp.next;
			}
			if(temp==null){
				System.out.println("ID NOT FOUND");
				}
			}
		}
			catch(Exception e){
				System.out.println("			* You Entered Wrong Input *");
				System.out.println("				* Try Again *");
				}
		}
		
		
		public void swapData(Student first, Student second){
			
		int value = first.id;
		first.id = second.id;
		second.id = value;
		
		String name = first.name;
		first.name = second.name;
		second.name = name;
		
		double per = first.per;
		first.per = second.per;
		second.per = per;
		
		char c = first.gender;
		first.gender = second.gender;
		second.gender = c;
	}
	
	public void Sort()
	{
      	
		Student front =head;
		Student back = null;
		while (front != null)
		{
          
			back = front.next;
          
			while (back != null && back.prev != null && 
                  back.id < back.prev.id)
			{
					swapData(back, back.prev);
					back = back.prev;	
			}
           
			front = front.next;
		}
	}
	
	
	void modify(){
		try{
	
		System.out.println("Enter ID for Edit Information : ");
		int I=sc.nextInt();
		
		Student temp=head;
		while(temp!=null){
			if(temp.id==I)
				break;
			temp=temp.next;
		}
		if(temp==null){
			System.out.println("		ID Not Found ");
		}else{
		System.out.println("What You Want To Change. ");
		System.out.println(" 1.Name \n 2.Percentage \n 3.Gender");
		System.out.print("Enter Choice : ");
		int x=sc.nextInt();
		switch(x){
			
			case 1: System.out.print("Enter Name : ");
					sc.nextLine();
					temp.name=sc.nextLine();
					break;
					
			case 2: System.out.print("Enter Percentage : ");
					temp.per=sc.nextDouble();
					break;
					
			case 3: System.out.print("Enter Gender : ");
					temp.gender=sc.next().charAt(0);
					break;
					
			default:System.out.println("		Enter proper Choice.");
			}
		}
		}catch(Exception e){
				System.out.println("			* You Entered Wrong Input *");
				System.out.println("				* Try Again *");
				}
		
	}
			
	
	 static String UserName = "12345";
     static String Password = "12345";
	 
	 public void login(){
		 
		 System.out.print("Enter User Name : ");
		 String user=sc.nextLine();
		 
			if(UserName.equals(user)){
			System.out.print("Enter Password  : ");
			String pass=sc.nextLine();
			
            if(Password.equals(pass)){
                System.out.println("            logIn succesfully");
                System.out.println("-----------------------------------------");
               
            }else{
                System.out.println("            Incorrect password");
                System.out.println("-----------------------------------------");
				login();
            }
			}else{
            System.out.println("				Incorrect username");
            System.out.println("-----------------------------------------");
            System.out.println("				please Try Again");
			login();
            
        }
	 }
	 
}
	 
    


public class Student_record{
	public static void main(String args[]){
		
		Student_data SD = new Student_data();
		Scanner sc =new Scanner(System.in);
		System.out.println();
		System.out.println("			 $$$$$  ---STUDENTS RECORD---	 $$$$$ ");
		System.out.println();
		SD.login();
		
		int q=0;
		do{
		try{
		
		System.out.println();
		System.out.println("========================================================================");
		System.out.println();
		System.out.println("ENTER YOUR CHOICE :");
		System.out.println();
		System.out.println(" 1.Add New Record. \n 2.Remove Record. \n 3.Search Record. \n 4.Display Record. \n 5.Total Record Stored. \n 6.Ordered List. \n 7.Remove All Record. \n 8.Edit Record. \n 9.Exit.");
		System.out.println();
		System.out.println("========================================================================");
		int c=sc.nextInt();
		
		
		switch(c){
			case 1: SD.insert();
					System.out.println("		*Record Saved*");
					break;
					
			case 2: SD.remove();
					break;
					
			case 3: SD.search();
					break;
					
			case 4: SD.display();
					break;
					
			case 5: System.out.println("Total Number Of Students : "+SD.count);
					break;
					
			case 6: SD.Sort();
					break;
					
			case 7: SD.removeAll();
					System.out.println("		All Record Has Been Remove !! ");
					break;
					
			case 8: SD.modify();
					break;
			
					
			case 9: q=9;
					break;
					
			
			default: System.out.println("Enter Proper Choice");
			
			}
			}
			catch(Exception e){
				System.out.println("			* You Entered Wrong Input *");
				System.out.println("				* Try Again *");
				}
			sc.nextLine();
		
		}while(q != 9); 
		
	}
}