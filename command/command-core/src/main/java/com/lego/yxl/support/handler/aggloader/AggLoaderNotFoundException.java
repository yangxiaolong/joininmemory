package com.lego.yxl.support.handler.aggloader;

import lombok.Value;

@Value
public class AggLoaderNotFoundException extends RuntimeException{
    private final Class cmdClass;
    private final Class aggClass;
}
