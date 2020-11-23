limpiar:
	rm -rf bin
compilar:limpiar
	find src -name "*.java" | xargs javac -cp bin -d bin
jar:compilar
	jar cvfm libreta.jar manifest.txt -C bin .
javadoc:
	rm -rf html
	mkdir html
	find . -type f -name "*.java" | xargs javadoc -d html -encoding utf-8 -docencoding utf-8 -charset utf-8
