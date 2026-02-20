package com.placement.bean;

import java.math.BigDecimal;
import jakarta.persistence.*;

@Entity
@Table(name = "STUDENT_TBL")
public class Student {

    @Id
    @Column(name = "STUDENT_REG_NO")
    private String studentRegNo;

    @Column(name = "FULL_NAME")
    private String fullName;

    @Column(name = "BRANCH")
    private String branch;

    @Column(name = "CURRENT_SEMESTER")
    private int currentSemester;

    @Column(name = "CGPA")
    private BigDecimal cgpa;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "MOBILE")
    private String mobile;

    @Column(name = "STATUS")
    private String status;

    public Student() {}

	public String getStudentRegNo() {
		return studentRegNo;
	}

	public void setStudentRegNo(String studentRegNo) {
		this.studentRegNo = studentRegNo;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public int getCurrentSemester() {
		return currentSemester;
	}

	public void setCurrentSemester(int currentSemester) {
		this.currentSemester = currentSemester;
	}

	public BigDecimal getCgpa() {
		return cgpa;
	}

	public void setCgpa(BigDecimal cgpa) {
		this.cgpa = cgpa;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
    

    // Getters and Setters
}
