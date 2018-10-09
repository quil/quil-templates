#!/bin/bash

PROJECT=testproject

cd clj

echo
echo "Installing Clojure template."
echo "----------------------------"
lein install

echo
echo "Creating project using Clojure template."
echo "----------------------------------------"
lein new quil $PROJECT
cd $PROJECT

echo
echo "Running Clojure project."
echo "------------------------"
lein run -m ${PROJECT}.core

echo
echo "Clojure project source."
echo "-----------------------"
less src/$PROJECT/core.clj

cd ../../
rm -rf clj/$PROJECT

cd cljs

echo
echo "Installing ClojureScript template."
echo "----------------------------------"
lein install

echo
echo "Creating project using ClojureScript template."
echo "----------------------------------------------"
lein new quil-cljs $PROJECT
cd $PROJECT

echo
echo "Building ClojureScript project."
echo "-------------------------------"
google-chrome http://localhost:3449/ &
lein figwheel

echo
echo "ClojureScript source."
echo "---------------------"
less src/$PROJECT/core.cljs

cd ../../
rm -rf cljs/$PROJECT


echo
echo "Done"
echo "----"
