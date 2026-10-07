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
-

What was fixed:
-

What you learned:
-

Commit message:
-

---

## Final Reflection

- How did AI responses change across prompts?
- How did testing affect your changes?
- What did version control help you understand?