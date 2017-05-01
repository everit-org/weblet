package org.everit.web.weblet;

public interface WebletFactory<W extends Weblet> {

  W createWeblet(WebletIncomingEdge incomingEdge);
}
