package org.everit.web.weblet;

import java.io.Writer;
import java.util.Locale;
import java.util.Map;

public interface Weblet {

  Map<String, Weblet> getChildren();

  WebletIncomingEdge getIncomingEdge();

  void preRender(WebletRequest request);

  String render(WebletRequest request, Writer writer, Locale locale);

  void serveResource(WebletRequest request, WebletResponse response);
}
