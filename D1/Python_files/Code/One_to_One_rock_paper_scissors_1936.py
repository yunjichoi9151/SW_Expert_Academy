a, b = map(int, input().split())
if a > b:
    print('A' if b == a - 1 else 'B')
else:
    print('B' if a == b - 1 else 'A')