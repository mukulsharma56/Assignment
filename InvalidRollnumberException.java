package com.te.hibernate.assignment;

public class InvalidRollnumberException extends RuntimeException {
String msg;


public InvalidRollnumberException(String msg) {
this.msg = msg;
}

public String setMessage() {

return this.msg;
}
}
