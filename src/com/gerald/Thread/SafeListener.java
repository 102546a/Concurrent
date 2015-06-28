package com.gerald.Thread;

import java.awt.Event;
import java.util.EventListener;

public class SafeListener {
	private final EventListener listener;
	private SafeListener(){
		listener = new EventListener() {
			public void onEvent(Event e){
				//dosth
			}
		};
	}
	public static SafeListener newInstance(EventSource source){
		SafeListener safe = new SafeListener();
		source.registerListener(safe.listener);
		return safe;
		
	}

}
