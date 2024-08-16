.PHONY: all
all: build run

.PHONY: build
build:
	kotlinc False.kt -include-runtime -d False.jar

.PHONY: run
run:
	java -jar False.jar

.PHONY: clean
clean:
	$(RM) False.jar
