import java.util.*;
import java.io.*;

public class Doctor {
	private int id;
	private String doctorName;
	private String doctorSpeciality;
	String doctorStatus;
	List<Patient> doctorPatientList = new ArrayList<Patient>();

	Doctor(int c1, String c, String cc) {
		this.id = c1;
		this.doctorName = c;
		this.doctorSpeciality = cc;

	}

	public int getId() {
		return id;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public List<Patient> getDoctorPatientList() {
		return doctorPatientList;
	}

	public void addPatientsToDoctor(Patient o) {
		doctorPatientList.add(o);
	}

	String getDoctorspeciality() {
		return doctorSpeciality;
	}

	public String toString() {
		return (id + " " + doctorName + "" + doctorSpeciality);
	}

}
