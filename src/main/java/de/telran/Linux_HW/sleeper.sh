#!/bin/bash
	for start in {0..10}
	do
	date +'%H:%M:%S'
	#sleep 5
	sleep 1
	done
ps -ef | tail +2 | wc -l
cat /proc/cpuinfo > file.txt
cat /etc/os-release | head -1 | sed 's/"/ /g' >> file.txt
cat /etc/os-release | head -1 | sed 's/"/ /g' | awk '{print$2}' >> file.txt
	for file in {50..100}
 	do
 	touch $file.txt
	done
