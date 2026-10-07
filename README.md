# Reflection – AI Number Program Lab

##  Student Name:
Daniel Bishop 

##  GitHub Repository Link:
https://github.com/dbish21/cmsc115_unit8_lab2.git

## Iteration 1

What the AI code does:
- The AI wrote a method that adds up every number in the array and returns the total. My prompt never said what "result" meant, so it guessed.

Tests passed/failed:
- Only testSingleValue passed, and that was luck, since the sum of one number is just that number. testBasicArray failed (expected 9, got 26), testNegativeNumbers failed (expected -1, got -64), and testEmptyArray failed (expected Integer.MIN_VALUE, got 0).

What surprised you:
- The AI didn't ask what the method was supposed to do. It just picked something and the code looked fine. Once I read the tests, it was clear they wanted the largest number in the array, which the prompt never mentioned.

Commit message:
- Iteration 1: AI-generated implementation

---

## Iteration 2

What changed:
- The method now finds the largest number instead of adding everything up. It starts with the first value as the max, then loops through the rest and replaces max whenever it finds a bigger number.

What improved:
- testBasicArray, testNegativeNumbers, and testSingleValue all pass now. Starting with the first value instead of 0 is what made the negative numbers test work, since -1 is less than 0.

What still failed and why:
- testEmptyArray still fails. The code grabs values[0] right away, and an empty array has no index 0, so it crashes with an ArrayIndexOutOfBoundsException. The prompt never said what to do with an empty array, so the AI didn't handle it.

Commit message:
- Iteration 2: largest value implementation

---

## Iteration 3

Final behavior:
- findResult returns the largest number in the array. If the array is empty, it returns Integer.MIN_VALUE instead of crashing. All 4 tests pass.
 
What was fixed:
- I added a check at the top of the method. If the array has no values, it returns Integer.MIN_VALUE right away, before the code tries to read values[0]. That fixed the crash in testEmptyArray.

What you learned:
- AI is only as good as the prompt. The first prompt was vague, so it guessed wrong. The second one was clear but left out the empty array case. Once the prompt covered that edge case, the code passed everything. The tests were what showed me what was missing each time.

Commit message:
- Iteration 3: final version passing all tests

---

## Final Reflection

- How did AI responses change across prompts?
  - The first prompt only gave a method name, so the AI guessed and wrote a sum. The second prompt said exactly what to return, so it found the largest number, but it didn't think about empty arrays. The third prompt called out the empty array case, and that version passed everything. Each time the prompt got more specific, the code got closer to what the tests wanted.
  
- How did testing affect your changes?
  - The tests told me what the method was actually supposed to do. After the first run I could see they wanted the largest number, not the sum. After the second run, the only failure was the empty array, so I knew exactly what to fix next. Without the tests I would have accepted the first AI answer, since it looked fine.
  
- What did version control help you understand?
  - Having a commit for each iteration made it easy to see how the code changed from one version to the next. I also ran into Git problems during setup, where my commits weren't going through at all. Checking git status and git log showed me what Git actually had versus what I thought I had saved. Now I check that my commits are really on GitHub instead of assuming they are.