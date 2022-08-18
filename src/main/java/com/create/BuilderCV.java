/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.create;

import java.io.IOException;

import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.properties.TextAlignment;

public class BuilderCV {

	private BuilderCV() {
	}

	private static String imageFile = "0.jpeg";

	public static void createResume(String path) throws IOException {

		ImageData data1 = ImageDataFactory.create(imageFile);

		Image img = new Image(data1);

		Document resume = GetDocument.get(path);

		// CFFFont font2 = new Font(Font.FontFamily.HELVETICA, 18, Font.BOLD);
		Paragraph name = new Paragraph("curriculum vitae").setFontSize(9f).setTextAlignment(TextAlignment.RIGHT);
		resume.add(name);
		resume.add(new Paragraph("Guido Cusani").setBold().setFontSize(30f).setTextAlignment(TextAlignment.RIGHT));

		resume.add(img.scaleToFit(80, 80).setFixedPosition(35, 725));

		name.setTextAlignment(TextAlignment.LEFT);

		Paragraph contatti = new Paragraph("CONTATTI").setTextAlignment(TextAlignment.LEFT).setFontSize(16f)
				.setPaddingTop(35f);
		resume.add(contatti);

		Paragraph via = new Paragraph("Via Vignali 03, 82010 Moiano (BN)").setTextAlignment(TextAlignment.LEFT)
				.setFontSize(9f);
		Paragraph telefono = new Paragraph("Cellulare: (+39) 389 1003413").setTextAlignment(TextAlignment.LEFT)
				.setFontSize(9f);
		Paragraph data = new Paragraph("Data di nascita: 21/04/1995").setTextAlignment(TextAlignment.LEFT)
				.setFontSize(9f);

		resume.add(via);
		resume.add(telefono);
		resume.add(data);

		/////////////////

		Paragraph esperienze = new Paragraph("ESPERIENZE LAVORATIVE").setTextAlignment(TextAlignment.LEFT)
				.setFontSize(16f).setPaddingTop(25f);

		Paragraph prima = new Paragraph(">> Web Developer").setTextAlignment(TextAlignment.LEFT).setFontSize(9f)
				.setBold().setPaddingTop(5);
		Paragraph primasub = new Paragraph("Sviluppo web 2021/22").setTextAlignment(TextAlignment.LEFT).setFontSize(8f)
				.setMarginTop(-3);

		Paragraph seconda = new Paragraph(">> Commesso").setTextAlignment(TextAlignment.LEFT).setFontSize(9f).setBold()
				.setPaddingTop(10);
		Paragraph secondasub = new Paragraph("CC. Liz Gallery, Via Benevento, 82016 Montesarchio (BN) 2019/2020")
				.setTextAlignment(TextAlignment.LEFT).setFontSize(8f).setMarginTop(-3);
		Paragraph secondasub2 = new Paragraph("Gestione clienti, rifornimento dei materiali e contabilità.")
				.setTextAlignment(TextAlignment.LEFT).setFontSize(8f).setMarginTop(-5);

		Paragraph terza = new Paragraph(">> Assistente ufficio contabile").setTextAlignment(TextAlignment.LEFT)
				.setFontSize(9f).setBold().setPaddingTop(10);
		Paragraph terzasub = new Paragraph("Ci.Mar. di Airola (BN) 2016 - 2017").setTextAlignment(TextAlignment.LEFT)
				.setFontSize(8f).setMarginTop(-3);
		Paragraph terzasub2 = new Paragraph(
				"Gestione dei dati contabili dell'azienda, stipendi e bolle di trasporto per ogni ordine.")
				.setTextAlignment(TextAlignment.LEFT).setFontSize(8f).setMarginTop(-5);

		resume.add(esperienze);
		resume.add(prima);
		resume.add(primasub);
		resume.add(seconda);
		resume.add(secondasub);
		resume.add(secondasub2);
		resume.add(terza);
		resume.add(terzasub);
		resume.add(terzasub2);

		//////////////////////

		Paragraph istruzione = new Paragraph("ISTRUZIONE").setTextAlignment(TextAlignment.LEFT).setFontSize(16f)
				.setPaddingTop(25f);

		Paragraph sc1 = new Paragraph(">> Web Developer").setTextAlignment(TextAlignment.LEFT).setFontSize(9f).setBold()
				.setPaddingTop(5);
		Paragraph scsub = new Paragraph("Sviluppo web 2021/22").setTextAlignment(TextAlignment.LEFT).setFontSize(8f)
				.setMarginTop(-3);

		Paragraph sc2 = new Paragraph(">> Conservatorio Statale di Musica Nicola Sala - Benevento")
				.setTextAlignment(TextAlignment.LEFT).setFontSize(9f).setBold().setPaddingTop(8);
		Paragraph scsub2 = new Paragraph("Laurea triennale in Musica Elettronica 2021")
				.setTextAlignment(TextAlignment.LEFT).setFontSize(8f).setMarginTop(-3);

		Paragraph sc3 = new Paragraph(">> Digital Marketing Google Certification").setTextAlignment(TextAlignment.LEFT)
				.setFontSize(9f).setBold().setPaddingTop(8);
		Paragraph scsub3 = new Paragraph("Google Certified Digital Marketing Course 2020")
				.setTextAlignment(TextAlignment.LEFT).setFontSize(8f).setMarginTop(-3);

		Paragraph sc4 = new Paragraph(">> Istituto Superiore \"A.Lombardi\"").setTextAlignment(TextAlignment.LEFT)
				.setFontSize(9f).setBold().setPaddingTop(8);
		Paragraph scsub4 = new Paragraph("Diploma Liceo Classico A. Lombardi, Airola (BN) 2013/14")
				.setTextAlignment(TextAlignment.LEFT).setFontSize(8f).setMarginTop(-3);

		resume.add(istruzione);
		resume.add(sc1);
		resume.add(scsub);
		resume.add(sc2);
		resume.add(scsub2);
		resume.add(sc3);
		resume.add(scsub3);
		resume.add(sc4);
		resume.add(scsub4);

		///////

		// aggiunto solo per testare il testo giustificato
		/*
		Paragraph bio = new Paragraph("LOREM IPSUM").setTextAlignment(TextAlignment.LEFT).setFontSize(16f).setPaddingTop(25f);
		Paragraph lorem = new Paragraph(LoremString.loremipusm).setTextAlignment(TextAlignment.JUSTIFIED_ALL)
				.setFontSize(9f).setPaddingTop(5);
		Paragraph lorem2 = new Paragraph(LoremString.loremipusm).setTextAlignment(TextAlignment.JUSTIFIED_ALL)
				.setFontSize(9f).setPaddingTop(5);

		resume.add(bio);
		resume.add(lorem);
		resume.add(lorem2);*/

		////////

		////////////

		Paragraph competenze = new Paragraph("COMPETENZE DIGITALI E LINGUISTICHE").setTextAlignment(TextAlignment.LEFT)
				.setFontSize(16f).setPaddingTop(25f);

		Paragraph digitali = new Paragraph("HTML / CSS / Javascript / Photoshop / Bootstrap / Angular / "
				+ "Typescript / Git / Wordpress / Ableton Live " + "/ Java / Spring / SQL")
				.setTextAlignment(TextAlignment.LEFT).setFontSize(9f).setPaddingTop(5);

		Paragraph lingue = new Paragraph("Italiano / Inglese").setTextAlignment(TextAlignment.LEFT).setFontSize(9f)
				.setPaddingTop(5);

		resume.add(competenze);
		resume.add(digitali);
		resume.add(lingue);

		///////

		resume.close();

	}
}