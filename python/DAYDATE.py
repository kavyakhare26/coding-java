from datetime import date
from datetime import time
from datetime import datetime
def main():
    today=date.today()
    print("today's date:", today)
    print("date components:",today.day,today.month,today.year)
    print("todays weekday is",today.weekday())
    today = datetime.now()
    print("the current date and time",today)
    t = datetime.time(datetime.now())
    print(t) 

main()    