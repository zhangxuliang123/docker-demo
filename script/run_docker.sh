#/bin/bash
# author: zxl
APP_NAME = docker_demo
SERVICE_PATH=/work/bin/${APP_NAME}
JAR_FILE=/work/bin/${APP_NAME}/${APP_NAME}.jar
start(){
   cd SERVICE_PATH
   nohup java -jar $JAR_FILE
}