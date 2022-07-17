n = int(input())
numArr = list(map(int, input().split()))
numArr2 = sorted(numArr)
print(numArr2[n // 2])