from unittest import TestCase

import book_system

import random


class test_book_system(TestCase):

    def test_that_test_book_system_generates_random_number(self):
    
        random_number = random.randint(1,100)
    
        book_system.generate_number(random_number)
        
    def test_that_test_book_system_suggest_book_at_random_everyday(self):
    
        random_number = random.randint(1,100)
        
        actual = book_system.generate_number (random_number)
    
        expected = "Book Title: The Wanted One \n Page ",random_number
        
        self.assertEqual(actual, expected)
        
    def test_that_test_book_system_suggest_book_to_users_if_users_enter_yes(self):
     
        new_random_number = random.randint(1,100)
        
        actual = book_system.generate_number (new_random_number)
    
        expected = "Book Title: The Wanted One \n Page ",new_random_number
        
        self.assertEqual(actual, expected)
        
    
