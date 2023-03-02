package ar.edu.unlp.info.oo1.ejercicio9_10;

public class JobSchedulerFIFO extends JobScheduler{

	
	public JobDescription next() {
    	JobDescription nextJob = null;
    	nextJob = super.getJobs().get(0);
    	super.unschedule(nextJob);
    	return nextJob;
	
	}
	
	
}
