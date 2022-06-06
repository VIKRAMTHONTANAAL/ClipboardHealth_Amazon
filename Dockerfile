FROM maven:3.8.1-openjdk-11-slim
# copying entire framework
COPY ./. /home/Projects/ClipboardHealth_Amazon
# check java installation
RUN java -version
# run maven version check
RUN mvn -v
# package the project to jar by skipping tests
RUN mvn -f /home/Projects/ClipboardHealth_Amazon clean package -DskipTests=true
