import random

all_books = []

def generate_number (random_number, new_random_number, another_random_number):

    all_books.insert(random_number, "Book Title: The Wanted One \n Page {random_number}")
    
    suggested = f"Book Title: The Wanted One \n Page {random_number}"
    
    
    
    user_input = (input("Would you like another suggestion? (yes/no): ")).lower()
    
    if user_input == "yes":
    
        new_random_number = random.randint(1,100)
        
        all_books.insert(new_random_number, "Book Title: The Wanted One \n Page {new_random_number}")
        
        new_suggested = f"Book Title: The Wanted One \n Page {new_random_number}"
        
        return new_suggested
        
        user_input = (input("Would you like another suggestion? (yes/no): ")).lower()
        
        while user_input == "yes":
        
            another_random_number = random.randint(1,100)
            
            all_books.insert(another_random_number, "Book Title: The Wanted One \n Page {another_random_number}")
        
            another_suggested = f"Book Title: The Wanted One \n Page {another_random_number}"
        
            user_input = (input("Would you like another suggestion? (yes/no): ")).lower()
            
            return another_suggested      
    
    elif user_input == "no":
        
        return suggested
        
    else: raise ValueError("Invalid input")   
    
    return suggested
    
def add_books ():
    
    added_book = (input("Enter book title you want to add: "))    
    
    all_books.append(added_book)
    
    return added_book
    
    
def remove_books ():

    removed = (input("Enter book title and the page of the book you want to remove: ")) 
    
    all_books.pop(removed)
    
    return removed
    
def update_books ():

    page = (input("Enter book page: "))
    
    updated_book = (input("Enter book title you want to update: "))
        
    all_books.insert(page, updated_book)
    
    return page, updated_book
    
    
def display_books ():

    return all_books
   
