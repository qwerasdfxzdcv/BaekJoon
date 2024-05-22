n = int(input())
star = "*"
space = " "
for i in range(1,n):
    print(space*(n-i)+star*(2*i-1))
for i in range(n,0,-1):
    print(space*(n-i)+star*(2*i-1))