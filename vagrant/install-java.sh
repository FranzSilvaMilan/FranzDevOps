#!/bin/bash

add-apt-repository ppa:openjdk-r/ppa -y
apt-get update
apt-get -y install apache2 openjdk-8-jdk
update-alternatives --config java