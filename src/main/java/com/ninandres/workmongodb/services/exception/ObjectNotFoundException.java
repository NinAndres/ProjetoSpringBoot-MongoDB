package com.ninandres.workmongodb.services.exception;

public class ObjectNotFoundException extends RuntimeException {
  public ObjectNotFoundException(String msg) {
    super(msg);
  }
}
