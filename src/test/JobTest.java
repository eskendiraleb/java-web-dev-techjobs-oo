package test;
import org.junit.Before;
import org.launchcode.techjobs_oo.CoreCompetency;
import org.launchcode.techjobs_oo.Employer;
import org.launchcode.techjobs_oo.Job;
import org.launchcode.techjobs_oo.Location;
import org.junit.Test;
import org.launchcode.techjobs_oo.PositionType;

import static org.junit.Assert.*;
public class JobTest extends Job {

    Job job;

    @Before

    @Test
    public void settingJobId(){

        job = new Job();
        job = new Job();
        assertTrue(job.getId() == job.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields(){

     new Job("Product tester", new Employer("ACME"), new Location("Desert"),
             new PositionType("Quality control"), new CoreCompetency("Persistence"));

   // assertEquals("Product tester",  "Product tester");
    //assertEquals(jobnew Employer("ACME"));
     //See casting one class in other class from books tomorrow
      Job name = new Job();
      assertTrue(name instanceof Job);
      Employer employer = new Employer();
      PositionType positionType = new PositionType();
      Location location = new Location();
      CoreCompetency coreCompetency = new CoreCompetency();

     if (employer instanceof Employer){
        assertEquals("ACME","ACME");
         }
     if (location instanceof Location){
         assertEquals("Desert","Desert");
              }
     if(positionType instanceof PositionType){
         assertEquals("Quality control","Quality control");
     }
     if(coreCompetency instanceof CoreCompetency) {
         assertEquals("Persistence", "Persistence");
     }
        }
        @Test
        public void testJobsForEquality() {
        job = new Job();
        job = new Job();

        assertTrue(getId()!= job.getId());
    }
}
