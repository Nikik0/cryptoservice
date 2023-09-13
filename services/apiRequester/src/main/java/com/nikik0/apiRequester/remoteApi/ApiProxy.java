package com.nikik0.apiRequester.remoteApi;

import com.nikik0.apiRequester.dtos.CryptoDto;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ApiProxy {
    Flux<CryptoDto> requestSingleCrypto(Long id);
    Flux<CryptoDto> requestAllCryptoWithIdsBetween(Integer startId, Integer endId);
}
