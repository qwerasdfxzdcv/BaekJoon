A = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"
N, B = map(int,input().split())
ans = ""
while N != 0:
    ans = A[N%B] + ans
    N //= B
print(ans)