package com.CoffeMapper.coffe.models;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;



@Configuration

public class RestTemplateConfiguration {

    @Bean

    public RestTemplate restTemplate() {

        RestTemplate restTemplate = new RestTemplate();

        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();

        converter.setSupportedMediaTypes(Arrays.asList(MediaType.TEXT_HTML, MediaType.MULTIPART_FORM_DATA));

        restTemplate.getMessageConverters().add(converter);

        return restTemplate;

    }

}