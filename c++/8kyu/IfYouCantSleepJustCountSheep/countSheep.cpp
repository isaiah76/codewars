#include <string>

std::string countSheep(int number) {
  std::string result;
  for (int i = 1; i <= number; i++) result.append(std::to_string(i) + " sheep...");
  return result;
}
