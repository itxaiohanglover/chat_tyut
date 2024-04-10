#!/bin/bash

#启动socket
nohup java -jar /socket.jar --server.port=8081 &

#启动chat
nohup java -jar /chat.jar --server.port=8083 &
