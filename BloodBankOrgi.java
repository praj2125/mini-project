import java.util.*;

class BloodBank{
	static Scanner s = new Scanner(System.in);
	String Name;
	String Address;
	String Mobile;
	String Blood;
	String Email;
	double Weight;
	int Age;
	
	public static BloodBank input(){
		BloodBank take = new BloodBank();
		System.out.print("Enter Name = ");
		s.nextLine();
		take.Name = s.nextLine();
		System.out.print("Enter Contact Number = ");
		take.Mobile = s.nextLine();
		System.out.print("Enter Email ID = ");
		take.Email = s.next();
		System.out.print("Enter Address = ");
		s.nextLine();
		take.Address = s.nextLine();
		
	
		System.out.print("Enter Age = ");
		int age = s.nextInt();
		if(age > 18 && age < 65){
			take.Age = age;
		}else{
			System.out.println("\nYou are Not Eligible...!");
			System.exit(0);
		}
	
		System.out.println("Select Your Blood Group");
		while(true){
			System.out.println("1. A+\t\t2. B+\n3. AB+\t\t4. O+\n5. A-\t\t6. B-\n7. AB-\t\t8. O-\n");
			
			int sel = s.nextInt();
			if(sel==1){
				take.Blood = "A+";
				break;
			}else if(sel==2){
				take.Blood = "B+";
				break;
			}else if(sel==3){
				take.Blood = "AB+";
				break;
			}else if(sel==4){
				take.Blood = "O+";
				break;
			}else if(sel==5){
				take.Blood = "A-";
				break;
			}else if(sel==6){
				take.Blood = "B-";
				break;
			}else if(sel==7){
				take.Blood = "AB-";
				break;
			}else if(sel==8){
				take.Blood = "O-";
				break;
			}else{
				System.out.println("\nInvalid Option..! Please Choose Correct Option\n");
				continue;
			}
		}
		
		System.out.print("Enter Weight = ");
		double wt = s.nextDouble();
		if(wt > 45 && wt < 75 ){
			take.Weight = wt;
		}else{
			System.out.println("You are Not Eligible...!");
			System.exit(0);
		}

		return take;
	}
	
	public static BloodBank inputrequired(){
		BloodBank take = new BloodBank();
		System.out.print("Enter Name = ");
		s.nextLine();
		take.Name = s.nextLine();
		System.out.print("Enter Contact Number = ");
		take.Mobile = s.nextLine();
		System.out.print("Enter Email ID = ");
		take.Email = s.next();
		System.out.print("Blood Group Required = ");
		while(true){
			System.out.println("1. A+\t\t2. B+\n3. AB+\t\t4. O+\n5. A-\t\t6. B-\n7. AB-\t\t8. O-\n");
			int sel = s.nextInt();
			if(sel==1){
				take.Blood = "A+";
				break;
			}else if(sel==2){
				take.Blood = "B+";
				break;
			}else if(sel==3){
				take.Blood = "AB+";
				break;
			}else if(sel==4){
				take.Blood = "O+";
				break;
			}else if(sel==5){
				take.Blood = "A-";
				break;
			}else if(sel==6){
				take.Blood = "B-";
				break;
			}else if(sel==7){
				take.Blood = "AB-";
				break;
			}else if(sel==8){
				take.Blood = "O-";
				break;
			}else{
				System.out.println("\nInvalid Option..! Please Choose Correct Option\n");
				continue;
			}
		}		
		return take;
		
	}
	
	public static void invoice(int quant, BloodBank arr2){
		System.out.println("======================= INVOICE =========================");
		System.out.println("Name : "+arr2.Name+"\t\tMobile : "+arr2.Mobile+"\n\n\n\nEmail : "+arr2.Email);
		System.out.println("--------*--------*--------*--------*--------*--------*--------");
		System.out.println("Blood Group : "+arr2.Blood+"\t\tQuantity : "+quant+"\n\nTotal Price:"+(quant*250)+" Rs/-");
		System.out.println("=========================================================");
	}
	
	public static void main(String [] args){
		
		BloodBank arr[] = new BloodBank[5];
		int select = 0;
		int c = 0;
		int quant = 0;
		do{
			System.out.println(" ++++++WELCOME TO CDAC BLOOD BANK WE ARE HERE TO HELP YOU++++++ ");
			System.out.println("\n\n ~)Select Option = ");
			System.out.println("\n1. Add Details for Blood Donatation.\n2. Require Blood\n3. Registered Users\n0. Exit\n");
			System.out.print("Enter option = ");
			select = s.nextInt();
			switch(select){
			case 1:{
				System.out.println("================ Enter Details ================");
				arr[c++] = input();
				System.out.println("===============================================");
			}
			break;
			case 2:{
				System.out.println("================ Enter Required Details ================");
				BloodBank obj = new BloodBank();
				obj = inputrequired();
				System.out.println("===============================================");
				System.out.println("300ml Available ! Please select Blood Pouch Quantity");
				quant = s.nextInt();
				invoice(quant, obj);
			}
			break;
			case 3:{
				System.out.println("================ Users Details ================");
				for(int i=0;i<c;i++){
					System.out.println("Name\t\t:\t\t"+arr[i].Name+"\nAddress\t\t:\t\t"+arr[i].Address+"\nMobile\t\t:\t\t"+arr[i].Mobile+"\nEmail\t\t:\t\t"+arr[i].Email+"\nBlood Group\t:\t\t"+arr[i].Blood+"\nWeight\t\t:\t\t"+arr[i].Weight+"\nAge\t\t:\t\t"+arr[i].Age);
					System.out.println();
				}
			}
			break;
			default:{
				if(select == 0){
					System.out.println("\n\tThanks for using our Service");
				}else{
					System.out.println("\nWrong Option entered...Please select correct Option from list...!\n");
				}
			}
		}
			
		}while(select!=0);
		
	}
}