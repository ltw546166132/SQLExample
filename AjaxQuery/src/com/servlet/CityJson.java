package com.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.CityBean;
import com.service.CitysServiceImpl;
import com.thoughtworks.xstream.XStream;

import net.sf.json.JSONArray;

/**
 * Servlet implementation class CityJson
 */
@WebServlet("/CityJson")
public class CityJson extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CityJson() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		String pid = request.getParameter("pid");
		CitysServiceImpl citysServiceImpl = new CitysServiceImpl();
		try {
			List<CityBean> cityList = citysServiceImpl.getCityList(Integer.valueOf(pid));
			JSONArray fromObject = JSONArray.fromObject(cityList);
			String string = fromObject.toString();
			response.getWriter().write(string);
		} catch (NumberFormatException | SQLException e) {
			e.printStackTrace();
		}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
