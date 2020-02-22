package com.yyf.simpleDataBindCustomize.convert;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter implements Converter<String, Date> {

    private String datePattern = "yyyy-MM-dd HH:mm:ss";
    @Override
    public Date convert(String source) {
        SimpleDateFormat sdf = new SimpleDateFormat(datePattern);

        try {
            return sdf.parse(source);
        } catch (ParseException e) {
            e.printStackTrace();
            throw new IllegalArgumentException(
                    "无效的日期格式，请使用这种格式："+datePattern
            );
        }
    }
}
