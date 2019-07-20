all: build run

build:
	sbt docker:publishLocal

run:
	docker-compose up

stop:
	docker-compose down

clean: stop
	docker rmi pics/playmongo
	docker rmi pics/playmongo:1.0-SNAPSHOT
