#include <iostream>
using namespace std;

int main(){

    // variables : Declaration and Initialization of variables
    
    int a; // initialization of variable a of integer datatype

    int b(10); // initialization and declaration of variable b with 10 (integer)

    int c{100}, d{26};

    int e,f;

    cout << e << " " << f;

    cout << c << " " << d << " " << b << " "<< a;

   // Type deduction : auto (compiler automatcally specifies the datatype)

   auto var (13.56);
   cout << " " << var << endl;

   // endl keyword (ends the current line)

   cout << "Hello world is in" << endl;
   cout << "    New Line" << endl;




    // primitive datatype :

    /*
        Integer
        float
        Character
        Boolean


        // INCLUDES TYPE MODIFIERS :

        signed
        unsigned
        long 
        short
    */

   //integer
   int IntVar = 56;
    cout << "Integer variable = " << IntVar << " and size of variable is : "
        << sizeof(IntVar) << endl;

    // float
    float FloatVar {234.567};
    cout << "Float variable = " << FloatVar << " and size of variable is : "
        << sizeof(FloatVar) << endl;

    // char
    char CharVar ('T');
    cout << "Char variable = " << CharVar << " and size of variable is : "
        << sizeof(CharVar) << endl;
    

    // concepts of Type modifiers

    return 0;


}
