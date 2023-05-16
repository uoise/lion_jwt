package com.ll.lion_jwt.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class Ut {
    public static class json {
        public static Object toStr(Map<String, Object> map) {
            try {
                return new ObjectMapper().writeValueAsString(map);
            } catch (JsonProcessingException e) {
                return null;
            }
        }

        public static Map<String, Object> toMap(String jsonStr) {
            try {
                return new ObjectMapper().readValue(jsonStr, LinkedHashMap.class);
            } catch (JsonProcessingException e) {
                return Collections.emptyMap();
            }
        }
    }
}