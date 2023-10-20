"""
write a program to input a line of text from user and find
1)count no: of characters in it (including spaces)
2)total no: of alphabets
3)total no: of digits
4)total no: of special characters
5)total number of words .assume that each word is seperated by one space.
"""

s=input("enter the string")

#total no: of character's
c=(len(s))
print("total no: of charcter's",c)

#number of alphabets
a=0
for i in s:
  if i.isalpha():
    a+=1
print("total number of alphabets =",a)

#number of digits
d=0
for i in s:
  if i.isdigit():
    d+=1
print("total number of digits =",d)

#number of special character's
sc=0
for i in s:
  if not i.isalnum():
    sc+=1
print("total number of special character's =",sc)

#number of words
w=s.count(" ")+1 #the number of spaces +1 gives number of words
print("total number of words's =",w)

#or  method-2 for finding  number of words
x=0
k=s.split("")
for i in k:
  x+=1
print(x)
