import java.util.*;
import java.io.*;

public class Demo {

	public static void main(String args[])

	{
		Hospital h1 = new Hospital("Appollo");
		int choice = 0;
		int s1 = 1;
		Doctor o = new Doctor(101, "Rai", "Surgeon");
		Doctor o2 = new Doctor(123, "Steve", "ENT");
		Doctor o4 = new Doctor(135, "Hari", "Opthalmologist");
		h1.addDoctor(o);
		h1.addDoctor(o4);
		h1.addDoctor(o2);
		Patient p = new Patient(11, "Steven", 21, "Male", "eye");
		Patient p1 = new Patient(13, "Michael", 12, "Male", "heart");
		h1.addPatient(p);
		h1.addPatient(p1);
		Scanner cin = new Scanner(System.in);
		while (s1 == 1) {
			System.out.println("-----MENU-----");
			System.out.println(
					" 1 add doctor \n 2 show doctors list \n 3 add patient \n 4 show patients list \n 5 Doctor and their patients \n 6 remove doctor \n 7 remove patient ");
			choice = cin.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter id:");
				int id = cin.nextInt();
				System.out.print("Enter Name:-");
				String dname = cin.next();
				cin.nextLine();
				System.out.print("Enter Specilization:-");
				String specilist = cin.nextLine();
				Doctor o1 = new Doctor(id, dname, specilist);
				h1.addDoctor(o1);
				break;
			case 2:
				h1.showDoc();
				break;
			case 3:
				System.out.println("Enter patient id:");
				id = cin.nextInt();
				System.out.print("Enter Name:-");
				dname = cin.next();
				cin.nextLine();
				System.out.print("Enter Disease:-");
				String disease = cin.nextLine();
				System.out.print("Enter Gender:-");
				String gender = cin.nextLine();
				System.out.print("Enter Age:-");
				int age = cin.nextInt();
				cin.nextLine();
				Patient p2 = new Patient(id, dname, age, gender, disease);
				h1.addPatient(p2);
				break;
			case 4:
				h1.showPat();
				break;
			case 5:
				h1.docPat();
				break;
			case 6:
				System.out.println("enter doctor id to remove");
				id = cin.nextInt();
				h1.delDoc(id);
				break;
			case 7:
				System.out.println("enter patient id to remove");
				id = cin.nextInt();
				h1.delPat(id);
				break;
			}
			System.out.println("\nReturn to Back Press 1");
			s1 = cin.nextInt();
		}
	}
}
