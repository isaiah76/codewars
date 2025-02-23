#include <string>

std::string switch_it_up(int number){
  const std::string nums[] = {"Zero", "One", "Two", "Three",
                            "Four", "Five", "Six", "Seven",
                            "Eight", "Nine"};
  return nums[number];
}
