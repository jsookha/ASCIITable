# ASCII Table Program

---

## Overview

This is a small educational Java program that demonstrates the relationship between characters and their numeric (ASCII / Unicode) values. It shows the conversion in both directions:

- **int to char** - take a decimal number and cast it to the character it represents.
- **char to int** - take a character from a String and cast it back to its numeric code.

The program is intentionally simple and is aimed at beginners learning about primitive types, casting, loops, and String traversal in Java.

---

## File

```
ConASCIITable.java
```

Package: `conasciitable`

---

## Background: What is ASCII?

Every character a computer displays is stored internally as a number. This mapping between numbers and characters is called a **character encoding**. ASCII (American Standard Code for Information Interchange) is one of the oldest and simplest of these encodings.

Some useful reference points:

| Decimal | Character | Notes                          |
|---------|-----------|--------------------------------|
| 32      | (space)   | First printable character      |
| 48 - 57 | 0 to 9    | Digits                         |
| 65 - 90 | A to Z    | Capital letters                |
| 97 - 122| a to z    | Lowercase letters              |
| 123-126 | { \| } ~  | Braces and tilde               |

The program only prints a subset of the printable ASCII range, grouped into logical sections.

---

## Program Structure

The program is organised into two parts:

```
ConASCIITable
│
├── displayAsciiRange(int, int)     Helper method - prints one range
│
└── main(String[])                  Entry point - organises the sections
```

### 1. `displayAsciiRange(int intStart, int intEnd)`

A small helper method that prints every decimal number in the given range together with the character it represents.

Logic:

1. Loop from `intStart` to `intEnd`.
2. Cast the loop counter to a `char` using `(char)`.
3. Print the number and the character side by side.

Two variables are kept deliberately separate:

- `intDecimalNumber` - the number (also the loop counter).
- `chrThisCharacter` - the character form of that number.

Keeping them separate makes the intent of each line clearer.

### 2. `main(String[] args)`

The entry point calls `displayAsciiRange` several times, each time with a different range, and prints a sub-heading before each call so the output is easy to read.

Sections printed:

```
1. CAPITAL LETTERS ONLY           (65 - 90)
2. NUMBERS ONLY                   (48 - 57)
3. VARIOUS SPECIAL CHARACTERS
      - Punctuation               (32 - 47)
      - Symbols                   (58 - 64)
      - Brackets & related        (91 - 96)
      - Braces & tilde            (123 - 126)
4. PRINTING CHARACTER NUMBERS FROM A STRING
      - Uses "SAMPLETEXT" as input
      - Demonstrates char -> int casting
```

---

## How to Compile and Run

From a terminal, in the directory containing the source file:

```
javac conasciitable/ConASCIITable.java
java  conasciitable.ConASCIITable
```

Or, if you are using an IDE (NetBeans, IntelliJ, Eclipse), simply open the project and run the `main` method.

---

## Sample Output (excerpt)

```
CAPITAL LETTERS ONLY
================================
65 = A
66 = B
...
90 = Z

NUMBERS ONLY
================================
48 = 0
49 = 1
...
57 = 9

VARIOUS SPECIAL CHARACTERS
================================

-- Punctuation (32 - 47) --
32 =  
33 = !
...
47 = /

...

PRINTING CHARACTER NUMBERS FROM A STRING
================================
S = 83
A = 65
M = 77
P = 80
L = 76
E = 69
T = 84
E = 69
X = 88
T = 84
```

---

## Design Notes

- **Casting** is the key teaching point. `(char)number` converts a number to its character; `(int)character` converts a character back to its number.
- **Naming** uses a light Hungarian notation (`intDecimalNumber`, `chrThisCharacter`, `strText`) to make the type of each variable visible at a glance. This is a stylistic choice, not a Java requirement.
- **Helper method** (`displayAsciiRange`) removes the repetition that would otherwise appear across the four special-character ranges.
- **Sub-headings** in the output help the reader see where one group ends and the next begins.
- **Output only uses** `System.out.println()`, no `printf` or `String.format`, so the lines stay easy to read for beginners.

---

## Possible Extensions

If you want to keep exploring, some natural next steps are:

1. Print the full range 0 - 127 and observe which characters are unprintable.
2. Add a section for lowercase letters (97 - 122).
3. Let the user enter their own String and print the character code for each letter.
4. Replace the hard-coded String `"SAMPLETEXT"` with a `Scanner` input.
5. Compare ASCII with Unicode by printing a few non-English characters and their code points.

---

## File History

| Date          | Change                                                                         |
|------------------------|-----------------------------------------------------------------------|
| 22 Apr 2023            | Original version written as a beginner exercise.                      |
| 21 Sep 2026 (refactor) | Helper method added, comments expanded, sub-headings added to output. |

---

## Author

J. Sookha

---
