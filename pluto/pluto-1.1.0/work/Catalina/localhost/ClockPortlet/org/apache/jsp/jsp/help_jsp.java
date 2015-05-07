package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class help_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_portlet_renderURL_windowState_portletMode_nobody;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_portlet_renderURL_windowState_portletMode_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_portlet_renderURL_windowState_portletMode_nobody.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<h2>Clock Portlet Help</h2>\r\n");
      out.write("\r\n");
      out.write("<a href=\"");
      if (_jspx_meth_portlet_renderURL_0(_jspx_page_context))
        return;
      out.write("\">-Home-</a>");
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

  private boolean _jspx_meth_portlet_renderURL_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:renderURL
    org.apache.pluto.tags.RenderURLTag _jspx_th_portlet_renderURL_0 = (org.apache.pluto.tags.RenderURLTag) _jspx_tagPool_portlet_renderURL_windowState_portletMode_nobody.get(org.apache.pluto.tags.RenderURLTag.class);
    _jspx_th_portlet_renderURL_0.setPageContext(_jspx_page_context);
    _jspx_th_portlet_renderURL_0.setParent(null);
    _jspx_th_portlet_renderURL_0.setPortletMode("view");
    _jspx_th_portlet_renderURL_0.setWindowState("normal");
    int _jspx_eval_portlet_renderURL_0 = _jspx_th_portlet_renderURL_0.doStartTag();
    if (_jspx_th_portlet_renderURL_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_portlet_renderURL_windowState_portletMode_nobody.reuse(_jspx_th_portlet_renderURL_0);
      return true;
    }
    _jspx_tagPool_portlet_renderURL_windowState_portletMode_nobody.reuse(_jspx_th_portlet_renderURL_0);
    return false;
  }
}
