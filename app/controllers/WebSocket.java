package controllers;

import java.util.ArrayList;

import play.libs.F;
import play.mvc.Controller;
import play.mvc.Http.Inbound;
import play.mvc.Http.Outbound;
import play.mvc.Http.WebSocketEvent;
import play.mvc.Http.WebSocketFrame;
import play.mvc.WebSocketController;

public class WebSocket extends Controller {

	public static ArrayList<Outbound> webSocketClient = new ArrayList();
	
	public static class RedisSocket extends WebSocketController {

		public static void message() {
			
			webSocketClient.add(outbound);
			System.out.println("websocket message");
			while (inbound.isOpen()) {
				WebSocketEvent e = await(inbound.nextEvent());
			}

			System.out.println("inbound close");
		}

	}
}
