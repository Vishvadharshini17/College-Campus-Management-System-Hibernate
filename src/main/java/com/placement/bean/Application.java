package com.placement.bean;

import java.sql.Date;
import jakarta.persistence.*;

@Entity
@Table(name = "APPLICATION_TBL")
public class Application {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "app_seq")
	@SequenceGenerator(
	    name = "app_seq",
	    sequenceName = "APPLICATION_SEQ",
	    allocationSize = 1
	)
	@Column(name = "APPLICATION_ID")
	private int applicationID;

   
    @ManyToOne
    @JoinColumn(name = "STUDENT_REG_NO")
    private Student student;

   
    @ManyToOne
    @JoinColumn(name = "COMPANY_ID")
    private Company company;

    @Column(name = "APPLIED_DATE")
    private Date appliedDate;

    @Column(name = "APPLICATION_STATUS")
    private String applicationStatus;

    @Column(name = "INTERVIEW_DATE")
    private Date interviewDate;

    @Column(name = "INTERVIEW_SLOT")
    private String interviewSlot;

    @Column(name = "INTERVIEW_PANEL")
    private String interviewPanel;

    @Column(name = "FINAL_OUTCOME")
    private String finalOutcome;

    public Application() {}


    public int getApplicationID() {
        return applicationID;
    }

    public void setApplicationID(int applicationID) {
        this.applicationID = applicationID;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Date getAppliedDate() {
        return appliedDate;
    }

    public void setAppliedDate(Date appliedDate) {
        this.appliedDate = appliedDate;
    }

    public String getApplicationStatus() {
        return applicationStatus;
    }

    public void setApplicationStatus(String applicationStatus) {
        this.applicationStatus = applicationStatus;
    }

    public Date getInterviewDate() {
        return interviewDate;
    }

    public void setInterviewDate(Date interviewDate) {
        this.interviewDate = interviewDate;
    }

    public String getInterviewSlot() {
        return interviewSlot;
    }

    public void setInterviewSlot(String interviewSlot) {
        this.interviewSlot = interviewSlot;
    }

    public String getInterviewPanel() {
        return interviewPanel;
    }

    public void setInterviewPanel(String interviewPanel) {
        this.interviewPanel = interviewPanel;
    }

    public String getFinalOutcome() {
        return finalOutcome;
    }

    public void setFinalOutcome(String finalOutcome) {
        this.finalOutcome = finalOutcome;
    }
}
