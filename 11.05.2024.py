import random
print("Welcome to the game! To quit the game, please type 'STOP'.")

correct_guesses = 0
total_guesses = 0

while True:
    guess = input("Please guess the outcome of the coin toss. Type 0 for heads and 1 for tails. ")
    head_or_tails = random.randint(0, 1)
    print(head_or_tails)
    
    guess = guess.upper()
    
    if guess == "STOP":
        print("The game has been terminated!")
        break
      
    guess = int(guess)
    total_guesses = total_guesses + 1

    if guess == head_or_tails:    
        print("Congratulations! You guessed it right!")
        correct_guesses = correct_guesses + 1
    else:
        print("Try again")

print(f"You guessed {total_guesses} times in total, out of them {correct_guesses} were correct.")

