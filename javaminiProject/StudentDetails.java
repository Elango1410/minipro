package javaminiProject;
import java.util.Scanner;
public class StudentDetails {
	public static void main(String[] args)
	    {
		  Scanner input = new Scanner(System.in);
		  
	 
	    	RecordManagement hr = new RecordManagement();
	 
	        Record record = new Record();
	        
	        Teacher teacher=new Teacher();
	        
	        record.setIdNumber(6862);
	        record.setContactNumber(911);
	        record.setName("Elangovan");
	        teacher.setId(100);
	        teacher.setName("elan");
	        teacher.setSalary(10000);
	        teacher.setContactNo(213);
	        hr.add(record);
	        hr.Tadd(teacher);
	        int option;
	        int option3;
	        int option1;
	 
	        char ch;
	        char ch1;
	        char ch2;
	       
	        do {
	        	 menu();
	        	 option=input.nextInt();
	        switch(option) {
	       
	       
	        
	        case 1://Student
	        	do {
	        		 System.out.println("1: Add Student");
		             System.out.println("2: Delete Student");
		             System.out.println("3: Update Student");
		             System.out.println("4: Search Student");
		             System.out.println("5: Display Students");
		             
		             System.out.print("Enter your selection : ");
	           
	            	 option1 = input.nextInt();
	 
	            	 switch (option1) {
	 
	            	 case 1:
	 
	            		 System.out.print("Enter the Student Id ");
	 
	            		 int idNumber = input.nextInt();
	 
	            		 System.out.print("Enter the Student contact number ");
	 
		                int contactNumber = input.nextInt();
		                input.nextLine();
		 
		                System.out.print("Enter the Student name ");
		 
		                String name = input.nextLine();
		 
		                record = new Record(name, idNumber,contactNumber);
		                hr.add(record);
		                System.out.println(record.toString());
		 
		                
		                break;
		 
		          
		            case 2:
		 
		                System.out.print("Enter the Student id ");
		                int rId = input.nextInt();
		 
		                hr.delete(rId);
		 
		                break;
		 
		            case 3:
		 
		                System.out.print("Enter the Student id  ");
		 
		                int rIdNo = input.nextInt();
		                hr.update(rIdNo, input);
		 
		                break;
		 
		            
		            case 4:
		 
		                System.out.print( "Enter the Student id ");
		                int bookId = input.nextInt();
		 
		                if (!hr.find(bookId)) {
		                    System.out.println("Student id does not exist\n");
		                }
		 
		                break;
		 
		            case 5:
		                hr.display();
		                break;
		 
		            
		 
		        
		            default:
		 
		                System.out.println("\nInvalid input\n");
		                break;
		            }
	            System.out.println("Do you want to continue");
			ch=input.next().charAt(0);
			}
	        while (ch=='y'||ch=='Y' );
	       break;
	       
	        case 2://Teacher
	        	do {
	        		
	        		 System.out.println("1: Add Teacher");
		             System.out.println("2: Delete Teacher");
		             System.out.println("3: Update Teacher");
		             System.out.println("4: Search Teacher");
		             System.out.println("5: Display Teacher");
		             
		             System.out.print("Enter your selection : ");
		             
		           option3=input.nextInt();
					switch(option3) {
					case 1:
						System.out.print("Enter the Teacher Id ");
						 
	            		 int tId = input.nextInt();
	 
	            		 System.out.print("Enter the Teacher name ");
	 
		                String Name = input.next();
		                
		 
		                System.out.print("Enter the Teacher salary ");
		 
		                int salary = input.nextInt();
		 
		                System.out.print("Enter the Teacher contact no ");
		                int ContactNo=input.nextInt();
						teacher = new Teacher(tId, Name,salary,ContactNo);
		                hr.Tadd(teacher);
		                System.out.println(teacher.toString());
		                break;
					case 2:

		                System.out.print("Enter the Teacher id ");
		                int TId = input.nextInt();
		                hr.Tdelete(TId);
		                break;
		             
					case 3:
						 System.out.print("Enter the Teacher id  ");
						 
			                int TIdNo = input.nextInt();
			                hr.Tupdate(TIdNo, input);
			 
			                break;
			                
					case 4:
						System.out.print( "Enter the Student id ");
		                int teachId = input.nextInt();
		 
		                if (!hr.fTeacher(teachId)) {
		                    System.out.println("Student id does not exist\n");
		                }
		 
		                break;
		                
					case 5:
						 hr.Tdisplay();
			                break;
	        	
					}
	      System.out.println("Do you want to continue");
	      ch1=input.next().charAt(0);    
	     }while(ch1=='y'||ch1=='Y');
	        }       
	        System.out.println("Do you want to continue");
	        ch2=input.next().charAt(0);
	    }while(ch2=='y'||ch2=='Y');
	   
}
		
	    public static void menu()
	    {
	 
	        System.out.println("MENU");
	        System.out.println("1: Student");
	        System.out.println("2.Teacher");
	       
	       
	        System.out.print("Enter your selection : ");
	    }
	}

