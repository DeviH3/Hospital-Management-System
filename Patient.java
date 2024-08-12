import java.util.*;
import java.io.*;

public class Patient {
	private int id;
	private String patientName;
	private int patientAge;
	private String patientGender;
	private String disease;

	Patient(int patientid, String patientName, int patientAge, String patientGender, String disease) {
		this.id = patientid;
		this.patientName = patientName;
		this.patientGender = patientGender;
		this.patientAge = patientAge;
		this.disease = disease;
	}

	public int getId() {
		return id;
	}

	public String getDisease() {
		return disease;
	}

	public String getName() {
		return patientName;
	}

	public int getAge() {
		return patientAge;
	}

	public String getGender() {
		return patientGender;
	}

	public String toString() {
		return (id + "" + patientName + "" + patientAge + "" + patientGender + " " + disease);
	}
}
