package com.nt.frontcontroller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nt.controller.LinksHandler;

@WebServlet("/")
public class NITFrontControllerServlet extends HttpServlet {
	private LinksHandler handler;
	@Override
	public void init() throws ServletException {
		
		handler= new LinksHandler();
	}
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		//navigation management
		String nvl=null;
		if(req.getServletPath().equalsIgnoreCase("/wish"))
			nvl=handler.showMessage(req);
		else if(req.getServletPath().equalsIgnoreCase("/lang"))
			nvl=handler.showAllLanguages(req);
		else
			nvl="home";
		//view management
		String destPage=null;
		if(nvl.equalsIgnoreCase("wish_result"))
			destPage="/show_wish.jsp";
		else if(nvl.equalsIgnoreCase("all_lang"))
			destPage="/show_lang.jsp";
		else
			destPage="index.jsp";
		//forward the request to dest page
		RequestDispatcher rd=req.getRequestDispatcher(destPage);
		rd.forward(req, res);
	
	}
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		doGet(req, res);
	}

}
