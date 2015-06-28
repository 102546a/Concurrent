package com.gerald.Thread;

import java.awt.Event;
import java.util.EventListener;

public class ThisEscape {
	public ThisEscape(EventSource source){
		new EventListener() {
			public void onEvent(Event e){
				//dosth;
			}
		};
	}

}
