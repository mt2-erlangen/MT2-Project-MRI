#!/bin/sh
find src/main/java -name "*.java" | sort | zip -X submission.zip -@
