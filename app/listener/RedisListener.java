package listener;

import play.mvc.Http.Outbound;
import redis.clients.jedis.JedisPubSub;
import controllers.WebSocket;

public class RedisListener extends JedisPubSub{

	@Override
	public void onMessage(String channel, String message) {

		System.out.println("Chanel : " + channel + " - Message : " + message);
		for (Outbound outbound : WebSocket.webSocketClient) {
			outbound.send(message);
		}
	
	}

	@Override
	public void onPMessage(String pattern, String channel, String message) {
		System.out.println("Pattern : " + pattern +" Chanel : " + channel + " - Message : " + message);		
	}

	@Override
	public void onPSubscribe(String arg0, int arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onPUnsubscribe(String arg0, int arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onSubscribe(String arg0, int arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onUnsubscribe(String arg0, int arg1) {
		// TODO Auto-generated method stub
		
	}

}
