package com.placement.bean;

import java.math.BigDecimal;
import java.sql.Date;
import jakarta.persistence.*;

@Entity
@Table(name = "COMPANY_TBL")
public class Company {

    @Id
    @Column(name = "COMPANY_ID")
    private String companyID;

    @Column(name = "COMPANY_NAME")
    private String companyName;

    @Column(name = "JOB_ROLE")
    private String jobRole;

    @Column(name = "CTC_LPA")
    private BigDecimal ctcLpa;

    @Column(name = "ELIGIBLE_BRANCHES")
    private String eligibleBranches;

    @Column(name = "MINIMUM_CGPA")
    private BigDecimal minimumCgpa;

    @Column(name = "DRIVE_DATE")
    private Date driveDate;

    @Column(name = "STATUS")
    private String status;

    public Company() {}

	public String getCompanyID() {
		return companyID;
	}

	public void setCompanyID(String companyID) {
		this.companyID = companyID;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getJobRole() {
		return jobRole;
	}

	public void setJobRole(String jobRole) {
		this.jobRole = jobRole;
	}

	public BigDecimal getCtcLpa() {
		return ctcLpa;
	}

	public void setCtcLpa(BigDecimal ctcLpa) {
		this.ctcLpa = ctcLpa;
	}

	public String getEligibleBranches() {
		return eligibleBranches;
	}

	public void setEligibleBranches(String eligibleBranches) {
		this.eligibleBranches = eligibleBranches;
	}

	public BigDecimal getMinimumCgpa() {
		return minimumCgpa;
	}

	public void setMinimumCgpa(BigDecimal minimumCgpa) {
		this.minimumCgpa = minimumCgpa;
	}

	public Date getDriveDate() {
		return driveDate;
	}

	public void setDriveDate(Date driveDate) {
		this.driveDate = driveDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
    

    // Getters and Setters
}
