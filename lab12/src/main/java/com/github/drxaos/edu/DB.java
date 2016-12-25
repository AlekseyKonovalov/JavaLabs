package com.github.drxaos.edu;

import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class DB{
    static public Map<String,List<Object>> tableAndList= new HashMap<String, List<Object>>();

    static boolean DBTable(String  tableName) {
        return tableAndList.containsKey(tableName);
    }

}