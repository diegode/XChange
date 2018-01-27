package org.knowm.xchange.ripio.dto.marketdata;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;

import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author diegode
 */
public class RipioTickerTest {

  @Test
  public void testUnmarshal() throws IOException {

    // Read in the JSON from the example resources
    InputStream is = RipioTickerTest.class.getResourceAsStream("/marketdata/example-ticker-data.json");
    ObjectMapper mapper = new ObjectMapper();
    RipioTicker ripioTicker = mapper.readValue(is, RipioTicker.class);

    // Verify that the example data was unmarshalled correctly
    assertThat(ripioTicker.getBid()).isEqualTo(new BigDecimal("255021.7785"));
    assertThat(ripioTicker.getAsk()).isEqualTo(new BigDecimal("273425.412"));
  }
}
