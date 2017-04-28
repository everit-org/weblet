package org.everit.web.weblet;

import java.util.Map;

public interface WebletDirectURLGenerator {

  String createPartialURL(Map<String, String> parameters);

  String createResourceURL(Map<String, String> parameters);
}
