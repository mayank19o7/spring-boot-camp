To run , First goto the location where Dockerfile is present.

1) `docker build -t springrest .`
2) Running through container - `docker run -p 8080:8080 springrest`

The first argument is the local port, followed by a colon, and then the container port.
So the argument -p 8080:8080 maps local port 8080 to the container port 8080