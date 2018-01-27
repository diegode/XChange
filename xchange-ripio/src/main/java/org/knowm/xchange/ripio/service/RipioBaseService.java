package org.knowm.xchange.ripio.service;

import org.knowm.xchange.Exchange;
import org.knowm.xchange.service.BaseExchangeService;
import org.knowm.xchange.service.BaseService;

/**
 * @author diegode
 */
public class RipioBaseService extends BaseExchangeService implements BaseService {

  /**
   * Constructor
   *
   * @param exchange
   */
  public RipioBaseService(Exchange exchange) {

    super(exchange);
  }
}
