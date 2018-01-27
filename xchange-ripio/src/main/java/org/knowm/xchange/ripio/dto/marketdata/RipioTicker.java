package org.knowm.xchange.ripio.dto.marketdata;

import java.math.BigDecimal;
import java.util.HashMap;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RipioTicker {
  @JsonProperty("base")
  private String base;
  @JsonProperty("rates")
  private HashMap<String, BigDecimal> rates;
  @JsonProperty("names")
  private HashMap<String, HashMap<String, String>> names;
  @JsonProperty("variation")
  private HashMap<String, BigDecimal> variation;

  public BigDecimal getBid() {
    return rates.get("ARS_SELL");
  }

  public BigDecimal getAsk() {
    return rates.get("ARS_BUY");
  }
}
