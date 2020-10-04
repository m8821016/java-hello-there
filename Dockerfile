FROM java:8
COPY . /var/www/java
WORKDIR /var/www/java
RUN javac src/com/dockerbyexample/HelloThere.java
CMD java -cp src/ com.dockerbyexample.HelloThere