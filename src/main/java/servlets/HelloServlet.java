package servlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class HelloServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException
    {
        response.setContentType("text/html");
        getResponse(request,response.getWriter());
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException
    {
        response.setContentType("text/html");
        getResponse(request,response.getWriter());
    }

    private void getResponse(HttpServletRequest request, PrintWriter out)
    {
     String title="Using "+request.getMethod()+" Method to Read Form Data";
     String docType="<!doctype html public \"-//w3c//dtd xhtml 4.0 transitional//en\">\n";
     out.println(docType+
              "<html>\n"+
              "<head><title>"+title+"</title></head>\n"+ 
              "<body bgcolor=\"#f0f0f0\">\n"+
              "<h1 align=\"center\">"+title+"</h1>\n"+
              "<ul>\n"+
              "<li><b>First Name:</b> "+request.getParameter("first_name")+"\n"+
              "<li><b>Last Name:</b> "+request.getParameter("last_name")+"\n"+
              "</ul>\n"+
              "</body></html>");
    }
}
