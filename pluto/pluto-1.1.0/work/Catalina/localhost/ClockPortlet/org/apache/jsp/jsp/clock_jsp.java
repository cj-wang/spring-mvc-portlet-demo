package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class clock_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fn:replace", org.apache.taglibs.standard.functions.Functions.class, "replace", new Class[] {java.lang.String.class, java.lang.String.class, java.lang.String.class});
}

  private static java.util.List _jspx_dependants;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    JspFactory _jspxFactory = null;
    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      _jspxFactory = JspFactory.getDefaultFactory();
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<link href=\"/ClockPortlet/public/jClocksGMT-master/css/jClocksGMT.css\" rel=\"stylesheet\">\r\n");
      out.write("\t<link href=\"/ClockPortlet/css/clock.css\" rel=\"stylesheet\"/>\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"/ClockPortlet/public/jquery-1.11.2/jquery-1.11.2.min.js\"></script>\r\n");
      out.write("\t<script src=\"/ClockPortlet/public/jClocksGMT-master/js/jClocksGMT.js\"></script>\r\n");
      out.write("\t<script src=\"/ClockPortlet/public/jClocksGMT-master/js/jquery.rotate.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\r\n");
      out.write("\t\t$(function() {\r\n");
      out.write("\t\t\t//init world clocks\r\n");
      out.write("\t\t\t$('.clock_container').each(function() {\r\n");
      out.write("\t\t\t\t$(this).jClocksGMT({\r\n");
      out.write("\t\t\t\t\toffset: $(this).attr('offset')\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t</script>\r\n");
      out.write("\r\n");
      out.write("\t<!-- World Clock -->\r\n");
      out.write("    <div id=\"clock_");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fn:replace(city, ' ', '_')}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false));
      out.write("\" class=\"clock_container\" offset=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${offset}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("        <div class=\"lbl\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${city}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</div>\r\n");
      out.write("        <div class=\"clockHolder\">\r\n");
      out.write("            <div class=\"rotatingWrapper\"><img class=\"hour\" src=\"/ClockPortlet/public/jClocksGMT-master/images/clock_hour.png\" /></div>\r\n");
      out.write("            <div class=\"rotatingWrapper\"><img class=\"min\" src=\"/ClockPortlet/public/jClocksGMT-master/images/clock_min.png\" /></div>\r\n");
      out.write("            <div class=\"rotatingWrapper\"><img class=\"sec\" src=\"/ClockPortlet/public/jClocksGMT-master/images/clock_sec.png\" /></div>\r\n");
      out.write("            <img class=\"clock\" src=\"/ClockPortlet/public/jClocksGMT-master/images/clock_face.png\" />\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"digital\">\r\n");
      out.write("            <span class=\"hr\"></span><span class=\"minute\"></span> <span class=\"period\"></span>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      if (_jspxFactory != null) _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
