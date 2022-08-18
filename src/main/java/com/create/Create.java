package com.create;

import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.itextpdf.kernel.colors.DeviceRgb;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.borders.Border;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.properties.TextAlignment;
import com.itextpdf.layout.properties.VerticalAlignment;

public class Create {
	private Create() {
	}

	public static void createPDF(String path) throws FileNotFoundException {

		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String format = formatter.format(date);

		Document doc = GetDocument.get(path);

		// Creating a table
		float col = 280f;
		float[] pointColumnWidths = { col, col };
		Table table = new Table(pointColumnWidths);

		// first Section
		table.setBackgroundColor(new DeviceRgb(63, 169, 219));
		table.setFontColor(new DeviceRgb(255, 255, 255));

		table.addCell(new Cell().add(new Paragraph("Fattura")).setTextAlignment(TextAlignment.LEFT)
				.setVerticalAlignment(VerticalAlignment.TOP).setPaddingTop(30f).setPaddingBottom(30f)
				.setPaddingLeft(20f).setFontSize(25f).setBorder(Border.NO_BORDER));

		table.addCell(new Cell().add(new Paragraph("advancia\ntechnology\n2022")).setTextAlignment(TextAlignment.RIGHT)
				.setPaddingTop(30f).setPaddingBottom(30f).setPaddingRight(20f).setBorder(Border.NO_BORDER));

		// mid section
		float[] colwidht = { 80, 300, 100, 80 };

		Table costumerinfo = new Table(colwidht);

		costumerinfo.addCell(
				new Cell(0, 4).add(new Paragraph("Info")).setBold().setBorder(Border.NO_BORDER).setPaddingTop(50f));

		costumerinfo.addCell(new Cell().add(new Paragraph("Nome")).setBorder(Border.NO_BORDER));
		costumerinfo.addCell(new Cell().add(new Paragraph("Data:")).setBorder(Border.NO_BORDER));
		costumerinfo.addCell(new Cell().add(new Paragraph("Fattura N.")).setBorder(Border.NO_BORDER));
		costumerinfo.addCell(new Cell().add(new Paragraph("Codice")).setBorder(Border.NO_BORDER));

		costumerinfo.addCell(new Cell().add(new Paragraph("Utente Uno")).setBorder(Border.NO_BORDER));
		costumerinfo.addCell(new Cell().add(new Paragraph(format)).setBorder(Border.NO_BORDER));
		costumerinfo.addCell(new Cell().add(new Paragraph("617461f1")).setBorder(Border.NO_BORDER));
		costumerinfo.addCell(new Cell().add(new Paragraph("12345")).setBorder(Border.NO_BORDER));

		// last section

		float[] itemsinfo = { 140, 140, 140, 140 };

		Table info = new Table(itemsinfo);

		info.addCell(new Cell().add(new Paragraph("Servizio")).setBackgroundColor(new DeviceRgb(63, 169, 219))
				.setFontColor(new DeviceRgb(255, 255, 255)));
		info.addCell(new Cell().add(new Paragraph("Ore")).setBackgroundColor(new DeviceRgb(63, 169, 219))
				.setFontColor(new DeviceRgb(255, 255, 255)));
		info.addCell(new Cell().add(new Paragraph("Prezzo")).setBackgroundColor(new DeviceRgb(63, 169, 219))
				.setFontColor(new DeviceRgb(255, 255, 255)));
		info.addCell(new Cell().add(new Paragraph("Totale")).setBackgroundColor(new DeviceRgb(63, 169, 219))
				.setFontColor(new DeviceRgb(255, 255, 255)));

		info.addCell(new Cell().add(new Paragraph("Web Service")));
		info.addCell(new Cell().add(new Paragraph("10")));
		info.addCell(new Cell().add(new Paragraph("10")));
		info.addCell(new Cell().add(new Paragraph("100")));

		info.addCell(new Cell().add(new Paragraph("App Service")));
		info.addCell(new Cell().add(new Paragraph("9")));
		info.addCell(new Cell().add(new Paragraph("10")));
		info.addCell(new Cell().add(new Paragraph("100")));

		info.addCell(new Cell().add(new Paragraph("")).setMarginTop(20f));
		info.addCell(new Cell().add(new Paragraph("")));
		info.addCell(new Cell().add(new Paragraph("20")));
		info.addCell(new Cell().add(new Paragraph("200")));

		// Adding Table to document
		doc.add(table);

		doc.add(costumerinfo);
		doc.add(new Paragraph("\n"));
		doc.add(info);

		// Closing the document
		doc.close();
		System.out.println("Pdf created successfully..");
	}

}
