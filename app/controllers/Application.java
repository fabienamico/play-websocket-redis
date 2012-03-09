package controllers;

import play.*;
import play.libs.F;
import play.modules.redis.Redis;
import play.mvc.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.*;

import jobs.RedisJob;

import listener.RedisListener;


public class Application extends Controller {
	
    public static void index() {
        render();   	
    }

}