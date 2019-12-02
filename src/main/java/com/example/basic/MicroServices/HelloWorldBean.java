package com.example.basic.MicroServices;

public class HelloWorldBean {

private String input;

public HelloWorldBean(String message)
{
	this.input=message;
}

public void setInput(String input) {
	this.input = input;
}

public String getInput() {
	return input;
}

@Override
public String toString()
{
return String.format("HelloWorldBean [message=%s]",input)	;
}

}
