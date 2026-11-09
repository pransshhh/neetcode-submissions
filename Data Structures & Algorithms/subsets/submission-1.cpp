class Solution {
public:
    vector<vector<int>> subsets(vector<int>& nums) {
        vector<vector<int>> result;
        vector<int> output;
        backtrack(nums, 0, output, result);
        return result;
    }

    void backtrack(
        vector<int>& nums,
        int idx,
        vector<int>& output,
        vector<vector<int>>& result
    ) {
        if (idx == nums.size()) {
            result.push_back(output);
            return;
        }

        output.push_back(nums[idx]);
        backtrack(nums, idx + 1, output, result);
        output.pop_back();

        backtrack(nums, idx + 1, output, result);
    }
};
