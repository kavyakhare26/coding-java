import csv
def readersample():
    with open("stockquotes.csv")as csvfile:
        reader= reader.csv(csvfile)
        for row in reader:
            print(row)
readersample()