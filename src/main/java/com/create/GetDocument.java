package com.create;

import java.io.FileNotFoundException;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;

public class GetDocument {

	private GetDocument() {
	}

	public static Document get(String path) throws FileNotFoundException {

		PdfWriter writer = new PdfWriter(path);

		PdfDocument pdf = new PdfDocument(writer);

		return new Document(pdf);

	}

}
