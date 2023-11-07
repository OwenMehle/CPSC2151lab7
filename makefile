# Config, just variables
J = javac


# Generate source and object lists, also just string variables
C_SRCS := src/cpsc2150/listDec/IShuffleList.java src/cpsc2150/listDec/ShuffleApp.java src/cpsc2150/listDec/ShuffleList.java 

# default target
all: build
	@echo "All Done!"

run: build
	java src/cpsc2150/listDec/ShuffleApp.java

clean:
	rm src/cpsc2150/listDec/*.class
# Link all built objects
build:
	$(J) $(C_SRCS) 