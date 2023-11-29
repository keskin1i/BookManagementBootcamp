package com.BookSystem.exception;


import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class BookException extends RuntimeException {
  public BookException(String message) {
    super(message);
  }

}
