package com.tnif.dayfour;
import java.util.*;
import java.io.*;

public class Buffer_demo {

	public static void main(String[] args )throws IOException {
	     int eid;
	     String ename;
	     double salary;
	     BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	     System.out.println("Enter the id ");
	     eid =Integer.parseInt(br.readLine());
	     System.out.println("Enter the name ");
	     ename=br.readLine();
	     System.out.println("Enter the salary ");
	     salary=Double.parseDouble(br.readLine());
	     System.out.println("Employee id" + eid);
	     System.out.println("Employee name" + ename);
	     System.out.println("Employee salary " + salary);
	     
	     

	}

}
