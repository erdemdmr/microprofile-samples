package com.microprofile.samples.services.book.resource;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(staticName = "error")
@Getter
public class ErrorPayload {
    private String code;
    private String message;
}
