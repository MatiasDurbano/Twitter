package com.Twitter;
import java.util.List;

import com.Interfaces.Network;
import com.Properties.PropertiesLoader;

public class TwitterNetworkImpl implements Network {
	
	private TwitterApi twitter;
	private InterpreterImpl interpreter;
	
	public TwitterNetworkImpl(){;
		this.twitter = new TwitterApi(new TwitterConfiguration(new PropertiesLoader()));
		interpreter= new InterpreterImpl();
	}
	
	@Override
	public List<String> get() {
		return interpreter.parseToString(twitter.obtenerTwitters());
	}

}
