A = int(input())
B = [[0]*100 for _ in range(100)]
for _ in range(A):
    a, b = map(int,input().split())
    for i in range(a, a+10):
        for j in range(b,b+10):
            B[i][j] = 1
count = 0
for i in range(100):
    count += B[i].count(1)
print(count)