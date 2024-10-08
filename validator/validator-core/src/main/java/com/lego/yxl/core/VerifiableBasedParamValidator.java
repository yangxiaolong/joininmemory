package com.lego.yxl.core;

import com.lego.yxl.core.common.ValidateErrorHandler;
import com.lego.yxl.core.common.Verifiable;
import org.springframework.stereotype.Component;

@Component
public class VerifiableBasedParamValidator implements ParamValidator<Object> {
    @Override
    public boolean support(Object verifiable) {
        return verifiable instanceof Verifiable;
    }

    @Override
    public void validate(Object verifiable, ValidateErrorHandler validateErrorHandler) {
        ((Verifiable) verifiable).validate(validateErrorHandler);
    }
}
