# conceptsProgramming
Public repository containing basic exercises in programming concepts.

# ParOrImpar Java Program

## Description

This Java program takes an integer input from the user and determines whether the number is **even** or **odd**. The program outputs:
- `"even"` if the number is divisible by 2 (even).
- `"odd"` if the number is not divisible by 2 (odd).

The program is designed to work without using any explicit conditional statements like `if`, `else`, or `switch`.

## Features
- Takes an integer input from the user.
- Determines if the number is **even** or **odd** using mathematical operations.
- Outputs `"even"` or `"odd"` based on the result.
- No conditional statements (`if`, `else`) are used in the logic for determining even or odd.

## How the Program Works

### Step-by-Step Logic:
1. **Input**: The program first asks the user to input an integer.
2. **Modulo Operation**: It checks if the number is divisible by 2 using the modulo operator (`%`).
3. **Boolean Conversion**: It converts the result into a string (`"true"` or `"false"`) using the `Boolean.toString()` method.
4. **String Comparison**: The program checks if the string representation of the result is `"true"`, indicating that the number is even.
5. **Output**: The program then prints `"even"` if the number is even, or `"odd"` if the number is odd.

### No Conditionals:
The program avoids using any explicit conditional statements (`if`, `else`, `switch`). Instead, it uses a combination of modulo operation, string conversion, and comparison to determine if the number is even or odd.

## How to Run the Program

1. **Requirements**:
   - Java (JDK 8 or higher) must be installed on your machine.

2. **Steps to Run**:
   1. Clone or download the `ParImpar` program to your local machine.
   2. Open a terminal/command prompt and navigate to the folder where the program is saved.
   3. Compile the program using the following command:
      ```bash
      javac ParImpar.java
      ```
   4. Run the compiled Java program with the following command:
      ```bash
      java ParImpar
      ```
   5. The program will prompt you to enter an integer. After entering the number, it will display whether the number is `even` or `odd`.

## Example

### Input:
Enter an integer: 126

### Output:
even
