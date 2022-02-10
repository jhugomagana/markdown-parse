MarkdownParse.class: MarkdownParse.java
	javac MarkdownParse.java

MarkdownParseTest.class: MarkdownParseTest.java
	javac MarkdownParse.java

test: MarkdownParseTest.class MarkdownParse.class
	javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar MarkdownParseTest.java
	java -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore MarkdownParseTest