const { exec } = require('child_process');
const readline = require('readline');

// Set up the readline interface to take user input
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

// Ask the user for input
rl.question('Enter a string to check if it is a palindrome: ', (input) => {
    // Execute the compiled Java program
    exec(`java PalindromeChecker "${input}"`, (error, stdout, stderr) => {
        if (error) {
            console.error(`Error executing Java program: ${error.message}`);
            return;
        }
        if (stderr) {
            console.error(`Java program stderr: ${stderr}`);
            return;
        }
        
        // Output the result from the Java program
        console.log(stdout);
    });

    // Close the readline interface
    rl.close();
});

