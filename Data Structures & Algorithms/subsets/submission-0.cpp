class Solution {
public:
    vector<vector<int>> subsets(vector<int>& nums) {
        vector<vector<int>> result;
        backtrack(nums, 0, {}, result);
        return result;
    }

    void backtrack(
        vector<int>& nums,
        int idx,
        vector<int> output,
        vector<vector<int>>& result
    ) {
        if (idx == nums.size()) {
            result.push_back(output);
            return;
        }

        vector<int> newOutput = output;
        newOutput.push_back(nums[idx]);
        backtrack(nums, idx + 1, newOutput, result);

        backtrack(nums, idx + 1, output, result);
    }
};
