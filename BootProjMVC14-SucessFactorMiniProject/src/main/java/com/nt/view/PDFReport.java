package com.nt.view;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Document;
import com.lowagie.text.Font;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfWriter;
import com.nt.module.Employee;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component("pdf_view")
public class PDFReport extends AbstractPdfView {

	@Override
	protected void buildPdfDocument(Map<String, Object> map, Document document, PdfWriter writer,
			HttpServletRequest req, HttpServletResponse res) throws Exception {
		// get the model attribute
		List<Employee>empList=(List<Employee>) map.get("empData");
		
		Paragraph para= new Paragraph("employee", new Font(Font.TIMES_ROMAN));
		document.add(para);
		Table table= new Table(6, empList.size());
		for(Employee emp:empList) {
			table.addCell(String.valueOf(emp.getEmpid()));
			table.addCell(emp.getName());
			table.addCell(String.valueOf(emp.getDoj()));
			table.addCell(emp.getDesg());
			table.addCell(String.valueOf(emp.getSal()));
			table.addCell(emp.getStatus());
		}
		document.add(table);
		
	}


	

}
