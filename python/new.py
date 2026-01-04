  #with open("test.txt","w") as testtxt:
   # testtxt.write("this is a test text file\n"+
                # " i created this file for this  programming demo\n"+
                # "kavya khare created this file")
def main():
    myfile = open("testfile.txt","w+")
    for i in range(10):
        myfile.write("this is some text\n")
    myfile.close()
main()    