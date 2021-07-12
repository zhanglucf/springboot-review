## springboot 启动会扫描以下位置的application.properties或者application.yml文件作为Spring boot的默认配置文件
在没有打成jar包时，和项目根路径同级的./config/applicatin.yml 或者application.yml会被加载，
且优先级比在classpath路径下的配置文件优先级要高。
- –file:./config/
- –file:./
- –classpath:/config/
- –classpath:/
打成jar包之后，和jar包同级目录下的./config/applicatin.yml 或者application.yml优先被加载。
- –file:./config/
- –file:./
- –classpath:/config/
- –classpath:/
## 我们还可以通过spring.config.location来改变默认的配置文件位置
