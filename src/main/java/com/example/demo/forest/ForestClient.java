package com.example.demo.forest;

import com.dtflys.forest.annotation.Request;

import java.util.Map;

/**
 * @author fengqian07
 * @Description
 * @date 2020/8/18 10:44
 */
public interface ForestClient {
    @Request(
            url = "http://ditu.amap.com/service/regeo?longitude=${0}&latitude=${1}",
            dataType = "json"
    )
    Map getLocation(String longitude, String latitude);
}
