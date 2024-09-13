package com.yxl.vo;

import com.yxl.annotation.JoinInMemory;
import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@JoinInMemory(keyFromSourceData = "",
        keyFromJoinData = "#{id}",
        loader = "#{@addressRepository.getByIds(#root)}",
        joinDataConverter = "#{T(com.yxl.demo.AddressVO).apply(#root)}"
)
public @interface JoinAddressVOOnId {
    @AliasFor(
            annotation = JoinInMemory.class
    )
    String keyFromSourceData();
}
