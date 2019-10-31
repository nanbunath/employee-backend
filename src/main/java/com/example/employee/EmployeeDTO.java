package com.example.employee;
import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="EMPLOYEE")
public class EmployeeDTO implements Serializable,Comparable<EmployeeDTO> {
        @Id
        @GeneratedValue (strategy = GenerationType.IDENTITY)
        @Column(name = "EMPLOYEE_ID")
        private long employeeId;

        @Column(name = "FIRST_NAME")
        private String firstName;

        @Column(name = "LAST_NAME")
        private String lastName;


        @Column(name = "GENDER")
        private String gender;

        @Column(name = "DOB")
        private String dateOfBirth;

        @Column(name="DEPARTMENT")
        private String department;

        public long getEmployeeId() {
                return employeeId;
        }

        public void setEmployeeId(long employeeId) {
                this.employeeId = employeeId;
        }

        public String getFirstName() {
                return firstName;
        }

        public void setFirstName(String firstName) {
                this.firstName = firstName;
        }

        public String getLastName() {
                return lastName;
        }

        public void setLastName(String lastName) {
                this.lastName = lastName;
        }

        public String getGender() {
                return gender;
        }

        public void setGender(String gender) {
                this.gender = gender;
        }

        public String getDateOfBirth() {
                return dateOfBirth;
        }

        public void setDateOfBirth(String dateOfBirth) {
                this.dateOfBirth = dateOfBirth;
        }

        public String getDepartment() {
                return department;
        }

        public void setDepartment(String department) {
                this.department = department;
        }

        @Override
        public int compareTo(EmployeeDTO employeeDTO) {
                return employeeDTO.getFirstName().compareTo(this.getFirstName());
        }
}
