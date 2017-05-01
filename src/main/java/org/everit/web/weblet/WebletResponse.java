package org.everit.web.weblet;

import java.util.Map;

public interface WebletResponse {

  String createRenderURL(Map<String, String> parameters);

}
