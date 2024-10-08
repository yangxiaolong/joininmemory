package com.lego.yxl.param;

import com.lego.yxl.annotation.SplitParam;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AnnBasedInputParam {

    @SplitParam
    private List<Long> numbers;

    private  Long other;

}
