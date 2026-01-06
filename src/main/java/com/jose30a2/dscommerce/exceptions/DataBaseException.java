package com.jose30a2.dscommerce.exceptions;

public class DataBaseException extends RuntimeException {
    // RunTimeException no exige try - catch

    public DataBaseException(String msg) {
        super(msg);
    }
}
