
import csv
def writesample():
    with open ("Sampledata.csv" , mode="w")as csvfile:
               csvwriter = csv.writer(csvfile)
               csvwriter.writerow(['name',"deparment"])
               csvwriter.writerow(['john',"engineering"])
writesample()