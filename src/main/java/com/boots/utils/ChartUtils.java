package com.boots.utils;

/**
 * Created by U38070 on 21/12/2016.
 */
public class ChartUtils {

   public static StringBuilder memoryChart= new StringBuilder("{\n" +
           "        \"chart\": {\n" +
           "            \"caption\": \"Management Node\",\n" +
           "            \"subCaption\": \"Memory\",\n" +
           "            \"numberPrefix\": \"\",\n" +
           "            \"showBorder\": \"0\",\n" +
           "            \"use3DLighting\": \"0\",\n" +
           "            \"enableSmartLabels\": \"0\",\n" +
           "            \"startingAngle\": \"310\",\n" +
           "            \"showLabels\": \"0\",\n" +
           "            \"showPercentValues\": \"0\",\n" +
           "            \"showLegend\": \"1\",\n" +
           "            \"defaultCenterLabel\": \"85% Free\",\n" +
           "            \"centerLabel\": \"\",\n" +
           "            \"centerLabelBold\": \"1\",\n" +
           "            \"showTooltip\": \"0\",\n" +
           "            \"decimals\": \"0\",\n" +
           "            \"useDataPlotColorForLabels\": \"1\",\n" +
           "            \"theme\": \"fint\"\n" +
           "        },\n" +
           "        \"data\": [{\n" +
           "            \"label\": \"Occupied\",\n" +
           "            \"value\": \"15\",\n" +
           "\t\t\t\"isSliced\": \"1\"\n" +
           "        }, {\n" +
           "            \"label\": \"Good\",\n" +
           "            \"value\": \"85\"\n" +
           "        }]\n" +
           "    }");

    public static StringBuilder delNode1Chart= new StringBuilder("{\n" +
            "        \"chart\": {\n" +
            "            \"caption\": \"Delivery Node\",\n" +
            "            \"subCaption\": \"Memory\",\n" +
            "            \"numberPrefix\": \"\",\n" +
            "            \"showBorder\": \"0\",\n" +
            "            \"use3DLighting\": \"0\",\n" +
            "            \"enableSmartLabels\": \"0\",\n" +
            "            \"startingAngle\": \"310\",\n" +
            "            \"showLabels\": \"0\",\n" +
            "            \"showPercentValues\": \"0\",\n" +
            "            \"showLegend\": \"1\",\n" +
            "            \"defaultCenterLabel\": \"75% Free\",\n" +
            "            \"centerLabel\": \"\",\n" +
            "            \"centerLabelBold\": \"1\",\n" +
            "            \"showTooltip\": \"0\",\n" +
            "            \"decimals\": \"0\",\n" +
            "            \"useDataPlotColorForLabels\": \"1\",\n" +
            "            \"theme\": \"fint\"\n" +
            "        },\n" +
            "        \"data\": [{\n" +
            "            \"label\": \"Occupied\",\n" +
            "            \"value\": \"15\",\n" +
            "\t\t\t\"isSliced\": \"1\"\n" +
            "        }, {\n" +
            "            \"label\": \"Good\",\n" +
            "            \"value\": \"75\"\n" +
            "        }]\n" +
            "    }");

   public static StringBuilder jsonResponse = new StringBuilder("{\n" +
                "    \"chart\": {\n" +
                "        \"caption\": \"Customer Satisfaction Score\",\n" +
                "        \"lowerlimit\": \"0\",\n" +
                "        \"upperlimit\": \"100\",\n" +
                "        \"lowerlimitdisplay\": \"Bad\",\n" +
                "        \"upperlimitdisplay\": \"Good\",\n" +
                "        \"palette\": \"1\",\n" +
                "        \"numbersuffix\": \"%\",\n" +
                "        \"tickvaluedistance\": \"10\",\n" +
                "        \"showvalue\": \"0\",\n" +
                "        \"gaugeinnerradius\": \"0\",\n" +
                "        \"bgcolor\": \"FFFFFF\",\n" +
                "        \"pivotfillcolor\": \"333333\",\n" +
                "        \"pivotradius\": \"8\",\n" +
                "        \"pivotfillmix\": \"333333, 333333\",\n" +
                "        \"pivotfilltype\": \"radial\",\n" +
                "        \"pivotfillratio\": \"0,100\",\n" +
                "        \"showtickvalues\": \"1\",\n" +
                "        \"showborder\": \"0\"\n" +
                "    },\n" +
                "    \"colorrange\": {\n" +
                "        \"color\": [\n" +
                "            {\n" +
                "                \"minvalue\": \"0\",\n" +
                "                \"maxvalue\": \"45\",\n" +
                "                \"code\": \"e44a00\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"minvalue\": \"45\",\n" +
                "                \"maxvalue\": \"75\",\n" +
                "                \"code\": \"f8bd19\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"minvalue\": \"75\",\n" +
                "                \"maxvalue\": \"100\",\n" +
                "                \"code\": \"6baa01\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    \"dials\": {\n" +
                "        \"dial\": [\n" +
                "            {\n" +
                "                \"value\": \"85\",\n" +
                "                \"rearextension\": \"15\",\n" +
                "                \"radius\": \"100\",\n" +
                "                \"bgcolor\": \"333333\",\n" +
                "                \"bordercolor\": \"333333\",\n" +
                "                \"basewidth\": \"8\"\n" +
                "            }\n" +
                "        ]\n" +
                "    }\n" +
                "}");

