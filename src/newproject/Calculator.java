package newproject;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Calculator {
	public static void main(String[] args) throws IOException {
    	File file = new File("D:\\jakay.html");
    	FileWriter filewritter = new FileWriter(file, true);
    	BufferedWriter bwritter = new BufferedWriter(filewritter);
    	bwritter.write("<!DOCTYPE html>"+"\n");
    	bwritter.write("<html>"+"\n");
    	bwritter.write("<head>"+"\n");
    	bwritter.write("<style>"+"\n");
    	bwritter.write("table { font-family: arial, sans-serif;  border-collapse: collapse; width: 100%;\r\n}"+"\n");
    	bwritter.write("td, th {\r\border: 1px solid #dddddd;\r\n" +" text-align: left;\r\n" +"padding: 8px;\r\n" + "}\r\n" +"}"+"\n");
    	bwritter.write("td, th {\r\n" +" border: 1px solid #dddddd;\r\n" + "text-align: left;\r\n" + "padding: 8px;\r\n" +"}"+"\n");
    	bwritter.write("tr:nth-child(even) {\r\n" +" background-color: #dddddd;\r\n" + "\r\n" + "}"+"\n");
        bwritter.write("</style>"+"\n");
    	bwritter.write("</head>"+"\n");
    	bwritter.write("<body>");
    	bwritter.write("<h2>TESTCASES TABLE</h2>"+"\n");
    	bwritter.write("\r\n"+"<table>"+"\n");
    	bwritter.write("<tr>"+"\n");
    	bwritter.write("<th>SERIAL NO</th>"+"\n");
    	bwritter.write("<th>URL</th>"+"\n");
    	bwritter.write("<th>PROJECT DETAILS</th>"+"\n");
    	bwritter.write("<th>PROJECT START TIME</th>"+"\n");
    	bwritter.write("</tr>"+"\n");
    	bwritter.write("<tr>"+"\n");
    	bwritter.write("<td></td>"+"\n");
    	bwritter.write("<td></td>"+"\n");
    	bwritter.write("<td></td>"+"\n");
    	bwritter.write("<td></td>"+"\n");
    	bwritter.write("</tr>"+"\n");
       
    	bwritter.write("</table>"+"\n");
    	bwritter.write("</body>"+"\n");
    	bwritter.write("</html>"+"\n");
    	bwritter.flush();
    	
    	bwritter.close();
    	
    	System.out.println("File is successfully written and saved!!!");
    	
    	
}
}

