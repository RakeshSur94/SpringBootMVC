package com.nt.view;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Document;
import com.lowagie.text.Font;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfStamper;
import com.lowagie.text.pdf.PdfWriter;
import com.nt.module.Employee;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component("pdf_view")
public class EmployeePDFView extends AbstractPdfView {


	@Override
	protected void buildPdfDocument(Map<String, Object> map, Document document, PdfWriter writer,
			HttpServletRequest req, HttpServletResponse res) throws Exception {
		//get model attribute
				List<Employee>empsList=(List<Employee>) map.get("empData");
				//add paragraph
				Paragraph paragraph= new Paragraph("employeeReport", new Font(Font.ITALIC));
				document.add(paragraph);
				
				//add table content
				Table table= new Table(5, empsList.size());
				for(Employee emp:empsList) {
					table.addCell(String.valueOf(emp.getEmpno()));
					table.addCell(emp.getEname());
					table.addCell(emp.getJob());
					table.addCell(String.valueOf(emp.getSal()));
					if(emp.getDeptno()!=null)
						table.addCell(String.valueOf(emp.getDeptno()));
					
					
				}
				document.add(table); 
	}

}
