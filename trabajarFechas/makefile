compilar:limpiar
	mkdir bin
	find src -name *.java | xargs javac -cp bin -d bin
jar:compilar
	jar cvfm ap-personas.jar Manifest.txt -C bin .
ejecutar:compilar
	java -cp bin aplicacion.Principal
limpiar:
	rm -rf bin
javadoc:compilar
	find . -type f -name "*.java" | xargs javadoc -d html -encoding utf-8 -docencoding utf-8 -charset utf-8
