package com.xxx.archetype.data.response;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@With
public class ApiResponse {
    private String message;
    private String code;
    private Object data;
}
