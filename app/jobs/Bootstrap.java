package jobs;

import play.jobs.Job;
import play.jobs.OnApplicationStart;

@OnApplicationStart
public class Bootstrap extends Job{
	
	public void doJob(){
    	RedisJob job = new RedisJob();
    	job.now();
	}

}
