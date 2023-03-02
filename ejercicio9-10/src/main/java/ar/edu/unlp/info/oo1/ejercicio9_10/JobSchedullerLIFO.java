package ar.edu.unlp.info.oo1.ejercicio9_10;

public class JobSchedullerLIFO extends JobScheduler{

	
	public JobDescription next() {
    	JobDescription nextJob = null;
    	nextJob = super.getJobs().get(super.getJobs().size()-1);
    	super.unschedule(nextJob);
    	return nextJob;
	
	}
	
}
