# Python Activity
#
# Fill in the code for the functions below.
# The starter code for each function includes a 'return'
# which is just a placeholder for your code. Make sure to add what is going to be returned.

# Part A (count_threes) now needs to return the multiple of three that 
# occurs the most in a string. For example, 0939639 would return 9 
# since it appeared 3 times while the other multiple of three appeared less 
# than that. You only need to worry about single digit multiples of 3
#  (3, 6, 9). You must use a dictionary to accomplish this.

def count_threes(n):
  # YOUR CODE HERE
  number = {"3":3, "6":6,"9":9}
  three = 0
  six = 0
  nine = 0
  a = str(n)
  
  for i in a:
      if int(i) / number["3"] == 1:
         three += 1
      if int(i) / number["6"] == 1:
         six += 1
      if int(i) / number["9"] == 1:
         nine += 1
         
  if three > six and three > nine:
     return 3
  elif six > three and six > nine:
     return 6
  else:
     return 9
  
  


#Part B (longest_consecutive_repeating_char) now needs to account
#  for the edge case where two characters have the same consecutive 
# repeat length. The return value should now be a list containing all 
# characters with the longest consecutive repeat. For example, the 
# longest_consecutive_repeating_char('aabbccd') would return ['a', 'b', 'c'] 
# (order doesn't matter). You must use a dictionary to accomplish this.
def longest_consecutive_repeating_char(s):
  # YOUR CODE HERE
    dict1 = {}
    count = 0
    
    for i in s:
      if i not in dict1.keys():
        dict1[i] = 0

    for x in range(0, len(s)):
      for k in range(x+1, len(s)):
        if (x) < (len(s) - 1) and s[x] == s[k]:
          count += 1

        if s[x] != s[k]:
          break

      if count > dict1[s[x]]:
        dict1[s[x]] = count
        count = 0
      else:
        count = 0

    maxvalue = [key for key, value in dict1.items() if value == max(dict1.values())]
    return maxvalue

  
  
  
  
  
  
  # count = 1
  # max_count = 0
  # character = ''

  # for x in range(0, len(s)-1):
  #   if s[x] == s[x + 1]:
  #     count += 1
  #   else:
  #     count = 1
    
  #   if max_count < count:
  #     max_count = count
  #     character = s[x]
  # return character
    




# Part C. is_palindrome
# Define a function is_palindrome(s) that takes a string s
# and returns whether or not that string is a palindrome.
# A palindrome is a string that reads the same backwards and
# forwards. Treat capital letters the same as lowercase ones
# and ignore spaces (i.e. case insensitive).
def is_palindrome(s):
  # YOUR CODE HERE
  s = s.lower()
  temp = s.replace(" ", "")
  string = temp[::-1]

  if string == temp:
    return True
  else:
    return False