package com.nikik0.apiRequester.remoteApi;

import com.nikik0.apiRequester.dtos.CryptoDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

@Slf4j
@Component
public class ApiProxyImpl implements ApiProxy {
    private final String  baseUrl = "https://api.coinlore.net/api/";
    private final WebClient webClient;

    public ApiProxyImpl() {
        this.webClient = WebClient.builder().build();
    }

    private String buildUrl(String predicate, String postfix){
        return baseUrl + predicate + postfix;
    }

    @Override
    public Flux<CryptoDto> requestSingleCrypto(Long id) {
        return webClient.get()
                .uri(buildUrl("ticker/?id=90", ""))
                .retrieve().bodyToFlux(CryptoDto.class)
                .doOnError(x -> log.error("bruh {}", x));
    }

    @Override
    public Flux<CryptoDto> requestAllCryptoWithIdsBetween(Integer startId, Integer endId) {
        return webClient.get()
                .uri(buildUrl("tickers/?start=100", "&limit=100"))
                .retrieve().bodyToFlux(CryptoDto.class)
                .doOnError(x -> log.error("error {} occurred while processing response", x.getMessage()));
    }
}
