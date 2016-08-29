#!/bin/bash -v
echo [Step 1] Makesure install JDK 1.7.0+ and print the JAVA_HOME [If there is an input ENTER]:
read javaHome
if [ -z ${javaHome} ]; then 
	if [ -z ${JAVA_HOME} ]; then
		echo "ERROR:no data for JAVA_HOME"
		exit 1;
	else
		javaHome=$JAVA_HOME
	fi
	
fi 
echo [Step 2] Makesure install Maven 3.0.3+ and print the M2_HOME [If there is an input ENTER]:
read m2Home
if [ -z ${m2Home} ]; then
        if [ -z ${M2_HOME} ]; then
                echo "ERROR:no data for M2_HOME"
		exit 2;
        else
                m2Home=$M2_HOME
        fi

fi

echo [Step 3] Install archetype to local maven repository.
$m2Home/bin/mvn clean install

echo [Step 4] Please print rint directory for object:
read objectHome
if [ -z ${objectHome} ]; then
	echo "ERROR:please directory for object. "
	exit 3;
fi

echo [Step 5] Begin to create project.
cd $objectHome
mvn archetype:generate -DarchetypeCatalog=local

echo [Step 6] Create object is success!!
