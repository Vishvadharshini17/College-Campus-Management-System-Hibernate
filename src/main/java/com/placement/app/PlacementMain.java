package com.placement.app;

import com.placement.bean.*;
import com.placement.service.PlacementService;

import java.sql.Date;
import java.util.Scanner;

public class PlacementMain {

    private static PlacementService service = new PlacementService();

    public static void main(String[] args) {
    	System.setProperty("org.jboss.logging.provider", "jdk");
    	java.util.logging.Logger.getLogger("org.hibernate")
    	        .setLevel(java.util.logging.Level.SEVERE);

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Campus Placement Management ===");

        try {

          
            System.out.print("Enter Student Registration Number: ");
            String regNo = sc.nextLine();

            Student s = service.viewStudentDetails(regNo);

            if (s != null) {
                System.out.println("\nSTUDENT FOUND");
                System.out.println("Reg No : " + s.getStudentRegNo());
                System.out.println("Name   : " + s.getFullName());
                System.out.println("Branch : " + s.getBranch());
                System.out.println("CGPA   : " + s.getCgpa());
            } else {
                System.out.println("STUDENT NOT FOUND");
                return;
            }

            System.out.print("\nEnter Company ID: ");
            String companyId = sc.nextLine();

            Company c = service.viewCompanyDetails(companyId);

            if (c != null) {
                System.out.println("\nCOMPANY FOUND");
                System.out.println("Company : " + c.getCompanyName());
                System.out.println("Role    : " + c.getJobRole());
                System.out.println("Status  : " + c.getStatus());
            } else {
                System.out.println("COMPANY NOT FOUND");
                return;
            }

            
            Date appliedDate = new Date(System.currentTimeMillis());

            boolean ok = service.applyForCompany(
                    regNo,
                    companyId,
                    appliedDate
            );

            if (ok)
                System.out.println("\nAPPLICATION SUBMITTED SUCCESSFULLY");
            else
                System.out.println("\nAPPLICATION FAILED");

        } catch (Exception e) {
            System.out.println("System Error: " + e);
        } finally {
            sc.close();
        }
    }
}