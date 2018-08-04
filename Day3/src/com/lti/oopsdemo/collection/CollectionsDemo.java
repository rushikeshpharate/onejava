package com.lti.oopsdemo.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.w3c.dom.ls.LSException;

public class CollectionsDemo implements IProduct {

	ArrayList<String> lst = new ArrayList();

	public void add() {
		lst.add("a");
		lst.add("b");
		System.out.println(lst);
		
	}

}
