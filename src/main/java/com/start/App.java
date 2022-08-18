package com.start;

import java.io.IOException;

import com.create.BuilderCV;
import com.create.Create;


public class App {

	private static String path_invoice = "/<..>/fattura.pdf";
	private static String path_resume = "<..>/resume.pdf";

	public static void main(String[] args) throws IOException {
		
		
		Create.createPDF(path_invoice);
		BuilderCV.createResume(path_resume);

	}

}
