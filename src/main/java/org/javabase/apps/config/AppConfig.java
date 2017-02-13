/**
 * 
 */
package org.javabase.apps.config;

import java.util.List;
import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
 
@Configuration
@EnableWebMvc
@Import(DBConfig.class)
@ComponentScan(basePackages = "org.javabase.apps")
public class AppConfig extends WebMvcConfigurerAdapter{
     
    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setViewClass(JstlView.class);
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");
 
        return viewResolver;
    }
 
     /*
     * Configure ResourceHandlers to serve static resources like CSS/ Javascript etc...
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
    }
    
    @Bean
    public LocaleResolver localeResolver(){
		CookieLocaleResolver resolver = new CookieLocaleResolver();
		resolver.setDefaultLocale(new Locale("en"));
		resolver.setCookieName("localeCookie");
		resolver.setCookieMaxAge(4800);
		return resolver;
    }
    
    /*
     * (non-Javadoc)
     * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter#configureMessageConverters(java.util.List)
     * @description Jackson Rest data binding converter.
     */
    @Override
    public void configureMessageConverters( List<HttpMessageConverter<?>> converters ) {
        converters.add(converter());
    }

    @Bean
    MappingJackson2HttpMessageConverter converter() {
    	MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
    	converter.setObjectMapper(new ObjectMapper().configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false));
        converter.setObjectMapper(new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false));
        return converter;
    }
    
    
}