package javaminiProject;


import java.util.LinkedList;
import java.util.Scanner;

public class RecordManagement {
		
	LinkedList<Record> list;
	LinkedList<Teacher> Tlist;

		
		public  RecordManagement()
		{
			list = new LinkedList<>();
			Tlist=new LinkedList<>();
		}

		
		public void add(Record record)
		{

			
			if (!find(record.getIdNumber())) {
				list.add(record);
			}
			else {

				System.out.println("Record already exists in the Record list");
			}
		}

		public boolean find(int idNimber)
		{

			for (Record l : list) {

				if (l.getIdNumber() == idNimber) {

					System.out.println(l);
					return true;
				}
			}
			return false;
		}

		
		
		public void delete(int recIdNumber)
		{
			Record recordDel = null;

			
			for (Record delL : list) {

				if (delL.getIdNumber() == recIdNumber) {
					recordDel = delL;
				}
			}

			if (recordDel == null) {

				System.out.println("Invalid record Id");
			}
			else {

				list.remove(recordDel);

				
				System.out.println("Successfully removed record from the list");
			}
		}

		
		
		public Record findRecord(int idNumber)
		{

			
			for (Record l : list) {

				if (l.getIdNumber() == idNumber) {
					return l;
				}
			}

			return null;
		}

		
		
		public void update(int id, Scanner input)
		{

			if (find(id)) {
				Record rec = findRecord(id);

				System.out.print("What is the new Student id Number ? ");
				int idNumber = input.nextInt();

				System.out.print("What is the new Student contact Number ");
				int contactNumber = input.nextInt();
				input.nextLine();

				System.out.print("What is the new Student Name ? ");
				String name = input.nextLine();

				rec.setIdNumber(idNumber);
				rec.setName(name);
				rec.setContactNumber(contactNumber);
				System.out.println("Record Updated Successfully");
			}
			else {

				System.out.println("Record Not Found in the Student list");
			}
		}

		
		public void display()
		{

			
			if (list.isEmpty()) {

				System.out.println("The list has no records\n");
			}
			
			for (Record record : list) {

				System.out.println(record.toString());
			}
		}
		
		
		
		
		
		public void Tadd(Teacher teacher) {
			if (!find(teacher.getId())) {
				Tlist.add(teacher);
			}
			else {

				System.out.println("Record already exists in the Record list");
			}
			
		}
		
		
		public boolean fTeacher(int tId)
		{

			for (Teacher  ft: Tlist) {

				if (ft.getId() == tId) {

					System.out.println(ft);
					return true;
				}
			}
			return false;
		}
		
		
		
		public void Tdelete(int idNo)
		{
			Teacher teachDel = null;

			
			for (Teacher td : Tlist) {

				if (td.getId() == idNo) {
					teachDel = td;
				}
			}

			if (teachDel == null) {

				System.out.println("Invalid record Id");
			}
			else {

				list.remove(teachDel);

				
				System.out.println("Successfully removed record from the list");
			}
		}
		
		
		
		public Teacher findTeacher(int Tid)
		{

			
			for (Teacher findL : Tlist) {

				if (findL.getId() == Tid) {
					return findL;
				}
			}

			return null;
		}
		
		public void Tupdate(int id, Scanner input)
		{

			if (fTeacher(id)) {
				Teacher tRec = findTeacher(id);

				System.out.print("What is the new Student id Number ? ");
				int Id = input.nextInt();

				
				System.out.print("What is the new Student contact Number ");
				int contactNumber = input.nextInt();
				input.nextLine();

				System.out.print("What is the new Student Name ? ");
				String name = input.nextLine();

				tRec.setId(id);
				tRec.setContactNo(contactNumber);
				tRec.setName(name);
				System.out.println("Record Updated Successfully");
			}
			else {

				System.out.println("Record Not Found in the Student list");
			}
		}
		
		
		public void Tdisplay()
		{

			if (Tlist.isEmpty()) {
				System.out.println("The list has no records\n");
			}
			for (Teacher teacher : Tlist) {

				System.out.println(teacher.toString());
			}
		}
	


}
