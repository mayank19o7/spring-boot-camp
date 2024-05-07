# Docker Commands

This document provides a list of commonly used Docker commands for managing containers, images, volumes, and networks.

## Table of Contents

- [Introduction](#introduction)
- [Images](#images)
- [Containers](#containers)
- [Volumes](#volumes)
- [Networks](#networks)

## Introduction

- **Check Docker version:**
    ```sh
    docker --version
    ```
- **To view all base images** Visit : [Docker Hub](https://hub.docker.com/)

## Images

- **List all images:**
    ```sh
    docker images
    ```
- **Search an specific image:**
    - Syntax :  `docker search IMAGE_NAME`
    - Example :
        ```sh 
        docker search hello-world
        ```
- **Pull an image from Docker Hub:**
    - Syntax :  `docker pull IMAGE_NAME`
    - Examples
        - Pull the `hello-world` image:
            ```sh 
            docker pull hello-world
            ```
        - Pull the `openjdk` image:
            ```sh 
            docker pull openjdk
            ```
        - Pull the `openjdk:18` image with version:
            ```sh 
            docker pull openjdk:18
            ```
- **inspect an image:**
    - Syntax :  `docker inspect IMAGE_ID/IMAGE_NAME`
    - Example :
        ```sh
        docker inspect python
        ```
- **Remove an image:**
    - Syntax :  `docker rmi IMAGE_ID/IMAGE_NAME`
    - Example :
        ```sh
        docker rmi hello-world
        ```
- **Build an image from a Dockerfile:**
    - Syntax :  `docker build -t IMAGE_NAME PATH_TO_DOCKERFILE`
    - Example :
        ```sh
        docker build -t my-image .
        ```
- **Push the docker image into the Dockerhub:**
    1. Tag the local image
        - Syntax :  `docker tag IMAGE_NAME USERNAME/IMAGE_NAME:TAG`  (TAG is optional)
        - Example :
            ```sh
            docker tag hello-world mayank19o7/my-hello-world:latest
            ```
    2. Log in to Docker Hub
        ```sh
        docker login
        ```
    3. Push the image to Docker Hub
        - Syntax :  `docker push USERNAME/IMAGE_NAME:TAG`  (TAG is optional)
        - Example :
            ```sh
            docker push mayank19o7/my-hello-world
            ```
## Containers

- **List all running containers:**
    ```sh 
    docker ps
    ```
- **List all containers (including stopped ones):**
    ```sh
    docker ps -a
    ```
- **Run a container in detached mode:**
    - Syntax :  `docker run --name CONTAINER_NAME -d IMAGE_NAME`
    - Examples
        - Running container with random name:
            ```sh 
            docker run hello-world
            ```
        - Running container with provided name in detached mode:
            ```sh 
            docker run --name hello-container -d hello-world
            ```
- **Run a container continuously (python or postgres):**
    - Syntax :  `docker run --name CONTAINER_NAME -it -d IMAGE_NAME`
    - Examples
        - Running container with random name:
            ```sh 
            docker run --name py-container -it -d python
            ```
        - Running container for postgres:
            ```sh
            docker run --name pg4-container -e POSTGRES_PASSWORD=master -it -d postgres
            ```
- **Run a container with port mapping:**
    - Syntax : `docker run -d -p <PORT_ON_HOST>:<PORT_ON_CONTAINER> CONTAINER_NAME`
    - Example :
        ```sh
        docker run --name my-running-app -d -p 8082:80 httpd
        ```

        to check the running server, go to [http://localhost:8082/](http://localhost:8082/)

- **Run new commands in a running container:**
    - Syntax : `docker exec -it  CONTAINER_NAME COMMAND_NAME`
    - Example :
        ```sh 
        docker exec -it py-container python3
        exit()
        ```
- **Stop a running container:**
    - Syntax :  `docker stop CONTAINER_ID/CONTAINER_NAME`
    - Example :
        ```sh
        docker stop py-container
        ```
- **inspect a container:**
    - Syntax :  `docker inspect CONTAINER_ID/CONTAINER_NAME`
    - Example :
        ```sh
        docker inspect py-container
        ```
- **Remove a stopped container:**
    - Syntax :  `docker rm CONTAINER_ID/CONTAINER_NAME`
    - Example :
        ```sh
        docker rm hello-container
        ```
- **View logs of a container:**
    - Syntax :  `docker logs CONTAINER_ID/CONTAINER_NAME`
    - Example :
        ```sh
        docker logs hello-container
        ```

## Volumes

- **List all volumes:**
    ```sh
    docker volume ls
    ```
- **Create a volume:**
    - Syntax :  `docker volume create VOLUME_NAME`
    - Example :
        ```sh
        docker volume create my-volume
        ```
- **Remove a volume:**
    - Syntax :  `docker volume rm VOLUME_NAME`
    - Example :
        ```sh
        docker volume rm my-volume
        ```

## Networks

- **List all networks:**
    ```sh
    docker network ls
    ```
- **Create a network:**
    - Syntax :  `docker network create NETWORK_NAME`
    - Example :
        ```sh
        docker network create my-network
        ```
- **Remove a network:**
    - Syntax :  `docker network rm NETWORK_NAME`
    - Example :
        ```sh
        docker network rm my-network
        ```