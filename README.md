# Web-App-Demo

## Web app注意点
1. Web应用的名字：ContextPath指定了web应用的名字。
2. 为什么浏览器中会显示 index.jsp的内容。因为通过 Tomcat 服务器启动的 web应用 的默认欢迎页是 index.jsp。
3. web.xml 的文件名能不能改，WEB-INF目录名能不能改？不可以改，这是Servlet规范的一部分。
4. Main目录下创建的目录能否不叫webapp。可以叫其他名字，这个目录的名字不是 Servlet 规范的一部分。

### 使用jar创建第一个servlet
1. 下载servlet的jar包，版本确认需要看tomcat的官网，java8以及以上应该有servlet4
2. Idea 里面找到project structure的Library，把servlet的jar加入
3. 找到tomcat安装目录把例子的web.xml拷贝出来修改一下。 （/Library/tomcat/webapps/examples/WEB-INF）
4. 自己的servlet类实现Servlet接口，追加自己的逻辑代码即可

### 用Tomcat来部署webApp
1. 进入tomcat目录下的webapps文件夹
2. 在webapps目录下创建文件夹hotel，这个文件夹是我们webapp的根目录，文件夹的名称就是我们webapp请求路径的根路径
3. webappRoot下创建WEB-INF文件夹
4. WEB-INF下创建classes文件夹
5. 将项目的web.xml赋值到WEB-INF下面
6. 将项目的out目录赋值到刚才创建的classes下面
7. 启动tomcat

### webapp标准目录结构
![webapp](./images/webapp.png)

### 创建过程
```
第一步：IDEA 创建空工程
第二步：IDEA 创建模块，build system 选择 Maven，修改 GroupId
第三步：在 main 目录下创建 webapp 目录，webapp 目录下创建 WEB-INF
第四步：在 WEB-INF 目录下创建 web.xml
第五步：填写 web.xml，建议从其他地方复制，例如从 TomcatRoot -> webapps -> examples 项目中复制，删除多余的内容，仅保留一个 servlet 和 servlet-mapping 作为后续参考
第六步：编辑 pom.xml，修改打包方式为 war
第七步：编辑 pom.xml，引入 javax.servlet-api 依赖，重新加载 Maven
第八步：在代码包路径下创建 Servlet 类，例如 QueryRoomServlet，实现 Servlet 接口
第九步：编辑 web.xml，配置 servlet 和 servlet-mapping
第十步：编辑 Configuration，增加一个 SmartTomcat 的 Configuration 
第十一步：配置 Configuration  
    Deployment directory : webapp 路径  
    Use classpath of module : hotel  
    Context path: /hotel  
第十二步：在 IDEA 中启动 Tomcat
第十三步：打开浏览器，在地址栏输入 http://localhost:8080/hotel/queryRoom
```

## maven优化webapp的部署
1. 在项目根目录下面创建配置文件pom.xml
2. 右键点击pom.xml，将项目标记为一个maven项目
3. 写pom文件
4. IDEA右边侧栏Maven，reload项目
5. 打war包，package指令
6. 把target文件夹中生成的war包赋值到Tomcat的app下面
7. 启动tomcat

# Servlet
## 概念相关
### 生命周期
Servlet对象的生命周期：一个 Servlet 对象从出生（创建）到死亡（销毁）的整个过程

## 生命周期方法
### Servlet 对象的 service 方法什么时候被调用
service 方法在用户访问 Servlet 对象的请求路径时被调用。
请求一次就会调用一次。

