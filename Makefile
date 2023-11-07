# Config, just variables
J = javac


# Generate source and object lists, also just string variables
C_SRCS := ShuffleList/src/cpsc2150.listDec/IShuffleList.java ShuffleList/src/cpsc2150.listDec/ShuffleApp.java ShuffleList/src/cpsc2150.listDec/ShuffleList.java 

# default target
all: build
	@echo "All Done!"

run: build
	java ShuffleList/src/cpsc2150.listDec/ShuffleApp.java

clean:
	rm ShuffleList/src/cpsc2150.listDec/*.class
# Link all built objects
build:
	$(J) $(C_SRCS) 