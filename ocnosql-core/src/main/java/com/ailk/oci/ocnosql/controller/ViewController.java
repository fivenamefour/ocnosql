package com.ailk.oci.ocnosql.controller;

import com.ailk.oci.ocnosql.entity.View;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: yutao3
 * Date: 13-1-22
 * Time: 下午2:58
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/view")
public class ViewController {

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public @ResponseBody
    List<View> getViewList() throws Exception {
        List<View> viewList = new ArrayList<View>();
        String prefixName = "dr_query201209";

        for (int i = 1; i <= 29; i++) {
            View t = new View();
            t.setViewId(Long.valueOf(i));
            if (i < 10) {
                t.setViewName(prefixName + "0" + i);
            }  else {
                t.setViewName(prefixName + i);
            }
            viewList.add(t);
        }

        return viewList;
    }
}
