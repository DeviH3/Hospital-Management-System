import java.util.*;
import java.io.*;

public class Hospital {

	List<Doctor> doctorList = new ArrayList<Doctor>();
	List<Patient> patientList = new ArrayList<Patient>();
	String hospitalName;

	void addDoctor(Doctor o) {
		doctorList.add(o);

	}

	void addPatient(Patient o) {
		patientList.add(o);
	}

	Hospital(String name) {
		this.hospitalName = name;
	}

	public void showDoc() {
		System.out.println("id \t name \t specialisation");
		int c = 1;
		for (Doctor y : doctorList) {
			System.out.println(y.getId() + " \t " + y.getDoctorName() + " \t " + y.getDoctorspeciality());
			c++;
		}
	}

	public void showPat() {
		System.out.println("id\tname\tdisease\t age\tgender");
		int c2 = 1;
		for (Patient x : patientList) {
			System.out.println(
					x.getId() + "\t" + x.getName() + "\t" + x.getDisease() + "\t" + x.getAge() + "\t" + x.getGender());
			c2++;
		}
	}

	public List<Patient> showPatients() {
		return patientList;
	}

	public void delDoc(int n) {
		for (Doctor y : doctorList) {
			if (y.getId() == n) {
				int z = doctorList.indexOf(y);
				doctorList.remove(z);
				System.out.println("deleted from list");
				break;
			}
		}

	}

	public void delPat(int n) {
		for (Patient x : patientList) {
			if (x.getId() == n) {
				int z = patientList.indexOf(x);
				patientList.remove(z);
				System.out.println("deleted from list");
				break;
			}
		}

	}

	public void docPat() {
		System.out.println("id\tpatient\tdoctor");
		int c2 = 1;
		for (Patient x : patientList) {
			for (Doctor y : doctorList) {
				if (x.getDisease().equals("eye")) {
					if (y.getDoctorspeciality().equalsIgnoreCase("Opthalmologist")) {
						System.out.println(c2 + "\t" + x.getName() + "\t" + y.getDoctorName());
						c2++;
					}
				}
				if (x.getDisease().equals("heart")) {
					if (y.getDoctorspeciality().equalsIgnoreCase("Surgeon")) {
						System.out.println(c2 + "\t" + x.getName() + "\t" + y.getDoctorName());
						c2++;
					}
				}

				if (x.getDisease().equals("earnose")) {
					if (y.getDoctorspeciality().equalsIgnoreCase("ENT")) {
						System.out.println(c2 + "\t" + x.getName() + "\t" + y.getDoctorName());
						c2++;
					}
				}

			}
		}

	}

}
