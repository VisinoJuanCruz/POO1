package ar.edu.unlp.info.oo1.ejercicio9_10;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class JobSchedulerTest {
    protected JobDescription firstJob;
    protected JobDescription highestPriorityJob;
    protected JobDescription mostEffortJob;
    protected JobDescription lastJob;
  
    
    private void initializeJobs() {
    	
    	firstJob = new JobDescription (1, 1, "Este es el primero");
    	highestPriorityJob = new JobDescription (1, 100, "Este es el de m�s prioridad");
    	mostEffortJob = new JobDescription (100, 1, "Este es el de m�s esfuerzo");
    	lastJob = new JobDescription (1, 1, "Este es el �ltimo");
    	
    }
    
    @BeforeEach
    void setUp() {
    	this.initializeJobs();
    } 
    
    private JobScheduler newFifoScheduler() {
    	JobSchedulerFIFO fifoScheduler = new JobSchedulerFIFO();
    	fifoScheduler.setStrategy("FIFO");
    	return fifoScheduler;
    }
    
    private JobScheduler newLifoScheduler() {
    	JobSchedulerLIFO lifoScheduler = new JobSchedulerLIFO();
    	lifoScheduler.setStrategy("LIFO");
    	return lifoScheduler;
    }
    
    private JobSchedulerHP newPriorityScheduler() {
    	JobSchedulerHP priorityScheduler = new JobSchedulerHP();
    	priorityScheduler.setStrategy("HighestPriority");
    	return priorityScheduler;
    }
    
    private JobSchedulerME newEffortScheduler() {
    	JobSchedulerME effortScheduler = new JobSchedulerME();
    	effortScheduler.setStrategy("MostEffort");
    	return effortScheduler;
    }
    
    private void scheduleJobsIn(JobScheduler aJobScheduler) {
    	aJobScheduler.schedule(firstJob);
    	aJobScheduler.schedule(highestPriorityJob);
    	aJobScheduler.schedule(mostEffortJob);
    	aJobScheduler.schedule(lastJob);
    }
    
    @Test
    void testSchedule() {
    	JobScheduler aScheduler = new JobScheduler();
    	aScheduler.schedule(highestPriorityJob);
    	assertTrue(aScheduler.getJobs().contains(highestPriorityJob));
    } 
    
    @Test
    void testUnschedule() {
    	JobScheduler aScheduler = new JobScheduler();
    	this.scheduleJobsIn(aScheduler);
    	aScheduler.unschedule(highestPriorityJob);
    	assertFalse(aScheduler.getJobs().contains(highestPriorityJob));   	
    }
    
    @Test
    void testNext() {
    	JobSchedulerFIFO schedulerFIFO;
    	
    	schedulerFIFO = new JobSchedulerFIFO();
    	this.scheduleJobsIn(schedulerFIFO);
    	assertEquals(schedulerFIFO.next(), firstJob);
    	assertEquals(schedulerFIFO.getJobs().size(), 3);
    	
    	JobSchedulerLIFO schedulerLIFO;
    	schedulerLIFO = new JobSchedulerLIFO();
    	this.scheduleJobsIn(schedulerLIFO);
    	assertEquals(schedulerLIFO.next(), lastJob);
    	assertEquals(schedulerLIFO.getJobs().size(), 3);

    	JobSchedulerHP schedulerHP;
    	schedulerHP = new JobSchedulerHP();
    	this.scheduleJobsIn(schedulerHP);
    	assertEquals(schedulerHP.next(), highestPriorityJob);
    	assertEquals(schedulerHP.getJobs().size(), 3);

    	JobSchedulerME schedulerME;
    	schedulerME = new JobSchedulerME();
    	this.scheduleJobsIn(schedulerME);
    	assertEquals(schedulerME.next(), mostEffortJob);
    	assertEquals(schedulerME.getJobs().size(), 3);

    }
}
