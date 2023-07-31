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
public class EmployeeXcelView extends AbstractXlsView {

	private int i=0;

	@Override
	protected void buildExcelDocument(Map<String, Object> map, Workbook workbook, HttpServletRequest req,
			HttpServletResponse res) throws Exception {
		//get model class attribute
		List<Employee>empsList=(List<Employee>) map.get("empData");
		//create sheet
		Sheet sheet= workbook.createSheet("sheet1");
		//add row to sheet
		empsList.forEach(emp->{
			//add row sheet presenting employee record
			Row row=sheet.createRow(i);
			//add cell to row
			row.createCell(0).setCellValue(emp.getEmpno());
			row.createCell(1).setCellValue(emp.getEname());
			row.createCell(2).setCellValue(emp.getJob());
			row.createCell(3).setCellValue(emp.getSal());
			if(emp.getDeptno()!=null)
				row.createCell(4).setCellValue(emp.getDeptno());
			i++;
		});
		

	}

}
