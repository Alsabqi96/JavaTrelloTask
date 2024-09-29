public int maxBlock(String str) {
    int len = str.length();
    int count = 0;
    int tmpcount = 1;

    // If the string is empty, return 0
    if (len == 0)
        return 0;

    // Iterate through the string
    for (int i = 0; i < len - 1; i++) {
        // Check if current character matches the next one
        if (str.charAt(i) == str.charAt(i + 1))
            tmpcount++;
        else
            tmpcount = 1;

        // Update the maximum count
        count = Math.max(count, tmpcount);
    }

    return count;
}










