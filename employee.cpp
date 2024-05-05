#include <iostream>
#include <string>
using namespace std;

// Base class Employee
class Employee {
public:
    string role;
    double baseSalary;
    int userExperience;

    Employee(string role, double baseSalary, int userExperience)
        : role(role), baseSalary(baseSalary), userExperience(userExperience) {}

    virtual double calculateSalary() {
        return baseSalary;
    }

    virtual double calculateTax() {
        // Simplified tax calculation for demonstration purposes
        return baseSalary * 0.1;  // Assuming a fixed tax rate of 10%
    }

    virtual ~Employee() {}  // Virtual destructor for proper cleanup
};

// Subclass for HOD, Dean, Principal
class One : public Employee {
public:
    One(string role, double baseSalary, int userExperience)
        : Employee(role, baseSalary, userExperience) {}

    double calculateSalary() override {
        return baseSalary + baseSalary *  userExperience*0.1; 
    }
};

// Subclass for Senior Faculty
class Two : public Employee {
public:
    Two(string role, double baseSalary, int userExperience)
        : Employee(role, baseSalary, userExperience) {}

    double calculateSalary() override {
        return baseSalary + baseSalary * userExperience*0.05; // 175% of the base salary
    }
};

// Subclass for Junior Faculty
class Three : public Employee {
public:
    Three(string role, double baseSalary, int userExperience)
        : Employee(role, baseSalary, userExperience) {}

    double calculateSalary() override {
        return baseSalary + baseSalary * userExperience*0.25; // 150% of the base salary
    }
};

// Subclass for Clerk, Lab Assistant
class Four : public Employee {
public:
    Four(string role, double baseSalary, int userExperience)
        : Employee(role, baseSalary, userExperience) {}

    double calculateSalary() override {
        return baseSalary+userExperience*0.001; // Only the base salary
    }
};

int main() {
    string role;
    double baseSalary;
    string Name;
    int userExperience;
    cout<<"Enter your name. :- ";
    getline(cin,Name);
    cout << "Enter One if you are HOD, Dean, Principal" << endl;
    cout << "Enter Two if you are Senior Faculty" << endl;
    cout << "Enter Three if you are Junior Faculty" << endl;
    cout << "Enter Four if you are Clerk, Lab Assistant" << endl;
    cout << "Enter the role :- " << endl;
    getline(cin, role);

    cout << "Enter the base salary :-  ";
    cin >> baseSalary;
    cout << "Enter the years of experience :- ";
    cin >> userExperience;

    Employee* employee = nullptr;

    if (role == "One" || role == "one" || role == "ONE") {
        employee = new One(role, baseSalary, userExperience);
            cout <<Name <<" is working as HOD/Dean/Principal with Salary of " << employee->calculateSalary()<<endl;
            cout<<Name<<" have to pay tax of   " << employee->calculateTax() << endl;

    } else if (role == "Two" || role == "TWO" || role == "two") {
        employee = new Two(role, baseSalary, userExperience);
      cout<< Name<<" is working as Senior Faculty with Salary of " << employee->calculateSalary()  <<endl;
      cout<<Name <<" have to pay tax of   " << employee->calculateTax() << endl;
    } else if (role == "Three" || role=="THREE" || role=="three") {
        employee = new Three(role, baseSalary, userExperience);
         cout<<Name <<" is working as Junior Faculty with Salary of " << employee->calculateSalary()<<endl;
         cout<< Name<<" have to pay tax of   " << employee->calculateTax() << endl;
    } else if (role == "Four" || role=="FOUR" || role=="four") {
        employee = new Four(role, baseSalary, userExperience);
         cout<<Name  <<" is working as Clerk/Lab Assistant with Salary of "<< employee->calculateSalary()<<endl;
         cout<<Name<< " have to pay tax of " << employee->calculateTax() << endl;
    } else {
        cout << "Invalid role provided." << endl;
        return 1;
    }


    delete employee;  // Clean up the dynamically allocated memory
    return 0;
}
