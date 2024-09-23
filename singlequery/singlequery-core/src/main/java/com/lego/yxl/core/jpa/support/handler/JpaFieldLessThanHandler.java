package com.lego.yxl.core.jpa.support.handler;
import com.lego.yxl.annotation.FieldLessThan;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;

import java.lang.reflect.Field;

/**
 * Created by taoli on 2022/8/31.
 * gitee : https://gitee.com/litao851025/lego
 * 编程就像玩 Lego
 */
public class JpaFieldLessThanHandler
    extends AbstractJpaAnnotationHandler<FieldLessThan>{
    public JpaFieldLessThanHandler() {
        super(FieldLessThan.class);
    }

    @Override
    public <E> Predicate create(Root<E> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder, FieldLessThan fieldLessThan, Object value) {
        if (value instanceof Comparable){
            return criteriaBuilder.lessThan(createExpression(root, fieldNameOf(fieldLessThan)), (Comparable) value);
        }
        return null;
    }

    @Override
    protected boolean matchField(Field field, Class queryType) {
        return Comparable.class.isAssignableFrom(queryType);
    }

    @Override
    protected String fieldNameOf(FieldLessThan fieldLessThan) {
        return fieldLessThan.value();
    }
}
