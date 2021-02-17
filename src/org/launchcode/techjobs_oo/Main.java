package org.launchcode.techjobs_oo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
        Job job3 = new Job("Ice cream taster", new Employer(""), new Location("Home"), new PositionType("UX"), new CoreCompetency("Taste"));

        ArrayList<Job> jobs = new ArrayList<>();
        jobs.add(job1);
        jobs.add(job2);
        jobs.add(job3);

        //if (this.employer.getValue().isEmpty()) employer.setValue("Data Not available");


       // System.out.println(Job);
        for (Job job : jobs) {
           // System.out.println(job);
            if (job.getEmployer().getValue().isEmpty()) job.getEmployer().setValue("Data Not available");
            if (job.getLocation().getValue().isEmpty()) job.getLocation().setValue("Data Not available");
            if (job.getPositionType().getValue().isEmpty()) job.getPositionType().setValue("Data Not available");
            if (job.getCoreCompetency().getValue().isEmpty()) job.getCoreCompetency().setValue("Data Not available");
            System.out.println(job.toString());
        }
    }
}

