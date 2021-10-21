from sys import argv
import os
import threading

emetm = argv
name = str(emetm[0])
print(name)

def printit ():
    threading.Timer(2.0,printit).start()
    for i in range(0,10):
        directorio = "hack"+str(i)

        os.mkdir(directorio)
        os.system("copia"+' '+name+' '+directorio)
printit()

input()