package com.twitter;
import java.util.List;

import com.interfaces.Network;
import com.properties.PropertiesLoader;

public class TwitterNetworkImpl implements Network {
	
	private TwitterController twitter;
	private InterpreterImpl interpreter;
	
	public TwitterNetworkImpl(){;
		this.twitter = new TwitterController(new TwitterConfiguration(new PropertiesLoader()));
		interpreter= new InterpreterImpl();
	}
	
	@Override
	public List<String> get() {
		return interpreter.parseToString(twitter.obtenerTwitters());
	}

}
