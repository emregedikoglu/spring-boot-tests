FROM alpine:3.1
MAINTAINER Emre Gedikoglu <egedikoglu1@gmail.com>
ADD test /src/main
ENTRYPOINT ["test"]