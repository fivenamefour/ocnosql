package com.ailk.oci.ocnosql.controller;

import com.ailk.oci.ocnosql.entity.Table;
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
 * Time: 上午9:27
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/table")
public class TableController {
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public @ResponseBody
    List<Table> getTableList() throws Exception {
        List<Table> tableList = new ArrayList<Table>();
        String prefixName = "dr_query201209";

        for (int i = 1; i <= 29; i++) {
            Table t = new Table();
            t.setTableId(Long.valueOf(i));
            if (i < 10) {
                t.setTableName(prefixName + "0" + i);
            }  else {
                t.setTableName(prefixName + i);
            }
            tableList.add(t);
        }

        return tableList;
    }
}
