package com.codeover.documentmind.exception;

public class DocumentProcessingException extends RuntimeException {


    public DocumentProcessingException(String message) {
        super(message);
    }

    public DocumentProcessingException() {
        super("Error in processing the document");
    }
    public DocumentProcessingException(String message, Throwable cause) {
        super(message, cause);
    }
}
