package com.Twitter;

import java.util.ArrayList;
import java.util.List;

import com.Interfaces.Interpreter;

import twitter4j.Status;


public class InterpreterImpl implements Interpreter{

	@Override
	public List<String> parseToString(Object arg) {
		List<Status> list= (List<Status>) arg;
		List<String> ret = new ArrayList<String>();
		
		for(Status status: list) {
			ret.add(status.getText());
		}
		
		return ret;
		
	}

}
