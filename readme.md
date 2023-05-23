# What is the basethor?

Simple cryptography  based in to Base64.


Knowing than every letter have a ID that create a reference on table ASCII and this ID is a number, i transform this letter in a number and the first number is a number that sum with the rest of others numbers that is a letter in table ASCII.
Like this the text "Victao 2024" transform in this:
 - <code>3.89.108.102.119.100.114.35.53.51.53.55</code>

To uncrypt, only walk in this text transforming in an array using the "split" in to ".", jump the first item and sub all others numbers with first item and transforming in a letter of the table ASCII.
- <code>Victao 2024</code>


## Class
    - crypthor

    Methods: {
        crypt,
        uncrypt,
    }
    
    Any methods receive and collect a string;

## Language
    - java

