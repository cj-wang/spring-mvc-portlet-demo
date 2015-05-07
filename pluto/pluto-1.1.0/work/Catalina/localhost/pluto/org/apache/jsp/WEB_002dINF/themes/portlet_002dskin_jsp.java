package org.apache.jsp.WEB_002dINF.themes;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class portlet_002dskin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/tld/pluto.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_pluto_portlet_portletId;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_pluto_modeAnchor_portletMode_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_pluto_url_windowState_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_pluto_title_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_pluto_render_nobody;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_pluto_portlet_portletId = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_pluto_modeAnchor_portletMode_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_pluto_url_windowState_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_pluto_title_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_pluto_render_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_pluto_portlet_portletId.release();
    _jspx_tagPool_pluto_modeAnchor_portletMode_nobody.release();
    _jspx_tagPool_pluto_url_windowState_nobody.release();
    _jspx_tagPool_pluto_title_nobody.release();
    _jspx_tagPool_pluto_render_nobody.release();
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
      out.write("<!-- Use pluto portlet tag to render the portlet -->\r\n");
      if (_jspx_meth_pluto_portlet_0(_jspx_page_context))
        return;
      out.write("\r\n");
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

  private boolean _jspx_meth_pluto_portlet_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  pluto:portlet
    org.apache.pluto.driver.tags.PortletTag _jspx_th_pluto_portlet_0 = (org.apache.pluto.driver.tags.PortletTag) _jspx_tagPool_pluto_portlet_portletId.get(org.apache.pluto.driver.tags.PortletTag.class);
    _jspx_th_pluto_portlet_0.setPageContext(_jspx_page_context);
    _jspx_th_pluto_portlet_0.setParent(null);
    _jspx_th_pluto_portlet_0.setPortletId("${portlet}");
    int _jspx_eval_pluto_portlet_0 = _jspx_th_pluto_portlet_0.doStartTag();
    if (_jspx_eval_pluto_portlet_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_pluto_portlet_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_pluto_portlet_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_pluto_portlet_0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\r\n");
        out.write("  <!-- Assemble the rendering result -->\r\n");
        out.write("  <div class=\"portlet\" id='<c:out value=\"");
        out.write("${portlet}");
        out.write("\"/>'>\r\n");
        out.write("    <div class=\"header\">\r\n");
        out.write("      <!-- Portlet Mode Controls -->\r\n");
        out.write("      ");
        if (_jspx_meth_pluto_modeAnchor_0(_jspx_th_pluto_portlet_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_pluto_modeAnchor_1(_jspx_th_pluto_portlet_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_pluto_modeAnchor_2(_jspx_th_pluto_portlet_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      <!-- Window State Controls -->\r\n");
        out.write("      <a href=\"");
        if (_jspx_meth_pluto_url_0(_jspx_th_pluto_portlet_0, _jspx_page_context))
          return true;
        out.write("\"><span class=\"min\"></span></a>\r\n");
        out.write("      <a href=\"");
        if (_jspx_meth_pluto_url_1(_jspx_th_pluto_portlet_0, _jspx_page_context))
          return true;
        out.write("\"><span class=\"max\"></span></a>\r\n");
        out.write("      <a href=\"");
        if (_jspx_meth_pluto_url_2(_jspx_th_pluto_portlet_0, _jspx_page_context))
          return true;
        out.write("\"><span class=\"norm\"></span></a>\r\n");
        out.write("      <!-- Portlet Title -->\r\n");
        out.write("      <h2 class=\"title\">");
        if (_jspx_meth_pluto_title_0(_jspx_th_pluto_portlet_0, _jspx_page_context))
          return true;
        out.write("</h2>\r\n");
        out.write("    </div>\r\n");
        out.write("    <div class=\"body\">\r\n");
        out.write("      ");
        if (_jspx_meth_pluto_render_0(_jspx_th_pluto_portlet_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    </div>\r\n");
        out.write("  </div>\r\n");
        out.write("\r\n");
        int evalDoAfterBody = _jspx_th_pluto_portlet_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_pluto_portlet_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_pluto_portlet_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_pluto_portlet_portletId.reuse(_jspx_th_pluto_portlet_0);
      return true;
    }
    _jspx_tagPool_pluto_portlet_portletId.reuse(_jspx_th_pluto_portlet_0);
    return false;
  }

  private boolean _jspx_meth_pluto_modeAnchor_0(javax.servlet.jsp.tagext.JspTag _jspx_th_pluto_portlet_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  pluto:modeAnchor
    org.apache.pluto.driver.tags.PortletModeAnchorTag _jspx_th_pluto_modeAnchor_0 = (org.apache.pluto.driver.tags.PortletModeAnchorTag) _jspx_tagPool_pluto_modeAnchor_portletMode_nobody.get(org.apache.pluto.driver.tags.PortletModeAnchorTag.class);
    _jspx_th_pluto_modeAnchor_0.setPageContext(_jspx_page_context);
    _jspx_th_pluto_modeAnchor_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_pluto_portlet_0);
    _jspx_th_pluto_modeAnchor_0.setPortletMode("view");
    int _jspx_eval_pluto_modeAnchor_0 = _jspx_th_pluto_modeAnchor_0.doStartTag();
    if (_jspx_th_pluto_modeAnchor_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_pluto_modeAnchor_portletMode_nobody.reuse(_jspx_th_pluto_modeAnchor_0);
      return true;
    }
    _jspx_tagPool_pluto_modeAnchor_portletMode_nobody.reuse(_jspx_th_pluto_modeAnchor_0);
    return false;
  }

  private boolean _jspx_meth_pluto_modeAnchor_1(javax.servlet.jsp.tagext.JspTag _jspx_th_pluto_portlet_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  pluto:modeAnchor
    org.apache.pluto.driver.tags.PortletModeAnchorTag _jspx_th_pluto_modeAnchor_1 = (org.apache.pluto.driver.tags.PortletModeAnchorTag) _jspx_tagPool_pluto_modeAnchor_portletMode_nobody.get(org.apache.pluto.driver.tags.PortletModeAnchorTag.class);
    _jspx_th_pluto_modeAnchor_1.setPageContext(_jspx_page_context);
    _jspx_th_pluto_modeAnchor_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_pluto_portlet_0);
    _jspx_th_pluto_modeAnchor_1.setPortletMode("edit");
    int _jspx_eval_pluto_modeAnchor_1 = _jspx_th_pluto_modeAnchor_1.doStartTag();
    if (_jspx_th_pluto_modeAnchor_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_pluto_modeAnchor_portletMode_nobody.reuse(_jspx_th_pluto_modeAnchor_1);
      return true;
    }
    _jspx_tagPool_pluto_modeAnchor_portletMode_nobody.reuse(_jspx_th_pluto_modeAnchor_1);
    return false;
  }

  private boolean _jspx_meth_pluto_modeAnchor_2(javax.servlet.jsp.tagext.JspTag _jspx_th_pluto_portlet_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  pluto:modeAnchor
    org.apache.pluto.driver.tags.PortletModeAnchorTag _jspx_th_pluto_modeAnchor_2 = (org.apache.pluto.driver.tags.PortletModeAnchorTag) _jspx_tagPool_pluto_modeAnchor_portletMode_nobody.get(org.apache.pluto.driver.tags.PortletModeAnchorTag.class);
    _jspx_th_pluto_modeAnchor_2.setPageContext(_jspx_page_context);
    _jspx_th_pluto_modeAnchor_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_pluto_portlet_0);
    _jspx_th_pluto_modeAnchor_2.setPortletMode("help");
    int _jspx_eval_pluto_modeAnchor_2 = _jspx_th_pluto_modeAnchor_2.doStartTag();
    if (_jspx_th_pluto_modeAnchor_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_pluto_modeAnchor_portletMode_nobody.reuse(_jspx_th_pluto_modeAnchor_2);
      return true;
    }
    _jspx_tagPool_pluto_modeAnchor_portletMode_nobody.reuse(_jspx_th_pluto_modeAnchor_2);
    return false;
  }

  private boolean _jspx_meth_pluto_url_0(javax.servlet.jsp.tagext.JspTag _jspx_th_pluto_portlet_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  pluto:url
    org.apache.pluto.driver.tags.PortletPortalURLTag _jspx_th_pluto_url_0 = (org.apache.pluto.driver.tags.PortletPortalURLTag) _jspx_tagPool_pluto_url_windowState_nobody.get(org.apache.pluto.driver.tags.PortletPortalURLTag.class);
    _jspx_th_pluto_url_0.setPageContext(_jspx_page_context);
    _jspx_th_pluto_url_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_pluto_portlet_0);
    _jspx_th_pluto_url_0.setWindowState("minimized");
    int _jspx_eval_pluto_url_0 = _jspx_th_pluto_url_0.doStartTag();
    if (_jspx_th_pluto_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_pluto_url_windowState_nobody.reuse(_jspx_th_pluto_url_0);
      return true;
    }
    _jspx_tagPool_pluto_url_windowState_nobody.reuse(_jspx_th_pluto_url_0);
    return false;
  }

  private boolean _jspx_meth_pluto_url_1(javax.servlet.jsp.tagext.JspTag _jspx_th_pluto_portlet_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  pluto:url
    org.apache.pluto.driver.tags.PortletPortalURLTag _jspx_th_pluto_url_1 = (org.apache.pluto.driver.tags.PortletPortalURLTag) _jspx_tagPool_pluto_url_windowState_nobody.get(org.apache.pluto.driver.tags.PortletPortalURLTag.class);
    _jspx_th_pluto_url_1.setPageContext(_jspx_page_context);
    _jspx_th_pluto_url_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_pluto_portlet_0);
    _jspx_th_pluto_url_1.setWindowState("maximized");
    int _jspx_eval_pluto_url_1 = _jspx_th_pluto_url_1.doStartTag();
    if (_jspx_th_pluto_url_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_pluto_url_windowState_nobody.reuse(_jspx_th_pluto_url_1);
      return true;
    }
    _jspx_tagPool_pluto_url_windowState_nobody.reuse(_jspx_th_pluto_url_1);
    return false;
  }

  private boolean _jspx_meth_pluto_url_2(javax.servlet.jsp.tagext.JspTag _jspx_th_pluto_portlet_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  pluto:url
    org.apache.pluto.driver.tags.PortletPortalURLTag _jspx_th_pluto_url_2 = (org.apache.pluto.driver.tags.PortletPortalURLTag) _jspx_tagPool_pluto_url_windowState_nobody.get(org.apache.pluto.driver.tags.PortletPortalURLTag.class);
    _jspx_th_pluto_url_2.setPageContext(_jspx_page_context);
    _jspx_th_pluto_url_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_pluto_portlet_0);
    _jspx_th_pluto_url_2.setWindowState("normal");
    int _jspx_eval_pluto_url_2 = _jspx_th_pluto_url_2.doStartTag();
    if (_jspx_th_pluto_url_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_pluto_url_windowState_nobody.reuse(_jspx_th_pluto_url_2);
      return true;
    }
    _jspx_tagPool_pluto_url_windowState_nobody.reuse(_jspx_th_pluto_url_2);
    return false;
  }

  private boolean _jspx_meth_pluto_title_0(javax.servlet.jsp.tagext.JspTag _jspx_th_pluto_portlet_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  pluto:title
    org.apache.pluto.driver.tags.PortletTitleTag _jspx_th_pluto_title_0 = (org.apache.pluto.driver.tags.PortletTitleTag) _jspx_tagPool_pluto_title_nobody.get(org.apache.pluto.driver.tags.PortletTitleTag.class);
    _jspx_th_pluto_title_0.setPageContext(_jspx_page_context);
    _jspx_th_pluto_title_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_pluto_portlet_0);
    int _jspx_eval_pluto_title_0 = _jspx_th_pluto_title_0.doStartTag();
    if (_jspx_th_pluto_title_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_pluto_title_nobody.reuse(_jspx_th_pluto_title_0);
      return true;
    }
    _jspx_tagPool_pluto_title_nobody.reuse(_jspx_th_pluto_title_0);
    return false;
  }

  private boolean _jspx_meth_pluto_render_0(javax.servlet.jsp.tagext.JspTag _jspx_th_pluto_portlet_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  pluto:render
    org.apache.pluto.driver.tags.PortletRenderTag _jspx_th_pluto_render_0 = (org.apache.pluto.driver.tags.PortletRenderTag) _jspx_tagPool_pluto_render_nobody.get(org.apache.pluto.driver.tags.PortletRenderTag.class);
    _jspx_th_pluto_render_0.setPageContext(_jspx_page_context);
    _jspx_th_pluto_render_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_pluto_portlet_0);
    int _jspx_eval_pluto_render_0 = _jspx_th_pluto_render_0.doStartTag();
    if (_jspx_th_pluto_render_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_pluto_render_nobody.reuse(_jspx_th_pluto_render_0);
      return true;
    }
    _jspx_tagPool_pluto_render_nobody.reuse(_jspx_th_pluto_render_0);
    return false;
  }
}
