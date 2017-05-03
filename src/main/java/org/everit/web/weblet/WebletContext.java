package org.everit.web.weblet;

public interface WebletContext {

  /**
   * Create an id that is unique across all {@link Weblet} that this {@link WebletContext} handles.
   * Calling this function multiple times with the same parameters should return the same result.
   * The unique id can be used to create parameter unique parameter names, request- or session
   * attributes keys, or context attribute keys.
   *
   * @param weblet
   *          The weblet that the unique id is generated for.
   * @param id
   *          The localId that is converted to a unique id.
   * @return An id that is unique across the {@link WebletContext}.
   */
  String createUniqueId(Weblet weblet, String id);

}
