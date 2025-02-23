#include <string>

std::string fakeBin(std::string str){
  for (char &c: str) c = (c >= '5') ? '1' : '0';
  return str;
}
