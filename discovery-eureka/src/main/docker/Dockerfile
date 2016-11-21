FROM java
ENV JAVA_HOME /usr
COPY discovery-eureka.jar /usr/local/eureka/
COPY start.sh /usr/local/eureka/
WORKDIR /usr/local/apmsol-pay
EXPOSE 8671
ENTRYPOINT ["sh", "start.sh"]