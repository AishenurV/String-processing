# String-processing

# StringProcessor

The `StringProcessor` class provides methods for string processing, including checking password strength, counting digits and words, and evaluating mathematical expressions.

## Table of Contents

- [Features](#features)
- [Usage](#usage)
- [Testing](#testing)
- [Requirements](#requirements)
- [Contributing](#contributing)
- [License](#license)

## Features

### `isStrongPassword(String password): boolean`

Checks if the provided password is strong, satisfying the following criteria:
- At least one uppercase letter.
- At least one lowercase letter.
- At least one digit.
- At least one special symbol.

Returns `true` if the password is strong; otherwise, returns `false`.

### `calculateDigits(String sentence): int`

Counts the number of digits in the given sentence and returns the count.

### `calculateWords(String sentence): int`

Calculates the number of words in the given sentence, considering words as separated by spaces. Returns the count of words.

### `calculateExpression(String expression): double`

Given a string containing a well-formed mathematical expression with numbers, arithmetic operations, and brackets, calculates and returns the result of the expression.

## Usage

1. **Clone the repository:**
   ```bash
   git clone <repository-url>
