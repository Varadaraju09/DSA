#include<iostream>
using namespace std;

class SNPSU {
    public:
    int data;
    string str;
    SNPSU() {
        cout << "Object created" << endl;
    }
    ~SNPSU() {
        cout << "Object created" << endl;
    }
};

int main() {
    int x;
    cin >> x;
    SNPSU Obj;
    SNPSU O2 = SNPSU();
    return 0;

}