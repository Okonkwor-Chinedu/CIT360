package Servlets;

import java.io.IOException;

public class solve extends HttpServlet {

	public static void main(String[] args) {
		private static final long serialVersionVID =1L;
		
		protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServeletExeption, IOException{
		// TODO Auto-generated method stub
			PrintWriter out = response.getWriter();
			int n1 = Integer.parseInt(request.getParameter("num1"));
			int n2 = Integer.parseInt(request.getParameter("num2"));
			String operation = request.getParameter("operation");
			int result = 0;

			switch(operation) {
			case"+":
			result = n1 + n2;
			break;

			case"-":
			result = n1 - n2;

			default:
				break;
			}
			out.println(result);
			}
	}
