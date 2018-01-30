package com.Rain;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String str_a = request.getParameter("a");
		String str_b = request.getParameter("b");

		// ���ַ������͵Ĳ���ֵת��Ϊ����
		int int_a = Integer.parseInt(str_a);
		int int_b = Integer.parseInt(str_b);

		// ������ת����Ĳ���ֵ���мӷ�����
		int sum = int_a + int_b;

		// �����͵�������ת��Ϊ�ַ���
		String result = String.valueOf(sum);
//		String result = Intgeter.toString(sum);

		// ���������ŵ���Ӧ��
		response.getWriter().append(result);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
