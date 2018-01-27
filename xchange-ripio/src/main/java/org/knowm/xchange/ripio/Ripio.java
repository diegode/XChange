package org.knowm.xchange.ripio;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.knowm.xchange.ripio.dto.marketdata.RipioTicker;

/**
 * @author diegode
 */

@Path("api/v1")
@Produces(MediaType.APPLICATION_JSON)
public interface Ripio {

  @GET
  @Path("rates")
  RipioTicker getTicker();
}
