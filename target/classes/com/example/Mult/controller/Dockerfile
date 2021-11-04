FROM openjdk:11-jdk-alpine
COPY target/demo-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app.jar"]














# using a python small basic image
#FROM openjdk:8-jdk-alpine

#ARG JAR_FILE=target

# exposing our app port in docker internal network
#EXPOSE 5000

# creates a dir for our application
#WORKDIR /soma

# copy our requirements.txt file and install dependencies
#COPY requirements.txt .
#RUN pip install -r requirements.txt

# copy the rest of our application
#COPY . .
# run the application
#CMD java MultController.java