// if , elseif , else


#include <iostream>

using namespace std;

int main(){

    // Program for age group

    short int age;

    cout << "Enter your age : ";
    cin >> age;
    cout << "\n";

    if (age <= 10){
        cout << "You are a Child " << age << "\n";
    }
    else if (age > 10 && age <18){
        cout << "You are a Teenager " << age <<endl;
    }
    else{
        cout << "You are an Adult " << age;
    }

}