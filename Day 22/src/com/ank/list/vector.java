package com.ank.list;
import java.util.*;  
public class vector{  
public static void main(String args[]){  
Vector<String> v=new Vector<String>();  
v.add("Aman");  
v.add("Taran");  
v.add("Sam");  
v.add("Yash");  
Iterator<String> itr=v.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  