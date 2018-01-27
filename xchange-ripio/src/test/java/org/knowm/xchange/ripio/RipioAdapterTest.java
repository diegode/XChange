package org.knowm.xchange.ripio;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;

import org.junit.Test;
import org.knowm.xchange.currency.CurrencyPair;
import org.knowm.xchange.dto.marketdata.Ticker;
import org.knowm.xchange.ripio.dto.marketdata.RipioTicker;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author diegode
 */
public class RipioAdapterTest {

  @Test
  public void testTickerAdapter() throws IOException {
    // Read in the JSON from the example resources
    InputStream is = RipioAdapterTest.class.getResourceAsStream("/marketdata/example-ticker-data.json");
    // Use Jackson to parse it
    ObjectMapper mapper = new ObjectMapper();
    RipioTicker ripioTicker = mapper.readValue(is, RipioTicker.class);

    Ticker ticker = RipioAdapters.adaptTicker(ripioTicker, new CurrencyPair("BTC", "ARS"));
    assertThat(ticker).isNotNull();
    assertThat(ticker.getBid()).isEqualTo(new BigDecimal("255021.7785"));
    assertThat(ticker.getAsk()).isEqualTo(new BigDecimal("273425.412"));
    assertThat(ticker.getLast()).isEqualTo(new BigDecimal("273425.412"));
  }
}
