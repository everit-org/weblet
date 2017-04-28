package org.everit.web.weblet;

import java.io.Writer;
import java.util.Locale;
import java.util.Map;

public interface Weblet {

  Map<String, Weblet> getChildren();

  void processRequest(WebletRequest request, String webletId);

  String render(WebletRequest request, Writer writer, Locale locale, String id);

  void serveResource(WebletRequest request, WebletResponse response);
}
