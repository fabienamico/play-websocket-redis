package jobs;

import listener.RedisListener;
import play.jobs.Job;
import play.jobs.OnApplicationStart;
import play.modules.redis.Redis;

public class RedisJob extends Job{
	
	public void doJob(){
		RedisListener redisListener = new RedisListener();
    	Redis.subscribe(redisListener, "playChanel".split(":"));
	}

}
