package cdu.gu.utils;

import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.Charset;

public class restTemplate {
    /**
     * 创建指定字符集的RestTemplate
     *
     * @param charset 编码
     * @return 返回结果
     */
    public  RestTemplate getInstance(String charset) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(new StringHttpMessageConverter(Charset.forName(charset)));
        return restTemplate;
    }
}
