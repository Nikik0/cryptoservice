package com.nikik0.apiRequester.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CryptoDto {
    Long id;
    String symbol;
    String name;
    String nameid;
    Integer rank;
    Double price_usd;
    Double percent_change_24h;
    Double percent_change_1h;
    Double percent_change_7d;
    Double price_btc;
    BigDecimal market_cap_usd;
    BigDecimal volume24;
    BigDecimal volume24a;
    BigDecimal csupply;
    BigDecimal tsupply;
    BigDecimal msupply;
}
