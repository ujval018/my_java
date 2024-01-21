#include <iostream>
using namespace std;

class quad{
public:
int side=4;
void print(){
    cout<<"sides are "<<side;
}

};
class square:public quad{
    public:
    int sides;
    square(){
        sides=1;
    }
    square(int side){
        sides=side;
    }
    void printS(){
        cout<<"sides are "<<side<<endl;
        cout<<"all sides same"<<endl;
    }
    int area(){
        int area=sides*sides;
        return area;

    }


};
class cube:public square{

};







int main(){
    square q1;
    q1.printS();

    q1.area();
int n=19;

}