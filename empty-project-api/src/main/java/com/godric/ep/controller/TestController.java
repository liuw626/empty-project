package com.godric.ep.controller;

import com.godric.ep.common.exception.BizErrorEnum;
import com.godric.ep.common.exception.BizException;
import com.godric.ep.common.result.DataResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

    @GetMapping("do")
    public DataResult<String> doTest(int i) {
        if (i == 0) {
            throw new BizException(BizErrorEnum.NEED_LOGIN);
        }
        return DataResult.success("test");
    }

}
