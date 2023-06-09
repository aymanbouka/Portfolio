print("chose number 1 between 1 - 100")

first = int(input("input: "))


print("chose number 2 between 1 - 100")

second = int(input("input: "))


print("chose number 3 between 1 - 100")

third = int(input("input: "))

myList = [first, second, third]


print("The highest number you entered: ",max(myList))

print("The lowest number you entered: ", min(myList))

print("And the Average is: ",(first + second + third) / 3)

