package com.nikik0.apiRequester.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class KafkaMessageDto {
    private Long id;
    private String symbol;
    private String status;
    private Double value;

}
