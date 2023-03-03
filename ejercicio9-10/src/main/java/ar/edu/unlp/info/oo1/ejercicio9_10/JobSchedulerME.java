package ar.edu.unlp.info.oo1.ejercicio9_10;

public class JobSchedulerME extends JobScheduler{

	
	public JobDescription next() {
    	JobDescription nextJob = null;
    	nextJob = super.getJobs().stream()
     			.max((j1,j2) -> Double.compare(j1.getEffort(), j2.getEffort()))
     			.orElse(null);
    	super.unschedule(nextJob);
    	return nextJob;
	
	}
}