    public static StringBuilder tomcatResponse = new StringBuilder("{\n" +
            "    \"chart\": {\n" +
            "        \"caption\": \"Tomcat Application servers\",\n" +
            "        \"subcaption\": \"By Nodes\",\n" +
            "        \"yaxisname\": \"\",\n" +
            "        \"palette\": \"2\",\n" +
            "        \"animation\": \"1\",\n" +
            "        \"showvalues\": \"0\",\n" +
            "        \"basefontcolor\": \"055082\",\n" +
            "        \"formatnumberscale\": \"1\",\n" +
            "        \"numbersuffix\": \"\",\n" +
            "        \"labeldisplay\": \"ROTATE\",\n" +
            "        \"numdivlines\": \"0\",\n" +
            "        \"slantlabels\": \"1\",\n" +
            "        \"showborder\": \"0\",\n" +
            "        \"plottooltext\": \"$label\",\n" +
            "        \"showzeroplanevalue\": \"0\",\n" +
            "\t\t\"showYAxisValues\": \"0\",\n" +
            "        \"theme\": \"zune\"\n" +
            "    },\n" +
            "   \n" +
            "    \"data\": [\n" +
            "        {\n" +
            "            \"label\": \"Management\",\n" +
            "            \"value\": \"+4\",\n" +
            "\t\t\t\"color\": \"#3f822e\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"label\": \"ES - Delivery01\",\n" +
            "            \"value\": \"+4\",\n" +
            "\t\t\t\"color\": \"#3f822e\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"label\": \"ES - Delivery02\",\n" +
            "            \"value\": \"+4\",\n" +
            "\t\t\t\"color\": \"#3f822e\"\n" +
            "        },\n" +
            "        {\n" +
            "             \"label\": \"ES - Delivery03\",\n" +
            "            \"value\": \"+4\",\n" +
            "\t\t\t\"color\": \"#3f822e\"\n" +
            "        },\n" +
            "        {\n" +
            "           \"label\": \"BY - Delivery01\",\n" +
            "            \"value\": \"+4\",\n" +
            "\t\t\t\"color\": \"#3f822e\"\n" +
            "        },\n" +
            "        {\n" +
            "           \"label\": \"BY - Delivery02\",\n" +
            "            \"value\": \"+4\",\n" +
            "\t\t\t\"color\": \"#BE3243\"\n" +
            "        }\n" +
            "    ],\n" +
            "    \"trendlines\": [\n" +
            "        {\n" +
            "            \"line\": [\n" +
            "                {\n" +
            "                    \"startvalue\": \"0\",\n" +
            "                    \"endvalue\": \"\",\n" +
            "                    \"istrendzone\": \"\",\n" +
            "                    \"color\": \"055082\",\n" +
            "                    \"displayvalue\": \"On Time\"\n" +
            "                }\n" +
            "            ]\n" +
            "        }\n" +
            "    ]\n" +
            "}");

    public static StringBuilder dbResponse = new StringBuilder("{\n" +
            "    \"chart\": {\n" +
            "        \"caption\": \"CM DB Servers\",\n" +
            "        \"subcaption\": \"By Nodes\",\n" +
            "        \"yaxisname\": \"\",\n" +
            "        \"palette\": \"2\",\n" +
            "        \"animation\": \"1\",\n" +
            "        \"showvalues\": \"0\",\n" +
            "        \"basefontcolor\": \"055082\",\n" +
            "        \"formatnumberscale\": \"1\",\n" +
            "        \"numbersuffix\": \"\",\n" +
            "        \"labeldisplay\": \"ROTATE\",\n" +
            "        \"numdivlines\": \"0\",\n" +
            "        \"slantlabels\": \"1\",\n" +
            "        \"showborder\": \"0\",\n" +
            "        \"plottooltext\": \"$label\",\n" +
            "        \"showzeroplanevalue\": \"0\",\n" +
            "\t\t\"showYAxisValues\": \"0\",\n" +
            "        \"theme\": \"zune\"\n" +
            "    },\n" +
            "   \n" +
            "    \"data\": [\n" +
            "        {\n" +
            "            \"label\": \"RACCDB_1\",\n" +
            "            \"value\": \"+4\",\n" +
            "\t\t\t\"color\": \"#3f822e\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"label\": \"RACCDB_2\",\n" +
            "            \"value\": \"+4\",\n" +
            "\t\t\t\"color\": \"#3f822e\"\n" +
            "        }\n" +
            "    ],\n" +
            "    \"trendlines\": [\n" +
            "        {\n" +
            "            \"line\": [\n" +
            "                {\n" +
            "                    \"startvalue\": \"0\",\n" +
            "                    \"endvalue\": \"\",\n" +
            "                    \"istrendzone\": \"\",\n" +
            "                    \"color\": \"055082\",\n" +
            "                    \"displayvalue\": \"On Time\"\n" +
            "                }\n" +
            "            ]\n" +
            "        }\n" +
            "    ]\n" +
            "}");

