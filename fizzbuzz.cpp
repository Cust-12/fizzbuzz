#include <iostream>

int main(){ 
  for(int i = 1; i <101; i++){ //run a loop from 1 to 100
    if(i % 3 == 0 && i % 5 == 0){ //if i is divisible by 3 or 5
      std::cout << "fizzbuzz\n";  //output fizzbuzz
    }
    else if(i % 3 == 0){  //if i is dvisible by 3
      std::cout << "fizz\n";  //output fizz
    }
    else if(i % 5 == 0){  //if i is divisible by 5
      std::cout << "buzz\n";  //output buzz
    }
    else{
      std::cout << i << "\n"; //else output number and an extra line
    }
  }
  return 0 ;
}