# Simple Java Program using Docker

This project demonstrates how to build an image for a simple java program using `Dockerfile` and run it through docker container.

## Usage

1. First go to the location where `Dockerfile` is present. (Current directory in this project).
2. Build the image :
	```sh
	docker build -t my-image .
	```
3. Running through container :
	```sh
	docker run --name my-container my-image
	```
4. Output will be shown in console as `Hello World!`.


## Author

- Mayank Sahu (https://github.com/mayank19o7).