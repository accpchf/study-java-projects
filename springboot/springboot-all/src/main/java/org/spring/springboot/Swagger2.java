package org.spring.springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author 程序猿DD
 * @version 1.0.0
 * @date 16/4/18 下午12:02.
 * @blog http://blog.didispace.com
 */
@Configuration//通过@Configuration注解，让Spring来加载该类配置。
@EnableSwagger2//再通过@EnableSwagger2注解来启用Swagger2。
public class Swagger2 {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
          //Swagger会扫描该包下所有Controller定义的API，并产生文档内容（除了被@ApiIgnore指定的请求）。
                .apis(RequestHandlerSelectors.basePackage("org.spring.springboot.controllers"))
                .paths(PathSelectors.any())
                .build();
    }
    //编写首页的介绍
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Spring Boot中使用Swagger2构建RESTful APIs")
                .description("更多Spring Boot相关文章请关注：http://blog.didispace.com/")
                .termsOfServiceUrl("http://blog.didispace.com/")
                .contact(getContact())
                .version("1.0")
                .build();
    }
    //编写联系方法
    private Contact getContact(){
    	return new Contact("海峰","http://blog.didispace.com/","1536021562@qq.com");
    }
}
