#!/bin/bash
echo USAGE: mvn_create groupId artifactId package
mvn -B archetype:generate -DarchetypeGroupId=com.shavinod -DarchetypeArtifactId=maven-scala-java-archetype -DarchetypeVersion=0.0.2 -DgroupId=$1 -DartifactId=$2 -Dpackage=$3


