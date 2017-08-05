#!/usr/bin/python

import subprocess

p = subprocess.Popen(["java", "-jar", "/home/ubuntu/NetBeansProjects/python2java/dist/python2java.jar"], stdin=subprocess.PIPE, stdout=subprocess.PIPE)

while True:
	for x in range(0,1000):
		p.stdin.write("linea {}\r\n".format(x))
		line = p.stdout.readline()
		print line

	p.stdin.write("x\r\n") # finalizar
	break


