package org.everit.web.weblet;

/**
 * An edge in the {@link Weblet} graph how a {@link Weblet} is accessed from a parent Weblet.
 */
public class WebletIncomingEdge {

  /**
   * The unique key of a child {@link Weblet} within the parent {@link Weblet}. The child Weblet is
   * accessed via the keys on the path, the path is transformed to a URL in case of resource
   * requests.
   */
  public final String key;

  /**
   * The direct parent {@link Weblet} in the {@link Weblet} DAG. The root {@link Weblet} does not
   * have a parent, therefore the value of the parent for the incoming edge in the root
   * {@link Weblet} is <code>null</code>.
   */
  public final Weblet parent;

  public WebletIncomingEdge(final String key, final Weblet parent) {
    this.key = key;
    this.parent = parent;
  }

}
