class Solution {
    public String removeDuplicateLetters(String s) {
        int[] lastIndex = new int[26]; // Last occurrence of each character
        boolean[] seen = new boolean[26]; // If character is in the result
        Stack<Character> stack = new Stack<>(); // Stores the final sequence

        // Step 1: Store the last occurrence of each character
        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }

        // Step 2: Iterate through the string
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // Skip if character is already in result
            if (seen[c - 'a']) continue;

            // Maintain lexicographical order by removing larger elements
            while (!stack.isEmpty() && stack.peek() > c && lastIndex[stack.peek() - 'a'] > i) {
                seen[stack.pop() - 'a'] = false;
            }

            // Add current character to stack
            stack.push(c);
            seen[c - 'a'] = true;
        }

        // Step 3: Convert stack to string
        StringBuilder sb = new StringBuilder();
        for (char c : stack) sb.append(c);
        return sb.toString();
    }
}
