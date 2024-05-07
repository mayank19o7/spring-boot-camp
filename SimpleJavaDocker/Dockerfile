# Dockerfile should be at the project folder level making the project as "build context"
# And hence, for security reasons, you can only copy from the directory set as the "build context" and below.

# Use a base image with Java pre-installed
FROM openjdk:17
# Set the working directory inside the container, to be used by RUN, CMD, ADD, COPY commands.
WORKDIR /usr/app
# Copy the Java source files into the container
COPY ./src/main/java .
# Compile the Java code
RUN javac com/mak/SimpleJavaDocker.java
# Command to run your Java application
CMD ["java", "com.mak.SimpleJavaDocker"]
