/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2015-08-05 22:18:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <script src=\"/boris/resources/core/bower_components/jquery/dist/jquery.js\"></script>\n");
      out.write("    <script src=\"/boris/resources/core/bower_components/material-design-lite/material.js\"></script>\n");
      out.write("    <link rel=\"stylesheet\" href=\"/boris/resources/core/bower_components/angular-material/angular-material.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"/boris/resources/core/bower_components/material-design-lite/material.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://storage.googleapis.com/code.getmdl.io/1.0.2/material.indigo-purple.min.css\" /> \n");
      out.write("    <link rel=\"stylesheet\" href=\"//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css\">\n");
      out.write("    <script src=\"//code.jquery.com/jquery-1.10.2.js\"></script>\n");
      out.write("    <script src=\"//code.jquery.com/ui/1.11.4/jquery-ui.js\"></script>\n");
      out.write("    <script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("    <script src=\"/boris/resources/core/js/searchJ.js\"></script>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=RobotoDraft:300,400,500,700,400italic\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"/boris/resources/core/css/boris.css\">\n");
      out.write("\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>Boris</title>\n");
      out.write("    \n");
      out.write("   \t<script type=\"text/javascript\">\n");
      out.write("\t// $(document).ready(function() {\n");
      out.write("\t// \t $.ajax( {\n");
      out.write("\t// \t\t url: 'technologies/trending',\n");
      out.write("\t// \t\t type: 'GET',\n");
      out.write("\t// \t      success: function(data) {\n");
      out.write("\t// \t    \t  var columnCount = 0;\n");
      out.write("\t// \t    \t  var htmlToAppend = \"\";\n");
      out.write("\t// \t    \t  $.each(data, function( index, value ) {\n");
      out.write("\t// \t    \t\t  if(index % 3 == 0){\n");
      out.write("\t// \t    \t\t\t  htmlToAppend +=   ' <div class=\"cardColumnContainer\">';\n");
      out.write("\t// \t    \t\t\t  columnCount +=1;\n");
      out.write("\t// \t    \t\t  }\n");
      out.write("\t// \t    \t\t  htmlToAppend += '<div class=\"mdl-card mdl-shadow--8dp\">'+\n");
      out.write(" //                     '<div class=\"\" style=\"padding-left: 10px\">'+\n");
      out.write(" //                        '<a class=\" mdl-button mdl-js-button mdl-js-ripple-effect\" style=\"font-weight: 400;color: darkgray; margin: 0\">Web Components</a>'+\n");
      out.write(" //                     ' </div>'+\n");
      out.write(" //                      '<div class=\"mdl-card__title\" style=\"padding-top:0px\">'+\n");
      out.write(" //                        ' <h2 class=\"mdl-card__title-text\" >'+value.title+'</h2>'+\n");
      out.write(" //                      '</div>'+\n");
      out.write(" //                     ' <div class=\"mdl-card__supporting-text\">'+\n");
      out.write(" //                       value.readableDescription+\n");
      out.write(" //                     ' </div>'+\n");
      out.write(" //                     ' <div class=\"mdl-card__actions mdl-card--border\">'+\n");
      out.write(" //                        '  <a class=\"mdl-button mdl-button--colored mdl-js-button mdl-js-ripple-effect\">  Read More ...</a>'+\n");
      out.write(" //                      '</div>'+\n");
      out.write(" //                      '<div class=\"mdl-card__menu\">'+\n");
      out.write(" //                         ' <button class=\"mdl-button mdl-button--icon mdl-js-button mdl-js-ripple-effect\">'+\n");
      out.write(" //                            ' <i class=\"material-icons\">favorite_border</i>'+\n");
      out.write(" //                          '</button> </div> </div>';\n");
      out.write(" //                          if(index % 3 ==2){\n");
      out.write(" //                     htmlToAppend +=\"</div>\";\n");
      out.write("\t// \t    \t  $(\"#cardContainer\").append(htmlToAppend);\n");
      out.write("\t// \t    \t  htmlToAppend = \"\";\n");
      out.write(" //                          }\n");
      out.write("\t// \t    \t\t});\n");
      out.write("\t// \t      },\n");
      out.write("\t// \t      error: function() {\n");
      out.write("\t// \t         alert(\"didnt work\")\n");
      out.write("\t// \t      }\n");
      out.write("\t// \t   });\n");
      out.write("\t// });\n");
      out.write("\t// </script>\n");
      out.write("</head>\n");
      out.write("<body ng-app=\"MyApp\">\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("   \n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("<div class=\"mdl-layout mdl-js-layout mdl-layout--fixed-header\">\n");
      out.write("    <header class=\"mdl-layout__header\">\n");
      out.write("        <div class=\"mdl-layout__header-row\">\n");
      out.write("\n");
      out.write("            <img src=\"/boris/resources/core/img/logo_white.png\" alt=\"Boris_logo\" style=\"height: 30px;\">\n");
      out.write("            <div class=\"mdl-layout-spacer\"></div>\n");
      out.write("            <nav class=\"mdl-navigation \">\n");
      out.write("\n");
      out.write("                <div class=\"mdl-tooltip\" for=\"add\">\n");
      out.write("                    Add Article/Event\n");
      out.write("                </div>\n");
      out.write("                <button id=\"subscriptionFeed\" class=\"mdl-button mdl-button--icon mdl-js-button mdl-js-ripple-effect\" ng-click=\"myFilter = {subscribed:true}\">assignment</button>\n");
      out.write("                <div class=\"mdl-tooltip\" for=\"subscriptionFeed\">\n");
      out.write("                    Subscription Feed\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"mdl-tooltip\" for=\"godMode\">\n");
      out.write("                    God Mode\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div ng-controller=\"addArticleControl\" class=\"\">\n");
      out.write("                    <a id=\"addArticle\" class=\"material-icons material-icons-header mdl-navigation__link\" ng-click=\"showAdvanced($event)\" flex flex-md=\"100\">\n");
      out.write("                        add_circle\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div ng-controller=\"addArticleControl\" class=\"\">\n");
      out.write("                    <a id=\"godMode\" class=\"material-icons material-icons-header mdl-navigation__link\" ng-click=\"showAdvanced($event)\" flex flex-md=\"100\">\n");
      out.write("                        flash_on\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div ng-controller=\"accountSetControl\" class=\"\">\n");
      out.write("                    <a id=\"accountSet\" class=\"material-icons material-icons-header mdl-navigation__link\" ng-click=\"showAdvanced($event)\" flex flex-md=\"100\">\n");
      out.write("                        account_circle\n");
      out.write("                    </a>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <script type=\"text/ng-template\" id=\"dialog1.tmpl.html\"><md-dialog aria-label=\"Mango (Fruit)\">\n");
      out.write("                <form>\n");
      out.write("                    <md-toolbar>\n");
      out.write("                        <div class=\"md-toolbar-tools\">\n");
      out.write("                            <h2>Mango (Fruit)</h2>\n");
      out.write("                            <span flex></span>\n");
      out.write("                            <md-button class=\"md-icon-button\" ng-click=\"answer('not applicable')\">\n");
      out.write("                                <md-icon md-svg-src=\"img/icons/ic_close_24px.svg\" aria-label=\"Close dialog\"></md-icon>\n");
      out.write("                            </md-button>\n");
      out.write("                        </div>\n");
      out.write("                    </md-toolbar>\n");
      out.write("                    <md-dialog-content>\n");
      out.write("                        <div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </md-dialog-content>\n");
      out.write("\n");
      out.write("                    <div class=\"md-actions\" layout=\"row\">\n");
      out.write("                        <md-button href=\"http://en.wikipedia.org/wiki/Mango\" target=\"_blank\" hide show-md>\n");
      out.write("                            More on Wikipedia\n");
      out.write("                        </md-button>\n");
      out.write("                        <span flex></span>\n");
      out.write("                        <md-button ng-click=\"answer('not useful')\" class=\"md-primary\">\n");
      out.write("                            Not Useful\n");
      out.write("                        </md-button>\n");
      out.write("                        <md-button ng-click=\"answer('useful')\" class=\"md-primary\">\n");
      out.write("                            Useful\n");
      out.write("                        </md-button>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("                </md-dialog>\n");
      out.write("                </script>\n");
      out.write("                <script type=\"text/ng-template\" id=\"dialog2.tmpl.html\"><md-dialog aria-label=\"Mango (Fruit)\" style=\"width: 90%\">\n");
      out.write("                <form>\n");
      out.write("                    <md-toolbar>\n");
      out.write("                        <div class=\"md-toolbar-tools\">\n");
      out.write("                            <h2>Add New Technology</h2>\n");
      out.write("                            <span flex></span>\n");
      out.write("                            <md-button class=\"md-icon-button\" ng-click=\"answer('not applicable')\">\n");
      out.write("                                <md-icon md-svg-src=\"img/icons/ic_close_24px.svg\" aria-label=\"Close dialog\"></md-icon>\n");
      out.write("                            </md-button>\n");
      out.write("                        </div>\n");
      out.write("                    </md-toolbar>\n");
      out.write("                    <md-dialog-content>\n");
      out.write("                        <div>\n");
      out.write("\n");
      out.write("                            <div>\n");
      out.write("                                <md-content class=\"md-padding\">\n");
      out.write("                                    <md-content class=\"md-padding\">\n");
      out.write("                                        <div ng-controller=\"DemoCtrl\" layout=\"column\" class=\"inputdemoBasicUsage\" ng-app=\"MyApp\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                            <md-content layout-padding=\"\">\n");
      out.write("                                                <form name=\"userForm\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                    <div layout=\"\" layout-sm=\"column\" style=\"display: flex; flex-flow: column;\">\n");
      out.write("                                                        <md-input-container flex=\"\">\n");
      out.write("                                                            <label>Title</label>\n");
      out.write("                                                            <input ng-model=\"user.firstName\" class=\"add-tech-title\">\n");
      out.write("                                                        </md-input-container>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                        <md-input-container flex>\n");
      out.write("                                                            <label>Description</label>\n");
      out.write("                                                            <textarea ng-model=\"user.biography\" class=\"add-tech-desc\"></textarea>\n");
      out.write("                                                        </md-input-container>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                        <div ng-controller=\"CustomInputDemoCtrl as ctrl\"    class=\"chipsdemoCustomInputs\" ng-app=\"MyApp\">\n");
      out.write("                                                            <md-chips ng-model=\"ctrl.selectedVegetables\" md-autocomplete-snap=\"\" md-require-match=\"\">\n");
      out.write("                                                                <md-autocomplete md-selected-item=\"ctrl.selectedItem\" md-search-text=\"ctrl.searchText\" md-items=\"item in ctrl.querySearch(ctrl.searchText)\" md-item-text=\"item.name\" placeholder=\"Add a category\">\n");
      out.write("                                                                    <span md-highlight-text=\"ctrl.searchText\">{{item.name}}</span>\n");
      out.write("                                                                </md-autocomplete>\n");
      out.write("                                                                <md-chip-template>\n");
      out.write("                                                                                        <span>\n");
      out.write("                                                                                          <strong>{{$chip.name}}</strong>\n");
      out.write("                                                                                        </span>\n");
      out.write("                                                                </md-chip-template>\n");
      out.write("                                                            </md-chips>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("\n");
      out.write("                                                </form>\n");
      out.write("                                            </md-content>\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    </md-content>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                </md-content>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </md-dialog-content>\n");
      out.write("\n");
      out.write("                    <div class=\"md-actions\" layout=\"row\">\n");
      out.write("                        <md-button ng-click=\"answer('not useful')\" class=\"md-primary\">\n");
      out.write("                            Cancel\n");
      out.write("                        </md-button>\n");
      out.write("                        <md-button ng-click=\"answer('useful')\" class=\"md-primary\">\n");
      out.write("                            Add\n");
      out.write("                        </md-button>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("                </md-dialog>\n");
      out.write("                </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"mdl-tooltip\" for=\"accountSet\">\n");
      out.write("                    Account Settings\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("    </header>\n");
      out.write("    <main class=\"mdl-layout__content\">\n");
      out.write("        <div class=\"mainContainer\">\n");
      out.write("\n");
      out.write("            <!--<div class=\"mdl-card mdl-card&#45;&#45;border mdl-shadow&#45;&#45;8dp mdl-card-searchBar\">-->\n");
      out.write("                <!--<div id=\"searchBar\" class=\"mdl-textfield mdl-js-textfield mdl-textfield-index\" onclick=\"searchPop()\" >-->\n");
      out.write("                    <!--<input id=\"tags\" class=\"mdl-textfield__input mdl-textfield__input-index\" type=\"text\" id=\"sample1\"/>-->\n");
      out.write("                    <!--<label class=\"mdl-textfield__label mdl-textfield__label-index\" for=\"sample1\"></label>-->\n");
      out.write("                <!--</div>-->\n");
      out.write("\n");
      out.write("            <div ng-controller=\"SearchCtrl as ctrl\" layout=\"column\" class=\"autocompletedemoBasicUsage\" style=\"margin-top: 15px\">\n");
      out.write("                        <form ng-submit=\"$event.preventDefault()\">\n");
      out.write("                            <md-autocomplete  ng-disabled=\"ctrl.isDisabled\" md-no-cache=\"ctrl.noCache\" md-selected-item=\"ctrl.selectedItem\" md-search-text-change=\"ctrl.searchTextChange(ctrl.searchText)\" md-search-text=\"ctrl.searchText\" md-selected-item-change=\"ctrl.selectedItemChange(item)\" md-items=\"item in ctrl.querySearch(ctrl.searchText)\" md-item-text=\"item.display\" md-min-length=\"0\" placeholder=\"Search\">\n");
      out.write("                                <md-item-template>\n");
      out.write("                                    <span md-highlight-text=\"ctrl.searchText\" md-highlight-flags=\"^i\">{{item.display}}</span>\n");
      out.write("                                </md-item-template>\n");
      out.write("                                <md-not-found>\n");
      out.write("                                    No matches found for \"{{ctrl.searchText}}\".\n");
      out.write("                                </md-not-found>\n");
      out.write("                            </md-autocomplete>\n");
      out.write("                        </form>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            <!--</div>-->\n");
      out.write("\n");
      out.write("            <div class=\"cardContainer\" id=\"cardContainer\" ng-controller=\"AJAXCtrl\">\n");
      out.write("            \n");
      out.write("            \n");
      out.write("                <div class=\"cardColumnContainer\">\n");
      out.write("                    <div class=\"mdl-card mdl-shadow--8dp\" ng-repeat=\"value in myData | filter:myFilter\" ng-if=\"$index< 3\">\n");
      out.write("                      <div class=\"\" style=\"padding-left: 10px\">\n");
      out.write("                         <a class=\" mdl-button mdl-js-button mdl-js-ripple-effect\" style=\"font-weight: 400;color: darkgray; margin: 0\">Web Components</a>\n");
      out.write("                      </div>\n");
      out.write("                                       \n");
      out.write("                        <div class=\"mdl-card__title\" style=\"padding-top:0px\">\n");
      out.write("                             <h2 class=\"mdl-card__title-text\" >{{value.title}}</h2>\n");
      out.write("                        </div>\n");
      out.write("                                          \n");
      out.write("                      <div class=\"mdl-card__supporting-text\">\n");
      out.write("                           {{value.description}}\n");
      out.write("                      </div>\n");
      out.write("                                          \n");
      out.write("                      <div class=\"mdl-card__actions mdl-card--border\">\n");
      out.write("                        <a class=\"mdl-button mdl-button--colored mdl-js-button mdl-js-ripple-effect\">  Read More ...</a>\n");
      out.write("                      </div>\n");
      out.write("                                          \n");
      out.write("                      <div class=\"mdl-card__menu\">\n");
      out.write("                        <button class=\"mdl-button mdl-button--icon mdl-js-button mdl-js-ripple-effect\" ng-click=\"sub($index)\">\n");
      out.write("                            <i class=\"material-icons\" ng-if=\"value.subscribed == true\">favorite</i>\n");
      out.write("                            <i class=\"material-icons\" ng-if=\"value.subscribed == false\">favorite_border</i>\n");
      out.write("                        </button> \n");
      out.write("                      </div> \n");
      out.write("                      \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"cardColumnContainer\">\n");
      out.write("                    <div class=\"mdl-card mdl-shadow--8dp\" ng-repeat=\"value in myData | filter:myFilter\" ng-if=\"$index > 2 && $index < 6\">\n");
      out.write("                      <div class=\"\" style=\"padding-left: 10px\">\n");
      out.write("                         <a class=\" mdl-button mdl-js-button mdl-js-ripple-effect\" style=\"font-weight: 400;color: darkgray; margin: 0\">Web Components</a>\n");
      out.write("                      </div>\n");
      out.write("                                       \n");
      out.write("                        <div class=\"mdl-card__title\" style=\"padding-top:0px\">\n");
      out.write("                             <h2 class=\"mdl-card__title-text\" >{{value.title}}</h2>\n");
      out.write("                        </div>\n");
      out.write("                                          \n");
      out.write("                      <div class=\"mdl-card__supporting-text\">\n");
      out.write("                           {{value.description}}\n");
      out.write("                      </div>\n");
      out.write("                                          \n");
      out.write("                      <div class=\"mdl-card__actions mdl-card--border\">\n");
      out.write("                        <a class=\"mdl-button mdl-button--colored mdl-js-button mdl-js-ripple-effect\">  Read More ...</a>\n");
      out.write("                      </div>\n");
      out.write("                                          \n");
      out.write("                      <div class=\"mdl-card__menu\">\n");
      out.write("                        <button class=\"mdl-button mdl-button--icon mdl-js-button mdl-js-ripple-effect\" ng-click=\"sub($index)\">\n");
      out.write("                            <i class=\"material-icons\" ng-if=\"value.subscribed == true\">favorite</i>\n");
      out.write("                            <i class=\"material-icons\" ng-if=\"value.subscribed == false\">favorite_border</i>\n");
      out.write("                        </button> \n");
      out.write("                      </div> \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"cardColumnContainer\">\n");
      out.write("                    <div class=\"mdl-card mdl-shadow--8dp\" ng-repeat=\"value in myData | filter:myFilter\" ng-if=\"$index > 5 \">\n");
      out.write("                      <div class=\"\" style=\"padding-left: 10px\">\n");
      out.write("                         <a class=\" mdl-button mdl-js-button mdl-js-ripple-effect\" style=\"font-weight: 400;color: darkgray; margin: 0\">Web Components</a>\n");
      out.write("                      </div>\n");
      out.write("                                       \n");
      out.write("                        <div class=\"mdl-card__title\" style=\"padding-top:0px\">\n");
      out.write("                             <h2 class=\"mdl-card__title-text\" >{{value.title}}</h2>\n");
      out.write("                        </div>\n");
      out.write("                                          \n");
      out.write("                      <div class=\"mdl-card__supporting-text\">\n");
      out.write("                           {{value.description}}\n");
      out.write("                      </div>\n");
      out.write("                                          \n");
      out.write("                      <div class=\"mdl-card__actions mdl-card--border\">\n");
      out.write("                        <a class=\"mdl-button mdl-button--colored mdl-js-button mdl-js-ripple-effect\">  Read More ...</a>\n");
      out.write("                      </div>\n");
      out.write("                                          \n");
      out.write("                      <div class=\"mdl-card__menu\">\n");
      out.write("                        <button class=\"mdl-button mdl-button--icon mdl-js-button mdl-js-ripple-effect\" ng-click=\"sub($index)\">\n");
      out.write("                            <i class=\"material-icons\" ng-if=\"value.subscribed == true\">favorite</i>\n");
      out.write("                            <i class=\"material-icons\" ng-if=\"value.subscribed == false\">favorite_border</i>\n");
      out.write("                        </button> \n");
      out.write("                      </div> \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </main>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script src='https://ajax.googleapis.com/ajax/libs/angularjs/1.3.15/angular.js'></script>\n");
      out.write("<script src='https://ajax.googleapis.com/ajax/libs/angularjs/1.3.15/angular-animate.min.js'></script>\n");
      out.write("<script src='https://ajax.googleapis.com/ajax/libs/angularjs/1.3.15/angular-route.min.js'></script>\n");
      out.write("<script src='https://ajax.googleapis.com/ajax/libs/angularjs/1.3.15/angular-aria.min.js'></script>\n");
      out.write("<script src='https://ajax.googleapis.com/ajax/libs/angularjs/1.3.15/angular-messages.min.js'></script>\n");
      out.write("<script src='http://cdn.rawgit.com/angular/bower-material/v0.10.0/angular-material.js'></script>\n");
      out.write("<script src='https://s3-us-west-2.amazonaws.com/s.cdpn.io/t-114/assets-cache.js'></script>\n");
      out.write("<script src=\"/boris/resources/core/js/dialog.js\"></script>\n");
      out.write("<script src=\"/boris/resources/core/js/add.js\"></script>\n");
      out.write("<script src=\"/boris/resources/core/js/tag.js\"></script>\n");
      out.write("<script src=\"/boris/resources/core/js/autocompleteSearch.js\"></script>\n");
      out.write("<script src=\"/boris/resources/core/js/test.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}