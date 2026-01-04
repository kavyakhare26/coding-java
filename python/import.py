import os
from os import path
import datetime
from datetime import date, time, timedelta;
import time
def main():
    
    t = time.ctime(path.getmtime("textfile.txt"))
    print(t)
    print(datetime.datetime.fromtimestamp(path.getmtime("textfile.txt")))
    td = datetime.datetime.now() - datetime.datetime.fromtimestamp(path.getmtime("textfile.txt"))
    print("it has been",td,"since the file was modified")
    print("or,",td.total_seconds(),"seconds")
main()    