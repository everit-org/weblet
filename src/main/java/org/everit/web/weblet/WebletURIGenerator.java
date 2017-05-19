package org.everit.web.weblet;

import java.net.URI;
import java.util.Map;
import java.util.Set;

public interface WebletURIGenerator {

  URI createActionURI(Weblet weblet, Map<String, String> parameters, Set<String> stateIds);

  /**
   * Creates a bookmarkable URI that points to the page that holds the context with parameters to
   * the specific weblets.
   *
   * @param parametersByWeblets
   *          The parameters addressed to the specific weblets.
   * @return An absolute URI starting with path (not containing scheme, host and port).
   */
  URI createBookmarkableURI(Weblet weblet, Map<String, String> parameters, Set<String> stateIds);

  /**
   * Creates an URI that if used, the {@link Weblet#serveResource(WebletRequest, WebletResponse)}
   * function of the specified {@link Weblet} will be called directly.
   *
   * @param parameters
   * @return An absolute or relative URI starting with path (not containing scheme, host and port).
   *         The URI should work within the current page.
   */
  URI createResourceURI(Weblet weblet, Map<String, String> parameters, Set<String> stateIds);

}
