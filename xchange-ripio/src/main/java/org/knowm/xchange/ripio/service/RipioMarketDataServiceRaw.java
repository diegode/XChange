package org.knowm.xchange.ripio.service;

import org.knowm.xchange.Exchange;
import org.knowm.xchange.ripio.Ripio;
import org.knowm.xchange.ripio.dto.marketdata.RipioTicker;

import si.mazi.rescu.RestProxyFactory;

/**
 * Created by diegode on 13/01/2018
 */
public class RipioMarketDataServiceRaw extends RipioBaseService {

  private final Ripio ripio;

  public RipioMarketDataServiceRaw(Exchange exchange) {

    super(exchange);
    this.ripio = RestProxyFactory.createProxy(Ripio.class, exchange.getExchangeSpecification().getSslUri(), getClientConfig());
  }

  public RipioTicker getRipioTicker() {
    return ripio.getTicker();
  }
}
