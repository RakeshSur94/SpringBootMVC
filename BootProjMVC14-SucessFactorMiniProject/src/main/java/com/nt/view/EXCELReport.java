package com.nt.view;

import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractXlsView;

import com.nt.module.Employee;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component("excel_view")
public class EXCELReport extends AbstractXlsView {

	private int i;

	@Override
	protected void buildExcelDocument(Map<String, Object> map, Workbook workbook, HttpServletRequest req,
			HttpServletResponse res) throws Exception {
		// get model class atribute
		List<Employee>list=(List<Employee>) map.get("empData");
		Sheet sheet=workbook.createSheet("sheet1");
		Row row = sheet.createRow(i);
		list.forEach(emp->{
			
			row.createCell(0).setCellValue(emp.getEmpid());
			row.createCell(1).setCellValue(emp.getName());
			row.createCell(2).setCellValue(String.valueOf(emp.getDoj()));
			row.createCell(3).setCellValue(emp.getDesg());
			row.createCell(4).setCellValue(emp.getSal());
			if(emp.getStatus()!=null)
			row.createCell(5).setCellValue(emp.getStatus());
			i++;
			
			
		});

	}

}
