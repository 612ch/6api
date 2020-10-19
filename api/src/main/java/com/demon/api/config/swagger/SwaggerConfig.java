package com.demon.api.config.swagger;

import com.github.xiaoymin.swaggerbootstrapui.annotations.EnableSwaggerBootstrapUI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName SwaggerConfig
 * @Descriotion Swagger配置类
 * @Author ChenHao
 * @Date 2020/10/19 19:12
 **/

@Configuration
@EnableSwagger2
@EnableSwaggerBootstrapUI
public class SwaggerConfig {

    private static String PACKAGE_NAME = "com.demon.api.controller";


    /**
     * 所有接口
     *
     * @return {@link Docket}
     */
    @Bean
    public Docket allAPI() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("All API")// 定义组 娱乐类接口
                .select() // 选择那些路径和 api 会生成 document
                .apis(RequestHandlerSelectors.basePackage(PACKAGE_NAME)) // 拦截的包路径
                .paths(PathSelectors.any())  //拦截所有接口
                .build() // 创建
                .securitySchemes(securitySchemes())
                .apiInfo(apiInfo()); // 配置说明
    }

    /**
     * 娱乐类接口
     *
     * @return {@link Docket}
     */
    @Bean
    public Docket delightAPI() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("Delight API")// 定义组 娱乐类接口
                .select() // 选择那些路径和 api 会生成 document
                .apis(RequestHandlerSelectors.basePackage(PACKAGE_NAME + ".delight")) // 拦截的包路径
                .paths(PathSelectors.any())  //拦截所有接口
                .build() // 创建
                .securitySchemes(securitySchemes())
                .apiInfo(apiInfo()); // 配置说明
    }

    /**
     * 功能类接口
     *
     * @return {@link Docket}
     */
    @Bean
    public Docket functionAPI() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("Function API")// 定义组
                .select() // 选择那些路径和 api 会生成 document
                .apis(RequestHandlerSelectors.basePackage(PACKAGE_NAME + ".function")) // 拦截的包路径
                .paths(PathSelectors.any())  //拦截所有接口
                .build() // 创建
                .securitySchemes(securitySchemes())
                .apiInfo(apiInfo()); // 配置说明
    }

    /**
     * 生活类接口
     *
     * @return {@link Docket}
     */
    @Bean
    public Docket lifeAPI() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("Life API")// 定义组 生活类接口
                .select() // 选择那些路径和 api 会生成 document
                .apis(RequestHandlerSelectors.basePackage(PACKAGE_NAME + ".life")) // 拦截的包路径
                .paths(PathSelectors.any())  //拦截所有接口
                .build() // 创建
                .securitySchemes(securitySchemes())
                .apiInfo(apiInfo()); // 配置说明
    }


    /**
     * 知识类接口
     *
     * @return {@link Docket}
     */
    @Bean
    public Docket questionAPI() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("Question API")// 定义组
                .select() // 选择那些路径和 api 会生成 document
                .apis(RequestHandlerSelectors.basePackage(PACKAGE_NAME + ".question")) // 拦截的包路径
                .paths(PathSelectors.any())  //拦截所有接口
                .build() // 创建
                .securitySchemes(securitySchemes())
                .apiInfo(apiInfo()); // 配置说明
    }

    /**
     * api的信息
     *
     * @return {@link ApiInfo}
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("6API接口平台")// 标题
                .description("提供后台所有Restful接口")// 描述
                .contact(new Contact("demon", "http://www.6api.top", "1319503977@qq.com"))// 联系
                .termsOfServiceUrl("http://www.6api.top")//网站url
                .version("1.0")// 版本
                .build();
    }

    /**
     * 安全计划
     *
     * @return {@link List<ApiKey>}
     */
    private List<ApiKey> securitySchemes() {
        List<ApiKey> apiKeyList = new ArrayList();
        apiKeyList.add(new ApiKey("token", "token", "header"));
        return apiKeyList;
    }
}
