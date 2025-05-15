A = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"
N, B = input().split()
ans = 0
for i, num in enumerate(N[::-1]):
    ans += int(B) ** i * A.index(num)
print(ans)