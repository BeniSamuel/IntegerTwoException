# 📐 IntegerTwoException

The **IntegerTwoException** is a custom exception designed to prevent division errors when the second integer is larger than the first. This exception ensures that you receive a full decimal result instead of a potentially misleading rounded value. Avoiding such pitfalls is essential for accurate calculations!

---

## How It Works

1. **Input the First Value**: Start by entering the first integer.
2. **Input the Second Value**: Next, input the second integer.
3. **Check the Values**: The system checks if the second integer is greater than the first.
4. **Trigger Exception**: If the second integer is larger, an exception is thrown with a relevant message.
5. **Display Result**: If no exception occurs, the operation proceeds, and the result is displayed.

---

## Example Usage

Here's a quick example of how **IntegerTwoException** can be utilized in your code:

```java
try {
    int result = divide(firstValue, secondValue);
    System.out.println("Result: " + result);
} catch (IntegerTwoException e) {
    System.err.println(e.getMessage());
}
```

--


> ## Benefits

1. Prevents Incorrect Results: Ensures calculations yield accurate decimal values.
2. User-Friendly Feedback: Provides clear error messages to guide users.
3. Improves Code Quality: Encourages robust error handling practices.

--

## Contribution
We welcome contributions! If you have suggestions, improvements, or additional features, feel free to submit a pull request or create an issue.

> # Made with ❤️ by Beni Samuel
