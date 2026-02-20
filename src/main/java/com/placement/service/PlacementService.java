package com.placement.service;

import com.placement.bean.*;
import com.placement.dao.*;
import com.placement.util.*;

import java.sql.Date;
import java.util.List;

public class PlacementService {

    private StudentDAO studentDAO = new StudentDAO();
    private CompanyDAO companyDAO = new CompanyDAO();
    private ApplicationDAO applicationDAO = new ApplicationDAO();

    // Register Student
    public boolean registerNewStudent(Student s)
            throws ValidationException, Exception {

        if (s.getStudentRegNo() == null || s.getStudentRegNo().isEmpty())
            throw new ValidationException();

        s.setStatus("ACTIVE");
        return studentDAO.insertStudent(s);
    }

    // Register Company
    public boolean registerCompanyDrive(Company c)
            throws ValidationException, Exception {

        if (c.getCompanyID() == null || c.getCompanyID().isEmpty())
            throw new ValidationException();

        c.setStatus("OPEN");
        return companyDAO.insertCompany(c);
    }

    // View Student
    public Student viewStudentDetails(String regNo) throws Exception {
        return studentDAO.findStudentByRegNo(regNo);
    }

    // View Company
    public Company viewCompanyDetails(String companyId) throws Exception {
        return companyDAO.findCompanyById(companyId);
    }

    // Apply For Company (UPDATED FOR RELATIONSHIP)
    public boolean applyForCompany(String regNo, String companyId, Date appliedDate)
            throws ValidationException, EligibilityViolationException, Exception {

        Student s = studentDAO.findStudentByRegNo(regNo);
        Company c = companyDAO.findCompanyById(companyId);

        if (s == null || c == null)
            throw new ValidationException();

        if (!c.getEligibleBranches().contains(s.getBranch()))
            throw new EligibilityViolationException();

        if (s.getCgpa().compareTo(c.getMinimumCgpa()) < 0)
            throw new EligibilityViolationException();

        Application a = new Application();

        // 🔥 SET OBJECTS NOT IDs
        a.setStudent(s);
        a.setCompany(c);

        a.setAppliedDate(appliedDate);
        a.setApplicationStatus("APPLIED");

        return applicationDAO.insertApplication(a);
    }

    // List Applications
    public List<Application> listApplicationsByStudent(String regNo)
            throws Exception {

        return applicationDAO.findApplicationsByStudent(regNo);
    }
}
