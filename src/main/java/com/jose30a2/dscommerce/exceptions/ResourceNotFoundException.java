package com.jose30a2.dscommerce.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    // RunTimeException no exige try - catch

    public ResourceNotFoundException(String msg) {
        super(msg);
    }
}
