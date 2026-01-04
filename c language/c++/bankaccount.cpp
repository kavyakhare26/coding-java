#include <iostream>
using namespace std;
#include <string>
class BankAccount{
    private:
    long accountNumber;
    string customerName;
    double balance;

public:
   BankAccount(long accNum,string name,double initialBalance){
    accountNumber =accNum;
    customerName =name;
    balance =initialBalance;
   }
   void displayAccountInfo(){
    cout<<"\nAccount number:"<<accountNumber<<endl;
    cout<<"customeName:"<<customerName<<endl;
    cout<<"balance:"<<balance<<endl;
    
   }
   void deposit(double amount){
      if(amount>0){
        balance+=amount;
        cout<<"deposit ammount succesfully"<<balance<<endl;
      }
      else{
        cout<<"balance must be positive"<<endl;
      }
   }
   void withdrawl(double amount){
     if(amount>0){
        if(balance>=amount){
            balance-=amount;
            cout<<"withdrawl ammount"<<balance<<endl;
        }else{
            cout<<"insufficient balance"<<endl;

        }
    
     }
     else{
        cout<<"withdrawl amount must be positive"<<endl;
     }
    }
    
    long getAccountNumber(){
        return accountNumber;
    }
    
};
//int main(){
    ///BankAccount account(1001,"kavya",1500.00);
    //account.displayAccountInfo();
    //account.deposit(500.00);
    //account.withdrawl(200.00);
    //account.getAccountNumber();
    //return 0;
//}
int main() {
    // Create a BankAccount object
    BankAccount myAccount(1001,"Alice Smith", 10000.0);

    int choice;
    double amount;

    do {
        std::cout << "\n--- Bank Menu ---" << std::endl;
        std::cout << "1. Display Account Details" << std::endl;
        std::cout << "2. Deposit" << std::endl;
        std::cout << "3. Withdrawl" << std::endl;
        std::cout << "4. Exit" << std::endl;
        std::cout << "Enter your choice: ";
        std::cin >> choice;

        switch (choice) {
            case 1:
                myAccount.displayAccountInfo();
                break;
            case 2:
                std::cout << "Enter amount to deposit: $";
                std::cin >> amount;
                myAccount.deposit(amount);
                break;
            case 3:
                std::cout << "Enter amount to withdraw: $";
                std::cin >> amount;
                myAccount.withdrawl(amount);
                break;
            case 4:
                std::cout << "Exiting program. Thank you!" << std::endl;
                cout<<myAccount.getAccountNumber();
                break;
            default:
                std::cout << "Invalid choice. Please try again." << std::endl;
                break;
        }
    } while (choice != 4);

    return 0;
}