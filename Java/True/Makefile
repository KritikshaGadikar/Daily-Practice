.PHONY: all
all: build test

.PHONY: build
build:
	javac -d bin src/*.java

.PHONY: test
test:
	java -cp bin org.junit.runner.JUnitCore [True.java]

.PHONY: clean
clean:
	$(RM) -r bin/*
