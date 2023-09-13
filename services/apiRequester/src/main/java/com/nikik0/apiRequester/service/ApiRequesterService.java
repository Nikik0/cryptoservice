package com.nikik0.apiRequester.service;

import com.nikik0.apiRequester.remoteApi.ApiProxy;
import com.nikik0.apiRequester.repositories.CryptoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class ApiRequesterService {
    //берем первую колонку и цену в мапу, делаем по 1 запросу к апишке для каждого элемента мапы,
    //если цена которая вернулась отличается от значения мапы, то записываем новое значение цены для элемента бд с ключом мапы,
    //и отправляем месседж в кафку, если не найден такой (плохой респонс от апи). то отправляем соответсвующее сообщение в кафку
    private final CryptoRepository repository;
    private final ApiProxy apiProxy;

    public void gettest(){
        apiProxy.requestSingleCrypto(90L).subscribe(x -> log.info("got {}", x));
    }
}

