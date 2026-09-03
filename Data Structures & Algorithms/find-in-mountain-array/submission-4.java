class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();
        int l = 0, r = n - 1;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) l = mid + 1;
            else r = mid;
        }
        int piv = l;
        int n1 = bs(mountainArr, 0, piv, target, true);
        if (n1 != -1) return n1;
        int n2 = bs(mountainArr, piv + 1, n - 1, target, false);
        return n2;
    }

    public int bs(MountainArray arr, int st, int end, int target, boolean ascending) {
        while (st <= end) {
            int mid = st + (end - st) / 2;
            int val = arr.get(mid);
            if (val == target) return mid;
            if (ascending) {
                if (val < target) st = mid + 1;
                else end = mid - 1;
            } else {
                if (val > target) st = mid + 1;
                else end = mid - 1;
            }
        }
        return -1;
    }
}