    public static StringBuilder iorResponse = new StringBuilder("{\n" +
            "    \"chart\": {\n" +
            "        \"caption\": \"CM Component Connectivity\",\n" +
            "        \"subcaption\": \"By Nodes\",\n" +
            "        \"yaxisname\": \"\",\n" +
            "        \"palette\": \"2\",\n" +
            "        \"animation\": \"1\",\n" +
            "        \"showvalues\": \"0\",\n" +
            "        \"basefontcolor\": \"055082\",\n" +
            "        \"formatnumberscale\": \"1\",\n" +
            "        \"numbersuffix\": \"\",\n" +
            "        \"labeldisplay\": \"ROTATE\",\n" +
            "        \"numdivlines\": \"0\",\n" +
            "        \"slantlabels\": \"1\",\n" +
            "        \"showborder\": \"0\",\n" +
            "        \"plottooltext\": \"$label\",\n" +
            "        \"showzeroplanevalue\": \"0\",\n" +
            "\t\t\"showYAxisValues\": \"0\",\n" +
            "        \"theme\": \"zune\"\n" +
            "    },\n" +
            "   \n" +
            "    \"data\": [\n" +
            "        {\n" +
            "            \"label\": \"CMS\",\n" +
            "            \"value\": \"+4\",\n" +
            "\t\t\t\"color\": \"#3f822e\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"label\": \"MLS\",\n" +
            "            \"value\": \"+4\",\n" +
            "\t\t\t\"color\": \"#3f822e\"\n" +
            "        },\n" +
            "\t\t{\n" +
            "            \"label\": \"RLS\",\n" +
            "            \"value\": \"+4\",\n" +
            "\t\t\t\"color\": \"#3f822e\"\n" +
            "        }\n" +
            "    ],\n" +
            "    \"trendlines\": [\n" +
            "        {\n" +
            "            \"line\": [\n" +
            "                {\n" +
            "                    \"startvalue\": \"0\",\n" +
            "                    \"endvalue\": \"\",\n" +
            "                    \"istrendzone\": \"\",\n" +
            "                    \"color\": \"055082\",\n" +
            "                    \"displayvalue\": \"On Time\"\n" +
            "                }\n" +
            "            ]\n" +
            "        }\n" +
            "    ]\n" +
            "}");

    public static StringBuilder runlevelResponse = new StringBuilder("{\n" +
            "    \"chart\": {\n" +
            "        \"caption\": \"CM Runlevel\",\n" +
            "        \"subcaption\": \"By Nodes\",\n" +
            "        \"yaxisname\": \"\",\n" +
            "        \"palette\": \"2\",\n" +
            "        \"animation\": \"1\",\n" +
            "        \"showvalues\": \"0\",\n" +
            "        \"basefontcolor\": \"055082\",\n" +
            "        \"formatnumberscale\": \"1\",\n" +
            "        \"numbersuffix\": \"\",\n" +
            "        \"labeldisplay\": \"ROTATE\",\n" +
            "        \"numdivlines\": \"0\",\n" +
            "        \"slantlabels\": \"1\",\n" +
            "        \"showborder\": \"0\",\n" +
            "        \"plottooltext\": \"$label\",\n" +
            "        \"showzeroplanevalue\": \"0\",\n" +
            "\t\t\"showYAxisValues\": \"0\",\n" +
            "        \"theme\": \"zune\"\n" +
            "    },\n" +
            "   \n" +
            "    \"data\": [\n" +
            "        {\n" +
            "            \"label\": \"CMS\",\n" +
            "            \"value\": \"+4\",\n" +
            "\t\t\t\"color\": \"#3f822e\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"label\": \"MLS\",\n" +
            "            \"value\": \"+4\",\n" +
            "\t\t\t\"color\": \"#3f822e\"\n" +
            "        },\n" +
            "\t\t{\n" +
            "            \"label\": \"RLS\",\n" +
            "            \"value\": \"+4\",\n" +
            "\t\t\t\"color\": \"#3f822e\"\n" +
            "        }\n" +
            "    ],\n" +
            "    \"trendlines\": [\n" +
            "        {\n" +
            "            \"line\": [\n" +
            "                {\n" +
            "                    \"startvalue\": \"0\",\n" +
            "                    \"endvalue\": \"\",\n" +
            "                    \"istrendzone\": \"\",\n" +
            "                    \"color\": \"055082\",\n" +
            "                    \"displayvalue\": \"On Time\"\n" +
            "                }\n" +
            "            ]\n" +
            "        }\n" +
            "    ]\n" +
            "}");



}
