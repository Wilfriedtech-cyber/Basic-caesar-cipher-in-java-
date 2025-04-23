# 🔐 Java Caesar Cipher: Text Encryption & Decryption System

This is a simple Java-based project that demonstrates Caesar cipher encryption and decryption. It was created to showcase my understanding of basic Java programming concepts such as loops, conditional statements, user input handling, and method creation.

---

## 🧠 Why I Built This

I built this project to:

- Practice writing clean and modular Java code.
- Understand how classic encryption algorithms work.
- Demonstrate how input/output and string manipulation are handled in Java.
- Reinforce my knowledge of methods, control flow, and basic algorithm logic.

---

## 🔎 What is Caesar Cipher Encryption?

Before diving into Caesar cipher, let's quickly define **encryption**:

> **Encryption** is the process of converting plain, readable data (plaintext) into an unreadable format (ciphertext) to prevent unauthorized access. It ensures data confidentiality during transmission or storage.

There are many types of encryption techniques such as:
- RSA
- AES (Advanced Encryption Standard)
- **Caesar Cipher** (one of the oldest and simplest)

### Caesar Cipher in a Nutshell

The Caesar cipher is a substitution technique that shifts each letter in the plaintext by a fixed number of positions (called the **shift** or **key**) in the alphabet. 

For example, with a shift of `3`, the letter `A` becomes `D`, `B` becomes `E`, and so on. If it goes past `Z`, it wraps around to the beginning.

---

## 🛠️ How It Works (in Code)

In this project:

- The user chooses to **encrypt**, **decrypt**, or **exit** the program.
- For encryption, each letter is shifted forward by the entered shift value using ASCII math.
- For decryption, the shift is reversed (e.g., if the shift is 3, it uses `26 - 3` to decrypt).
- Uppercase and lowercase letters are handled separately.
- Non-alphabetic characters (spaces, numbers, punctuation) are preserved as-is.

  
## 🚧 Difficulties & Takeaways
### 🔍 Challenges
Understanding how to work with character data using ASCII values.

Writing a modular function that works for both encryption and decryption.

Handling input/output cleanly in a loop without causing scanner issues.

### ✅ What I Learned
How Caesar cipher logic is implemented programmatically.

How to use Scanner for user interaction.

The importance of modular methods (Encrypt() and Decrypt()).

How to make a simple terminal-based user interface.

## 🧾 License
This project is open-source and free to use for educational purposes.
 
