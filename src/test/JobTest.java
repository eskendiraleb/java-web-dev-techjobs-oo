package test;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.CoreCompetency;
import org.launchcode.techjobs_oo.Employer;
import org.launchcode.techjobs_oo.Job;
import org.launchcode.techjobs_oo.Location;
import org.launchcode.techjobs_oo.PositionType;

import static org.junit.Assert.*;
public class JobTest extends Job {

    Job job;


    @Before

    @Test
    public void settingJobId() {

        job = new Job();
        job = new Job();
        assertFalse(job.getId() == job.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        job = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));

        if (job instanceof Job) {
            assertEquals("Wrong Name ", "Product tester", job.getName());
            assertEquals("Wrong Employer ", "ACME", job.getEmployer().getValue());
            assertEquals("Wrong Location ", "Desert", job.getLocation().getValue());
            assertEquals("Wrong Position Type ", "Quality control", job.getPositionType().getValue());
            assertEquals("Wrong Corecompetency Type ", "Persistence", job.getCoreCompetency().getValue());
        }

    }

    @Test
    public void testJobsForEquality() {
        job = new Job();
        job = new Job();

        assertTrue(getId() != job.getId());
    }

    @Test
    public void toStringTest1() {
        String toString = job.toString();

       // assertTrue(toString.contains("\n\nID: " + String.valueOf(this.getId())));
        assertTrue(toString.contains("\nName: " + this.getName()));
        assertTrue(toString.contains("\nEmployer: " + this.getEmployer()));
        assertTrue(toString.contains("\nLocation: " + this.getLocation()));
        assertTrue(toString.contains("\nPosition Type: " + this.getPositionType()));
        assertTrue(toString.contains("\nCore Competency: " + this.getCoreCompetency()));


    }


}