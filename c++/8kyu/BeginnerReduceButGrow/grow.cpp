#include <vector>
int grow(std::vector<int> nums) {
  int r = 1;
  for (int i = 0; i < nums.size(); i++) r *= nums[i];
  return r;
}
