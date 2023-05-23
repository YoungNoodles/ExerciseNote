package com.cetc.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Brand {
    private Integer id;
    private String brand;
    private String company;
    private String ordered;
    private String description;
    private Integer status;


}
