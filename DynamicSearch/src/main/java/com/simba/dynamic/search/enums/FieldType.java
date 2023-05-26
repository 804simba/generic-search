package com.simba.dynamic.search.enums;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Slf4j
public enum FieldType {
    BOOLEAN {
        public Object parse(String value) {
            return Boolean.valueOf(value);
        }
    },

    CHAR {
        public Object parse(String value) {
            return value.charAt(0);
        }
    },

    DATE {
        public Object parse(String value) {
            Object date = null;
            try {
                DateTimeFormatter formatter
                        = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
                date = LocalDateTime.parse(value, formatter);
            } catch (Exception e) {
                log.info("Failed to field type DATE {}", e.getMessage());
            }
            return date;
        }
    },

    DOUBLE {
        public Object parse(String value) {
            return Double.parseDouble(value);
        }
    },

    INTEGER {
        public Object parse(String value) {
            return Integer.parseInt(value);
        }
    },

    LONG {
        public Object parse(String value) {
            return Long.parseLong(value);
        }
    },

    STRING {
        public Object parse(String value) {
            return value;
        }
    };

    public abstract Object parse(String value);
}
