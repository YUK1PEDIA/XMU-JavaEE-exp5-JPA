//School of Informatics Xiamen University, GPL-3.0 license

package com.xmu.exp5jpa.model.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class IdNameTypeDto {
    private Long id;
    private String name;
    private Byte type;
}