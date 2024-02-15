#!/bin/bash

cd "$HOME/.m2/repository/org/clojure/clojure"
LATEST_SNAPSHOT=$(find . -type d -name "*-SNAPSHOT" -exec basename {} \; | sort -V | tail -n 1)
echo "Latest snapshot version found: $LATEST_SNAPSHOT"
echo "LATEST_SNAPSHOT=$LATEST_SNAPSHOT" >> $GITHUB_ENV
