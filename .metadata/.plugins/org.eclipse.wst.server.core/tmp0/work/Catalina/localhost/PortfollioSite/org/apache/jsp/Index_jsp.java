/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.30
 * Generated at: 2021-01-18 21:58:10 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Kobe Weinstein</title>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write(" * {box-sizing: border-box}\r\n");
      out.write(" \r\n");
      out.write(" :root {\r\n");
      out.write("  --primary: #05F140;\r\n");
      out.write("  --primaryDim: #04C835;\r\n");
      out.write("  --textP: #000000;\r\n");
      out.write("  --Secondary: #034D63;\r\n");
      out.write("  --SecondaryLight: #046B8B;\r\n");
      out.write("  --textS: #dadfe1;\r\n");
      out.write("  --bg: #7C9299;\r\n");
      out.write("  --textBg: #000000;\r\n");
      out.write("  }\r\n");
      out.write(" \r\n");
      out.write(" body {\r\n");
      out.write("  font-size: 150%;\r\n");
      out.write("  font-family:\"Courier New\", monospace;\r\n");
      out.write("  background-color: var(--bg);\r\n");
      out.write("  \r\n");
      out.write("}\r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" .tab {\r\n");
      out.write("  float: left;\r\n");
      out.write("  border: 2px solid var(--Secondary);\r\n");
      out.write("  border-top: none;\r\n");
      out.write("  border-bottom: none;\r\n");
      out.write("  background-color: var(--Secondary);\r\n");
      out.write("  width: 15vw;\r\n");
      out.write("  height: 100%;\r\n");
      out.write("  min-height: 100%;\r\n");
      out.write("  display: flex;\r\n");
      out.write("  justify-content: center;\r\n");
      out.write("  flex-direction: column;\r\n");
      out.write("  position:fixed;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write(" .tab button {\r\n");
      out.write("  display: block;\r\n");
      out.write("  background-color: inherit;\r\n");
      out.write("  padding: 22px 16px;\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  border: none;\r\n");
      out.write("  outline: none;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  cursor: pointer;\r\n");
      out.write("  transition: 0.3s;\r\n");
      out.write("  font-family:\"Courier New\", monospace;\t\r\n");
      out.write("  color: var(--textS);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".tab button:hover {\r\n");
      out.write("  background-color: var(--primary);\r\n");
      out.write("  color: var(--textP);  \r\n");
      out.write("  border-top: 4px solid var(--SecondaryLight);\r\n");
      out.write("  border-bottom: 4px solid var(--SecondaryLight);  \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".tab button.active {\r\n");
      out.write("  background-color: var(--primaryDim);\r\n");
      out.write("  color: var(--textP);\r\n");
      out.write("  border-top: 4px solid var(--Secondary);\r\n");
      out.write("  border-bottom: 4px solid var(--Secondary);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".projectContent {\r\n");
      out.write("  float: left;\r\n");
      out.write("  padding: 0px 8px;\r\n");
      out.write("  border: 1px solid var(--Secondary);\r\n");
      out.write("  width: 70vw;\r\n");
      out.write("  border-left: none;\r\n");
      out.write("  min-height: 100vh;\r\n");
      out.write("  display: none;\r\n");
      out.write("  font-family:\"Courier New\", monospace;\t\r\n");
      out.write("  margin-left:15vw;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".tabContent {\r\n");
      out.write("  float: left;\r\n");
      out.write("  padding: 0px 12px;\r\n");
      out.write("  border: none;\r\n");
      out.write("  width: 85vw;\r\n");
      out.write("  border-left: none;\r\n");
      out.write("  min-height: 100%;\r\n");
      out.write("  display: none;\r\n");
      out.write("  font-family:\"Courier New\", monospace;\t\r\n");
      out.write("  background-color: var(--bg);\r\n");
      out.write("  margin-left:15vw;\r\n");
      out.write("  \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".columnName\r\n");
      out.write("{\r\n");
      out.write("\twidth: 80%;\r\n");
      out.write("\tdisplay:flex; \r\n");
      out.write("\talign-content:center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".columnContact\r\n");
      out.write("{\r\n");
      out.write("\twidth: 20%;\r\n");
      out.write("\theight: 30%;\r\n");
      out.write("\tpadding: 6px;\r\n");
      out.write("\ttext-align:Right;\r\n");
      out.write("\tvertical-align: text-top;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".SkillsCourses\r\n");
      out.write("{\r\n");
      out.write("\tdisplay: flex;\r\n");
      out.write("\tflex-flow: row wrap;\r\n");
      out.write("\tjustify-content: space-around;\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\tpadding: 24px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".column\r\n");
      out.write("{\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("li + li {\r\n");
      out.write("  margin-top: 15px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("hr\r\n");
      out.write("{\r\n");
      out.write(" Border: 1px solid var(--Secondary);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("a:link, a:visited \r\n");
      out.write("{\r\n");
      out.write("\tcolor:black;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://kit.fontawesome.com/3095d7b5c5.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("function openTab(evt, tabName)\r\n");
      out.write("{\r\n");
      out.write("\r\n");
      out.write("\tvar i, tabContent, tabs;\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\ttabcontent = document.getElementsByClassName(\"tabContent\");\r\n");
      out.write("\tfor(i=0; i < tabcontent.length; i++)\r\n");
      out.write("\t{\r\n");
      out.write("\t\ttabcontent[i].style.display = \"none\";\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\ttabs = document.getElementsByClassName(\"tablinks\");\r\n");
      out.write("\tfor(i=0; i < tabs.length; i++)\r\n");
      out.write("\t{\r\n");
      out.write("\t\ttabs[i].className = tabs[i].className.replace(\" active\", \"\");\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tdocument.getElementById(tabName).style.display = \"block\";\r\n");
      out.write("\t\r\n");
      out.write("\tif(tabName == 'projects')\r\n");
      out.write("\t{\r\n");
      out.write("\t\tdocument.getElementById(tabName).style.padding = \"0px 0px\";\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tevt.currentTarget.className += \" active\";\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function openProject(evt, projectName)\r\n");
      out.write("{\r\n");
      out.write("\r\n");
      out.write("\tvar i, tabContent, tabs;\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\ttabcontent = document.getElementsByClassName(\"projectContent\");\r\n");
      out.write("\tfor(i=0; i < tabcontent.length; i++)\r\n");
      out.write("\t{\r\n");
      out.write("\t\ttabcontent[i].style.display = \"none\";\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\ttabs = document.getElementsByClassName(\"projectlinks\");\r\n");
      out.write("\tfor(i=0; i < tabs.length; i++)\r\n");
      out.write("\t{\r\n");
      out.write("\t\ttabs[i].className = tabs[i].className.replace(\" active\", \"\");\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tdocument.getElementById(projectName).style.display = \"block\";\r\n");
      out.write("\t\r\n");
      out.write("\tevt.currentTarget.className += \" active\";\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body style=\"width: 100vw; height: 100vh; margin: 0; padding: 0;\">\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"tab\">\r\n");
      out.write("\t<button class=\"tablinks\" onclick=\"openTab(event, 'about')\" id=\"default\">About</button>\r\n");
      out.write("\t<button class=\"tablinks\" onclick=\"openTab(event, 'projects')\">Projects</button>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<div id = \"projects\" class=\"tabContent\">\r\n");
      out.write("\t\t<div class=\"tab\" style=\"border-left: none;\">\r\n");
      out.write("\t\t\t<button class=\"projectlinks\" onclick=\"openProject(event,'BookStacks')\">The BookStacks</button>\r\n");
      out.write("\t\t\t<button class=\"projectlinks\" onclick=\"openProject(event,'RunnersEdge')\">Runner's Edge</button>\r\n");
      out.write("\t\t\t<button class=\"projectlinks\" onclick=\"openProject(event,'Asteroids')\">Asteroids</button>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div id=\"BookStacks\" class=\"projectContent\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div style=\"width:100%; display: flex; justify-content: space-between;\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t<p style=\"font-size: 0.75em;\"><span style = \"font-size: 2.2em\">The BookStacks</span> <br>\r\n");
      out.write("\t\tDeveloped by: Kobe Weinstein and Adrian Lopez</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div style =\"align-self:center; padding: 0px 4vw;\">\r\n");
      out.write("\t\t<i>Unity</i>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div style=\"width: 75%; text-align:center; margin: auto;\">\r\n");
      out.write("\t\t\t<hr>\r\n");
      out.write("\t\t\t<p style=\"font-size:0.75em;\">A fast paced isometric adventure that takes the player deep below a library to destroy an evil lich bent on opening a portal to a realm of horrors. The Bookstacks central challenge, revolves around the managing of a very limited pool of reusable ammunition. </p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div style=\"text-align:center;\">\r\n");
      out.write("\t\t\t<iframe width=\"65%\" height=\"375vh\" style=\"border:none;\"\r\n");
      out.write("\t\t\tsrc=\"https://www.youtube.com/embed/muQl5Ingy2Q?autoplay=1&mute=1&loop=1&playlist=muQl5Ingy2Q\">\r\n");
      out.write("\t\t\t</iframe>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div style=\"float:right; width:80%; height:30%;\">\r\n");
      out.write("\t\t<p>Composition of work:</p>\r\n");
      out.write("\t\t\t<div style=\"width:100%; height:100%; display:flex; flex-direction: column;\">\r\n");
      out.write("\t\t\t\t<div><div style=\"display:inline-block; min-width:10vw;\">Art</div> <div style=\"border:1px solid black; width:60%; height:3vh; display:inline-block; vertical-align: middle;\"><div style=\"background-color: var(--primaryDim); height:100%; width:35%;\"></div></div> </div>\r\n");
      out.write("\t\t\t\t<div><div style=\"display:inline-block; min-width:10vw;\">Level Design</div> <div style=\"border:1px solid black; width:60%; height:3vh; display:inline-block; vertical-align: middle;\"><div style=\"background-color: var(--primaryDim); height:100%; width:45%;\"></div></div> </div>\r\n");
      out.write("\t\t\t\t<div><div style=\"display:inline-block; min-width:10vw;\">Gameplay</div> <div style=\"border:1px solid black; width:60%; height:3vh; display:inline-block; vertical-align: middle;\"><div style=\"background-color: var(--primaryDim); height:100%; width:90%;\"></div></div> </div>\r\n");
      out.write("\t\t\t\t<div><div style=\"display:inline-block; min-width:10vw;\">Engine</div> <div style=\"border:1px solid black; width:60%; height:3vh; display:inline-block; vertical-align: middle;\"><div style=\"background-color: var(--primaryDim); height:100%; width:20%;\"></div></div> </div>\r\n");
      out.write("\t\t\t\t<div><div style=\"display:inline-block; min-width:10vw;\">AI</div> <div style=\"border:1px solid black; width:60%; height:3vh; display:inline-block; vertical-align: middle;\"><div style=\"background-color: var(--primaryDim); height:100%; width:90%;\"></div></div> </div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div id=\"RunnersEdge\" class=\"projectContent\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div style=\"width:100%; display: flex; justify-content: space-between;\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t<p style=\"font-size: 0.75em;\"><span style = \"font-size: 2.2em\">\"Runnner's Edge\"</span> <br>\r\n");
      out.write("\t\tDeveloped by: Kobe Weinstein</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div style =\"align-self:center; padding: 0px 4vw;\">\r\n");
      out.write("\t\t<i>C++</i>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div style=\"width: 75%; text-align:center; margin: auto;\">\r\n");
      out.write("\t\t\t<hr>\r\n");
      out.write("\t\t\t<p style=\"font-size:0.75em;\">A game loosely based off of Mirror's Edge. The game was created in C++ as an assignment for ITP-380 Intro to Game programming.\r\n");
      out.write("\t\t\tThe main bulk of the code that needed to be written for the assignment focused on the physics and movement of the player and environment. All sound and art, as well as some skeleton code was provided by the instructors.</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div style=\"text-align:center;\">\r\n");
      out.write("\t\t\t<iframe width=\"65%\" height=\"375vh\" style=\"border:none;\"\r\n");
      out.write("\t\t\tsrc=\"https://www.youtube.com/embed/Rtn2YmhXi4M?autoplay=1&mute=1&loop=1&playlist=Rtn2YmhXi4M\">\r\n");
      out.write("\t\t\t</iframe>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div style=\"float:right; width:80%; height:30%;\">\r\n");
      out.write("\t\t<p>Composition of work:</p>\r\n");
      out.write("\t\t\t<div style=\"width:100%; height:100%; display:flex; flex-direction: column;\">\r\n");
      out.write("\t\t\t\t<div><div style=\"display:inline-block; min-width:10vw;\">Art</div> <div style=\"border:1px solid black; width:60%; height:3vh; display:inline-block; vertical-align: middle;\"><div style=\"background-color: var(--primaryDim); height:100%; width:5%;\"></div></div> </div>\r\n");
      out.write("\t\t\t\t<div><div style=\"display:inline-block; min-width:10vw;\">Level Design</div> <div style=\"border:1px solid black; width:60%; height:3vh; display:inline-block; vertical-align: middle;\"><div style=\"background-color: var(--primaryDim); height:100%; width:5%;\"></div></div> </div>\r\n");
      out.write("\t\t\t\t<div><div style=\"display:inline-block; min-width:10vw;\">Gameplay</div> <div style=\"border:1px solid black; width:60%; height:3vh; display:inline-block; vertical-align: middle;\"><div style=\"background-color: var(--primaryDim); height:100%; width:90%;\"></div></div> </div>\r\n");
      out.write("\t\t\t\t<div><div style=\"display:inline-block; min-width:10vw;\">Engine</div> <div style=\"border:1px solid black; width:60%; height:3vh; display:inline-block; vertical-align: middle;\"><div style=\"background-color: var(--primaryDim); height:100%; width:90%;\"></div></div> </div>\r\n");
      out.write("\t\t\t\t<div><div style=\"display:inline-block; min-width:10vw;\">AI</div> <div style=\"border:1px solid black; width:60%; height:3vh; display:inline-block; vertical-align: middle;\"><div style=\"background-color: var(--primaryDim); height:100%; width:5%;\"></div></div> </div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div id=\"Asteroids\" class=\"projectContent\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div style=\"width:100%; display: flex; justify-content: space-between;\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t<p style=\"font-size: 0.75em;\"><span style = \"font-size: 2.2em\">Asteroids</span> <br>\r\n");
      out.write("\t\tDeveloped by: Kobe Weinstein</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div style =\"align-self:center; padding: 0px 4vw;\">\r\n");
      out.write("\t\t<i>C++</i>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div style=\"width: 75%; text-align:center; margin: auto;\">\r\n");
      out.write("\t\t\t<hr>\r\n");
      out.write("\t\t\t<p style=\"font-size:0.75em;\">Developed for a class as a demonstration of understanding of 3d game programming. For this assignment, I had to implement the flight, rolling, shooting, and the lock-on mechanics.</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div style=\"text-align:center;\">\r\n");
      out.write("\t\t\t<iframe width=\"65%\" height=\"375vh\" style=\"border:none;\"\r\n");
      out.write("\t\t\tsrc=\"https://www.youtube.com/embed/PG1mOM3zf5M?autoplay=1&mute=1&loop=1&playlist=PG1mOM3zf5M\">\r\n");
      out.write("\t\t\t</iframe>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div style=\"float:right; width:80%; height:30%;\">\r\n");
      out.write("\t\t<p>Composition of work:</p>\r\n");
      out.write("\t\t\t<div style=\"width:100%; height:100%; display:flex; flex-direction: column;\">\r\n");
      out.write("\t\t\t\t<div><div style=\"display:inline-block; min-width:10vw;\">Art</div> <div style=\"border:1px solid black; width:60%; height:3vh; display:inline-block; vertical-align: middle;\"><div style=\"background-color: var(--primaryDim); height:100%; width:5%;\"></div></div> </div>\r\n");
      out.write("\t\t\t\t<div><div style=\"display:inline-block; min-width:10vw;\">Level Design</div> <div style=\"border:1px solid black; width:60%; height:3vh; display:inline-block; vertical-align: middle;\"><div style=\"background-color: var(--primaryDim); height:100%; width:5%;\"></div></div> </div>\r\n");
      out.write("\t\t\t\t<div><div style=\"display:inline-block; min-width:10vw;\">Gameplay</div> <div style=\"border:1px solid black; width:60%; height:3vh; display:inline-block; vertical-align: middle;\"><div style=\"background-color: var(--primaryDim); height:100%; width:90%;\"></div></div> </div>\r\n");
      out.write("\t\t\t\t<div><div style=\"display:inline-block; min-width:10vw;\">Engine</div> <div style=\"border:1px solid black; width:60%; height:3vh; display:inline-block; vertical-align: middle;\"><div style=\"background-color: var(--primaryDim); height:100%; width:70%;\"></div></div> </div>\r\n");
      out.write("\t\t\t\t<div><div style=\"display:inline-block; min-width:10vw;\">AI</div> <div style=\"border:1px solid black; width:60%; height:3vh; display:inline-block; vertical-align: middle;\"><div style=\"background-color: var(--primaryDim); height:100%; width:5%;\"></div></div> </div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<div id=\"about\" class=\"tabContent\">\r\n");
      out.write("\t\r\n");
      out.write("\t<div style=\"width:100%; display:flex; flex-flow:row wrap; justify-content:space-between;\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"columnName\">\r\n");
      out.write("\t\t\t<img src=\"photo.png\" width=\"200px\" height=\"200px\" style=\" object-fit: fill;\">\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t<h1 style=\"color: var(--primary); font-size:2.5em;\">Kobe Weinstein</h1>\r\n");
      out.write("\t\t\t<h6>Graduating in Spring 2022, BS Computer Science:Games from The University of Southern California</h6>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"columnContact\">\r\n");
      out.write("\t\t<p style=\"font-size: 2.5em;\">\r\n");
      out.write("\t\t\t<a href=\"http://www.linkedin.com/in/kobe-weinstein\" style=\"color:blue;\"><i class=\"fab fa-linkedin\"></i></a> \r\n");
      out.write("\t\t\t<a href=\"http://www.Github.com/DrAgentIce\" style=\"color:black;\"><i class=\"fab fa-github-square\"></i></a>\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<p style=\"padding: 0px 24px; text-indent:2em;\">\r\n");
      out.write("\tI am currently a student at USC set to graduate in the spring of 2022. I am studying Computer Science: Games, and I am primarily interested in game play engineering and AI. \r\n");
      out.write("\tIn terms of experience, I have competence and practice in game development in C++ and C#, as reflected in my projects. Outside of game development I am proficient in Java, although I have not used it in games development.\r\n");
      out.write("\tAS far as experience with common systems in games, I have implemented A* pathfinding both in C++ and in Unity using C#, and I have familiarity with techniques such as, AABB collision, leading edge detection, and ray casting, among others.\r\n");
      out.write("\t</p>\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"SkillsCourses\">\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"column\">\r\n");
      out.write("\t<div style=\"text-align: center;\">Skills</div>\r\n");
      out.write("\t<hr>\r\n");
      out.write("\t<ul>\r\n");
      out.write("\t<li>C++, C#, Java</li>\r\n");
      out.write("\t<li>Unity, SDL</li>\r\n");
      out.write("\t<li>Game Design/Ideation/Prototyping</li>\r\n");
      out.write("\t<li>Database management, Filemaker</li>\r\n");
      out.write("\t<li>Artificial Neural Network experience</li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"column\">\r\n");
      out.write("\t<div style=\"text-align: center;\">Education</div>\r\n");
      out.write("\t<hr>\r\n");
      out.write("\t<ul>\r\n");
      out.write("\t\t<li>Video Game Programming <a href=\"https://web-app.usc.edu/soc/syllabus/20201/31902.pdf\">ITP380</a></li>\r\n");
      out.write("\t\t<li>Data structures <a href=\"https://web-app.usc.edu/ws/soc_archive/soc/term-20201/course/csci-201/index.html\">CSCI201</a></li>\r\n");
      out.write("\t\t<li>Algorithms <a href=\"https://classes.usc.edu/term-20203/course/csci-270/\">CSCI270</a></li>\r\n");
      out.write("\t\t<li>Game Design <a href=\"https://classes.usc.edu/term-20201/course/ctin-484/\">CTIN484/489</a></li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("document.getElementById(\"default\").click();\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
