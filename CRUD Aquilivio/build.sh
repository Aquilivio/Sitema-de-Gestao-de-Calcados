#!/bin/bash
echo "Compilando o projecto..." 
rm -rf bin/*
mkdir -p bin/*
javac -d bin src/*.java
echo "Compilacao concluida!"