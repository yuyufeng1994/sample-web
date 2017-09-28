package top.yuyufeng.sample.web.action.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter implements Converter<String, Date> {
    public static DateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
    //2016-08-18
    @Override
    public Date convert(String source) {
        // 将日期串转成日起类型(格式是 yyyy-MM-dd)
        try {
            return simpleDateFormat.parse(source);
        } catch (ParseException e) {
            return null;
        }
    }

}