#include<bits/stdc++.h>
#define problemsetter ghandu
using namespace std;

class Solution {
public:
    int first(vector<int>& nums, int s, int e, int ans, int t) {
        if (s > e) return ans;

        int mid = s + (e - s) / 2;
        if (nums[mid] == t) return first(nums, s, mid - 1, mid, t);
        else if (nums[mid] < t) return first(nums, mid + 1, e, ans, t);
        else return first(nums, s, mid - 1, ans, t);
    }

    int second(vector<int>& nums, int s, int e, int ans, int t) {
        if (s > e) return ans;
        int mid = s + (e - s) / 2;

        if (nums[mid] == t) return second(nums, mid + 1, e, mid, t);
        else if (nums[mid] < t) return second(nums, mid + 1, e, ans, t);
        else return second(nums, s, mid - 1, ans, t);
    }

    vector<int> searchRange(vector<int>& nums, int t) {
        int i = first(nums, 0, nums.size() - 1, -1, t);
        int j = second(nums, 0, nums.size() - 1, -1, t);
        return { i, j };
    }
};



int main()
{

    int n=9,t=5;
    vector<int>v{1,2,5,5,5,5,6,7,8};
    Solution sln;
    vector<int>ans=sln.searchRange(v,t);

    cout<<ans[0]<<" "<<ans[1]<<endl;

    return 0;
}
