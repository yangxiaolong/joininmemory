package com.yxl.service.address;

import com.yxl.wide.WideItemData;
import com.yxl.wide.WideOrderType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address implements WideItemData<WideOrderType, Long> {
    private Long id;
    private Long userId;
    private String detail;

    @Override
    public WideOrderType getItemType() {
        return WideOrderType.ADDRESS;
    }

    @Override
    public Long getKey() {
        return id;
    }
}
