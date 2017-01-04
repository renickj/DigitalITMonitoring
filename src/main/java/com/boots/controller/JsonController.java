package com.boots.controller;

import com.boots.utils.ChartUtils;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by U38070 on 20/12/2016.
 */
@RestController
public class JsonController {

    @CrossOrigin
    @RequestMapping(value = "/getJSon" , method = RequestMethod.GET,produces = "application/json")
    public String getJsonString() {
        StringBuilder jsonResponse = new StringBuilder();
        jsonResponse.append("{\"chart\": {\"caption\": \"Monthly\",\"xaxisname\": \"Month\",\"yaxisname\": \"Revenue\",\"numberprefix\": \"$\",\"showvalues\": \"1\",\"animation\": \"1\"},");
        jsonResponse.append("\"data\": [{\"label\": \"Jan\",\"value\": \"420000\"}, {\"label\": \"Feb\",\"value\": \"810000\"}, {\"label\": \"Mar\",\"value\": \"720000\"}, {");
        jsonResponse.append("\"label\": \"Apr\",\"value\": \"550000\"}, {\"label\": \"May\",\"value\": \"910000\"}, {\"label\": \"Jun\",\"value\": \"510000\"}, {\"label\": \"Jul\",\"value\": \"680000\"}, {");
        jsonResponse.append("\"label\": \"Aug\",\"value\": \"620000\"}, {\"label\": \"Sep\",\"value\": \"610000\"}, {\"label\": \"Oct\",\"value\": \"490000\"}, {\"label\": \"Nov\",\"value\": \"900000\"}, {");
        jsonResponse.append("\"label\": \"Dec\",\"value\": \"730000\"}],");
        jsonResponse.append("\"trendlines\": [{\"line\": [{\"startvalue\": \"700000\",\"istrendzone\": \"1\",\"valueonright\": \"1\",\"tooltext\": \"AYAN\",\"endvalue\": \"900000\",\"color\": \"009933\",");
        jsonResponse.append("\"displayvalue\": \"Target\",\"showontop\": \"1\",\"thickness\": \"5\"}] }]");
        jsonResponse.append("}");
        return jsonResponse.toString();
    }

    @CrossOrigin
    @RequestMapping(value = "/getMemory" , method = RequestMethod.GET,produces = "application/json")
    public String getMemory() {
           return ChartUtils.jsonResponse.toString();
    }

/*    @CrossOrigin
    @RequestMapping(value = "/getMemoryChart" , method = RequestMethod.GET,produces = "application/json")
    public String getMemoryChart() {
        return ChartUtils.memoryChart.toString();
    }*/

    @CrossOrigin
    @RequestMapping(value = "/getMemoryChart" , method = RequestMethod.GET,produces = "application/json")
    public String getMemoryChart(@RequestParam("nodeInfo") String node) {
        if(!node.isEmpty() && node.equals("MNGMT")) {
            return ChartUtils.memoryChart.toString();
        }else  if(!node.isEmpty() && node.equals("DEL")){
            return ChartUtils.delNode1Chart.toString();
        }else if(!node.isEmpty() && node.equals("TOMCAT")){
            System.out.println("In TOMCAT");
            return ChartUtils.tomcatResponse.toString();
        }else if(!node.isEmpty() && node.equals("DB")){
            System.out.println("In DB");
            return ChartUtils.dbResponse.toString();
        }
        else if(!node.isEmpty() && node.equals("IOR")){
            System.out.println("In DB");
            return ChartUtils.iorResponse.toString();
        }
        else if(!node.isEmpty() && node.equals("RUNLEVEL")){
            System.out.println("In RUNLEVEL");
            return ChartUtils.runlevelResponse.toString();
        }

        return "";


    }

}
