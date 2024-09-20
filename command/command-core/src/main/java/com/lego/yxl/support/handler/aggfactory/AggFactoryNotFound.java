package com.lego.yxl.support.handler.aggfactory;

import lombok.Value;

@Value
public class AggFactoryNotFound extends RuntimeException{
    private Class contextClass;
    private Class aggClass;
}
