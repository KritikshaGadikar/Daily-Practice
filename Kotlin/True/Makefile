.PHONY: all
all: build run

.PHONY: build
build:
	kotlinc True.kt -include-runtime -d True.jar

.PHONY: run
run:
	java -jar True.jar

.PHONY: clean
clean:
	$(RM) True.jar
