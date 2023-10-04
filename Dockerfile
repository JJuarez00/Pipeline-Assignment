FROM openjdk:17-oracle

WORKDIR /opt/myapp

COPY ./hello.java .

RUN javac hello.java

CMD ["java", "hello"]