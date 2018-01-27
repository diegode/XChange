package org.knowm.xchange.ripio;

import static org.knowm.xchange.currency.Currency.ARS;
import static org.knowm.xchange.currency.Currency.BTC;

import org.knowm.xchange.currency.CurrencyPair;
import org.knowm.xchange.dto.marketdata.Ticker;
import org.knowm.xchange.exceptions.NotAvailableFromExchangeException;
import org.knowm.xchange.ripio.dto.marketdata.RipioTicker;

/**
 * @author diegode
 * Various adapters for converting from Ripio DTOs to XChange DTOs
 */
public final class RipioAdapters {

  private RipioAdapters() {
  }

  /**
   * Adapts a RipioTicker to a Ticker Object
   *
   * @param ripioTicker The exchange specific ticker
   * @param currencyPair
   * @return The ticker
   */
  public static Ticker adaptTicker(RipioTicker ripioTicker, CurrencyPair currencyPair) {
    if (!currencyPair.equals(new CurrencyPair(BTC, ARS))) {
      throw new NotAvailableFromExchangeException();
    }
    return new Ticker.Builder()
        .currencyPair(currencyPair)
        .bid(ripioTicker.getBid())
        .ask(ripioTicker.getAsk())
        .last(ripioTicker.getAsk())
        .build();
  }
}
