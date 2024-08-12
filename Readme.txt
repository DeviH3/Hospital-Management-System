Hospital Management System 

Overview

This project is a simple Hospital Management System implemented in Java. It allows you to manage doctors and patients within a hospital. The system provides functionality to add, view, and remove doctors and patients, as well as assign patients to appropriate doctors based on their medical needs.

Features

- Add Doctor : Allows the user to add a new doctor to the hospital's list of doctors.
- View Doctors : Displays a list of all doctors in the hospital, including their ID, name, and specialization.
- Add Patient : Allows the user to add a new patient to the hospital's list of patients.
- View Patients : Displays a list of all patients, including their ID, name, age, gender, and disease.
- Assign Patients to Doctors : Automatically assigns patients to doctors based on the disease the patient has and the doctor's specialization.
- Remove Doctor : Allows the user to remove a doctor from the hospital's list.
- Remove Patient: Allows the user to remove a patient from the hospital's list.

Classes

1. Demo :
   - This is the main class where the program execution starts.
   - It contains the menu-driven code that interacts with the user and performs operations based on the user's choices.

2. Hospital :
   - Manages lists of doctors and patients.
   - Contains methods to add, view, and remove doctors and patients.
   - Contains logic to assign patients to appropriate doctors based on the disease.

3. Doctor :
   - Represents a doctor with attributes like ID, name, specialization, and a list of assigned patients.
   - Contains methods to get and set doctor details and manage the list of patients assigned to the doctor.

4. Patient :
   - Represents a patient with attributes like ID, name, age, gender, and disease.
   - Contains methods to get patient details.

