#!/usr/bin/env python3
# -*- coding: utf-8 -*-

CHARS = ['a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',
	'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z',
	'0','1','2','3','4','5','6','7','8','9',
	'!','*','#','@','$','&','%']

MAX_LENGTH = 3

def main():
	for i in range(MAX_LENGTH):
		print_combinations(i + 1)

def print_combinations(length):
	char_indexes = [0] * length
	
	print_current_combination(char_indexes)

	while (increment_char_indexes(char_indexes)):
		print_current_combination(char_indexes)

def print_current_combination(char_indexes):
	combo=''

	for i in char_indexes:
		combo+=CHARS[i]

	print(combo)

def increment_char_indexes(char_indexes):

	char_i_to_incr=len(char_indexes) - 1
	char_indexes[char_i_to_incr] += 1

	while (char_indexes[char_i_to_incr] == len(CHARS)):
		char_indexes[char_i_to_incr] = 0
		char_i_to_incr -= 1

		if (char_i_to_incr < 0):
			return False

		char_indexes[char_i_to_incr] += 1

	return True
    
if __name__ == "__main__":
	main()