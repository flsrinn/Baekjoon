N = int(input())
A, B = map(int, input().split())
count = 0

while N > 0 and (A >= 2 or B >= 1):
    if A >= 2:
        A -= 2
    elif B >= 1:
        B -= 1
    count += 1
    N -= 1

print(count)
