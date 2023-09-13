package com.nikik0.apiRequester.repositories;

import com.nikik0.apiRequester.entities.CryptoEntity;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

import java.util.Map;

public interface CryptoRepository extends R2dbcRepository<CryptoEntity, Long> {
    @Query("select id, value from crypto")
    Map<Long, Double> findIdsAndValues();
}
