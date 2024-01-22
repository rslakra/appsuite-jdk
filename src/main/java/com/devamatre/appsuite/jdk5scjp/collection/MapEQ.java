package com.devamatre.appsuite.jdk5scjp.collection;

import java.util.HashMap;
import java.util.Map;

public class MapEQ {
	class ToDo {
		String str;
		ToDo(String str) {
			this.str = str;
		}
	}

	public static void main(String[] args) {
		Map<ToDos, String> m = new HashMap<ToDos, String>();
		ToDos t1 = new ToDos("Monday");
		ToDos t2 = new ToDos("Monday");
		ToDos t3 = new ToDos("Tuesday");
// MapEQ.ToDo tt = new MapEQ().new ToDo("Tuesday");
// m.add(t1, "doSomething");
// m.add(t1, "enjoy");
// m.add(t1, "test");
		
	}
}

class ToDos {
	String str;
	ToDos(String str) {
		this.str = str;
	}
}
