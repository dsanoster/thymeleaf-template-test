package myapp;

import java.io.IOException;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ThymeleafTemplateTestServlet extends HttpServlet {
  @Override
  public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
    resp.setContentType("text/html");
    resp.getWriter().println("<!DOCTYPE html>");
    resp.getWriter().println(
        "<html xmlns=\"http://www.w3.org/1999/xhtml\" xmlns:th=\"http://www.thymeleaf.org\">");
    resp.getWriter().println("<head>");
    resp.getWriter().println("<meta charset=\"UTF-8\">");
    resp.getWriter().println("</head>");
    resp.getWriter().println("<body>");
    resp.getWriter().println("<div th:fragment=\"time\">" + new Date().toString() + "</div>");
    resp.getWriter().println("</body>");
    resp.getWriter().println("</html>");
  }
}
