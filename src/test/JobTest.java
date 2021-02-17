package test;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.CoreCompetency;
import org.launchcode.techjobs_oo.Employer;
import org.launchcode.techjobs_oo.Job;
import org.launchcode.techjobs_oo.Location;
import org.launchcode.techjobs_oo.PositionType;

//import java.io.File;
import static org.junit.Assert.*;

public class JobTest extends Job {

    Job job;
    Job job2;


    @Before
    @Test
    public void settingJobId() {

        job = new Job();
        job2 = new Job();
        assertFalse(job.getId() == job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        job = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
              new PositionType("Quality control"), new CoreCompetency("Persistence"));

        if (job instanceof Job) {
            assertEquals("Wrong Name ", job.getName(),"Product tester" );
            assertEquals("Wrong Employer ", job.getEmployer().getValue(),"ACME");
            assertEquals("Wrong Location ", job.getLocation().getValue(),"Desert" );
            assertEquals("Wrong Position Type ",  job.getPositionType().getValue(),"Quality control");
            assertEquals("Wrong Corecompetency Type ", job.getCoreCompetency().getValue(),"Persistence" );
        }

    }

    @Test
    public void testJobsForEquality() {
        job = new Job();
        job = new Job();

        assertTrue(getId() != job.getId());
    }

    @Test
    public void toStringTest() {
        String toString = job.toString();


        assertTrue(toString.contains("\nID: " + job.getId()));
        assertTrue(toString.contains("\nName: " + this.getName()));
        assertTrue(toString.contains("\nEmployer: " + this.getEmployer()));
        assertTrue(toString.contains("\nLocation: " + this.getLocation()));
        assertTrue(toString.contains("\nPosition Type: " + this.getPositionType()));
        assertTrue(toString.contains("\nCore Competency: " + this.getCoreCompetency()));

    }

}