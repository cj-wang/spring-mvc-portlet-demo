package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Map;
import javax.servlet.jsp.jstl.core.LoopTagStatus;
import org.apache.pluto.testsuite.TestConfig;

public final class introduction_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_portlet_defineObjects_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_varStatus_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_portlet_actionURL_var_secure;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_portlet_param_value_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_portlet_defineObjects_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_varStatus_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_portlet_actionURL_var_secure = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_portlet_param_value_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_portlet_defineObjects_nobody.release();
    _jspx_tagPool_c_forEach_varStatus_var_items.release();
    _jspx_tagPool_c_out_value_nobody.release();
    _jspx_tagPool_portlet_actionURL_var_secure.release();
    _jspx_tagPool_portlet_param_value_name_nobody.release();
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      //  portlet:defineObjects
      javax.portlet.PortletRequest renderRequest = null;
      javax.portlet.RenderResponse renderResponse = null;
      javax.portlet.PortletConfig portletConfig = null;
      org.apache.pluto.tags.DefineObjectsTag _jspx_th_portlet_defineObjects_0 = (org.apache.pluto.tags.DefineObjectsTag) _jspx_tagPool_portlet_defineObjects_nobody.get(org.apache.pluto.tags.DefineObjectsTag.class);
      _jspx_th_portlet_defineObjects_0.setPageContext(_jspx_page_context);
      _jspx_th_portlet_defineObjects_0.setParent(null);
      int _jspx_eval_portlet_defineObjects_0 = _jspx_th_portlet_defineObjects_0.doStartTag();
      renderRequest = (javax.portlet.PortletRequest) _jspx_page_context.findAttribute("renderRequest");
      renderResponse = (javax.portlet.RenderResponse) _jspx_page_context.findAttribute("renderResponse");
      portletConfig = (javax.portlet.PortletConfig) _jspx_page_context.findAttribute("portletConfig");
      if (_jspx_th_portlet_defineObjects_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_portlet_defineObjects_nobody.reuse(_jspx_th_portlet_defineObjects_0);
        return;
      }
      renderRequest = (javax.portlet.PortletRequest) _jspx_page_context.findAttribute("renderRequest");
      renderResponse = (javax.portlet.RenderResponse) _jspx_page_context.findAttribute("renderResponse");
      portletConfig = (javax.portlet.PortletConfig) _jspx_page_context.findAttribute("portletConfig");
      _jspx_tagPool_portlet_defineObjects_nobody.reuse(_jspx_th_portlet_defineObjects_0);
      out.write("\r\n");
      out.write("\r\n");
      out.write("<p>\r\n");
      out.write("  This portlet is a portlet specification compatibility test portlet.\r\n");
      out.write("  It provides several tests of verying complexities which will assist in\r\n");
      out.write("  evaluating compliance with the portlet specification. It was originally\r\n");
      out.write("  developed for testing Apache Pluto, however, it does not utilize any\r\n");
      out.write("  proprietary APIs and should work with all compliant portlet containers.\r\n");
      out.write("</p>\r\n");
      out.write("\r\n");
      out.write("<p>\r\n");
      out.write("  Please select one of the following tests:\r\n");
      out.write("  <table>\r\n");
      out.write("    ");
      //  c:forEach
      org.apache.taglibs.standard.tag.el.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.el.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.el.core.ForEachTag.class);
      _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_0.setParent(null);
      _jspx_th_c_forEach_0.setVar("testConfig");
      _jspx_th_c_forEach_0.setItems("${tests}");
      _jspx_th_c_forEach_0.setVarStatus("status");
      int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("      <tr>\r\n");
            out.write("        <td>\r\n");
            out.write("          # ");
            if (_jspx_meth_c_out_0(_jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
              return;
            out.write(".\r\n");
            out.write("        </td>\r\n");
            out.write("        <td>\r\n");
            out.write("          ");
            if (_jspx_meth_c_out_1(_jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
              return;
            out.write("\r\n");
            out.write("        </td>\r\n");
            out.write("        \r\n");
            out.write("        ");
            out.write("\r\n");
            out.write("        ");
            //  portlet:actionURL
            java.lang.String url = null;
            org.apache.pluto.tags.ActionURLTag _jspx_th_portlet_actionURL_0 = (org.apache.pluto.tags.ActionURLTag) _jspx_tagPool_portlet_actionURL_var_secure.get(org.apache.pluto.tags.ActionURLTag.class);
            _jspx_th_portlet_actionURL_0.setPageContext(_jspx_page_context);
            _jspx_th_portlet_actionURL_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
            _jspx_th_portlet_actionURL_0.setSecure( renderRequest.isSecure() ? "True" : "False" );
            _jspx_th_portlet_actionURL_0.setVar("url");
            int _jspx_eval_portlet_actionURL_0 = _jspx_th_portlet_actionURL_0.doStartTag();
            url = (java.lang.String) _jspx_page_context.findAttribute("url");
            if (_jspx_eval_portlet_actionURL_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
              do {
                out.write("\r\n");
                out.write("          ");
                //  portlet:param
                org.apache.pluto.tags.ParamTag _jspx_th_portlet_param_0 = (org.apache.pluto.tags.ParamTag) _jspx_tagPool_portlet_param_value_name_nobody.get(org.apache.pluto.tags.ParamTag.class);
                _jspx_th_portlet_param_0.setPageContext(_jspx_page_context);
                _jspx_th_portlet_param_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_portlet_actionURL_0);
                _jspx_th_portlet_param_0.setName("testId");
                _jspx_th_portlet_param_0.setValue( ((LoopTagStatus) pageContext.getAttribute("status")).getIndex() + "" );
                int _jspx_eval_portlet_param_0 = _jspx_th_portlet_param_0.doStartTag();
                if (_jspx_th_portlet_param_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  _jspx_tagPool_portlet_param_value_name_nobody.reuse(_jspx_th_portlet_param_0);
                  return;
                }
                _jspx_tagPool_portlet_param_value_name_nobody.reuse(_jspx_th_portlet_param_0);
                out.write("\r\n");
                out.write("          ");
                //  c:forEach
                org.apache.taglibs.standard.tag.el.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.el.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.el.core.ForEachTag.class);
                _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
                _jspx_th_c_forEach_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_portlet_actionURL_0);
                _jspx_th_c_forEach_1.setVar("param");
                _jspx_th_c_forEach_1.setItems("${testConfig.actionParameters}");
                int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
                try {
                  int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
                  if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n");
                      out.write("            ");

                TestConfig.Parameter parameter = (TestConfig.Parameter)
                        pageContext.findAttribute("param");
                String paramName = parameter.getName();
                String paramValue = parameter.getValue();
            
                      out.write("\r\n");
                      out.write("            ");
                      //  portlet:param
                      org.apache.pluto.tags.ParamTag _jspx_th_portlet_param_1 = (org.apache.pluto.tags.ParamTag) _jspx_tagPool_portlet_param_value_name_nobody.get(org.apache.pluto.tags.ParamTag.class);
                      _jspx_th_portlet_param_1.setPageContext(_jspx_page_context);
                      _jspx_th_portlet_param_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
                      _jspx_th_portlet_param_1.setName( paramName );
                      _jspx_th_portlet_param_1.setValue( paramValue );
                      int _jspx_eval_portlet_param_1 = _jspx_th_portlet_param_1.doStartTag();
                      if (_jspx_th_portlet_param_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _jspx_tagPool_portlet_param_value_name_nobody.reuse(_jspx_th_portlet_param_1);
                        return;
                      }
                      _jspx_tagPool_portlet_param_value_name_nobody.reuse(_jspx_th_portlet_param_1);
                      out.write("\r\n");
                      out.write("          ");
                      int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    return;
                  }
                } catch (Throwable _jspx_exception) {
                  while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
                    out = _jspx_page_context.popBody();
                  _jspx_th_c_forEach_1.doCatch(_jspx_exception);
                } finally {
                  _jspx_th_c_forEach_1.doFinally();
                  _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
                }
                out.write("\r\n");
                out.write("        ");
                int evalDoAfterBody = _jspx_th_portlet_actionURL_0.doAfterBody();
                url = (java.lang.String) _jspx_page_context.findAttribute("url");
                if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                  break;
              } while (true);
            }
            if (_jspx_th_portlet_actionURL_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              _jspx_tagPool_portlet_actionURL_var_secure.reuse(_jspx_th_portlet_actionURL_0);
              return;
            }
            url = (java.lang.String) _jspx_page_context.findAttribute("url");
            _jspx_tagPool_portlet_actionURL_var_secure.reuse(_jspx_th_portlet_actionURL_0);
            out.write("\r\n");
            out.write("        ");
            out.write("\r\n");
            out.write("        \r\n");
            out.write("        <td>\r\n");
            out.write("          <a href=\"");
            if (_jspx_meth_c_out_2(_jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
              return;
            out.write("\">Test</a>\r\n");
            out.write("        </td>\r\n");
            out.write("      </tr>\r\n");
            out.write("    ");
            int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_forEach_0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_forEach_0.doFinally();
        _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_0);
      }
      out.write("\r\n");
      out.write("  </table>\r\n");
      out.write("</p>\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_c_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_0.setValue("${status.index}");
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_c_out_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_1.setValue("${testConfig.name}");
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }

  private boolean _jspx_meth_c_out_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_2 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_2.setPageContext(_jspx_page_context);
    _jspx_th_c_out_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_2.setValue("${url}");
    int _jspx_eval_c_out_2 = _jspx_th_c_out_2.doStartTag();
    if (_jspx_th_c_out_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
    return false;
  }
}
