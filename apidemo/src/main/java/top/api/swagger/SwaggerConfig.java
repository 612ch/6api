package top.api.swagger;

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
 * @Descriotion swagger配置
 * @Author ChenHao
 * @Date 2020/10/15 19:15
 **/
@Configuration
@EnableSwagger2
@EnableSwaggerBootstrapUI
public class SwaggerConfig {
    /*设计力求简洁，直到无法更简洁。*/

    private static String PACKAGE_NAME = "top.api.controller";

    /**
     * @author guozihao
     * @Description 全部接口文档
     * @Data 2020/9/15 9:35
     */
    @Bean
    public Docket accessToken() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("全部接口")// 定义组
                .select() // 选择那些路径和 api 会生成 document
                .apis(RequestHandlerSelectors.basePackage(PACKAGE_NAME)) // 拦截的包路径
                .paths(PathSelectors.any())  //拦截所有接口
                .build() // 创建
                .securitySchemes(securitySchemes())
                .apiInfo(apiInfo()); // 配置说明
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("6API接口平台")// 标题
                .description("提供后台所有Restful接口")// 描述
                .contact(new Contact("demon", "http://www.6api.top", "1319503977@qq.com"))// 联系
                .termsOfServiceUrl("http://www.6api.top")//网站url
                .version("1.0")// 版本
                .build();
    }
    private List<ApiKey> securitySchemes() {
        List<ApiKey> apiKeyList = new ArrayList();
        apiKeyList.add(new ApiKey("token", "token", "header"));
        return apiKeyList;
    }


}
