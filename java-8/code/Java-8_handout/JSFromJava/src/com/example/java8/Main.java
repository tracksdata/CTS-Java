package com.example.java8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.nio.file.Files;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {

		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("nashorn");

//		String script = "var welcome='Hello';"
//				+ "welcome+=', Naga';"
//				+ "welcome;";

		File f=new File("scripts/readurl.js");
		Reader reader=new FileReader(f);
		
		Object result;
		try {
			result = (String)engine.eval(reader);
			System.out.println(result);
		} catch (ScriptException e) {
			System.out.println("There was a Javascript error");
			e.printStackTrace();
		}

	}

}
