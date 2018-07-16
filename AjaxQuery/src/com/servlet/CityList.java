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
 * Servlet implementation class CityList
 */
@WebServlet("/CityList")
public class CityList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CityList() {
        super();
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
			//XStream转换bean成xml
			XStream xStream = new XStream();
			xStream.alias("city", CityBean.class);
			String xml = xStream.toXML(cityList);
			response.getWriter().write(xml);
		} catch (NumberFormatException | SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
