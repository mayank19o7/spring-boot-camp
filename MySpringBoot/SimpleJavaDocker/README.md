To run , First goto the location where Dockerfile is present.

1) `docker build -t simplejavaimage` .
2) Running through container - `docker run --name simplejava -it -d simplejavaimage`
3) Running through image - `docker run -it simplejavaimage`