class Solution {
    public int[] shuffle(int[] nums, int n) {
    int indexForY = n;      // y
    int ressult = 0;    // result (y positions)
    int indexForX = 0;        // x
    int [] b = new int [2*n];

    for(int i = 0; i < n; i++){
        b[ressult] =nums[indexForX];
        b[ressult+1] = nums[indexForY];
        indexForX++;
        indexForY++;
        ressult+=2;

    }
    return b;
    }
}