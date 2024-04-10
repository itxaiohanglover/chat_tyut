## 拉取JDK8作为基础镜像
FROM java:8
# 作者
MAINTAINER liuyuhang <1531137510@qq.com>
# 添加jar包
COPY /chat.jar /chat.jar
COPY /socket.jar /socket.jar
# 添加entrypoint脚本,并添加可执行权限
COPY /start.sh /start.sh
RUN chmod +x /start.sh
# 镜像启动后暴露的端口
EXPOSE 8081 8083

ENTRYPOINT ["sh","-c","./start.sh"]
