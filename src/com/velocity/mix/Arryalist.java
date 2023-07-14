package com.velocity.mix;

import java.util.ArrayList;
import java.util.Iterator;

public class Arryalist {

	public static void main(String[] args) {
ArrayList al = new ArrayList();
al.add("Rushi");
al.add(50);
al.add(86);
ArrayList al2= new ArrayList();
al.add("Vipul");
al.add(52);
al.addAll(al2);
Iterator itr = al.iterator();
while(itr.hasNext())
System.out.println(itr.next());


	}
}
