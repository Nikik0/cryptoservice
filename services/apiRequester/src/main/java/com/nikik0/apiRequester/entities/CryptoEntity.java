package com.nikik0.apiRequester.entities;

import java.math.BigDecimal;

public class CryptoEntity {
    Long id;
    String symbol;
    String name;
    String nameid;
    Integer rank;
    Double price_usd;
    Float percent_change_24h;
    Float percent_change_1h;
    Float percent_change_7d;
    Double price_btc;
    BigDecimal market_cap_usd;
    BigDecimal volume24;
    BigDecimal volume24a;
    BigDecimal csupply;
    BigDecimal tsupply;
    BigDecimal msupply;
}
