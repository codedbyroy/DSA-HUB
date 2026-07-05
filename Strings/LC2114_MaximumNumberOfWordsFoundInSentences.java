class LC2114_MaximumNumberOfWordsFoundInSentences {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (int i = 0; i < sentences.length; i++) {
            String ss = sentences[i];
            int wc = 1;
            for (int j = 0; j < ss.length(); j++) {
                if (ss.charAt(j) == ' ')
                    wc++;
            }
            if (max < wc) {
                max = wc;
            }
        }
        return max;
    }
}

/*
======================== APPROACH ========================

1. Traverse each sentence.
2. Start word count as 1.
3. Count spaces in the sentence.
4. Every space indicates a new word.
5. Track the maximum word count.
6. Return the maximum.

================== COMPLEXITY ANALYSIS ==================

Time Complexity  : O(n * m)
Space Complexity : O(1)

n = number of sentences
m = average sentence length

==================== INTERVIEW NOTES ====================

1. First String Traversal problem.
2. Uses charAt() to access characters.
3. Uses length() for Strings.
4. Words = Spaces + 1.

==================== EDGE CASES ====================

1. Single sentence
2. Single word sentence
3. Multiple sentences
4. Long sentences

*/
