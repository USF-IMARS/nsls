#!/bin/bash
java \
-classpath ./lib/nsls.jar \
gov.nasa.gsfc.nisgs.nsls.server.Server \
$1 $2 $3 $4 $5 $6 $7 $8 $9
